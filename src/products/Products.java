package products;

public class Products {
    public int productNum;
    public String manufacturer;
    public String brand;
    public String price;
    public int stockNum;

    public Products(int productNum, String manufacturer, String brand, String price, int stockNum) {
        this.productNum = productNum;
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.price = price;
        this.stockNum = stockNum;
    }
}
