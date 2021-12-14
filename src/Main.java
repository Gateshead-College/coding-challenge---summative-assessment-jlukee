import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("----------");
        System.out.println("Welcome to ProDirectSoccer!");
        System.out.println("----------");

        main.menu();

    }

    public void menu() {
        List a = new ArrayList();
        a.add(0, "Nike Hypervenoms");
        a.add(1, "Mitre Footballs");
        a.add(2, "Manchester United Long Sleeve Tops");
        a.add(3, "Manchester United White Shorts");
        a.add(4, "Manchester United Calendars");

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
                System.out.println("We currently stock " + a.get(0));
                System.out.println("--------");
                menu();
                break;
            case 2:
                System.out.println("We currently stock " + a.get(1));
                System.out.println("--------");
                menu();
                break;
            case 3:
                System.out.println("We currently stock " + a.get(2));
                System.out.println("--------");
                menu();
                break;
            case 4:
                System.out.println("We currently stock " + a.get(3));
                menu();
                break;
            case 5:
                System.out.println("We currently stock " + a.get(4));
                System.out.println("--------");
                menu();
                break;
            case 6:
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Invalid choice, please try again");
                System.out.println("--------");
                menu();
                break;
        }
    }
}
