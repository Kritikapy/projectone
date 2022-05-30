/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ua.learning.project.implementation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 *
 * @author redsky
 */
public class BaseTest {
    @BeforeTest
    public void init(){
        System.out.println("init");
    }
    
    @AfterTest
    public void destroy(){
        System.out.println("destroy");
    }

    
}
