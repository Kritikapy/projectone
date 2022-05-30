/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ua.learning.project.model.entity;

import java.util.Objects;

/**
 *
 * @author redsky
 */
public class RegistrationForm {
    private String firstName, lastName, birthday;
    private int age;
    
    //default constructor
    
    public RegistrationForm(){
        this.firstName = "Ivan";
        this.lastName = "Petrov";
        this.birthday = "25/05/1988";
        this.age = 25;
    }
    
    public RegistrationForm (String f, String l, String b, int a){
        this.firstName = f;
        this.lastName = l;
        this.birthday = b;
        this.age = a;
    }
    
    public RegistrationForm (String f){
        this.firstName = f;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    @Override
    public String toString(){
        String str = String.format(
                "RegistrationForm(firstName = '%s',lastName = '%s', birthday = '%s', age = %d)",
                this.getFirstName(), lastName, birthday, age 
        );
        return str;
    }
    
    @Override
    public int hashCode(){
        if (this.firstName.length()>3){
            System.out.println("firstName is more than 3 symbols");
            return 0;
        }
        return (Objects.hash(firstName));
    }
    
        
 
}
