package com.bxtel.dao;
import java.util.List;
import javax.persistence.QueryHint;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;
import com.bxtel.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    /**
     * 第一种情况的缓存,处理spring data jpa自身的方法
     * @param id
     * @return
     */
    @QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
    public User findById(long id);
    
    
    /**
     * 第二种情况缓存,处理能根据 spring data jpa 扩展的方法.
     * @return
     */
    @Query("from User")
    @QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
    List<User> findAllCached();
}