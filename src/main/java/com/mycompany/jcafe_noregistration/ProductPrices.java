/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcafe_noregistration;

/**
 *
 * @author My PC
 */
public class ProductPrices {
    
    public static int getCoffeePrice (String coffeeName, String size, String type) {
        int basePrice= 0;
        
        switch (coffeeName) {
            case "Americano": basePrice = 100;
            break;
            case "Latte": basePrice = 120;
            break;
            case "Cappucino": basePrice = 110;
            break;
            case "Espresso": basePrice = 95;
            break;
            case "Mocha": basePrice = 130;
            break;
            case "Macchiato": basePrice = 140;
            break;
            case "Flat White": basePrice = 115;
            break;
            case "Spanish": basePrice = 125;
            break;
            
            default: basePrice = 0;
            break;
             
        }
        
        switch (size.toLowerCase()) {
            case "small": basePrice += 0;
            break;
            case "medium": basePrice += 20;
            break;
            case "large": basePrice += 40;
            break;
        }
        
        //sa mainit bro or cold
        
        if (type.equalsIgnoreCase("cold")) {
            basePrice += 10;
        }
        return basePrice;
    }
    
    public static int getJuicePrice(String item) {
        //same lang sa taas //inulit ko kaya diko muna lalagayn haha
        return 0;
    }
    
     public static int getPastaPrice(String item) {
        //same lang sa taas //inulit ko kaya diko muna lalagayn haha
        return 0;
    }
     
      public static int getPastryPrice(String item) {
        //same lang sa taas //inulit ko kaya diko muna lalagayn haha
        return 0;
    }
    
    
}
