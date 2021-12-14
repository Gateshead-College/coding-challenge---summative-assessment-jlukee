import products.Footballs;
import products.Products;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    Products[] products = new Products[5];


    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("----------");
        System.out.println("Welcome to ProDirectSoccer!");
        System.out.println("----------");

        main.menu();

    }

    public void menu() {
        System.out.println("Please choose one of the options below to view our current stock");
        System.out.println("1 - Footwear");
        System.out.println("2 - Footballs");
        System.out.println("3 - Sports Tops");
        System.out.println("4 - Sports Shorts");
        System.out.println("5 - Gifts");
        System.out.println("6 - Exit");
        System.out.println("----------");
        byte choice = scanner.nextByte();
        System.out.println("----------");

        switch (choice) {
            case 1:
                System.out.println("--------");
                menu();
                break;
            case 2:
                System.out.println("---------");
                menu();
                break;
            case 3:
                System.out.println("----------");
                menu();
                break;
            case 4:
                menu();
                break;
            case 5:
                System.out.println("-----------");
                menu();
                break;
            case 6:
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Invalid choice, please try again");
                System.out.println("--------");
                menu();
        }
    }

}
