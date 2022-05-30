/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ua.learning.project.implementation.submit_registration;
import com.ua.learning.project.implementation.BaseTest;
import com.ua.learning.project.model.entity.RegistrationForm;
import com.ua.learning.project.model.menu.AbcMenu;
import com.ua.learning.project.model.menu.CDIMenu;
import com.ua.learning.project.model.menu.MainMenu;
import com.ua.learning.project.model.pages.LoginPage;
import com.ua.learning.project.utils.test_constants.TestConstants;
import org.testng.annotations.Test;
/**
 *
 * @author redsky
 */
public class SubmitRegistrationTest extends BaseTest{
        
    @Test
    public void loginSystem(){
        LoginPage p = new LoginPage("http://www.google.com.ua");
        p.openWindow();
    }
    
    @Test
    public void selectAllMenu(){
        AbcMenu a = new AbcMenu();
        CDIMenu c = new CDIMenu();
        MainMenu m = new MainMenu();
        
        a.selectMenu();
        c.selectMenu();
        m.selectMenu();
    }
    
    @Test
    public void selectABCMenu(){
        AbcMenu a = new AbcMenu();
        
        a.selectMenu();
    }
    
    @Test
    public void printDefaultRegistrationInstance(){
        RegistrationForm f = new RegistrationForm();
        System.out.println(f);
    }
    
    @Test
    public void printConstantRegistrationInstance(){
        RegistrationForm f = new RegistrationForm(TestConstants.FIRSTNAME, TestConstants.LASTNAME,TestConstants.BIRTHDAY,TestConstants.AGE);
        System.out.println(f);
    }
    
    @Test
    public void printHashCode(){
        RegistrationForm f = new RegistrationForm("Petrov");
        System.out.println(f.hashCode());
    }
    
    
}


