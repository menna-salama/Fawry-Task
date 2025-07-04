/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawry.task;

/**
 *
 * @author SoftLaptop
 */
public class Customer {
    private double balance ;
    
    public Customer(double balance){
     this.balance=balance;    
    }
     public void  setBalance( double balance){
         this.balance=balance;
     }
     public double getBalance (){return balance;}
     
     public boolean pay (double amount ){
         if (balance >=amount ){
             balance -=amount;
             return true;
         }
         return false;
     }
}
