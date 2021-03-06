package products;

public class Gifts extends Products{

    String type;

    public Gifts(int productNum, String manufacturer, String brand, String type, double price, int stockNum) {
        super(productNum, manufacturer, brand, price, stockNum);
        this.type = type;
    }

    public void giftDesc(){
        System.out.println("------");
        System.out.println("Product Number = " + productNum);
        System.out.println("Product Type = " + type);
        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("Brand = " + brand);
        System.out.println("Price = £" + price);
        System.out.println("Number in Stock = " + stockNum);
    }

    @Override
    public int getProductNum() {
        return super.getProductNum();
    }


    @Override
    public int getStockNum() {
        return super.getStockNum();
    }

    @Override
    public void setStockNum(int stockNum) {
        super.setStockNum(stockNum);
    }

}
