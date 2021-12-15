import products.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Footballs> fbls = new ArrayList<>();
    ArrayList<Footwear> ftwr = new ArrayList<>();
    ArrayList<Tops> tops = new ArrayList<>();
    ArrayList<Shorts> shorts = new ArrayList<>();
    ArrayList<Gifts> gifts = new ArrayList<>();


    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("----------");
        System.out.println("Welcome to ProDirectSoccer!");
        System.out.println("----------");

        main.initialise();

        main.adminMenu();
    }

    private void adminMenu() {
        System.out.println("Please choose one of the options below");
        System.out.println("1 - View Stock");
        System.out.println("2 - Alter Stock");
        System.out.println("3 - Exit");
        System.out.println("--------");
        byte choice = Byte.parseByte(scanner.nextLine());
        switch (choice) {
            case 1:
                viewStockMenu();
                break;
            case 2:
                alterStockMainMenu();
                break;
            case 3:
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Invalid option, please try again.");
                adminMenu();
        }
    }

    private void alterStockMainMenu() {
        System.out.println("Please choose one of the options below to alter our current stock:");
        System.out.println("1 - Add New Stock");
        System.out.println("2 - Remove Existing Stock");
        System.out.println("3 - Edit Existing Stock");
        System.out.println("4 - Exit");
        System.out.println("----------");
        byte choice = Byte.parseByte(scanner.nextLine());
        System.out.println("----------");

        switch (choice) {
            case 1:
                createStockMenu();
                break;
            case 2:
                deleteStockMenu();
                break;
            case 3:
                //editStockMenu();
                break;
            case 4:
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Invalid option, please try again.");
                alterStockMainMenu();
        }
    }

    private void createStockMenu() {
        System.out.println("----------");
        System.out.println("Please select the type of stock you wish to add.");
        System.out.println("1 - Footballs");
        System.out.println("2 - Footwear");
        System.out.println("3 - Sports Tops");
        System.out.println("4 - Sports Shorts");
        System.out.println("5 - Gifts");
        System.out.println("6 - Exit to Main Menu.");
        byte choice = Byte.parseByte(scanner.nextLine());
        switch(choice) {
            case 1:
                createFootballs();
                break;
            case 2:
                createFootwear();
                break;
            case 3:
                createTops();
                break;
            case 4:
                createShorts();
                break;
            case 5:
                createGifts();
                break;
            case 6:
                adminMenu();
                break;
            default:
                System.out.println("Invalid choice, please try again");
                System.out.println("--------");
                createStockMenu();
        }
    }

    private void deleteStockMenu() {
        System.out.println("----------");
        System.out.println("Please select the type of stock you wish to delete.");
        System.out.println("1 - Footballs");
        System.out.println("2 - Footwear");
        System.out.println("3 - Sports Tops");
        System.out.println("4 - Sports Shorts");
        System.out.println("5 - Gifts");
        System.out.println("6 - Exit to Main Menu.");
        byte choice = Byte.parseByte(scanner.nextLine());
        switch(choice){
            case 1:
                createFootballs();
                break;
            case 2:
                createFootwear();
                break;
            case 3:
                createTops();
                break;
            case 4:
                createShorts();
                break;
            case 5:
                createGifts();
                break;
            case 6:
                adminMenu();
                break;
            default:
                System.out.println("Invalid choice, please try again");
                System.out.println("--------");
                createStockMenu();
        }
    }

    private void viewStockMenu() {
        System.out.println("Please choose one of the options below to view our current stock");
        System.out.println("1 - Footballs");
        System.out.println("2 - Footwear");
        System.out.println("3 - Sports Tops");
        System.out.println("4 - Sports Shorts");
        System.out.println("5 - Gifts");
        System.out.println("6 - Exit");
        System.out.println("----------");
        byte choice = Byte.parseByte(scanner.nextLine());
        System.out.println("----------");

        switch(choice) {
            case 1:
                System.out.println("Please see the following footballs");
                for(int i = 0; i < fbls.size(); i++) {
                    fbls.get(i).footballDesc();
                }
                viewStockMenu();
                break;
            case 2:
                System.out.println("Please see the following footwear");
                for(int i = 0; i < ftwr.size(); i++) {
                    ftwr.get(i).footwearDesc();
                }
                viewStockMenu();
                break;
            case 3:
                System.out.println("Please see the following sports tops");
                for(int i = 0; i < tops.size(); i++) {
                    tops.get(i).topsDesc();
                }
                viewStockMenu();
                break;
            case 4:
                System.out.println("Please see the following sports shorts");
                for(int i = 0; i < shorts.size(); i++) {
                    shorts.get(i).shortsDesc();
                }
                viewStockMenu();
                break;
            case 5:
                System.out.println("Please see the following gifts");
                for(int i = 0; i < gifts.size(); i++) {
                    gifts.get(i).giftDesc();
                }
                viewStockMenu();
                break;
            case 6:
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Invalid choice, please try again");
                System.out.println("--------");
                viewStockMenu();
        }
    }

    private void initialise() {
        fbls.add(new Footballs(1, "Mitre", "Manchester United", 15.99, 3));
        fbls.add(new Footballs(2, "Nike", "Newcastle United", 19.99, 2));
        fbls.add(new Footballs(3, "Addidas", "Liverpool", 18.99, 5));
        fbls.add(new Footballs(4, "Mitre", "Chelsea", 12.99, 9));

        ftwr.add(new Footwear(5, "New Balance", "OneWave", 39.99, 7));
        ftwr.add(new Footwear(6, "Nike", "Hypervenoms", 35.99, 11));
        ftwr.add(new Footwear(7, "Addidas", "Quickstrike", 45.99, 6));
        ftwr.add(new Footwear(8, "Puma", "Pele Edition", 62.99, 13));

        shorts.add(new Shorts(9, "Nike", "Chelsea", 19.99, 7));
        shorts.add(new Shorts(10, "Puma", "Juventus", 18.99, 11));
        shorts.add(new Shorts(11, "New Balance", "Liverpool", 24.99, 6));
        shorts.add(new Shorts(12, "Addidas", "Manchester United", 24.99, 13));

        tops.add(new Tops(13, "Nike", "Chelsea", true, 45.99, 7));
        tops.add(new Tops(14, "Puma", "Juventus", false, 42.99, 11));
        tops.add(new Tops(15, "New Balance", "Liverpool", false, 49.99, 6));
        tops.add(new Tops(16, "Addidas", "Manchester United", true, 49.99, 13));

        gifts.add(new Gifts(17, "Sports Direct", "Chelsea", "Calendar", 9.99, 7));
        gifts.add(new Gifts(18, "Sports Direct", "Juventus", "Flask", 4.99, 11));
        gifts.add(new Gifts(19, "Sports Direct", "Liverpool", "Socks", 9.99, 6));
        gifts.add(new Gifts(20, "Sports Direct", "Manchester United", "Calendar", 9.99, 13));
    }

    private void createFootballs() {
        System.out.println("-------");
        System.out.println("What is the product number for the football?");
        int productNum = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the name of the manufacturer?");
        String manufacturer = scanner.nextLine();
        System.out.println("What brand is the item?");
        String brand = scanner.nextLine();
        System.out.println("What is the item's price?");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("How many do we have in stock?");
        int stockNum = Integer.parseInt(scanner.nextLine());

        fbls.add(new Footballs(productNum, manufacturer, brand, price, stockNum));

        System.out.println("-------");
        System.out.println("New stock added. Returning to menu.");
        System.out.println("-------");

        adminMenu();

    }
    private void createFootwear() {
        System.out.println("-------");
        System.out.println("What is the product number for the footwear?");
        int productNum = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the name of the manufacturer?");
        String manufacturer = scanner.nextLine();
        System.out.println("What brand is the item?");
        String brand = scanner.nextLine();
        System.out.println("What is the item's price?");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("How many do we have in stock?");
        int stockNum = Integer.parseInt(scanner.nextLine());

        ftwr.add(new Footwear(productNum, manufacturer, brand, price, stockNum));

        System.out.println("-------");
        System.out.println("New stock added. Returning to menu.");
        System.out.println("-------");

        adminMenu();

    }
    private void createShorts() {
        System.out.println("-------");
        System.out.println("What is the product number for the shorts?");
        int productNum = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the name of the manufacturer?");
        String manufacturer = scanner.nextLine();
        System.out.println("What brand is the item?");
        String brand = scanner.nextLine();
        System.out.println("What is the item's price?");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("How many do we have in stock?");
        int stockNum = Integer.parseInt(scanner.nextLine());

        shorts.add(new Shorts(productNum, manufacturer, brand, price, stockNum));


        System.out.println("-------");
        System.out.println("New stock added. Returning to menu.");
        System.out.println("-------");

        adminMenu();

    }
    private void createTops() {
        System.out.println("-------");
        System.out.println("What is the product number for the tops?");
        int productNum = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the name of the manufacturer?");
        String manufacturer = scanner.nextLine();
        System.out.println("What brand is the item?");
        String brand = scanner.nextLine();
        System.out.println("Does the item has short sleeves? (y/n)");
        boolean isShortSleeve = scanner.nextLine().equalsIgnoreCase("y");
        System.out.println("What is the item's price?");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("How many do we have in stock?");
        int stockNum = Integer.parseInt(scanner.nextLine());

        tops.add(new Tops(productNum, manufacturer, brand, isShortSleeve, price, stockNum));

        System.out.println("-------");
        System.out.println("New stock added. Returning to menu.");
        System.out.println("-------");

        adminMenu();

    }
    private void createGifts() {
        System.out.println("-------");
        System.out.println("What is the product number for the gifts?");
        int productNum = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the name of the manufacturer?");
        String manufacturer = scanner.nextLine();
        System.out.println("What brand is the item?");
        String brand = scanner.nextLine();
        System.out.println("What sort of item is it?");
        String type = new Scanner(System.in).nextLine();
        System.out.println("What is the item's price?");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("How many do we have in stock?");
        int stockNum = Integer.parseInt(scanner.nextLine());

        gifts.add(new Gifts(productNum, manufacturer, brand, type, price, stockNum));

        System.out.println("-------");
        System.out.println("New stock added. Returning to menu.");
        System.out.println("-------");

        adminMenu();

    }
}
