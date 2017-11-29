/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author fjcorona
 */
public class SpringTest {
    
    public static void main(String[] args) {
        ApplicationContext appContext= new ClassPathXmlApplicationContext("");
    }
    
}
