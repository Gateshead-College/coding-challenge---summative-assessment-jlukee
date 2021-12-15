import products.*;

import java.util.ArrayList;
import java.util.Arrays;
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

    public void adminMenu() {
        System.out.println("Please choose one of the options below");
        System.out.println("1 - View Stock");
        System.out.println("2 - Alter Stock");
        System.out.println("3 - Exit");
        System.out.println("--------");
        Byte choice = Byte.parseByte(scanner.nextLine());
        switch (choice) {
            case 1:
                mainMenu();
                break;
            case 2:
                createFootballs();
                break;
            case 3:
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Invalid option, please try again.");
                adminMenu();
        }
    }


    public void mainMenu() {
        System.out.println("Please choose one of the options below to view our current stock");
        System.out.println("1 - Footballs");
        System.out.println("2 - Footwear");
        System.out.println("3 - Sports Tops");
        System.out.println("4 - Sports Shorts");
        System.out.println("5 - Gifts");
        System.out.println("6 - Exit");
        System.out.println("----------");
        byte choice = scanner.nextByte();
        System.out.println("----------");

        switch (choice) {
            case 1:
                System.out.println("Please see the following footballs");
                for(int i = 0; i < fbls.size(); i++) {
                    fbls.get(i).footballDesc();
                }
                mainMenu();
                break;
            case 2:
                System.out.println("Please see the following footwear");
                for(int i = 0; i < ftwr.size(); i++) {
                    ftwr.get(i).footwearDesc();
                }
                mainMenu();
                break;
            case 3:
                System.out.println("Please see the following sports tops");
                for(int i = 0; i < tops.size(); i++) {
                    tops.get(i).topsDesc();
                }
                mainMenu();
                break;
            case 4:
                System.out.println("Please see the following sports shorts");
                for(int i = 0; i < shorts.size(); i++) {
                    shorts.get(i).shortsDesc();
                }
                mainMenu();
                break;
            case 5:
                System.out.println("Please see the following gifts");
                for(int i = 0; i < gifts.size(); i++) {
                    gifts.get(i).giftDesc();
                }
                mainMenu();
                break;
            case 6:
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Invalid choice, please try again");
                System.out.println("--------");
                mainMenu();
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
        System.out.println("What is the footballs identifying number?");
        Integer productNum = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the name of the manufacturer?");
        String manufacturer = scanner.nextLine();
        System.out.println("What brand is the item?");
        String brand = scanner.nextLine();
        System.out.println("What is the item's price?");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("How many do we have in stock?");
        Integer stockNum = Integer.parseInt(scanner.nextLine());

        fbls.add(new Footballs(productNum, manufacturer, brand, price, stockNum));

        adminMenu();


    }

}
