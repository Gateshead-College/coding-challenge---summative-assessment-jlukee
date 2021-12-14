package products;

public class Shorts extends Products{

    public Shorts(int productNum, String manufacturer, String brand, double price, int stockNum) {
        super(productNum, manufacturer, brand, price, stockNum);
    }

    public void shortsDesc(){
        System.out.println("---Shorts---");
        System.out.println("Product Number = " + productNum);
        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("Brand = " + brand);
        System.out.println("Price = " + price);
        System.out.println("Number in Stock = " + stockNum);
        System.out.println("------");
    }
}
