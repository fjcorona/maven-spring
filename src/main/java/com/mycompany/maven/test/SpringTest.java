/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven.test;

import com.mycompany.maven.spring.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author fjcorona
 */
public class SpringTest {
    
    public static void main(String[] args) {
        ApplicationContext appContext= new ClassPathXmlApplicationContext("classpath:/beans.xml");
        Message message = (Message) appContext.getBean("messageId");
        System.out.println("The message is: " + message.getMessage());
        Message message2 = (Message) appContext.getBean("messageId2");
        System.out.println("The message 2 is: " + message2.getMessage());
    }
    
}
