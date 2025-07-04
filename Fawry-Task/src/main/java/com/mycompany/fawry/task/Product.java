/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawry.task;
import java.time.LocalDate;

 
public class Product {
    private String name ,expirDate;
    private double  price,weight;
    private int quantity;
    private boolean isShip,isExpir;
    
    public Product( String name,String expirDate, double  price, double weight,int quantity,boolean isShip,boolean isExpir){
        this.name=name;
        this.expirDate=expirDate;
        this.price=price;
        this.weight=weight;
        this.quantity=quantity;
        this.isExpir=isExpir;
        this.isShip=isShip;
    }
    public void setName(String name){
         this.name=name;
    }
     public void setExpirDate(String expirDate){
         this.expirDate=expirDate;
    }
      public void setPrice(double  price){
         this.price=price;
    }
       public void setWeight(double weight){
         this.weight=weight;
    }
        public void setQuantity(int quantity){
         this.quantity=quantity;
    }
         public void setIsShip(boolean isShip){
         this.isShip=isShip;
    }
          public void setIsExpir(boolean isExpir){
         this.isExpir=isExpir;
    }
    
    public String getName(){return name;}
    public String getExpirDate(){return expirDate;}
    public double getPrice(){return price;}
    public double getWeight(){return weight;}
    public int getQuantity(){return quantity;}
    public boolean  getIsShip(){return isShip;}
    public boolean  getIsExpir(){return isExpir;}
    public boolean isExpired(){
        if(isExpir && expirDate !=null &&!expirDate.isEmpty()){
            LocalDate exp= LocalDate.parse(expirDate);
             return exp.isBefore(LocalDate.now());
        }
        return false;
        
    }
    public void reduceQuantity(int qty){
        this.quantity -=qty;
    }
    
}
