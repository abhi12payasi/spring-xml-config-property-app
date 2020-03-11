package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
    public static void main(String[] args){
        ApplicationContext ac= new ClassPathXmlApplicationContext("config.xml");
        System.out.println(ac.getBean("employee"));
    }
}
