/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawry.task;

/**
 *
 * @author SoftLaptop
 */
public class Checkout {
    public static void process(Customer customer,Cart cart){
        if(cart.isEmpty()){
            System.out.println("cart is Empty");
            return ;
        }
        double subTotal=0,shipping=0,totalWeight=0;
        boolean hasShipping=false;
        StringBuilder shippingNotice =new StringBuilder();
        shippingNotice.append("Shipment \n");
        double shipmentWeight=0;
         
         StringBuilder receipt =new StringBuilder();
          receipt.append(" receipt\n");
          
          for (int i =0;i<cart.getProducts().size();i++){
              Product p=cart.getProducts().get(i);
              int q =cart.getQuantities().get(i);
              if (p.getIsExpir()&& p.isExpired()){
                  System.out.println(p.getName()+"is expired");
                  return;}
               subTotal +=p.getPrice() *q;
                    if (p.getIsShip()){
              double prodweight=p.getWeight()*q;
               shippingNotice.append(q + "x" +p.getName()+"\t\t"+ prodweight+"g\n");
               shipmentWeight +=prodweight;
              hasShipping=true;
          }
          p.reduceQuantity(q);
          receipt.append(q+"x"+p.getName()+"\t\t"+(p.getPrice()*q)+"\n");
          }
          
    if (hasShipping){
    shipping=30;
}
    double total =subTotal+shipping;
    if (!customer.pay(total)){
       System.out.println( " should pay total");
       return ;
        
    }
     if (hasShipping){
     shippingNotice.append("-----------------------------------\n");
     shippingNotice.append("total package weight "+shipmentWeight+"g\n");
     System.out.println(shippingNotice.toString()); 
}
     receipt.append("-----------------------------------\n");
     receipt.append("SubTotal\t\t "+ subTotal  +"\n");
     receipt.append("Shipping\t\t"+shipping+"\n");
     receipt.append("Amount\t\t"+total+"\n");
      System.out.println(receipt.toString()); 
     
     
     
     
}}
