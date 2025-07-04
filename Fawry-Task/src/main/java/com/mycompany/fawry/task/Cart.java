/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawry.task;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SoftLaptop
 */
public class Cart {
    private static class CartItem{
    Product product;
    int quantity;
    CartItem( Product product,int quantity){
        this.product=product;
        this.quantity=quantity;
    }
    }
    private List <CartItem> items= new ArrayList<>();
    
    public void add (Product product,int quantity){
        if(quantity>product.getQuantity()){
           System.out.println("not enough "+product.getName());
           return;
        }
        items.add(new CartItem(product,quantity));
    }
    public boolean isEmpty(){
        return items.isEmpty();
    }
    public void printCart(){
        for (CartItem item : items) {
            System.out.println(item.product.getName()+item.quantity);
        }
    }
    public List <Product> getProducts(){
        List<Product> products = new ArrayList<>();
        for (CartItem  item: items) {
            products.add(item.product);
        }
        return products;  
    }
     public List <Integer> getQuantities(){
        List<Integer> quantites = new ArrayList<>();
        for (CartItem item : items) {
           quantites.add(item.quantity);
        }
        return quantites;  
    }
    
}
