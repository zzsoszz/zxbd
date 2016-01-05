package com.bxtel.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/*
 * 
 * http://projects.spring.io/spring-boot/
 * 
 * https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-data-jpa/src/main/java/sample/data/jpa
 * 
 * Spring Data JPA——参考文档 
 * http://jpa.coding.io/#project
 * 
 * jpa 规范
 * http://www.yiibai.com/jpa/jpa_criteria_api.html
 * 
 * http://mvnrepository.com/artifact/org.hibernate/hibernate-validator
 * 
 * SPRING DATA JPA 中几种缓存的配置
 * http://ju.outofmemory.cn/entry/42566
 * 
 * Spring事务管理中@Transactional的参数配置 
 *  @Stateless
	@Transactional
	@PersistenceContext
 * http://blog.csdn.net/zsm653983/article/details/8103466
 */

import com.bxtel.bo.UserBO;
import com.bxtel.dao.UserRepository;
import com.bxtel.model.User;
@RestController
public class UserController {
	@Autowired
	UserRepository userbo;
	
	@RequestMapping
	@ResponseBody
	public String doadd()
	{
		User entity=new User();
		userbo.save(entity);
		return "1";
	}
	
	@RequestMapping
	@ResponseBody
	public String dologin()
	{
		return null;
	}
}
