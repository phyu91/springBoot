package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.MyController;

@SpringBootApplication
public class SpTestApplication {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(SpTestApplication.class, args);
		MyController myContoller = (MyController) cxt.getBean("myController");
		String a = myContoller.sayHello();
		System.out.println(a);
	}

}
