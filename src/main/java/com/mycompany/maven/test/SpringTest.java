package com.mycompany.maven.test;

import com.mycompany.maven.spring.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:/beans.xml");
        Message message = (Message) appContext.getBean("messageId");
        System.out.println("The message is: " + message.getMessage());
        Message message2 = (Message) appContext.getBean("messageId2");
        System.out.println("The message 2 is: " + message2.getMessage());
    }

}
