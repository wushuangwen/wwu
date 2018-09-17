package cn.tedu.spring.test;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.entity.CollectionEntity;
import cn.tedu.spring.entity.ValueBean;

public class Test {
	public static void main(String[] args) {
		//加载配置文件，获取spring容器
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取所需对象
		CollectionEntity ce = ac.getBean("CollectionEntity",CollectionEntity.class);
		ValueBean valueBean = ac.getBean("valueBean",ValueBean.class);
		//执行测试
		System.out.println("tag的值");
		System.out.println(ce.getTag());
		System.out.println();
		
		System.out.println("list集合输入的值");
		System.out.println(ce.getNames());
		System.out.println();
		
		System.out.println("set集合输入的值");
		System.out.println(ce.getCities());
		System.out.println();
		
		System.out.println("map集合输入的值");
		System.out.println(ce.getSession());
		System.out.println();
		
		System.out.println("spring表达式");
		System.out.println("tagValue:"+valueBean.tagValue);
		System.out.println("nameValue:"+valueBean.nameValue);
		System.out.println("cityValue:"+valueBean.cityValue);
		System.out.println("usernameValue:"+valueBean.usernameValue);
		System.out.println("passwordValue:"+valueBean.passwordValue);
		//释放资源
		ac.close();
	}
	
}
