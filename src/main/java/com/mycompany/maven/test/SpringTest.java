package com.mycompany.maven.test;

import com.mycompany.maven.spring.Message;
import com.mycompany.maven.spring.autowire.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    public static void testMessage() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        Message message = (Message) appContext.getBean("messageId");
        System.out.println("The message 1 is: " + message.getMessage());
        Message message2 = (Message) appContext.getBean("messageId2");
        System.out.println("The message 2 is: " + message2.getMessage());
    }

    public static void testAutowireNo() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans_s1_autowire_no.xml");
        Employee employee = (Employee) appContext.getBean("employee");
        System.out.println(employee);
    }

    public static void main(String[] args) {
        testMessage();
        // testAutowireNo();
    }

}
