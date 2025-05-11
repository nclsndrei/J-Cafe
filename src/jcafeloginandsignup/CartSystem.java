/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jcafeloginandsignup;

import java.util.ArrayList;

/**
 *
 * @author My PC
 */
public class CartSystem {
    
    private static final ArrayList<String> cartItems  = new ArrayList<>();
    
    public static void addToCart(String orderLine) {
        cartItems.add(orderLine);
    }
    
    public static void clearCart() {
        cartItems.clear();
    }
    
    public static  ArrayList<String> getCartItems() {
        return cartItems;
    }
    
    
    
    
    
}

//THIS IS THE BRAIN SO IF MAWALA TO  diko na alam
