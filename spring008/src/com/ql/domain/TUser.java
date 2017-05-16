/**
 * @(#)UserDao.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	刘金禹  2017年5月6日
 */
package com.ql.domain;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * TODO 填写功能说明
 * @author 刘金禹
 */
public class TUser {

	private String username;
	private String sex;
	private List lst;
	private Set set;
	private Map map;
	private List<THome> lst1;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public List getLst() {
		return lst;
	}
	public void setLst(List lst) {
		this.lst = lst;
	}
	public Set getSet() {
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public List<THome> getLst1() {
		return lst1;
	}
	public void setLst1(List<THome> lst1) {
		this.lst1 = lst1;
	}
	
	
}
