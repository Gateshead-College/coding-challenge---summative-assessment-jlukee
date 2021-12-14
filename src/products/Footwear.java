package products;

public class Footwear extends Products{


    public Footwear(int productNum, String manufacturer, String brand, double price, int stockNum) {
        super(productNum, manufacturer, brand, price, stockNum);
    }

    public void footwearDesc(){
        System.out.println("---Footwear---");
        System.out.println("Product Number = " + productNum);
        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("Brand = " + brand);
        System.out.println("Price = " + price);
        System.out.println("Number in Stock = " + stockNum);
        System.out.println("------");
    }
}
