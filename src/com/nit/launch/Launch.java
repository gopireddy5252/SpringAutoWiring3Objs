package com.nit.launch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.Config;
import com.nit.pojo.Emp;

public class Launch {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Emp res=(Emp)context.getBean("EmpId1");
		System.out.println(res);
	}

}
