/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jcafeloginandsignup;

/**
 *
 * @author My PC
 */
public class ProductPrices {
    public static int getCoffeePrice(String coffeeName, String size, String type ) {
        int basePrice = 0;
        
        switch (coffeeName) {
            case "Americano": basePrice =  100;
            break;
            
            case "Latte": basePrice =  100;
            break;
            
            case "Cappucino": basePrice =  120;
            break;
            
            case "Espresso": basePrice =  110;
            break;
            
            case "Mocha": basePrice =  95;
            break;
            
            case "Macchiato": basePrice =  130;
            break;
            
            case "Flat White": basePrice =  140;
            break;
            
            case "Spanish": basePrice =  125;
            break;
            
            default: basePrice = 0;
            break;
            
        }
        
        //size adjustyment
        
        switch(size.toLowerCase()) {
            
            case "small": basePrice += 0;
            break;
            
            case "medium": basePrice += 20;
            break;
            
            case "large": basePrice += 40;
            break;
            
            // Kapeng malamig
            
            
        }
        
    if (type.equalsIgnoreCase("cold")) {
            basePrice  += 10;
        }
            
            
            
     return basePrice;
           
    }
            
    public static int getJuicePrice (String name) {
            
            
            switch (name) {
            
            case "Apple Juice":
            return 50;
            
             case "Orange Juice":
            return 55;
            
             case "Grape Juice":
            return 50;
            
             case "Lemonade Juice":
            return 60;
            
             case "Mango Juice":
            return 60;
            
             case "Pineapple Juice":
            return 50;
            
            default: return 0;
        }
    }
            
    public static int getPastaPrice (String name) {
            
            
            switch (name) {
            
            case "Spaghetti":
            return 75;
            
             case "Carbonara":
            return 85;
            
             case "Pesto":
            return 80;
            
             case "Bolognese":
            return 90;
            
             case "Alfredo":
            return 100;
            
           
            
            default:
            return 0;
        }
    }
            
    public static int getPastryPrice (String name) {
            
            
            switch (name) {
            
            case "Croissant":
            return 45;
            
             case "Cinnamon Roll":
            return 50;
            
             case "Bagel":
            return 40;
            
             case "Danish":
            return 55;
            
             case "Muffin":
            return 50;
            
           
            
            default:
            return 0;
        }
    }
            
            
            
          
            
            
    
    
    
}
