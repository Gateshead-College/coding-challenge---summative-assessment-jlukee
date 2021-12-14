import products.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    Footballs[] fbls = new Footballs[4];
    Footwear[] ftwr = new Footwear[4];
    Tops[] tops = new Tops[4];
    Shorts[] shorts = new Shorts[4];
    Gifts[] gifts = new Gifts[4];


    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("----------");
        System.out.println("Welcome to ProDirectSoccer!");
        System.out.println("----------");

        main.initialise();

        main.mainMenu();
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
                System.out.println("Please see the following footwear");
                fbls[0].footballDesc();
                fbls[1].footballDesc();
                fbls[2].footballDesc();
                fbls[3].footballDesc();
                mainMenu();
                break;
            case 2:
                System.out.println("Please see the following footballs");
                ftwr[0].footwearDesc();
                ftwr[1].footwearDesc();
                ftwr[2].footwearDesc();
                ftwr[3].footwearDesc();
                mainMenu();
                break;
            case 3:
                System.out.println("Please see the following sports tops");
                tops[0].topsDesc();
                tops[1].topsDesc();
                tops[2].topsDesc();
                tops[3].topsDesc();
                mainMenu();
                break;
            case 4:
                System.out.println("Please see the following sports shorts");
                shorts[0].shortsDesc();
                shorts[1].shortsDesc();
                shorts[2].shortsDesc();
                shorts[3].shortsDesc();
                mainMenu();
                break;
            case 5:
                System.out.println("Please see the following gifts");
                gifts[0].giftDesc();
                gifts[1].giftDesc();
                gifts[2].giftDesc();
                gifts[3].giftDesc();
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
        fbls[0] = new Footballs(1, "Mitre", "Manchester United", 15.99, 3);
        fbls[1] = new Footballs(2, "Nike", "Newcastle United", 19.99, 2);
        fbls[2] = new Footballs(3, "Addidas", "Liverpool", 18.99, 5);
        fbls[3] = new Footballs(4, "Mitre", "Chelsea", 12.99, 9);

        ftwr[0] = new Footwear(5, "New Balance", "OneWave", 39.99, 7);
        ftwr[1] = new Footwear(6, "Nike", "Hypervenoms", 35.99, 11);
        ftwr[2] = new Footwear(7, "Addidas", "Quickstrike", 45.99, 6);
        ftwr[3] = new Footwear(8, "Puma", "Pele Edition", 62.99, 13);

        shorts[0] = new Shorts(9, "Nike", "Chelsea", 19.99, 7);
        shorts[1] = new Shorts(10, "Puma", "Juventus", 18.99, 11);
        shorts[2] = new Shorts(11, "New Balance", "Liverpool", 24.99, 6);
        shorts[3] = new Shorts(12, "Addidas", "Manchester United", 24.99, 13);

        tops[0] = new Tops(13, "Nike", "Chelsea", true, 45.99, 7);
        tops[1] = new Tops(14, "Puma", "Juventus", false, 42.99, 11);
        tops[2] = new Tops(15, "New Balance", "Liverpool", false, 49.99, 6);
        tops[3] = new Tops(16, "Addidas", "Manchester United", true, 49.99, 13);

        gifts[0] = new Gifts(17, "Sports Direct", "Chelsea", "Calendar", 9.99, 7);
        gifts[1] = new Gifts(18, "Sports Direct", "Juventus", "Flask", 4.99, 11);
        gifts[2] = new Gifts(19, "Sports Direct", "Liverpool", "Socks", 9.99, 6);
        gifts[3] = new Gifts(20, "Sports Direct", "Manchester United", "Calendar", 9.99, 13);
    }

}
