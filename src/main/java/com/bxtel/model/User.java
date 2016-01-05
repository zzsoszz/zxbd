package com.bxtel.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

//
//
// @NamedQueries(value = {
//
// @NamedQuery(name = User.QUERY_FIND_BY_LOGIN,
//
// query = "select u from User u where u." + User.name
//
// + " = :username"),
//
// @NamedQuery(name = "getUsernamePasswordToken",
//
// query = "select new com.aceona.weibo.vo.TokenBO(u.username,u.password) from User u where u." + User.PROP_LOGIN
//
// + " = :username")})
// 
// 
@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String type;//1.买家  2.设计师
	
	@NotNull
	private String mobile;//手机号
	
	@NotNull
	private String password;//密码
	
	private String name;//姓名
	
	private String email;//邮件
	
	private String companyid;//公司ID
	
	private String accesscount;//访问量
	
	private String workyear;//工作年限
	
	private String school;//毕业院校
	
	private String goodat;//擅长
	
	private String image1;//邮件
	
	private String image2;//邮件
	
	private String image3;//邮件
	
	private String image4;//邮件
	
	private String image5;//邮件
	
	private String opencompany;//第三方认证平台
	
	private String openid;//第三方认证平台唯一标识
}
