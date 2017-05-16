/**
 * @(#)Test.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	刘金禹  2017年5月6日
 */
package com.ql.test;

import java.util.Iterator; 
import java.util.List;

import org.springframework.beans.factory.BeanFactory; 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ql.domain.THome;
import com.ql.domain.TUser;

import oracle.net.aso.e;


/**
 * TODO 填写功能说明
 * @author 刘金禹
 */
public class Test {
	
	public static void main(String[] args) {
		//获取工厂
		BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext.xml");
		TUser user = (TUser) bf.getBean("user");
//		List lst = user.getLst();
//		for(int i=0;i<lst.size();i++){
//			System.out.println(lst.get(i));
//		}
		
//		Set set = user.getSet();
//		Iterator it = set.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
//		Map map = user.getMap();
//		System.out.println(map.get("b"));
		
		List<THome> lsta = user.getLst1();
		Iterator<THome> it = lsta.iterator();
		while(it.hasNext()){
			THome h = it.next();
			System.out.println(h.getAddress());
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	