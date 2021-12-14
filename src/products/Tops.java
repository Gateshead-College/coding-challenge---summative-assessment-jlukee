package products;

public class Tops extends Products{

    private boolean isShortSleeve;

    public Tops(int productNum, String manufacturer, String brand, boolean isShortSleeve, double price, int stockNum) {
        super(productNum, manufacturer, brand, price, stockNum);
        this.isShortSleeve = isShortSleeve;
    }

    public void topsDesc(){
        System.out.println("---Tops---");
        System.out.println("Product Number = " + productNum);
        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("Brand = " + brand);
        if(isShortSleeve) {
            System.out.println("The tops are short sleeve.");
        }
        else{
            System.out.println("The tops are long sleeve.");
        }
        System.out.println("Price = " + price);
        System.out.println("Number in Stock = " + stockNum);
        System.out.println("------");
    }
}
