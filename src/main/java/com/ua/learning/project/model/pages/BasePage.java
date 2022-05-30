/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ua.learning.project.model.pages;

/**
 *
 * @author redsky
 */
public abstract class BasePage {
    private String pageURL;
    
    //constructor
    public BasePage(String url){
        this.pageURL = url;
    }
    
    public void openWindow(){
        System.out.println(this.pageURL);
    }
    
}
