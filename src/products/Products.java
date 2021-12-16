package products;

import java.util.ArrayList;

public class Products {
    public int productNum;
    public String manufacturer;
    public String brand;
    public double price;
    public int stockNum;

    public Products(int productNum, String manufacturer, String brand, double price, int stockNum) {
        this.productNum = productNum;
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.price = price;
        this.stockNum = stockNum;
    }

    public int getProductNum() {
        return productNum;
    }

    public int getStockNum() {
        return stockNum;
    }

    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }
}
