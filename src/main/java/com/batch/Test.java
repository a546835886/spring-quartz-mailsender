package com.batch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
        public static void main(String[] args) {
            //启动spring容器
//            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("task-scheduling.xml");
//            System.out.println("initContext successfully");

            //spring继承quartz方法二：注解方式
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springMVC.xml");
            System.out.println("initContext successfully");
        }
}
