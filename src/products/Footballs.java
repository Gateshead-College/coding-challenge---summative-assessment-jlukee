package products;

import javax.swing.*;
import java.awt.*;

public class Footballs extends Products{

    public Footballs(int productNum, String manufacturer, String brand, double price, int stockNum) {
        super(productNum, manufacturer, brand, price, stockNum);
    }

    public void footballDesc(){
        System.out.println("---Footballs---");
        System.out.println("Product Number = " + productNum);
        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("Brand = " + brand);
        System.out.println("Price = £" + price);
        System.out.println("Number in Stock = " + stockNum);
        System.out.println("------");
    }



}
