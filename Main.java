package laptop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LaptopBase myLaptop = new Toshiba(); // Bisa diganti dengan MacBook()

        while (true) {
            System.out.println("\nInput command (ON, OFF, UP, DOWN, EXIT):");
            String input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "ON":
                    myLaptop.powerOn();
                    break;
                case "OFF":
                    myLaptop.powerOff();
                    break;
                case "UP":
                    myLaptop.volumeUp();
                    break;
                case "DOWN":
                    myLaptop.volumeDown();
                    break;
                case "EXIT":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }
}
