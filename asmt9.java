
//*******************************************************************
//
//  Assignment 9
//
// Creates a class called Product with the variables of productCode,
// description, price, and productCount. Public getters and setters
// to access a member's variables. Another class called client
// creates three Products and prints their variables' values.
//
//By: Crosby Allison
//Date: 11/07/2019
//*******************************************************************

// import NumberFormat
import java.text.*;

class Product {
    
    // Private Product variables
    private int productCode;
    private String description;
    private double price;
    private int productCount;
    
    // Public getters and setters of private Product variables
    public int getProductCode() {
        return productCode;
    }
    
    public void setProductCode(int newProductCode) {
        this.productCode = newProductCode;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String newDescription) {
        this.description = newDescription;
    }
    
    public String getPriceFormatted() {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        return formattedPrice;
    }
    
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    
    public int getCount() {
        return productCount;
    }
    
    public void setCount(int newProductCount) {
        this.productCount = newProductCount;
    }
}

public class Client {
    
    // prints a string with all the variable values of a given Product p
    private static void printProductVarDump (Product p) {
        System.out.println( String.format("Product Code: %s, Description: %s, Price: %s, Count: %s", Integer.toString(p.getProductCode()), p.getDescription(), p.getPriceFormatted(), Integer.toString(p.getCount())));
    }
    
    // initalizes Products and calls printProductVarDump to print their information
    public static void main (String[] args) {
        
        // First product
        Product p1 = new Product();
        p1.setProductCode(1234);
        p1.setDescription("A ham sandwich");
        p1.setPrice(12.99);
        p1.setCount(3);
        
        // Second product
        Product p2 = new Product();
        p2.setProductCode(1212);
        p2.setDescription("A cool pair of shoes");
        p2.setPrice(10.01);
        p2.setCount(33);
        
        // Third product
        Product p3 = new Product();
        p3.setProductCode(1289);
        p3.setDescription("A large rodent");
        p3.setPrice(22.99);
        p3.setCount(4);
        
        // Display information of products
        printProductVarDump(p1);
        printProductVarDump(p2);
        printProductVarDump(p3);
    }
}
