/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fawry.task;
 

/**
 *
 * @author SoftLaptop
 */
public class FawryTask {

    public static void main(String[] args) {
         Product cheese=new Product ("cheese","2025-08-01",100,200,10,true,true );
          Product  biscuits=new Product ("biscuits","2025-12-31",150,350,10,true,true );
          
          Customer customer =new Customer(100000);
          Cart cart=new Cart();
          cart.add(cheese,2);
          cart.add(biscuits,1);
          Checkout.process(customer,cart);
    }
}
