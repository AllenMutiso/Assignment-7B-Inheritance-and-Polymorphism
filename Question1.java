/*
* Author: Allen Mutiso
* MTSALL002
* 23-September-2026
* Contains the main method and other helper methods.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {

    public static void done () {
        System.out.println("Done");
    }

    public static void intro () {
        System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
    }

    public static Part readCommonDetails(Scanner input) {
        System.out.println("Enter the serial number");
        int serialNumber = input.nextInt();
        input.nextLine(); // Consume the leftover newline character

        System.out.println("Enter the manufacturer");
        String manufacturer = input.nextLine();

        System.out.println("Enter the colour");
        String color = input.nextLine();

        // Return an instance of the Part class.
        return new Part(color, manufacturer, serialNumber);
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Great International Technology");
        intro();
        String response = input.nextLine().toLowerCase();

        // This list will store all the items created by the user.
        List<Part> items = new ArrayList<>();
 
        while (!response.equals("q")) {
            
            switch (response) {
            // Box
            case "b":  
                Part userPart = readCommonDetails(input);    

                System.out.println("Enter the amount of memory (MB)");
                int userMemory = input.nextInt();
                input.nextLine();

                Box userBox = new Box(userPart.getColor(), userPart.getManufacturer(), userPart.getSerialNumber(), userMemory);
                items.add(userBox);

                break;

            //Screen
            case "s": 
                Part userPart2 = readCommonDetails(input);

                System.out.println("Enter the screen size in inches");
                int userSize = input.nextInt();

                Box userScreen = new Box(userPart2.getColor(), userPart2.getManufacturer(), userPart2.getSerialNumber(), userSize);
                items.add(userScreen);

                break;

            //Accessory
            case "a":
                Part userPart3 = readCommonDetails(input);

                Accessory userAccessory = new Accessory(userPart3.getColor(), userPart3.getManufacturer(), userPart3.getSerialNumber());
                items.add(userAccessory);

                break;

            //Delete
            case "d":
                System.out.println("Enter the serial number");
                int dSerialNumber = input.nextInt();

                for (Part p : items) {
                   if (p.getSerialNumber() == dSerialNumber) {
                        items.remove(p);
                        done();
                   }
                   else {
                    System.out.println("Invalid serial number");
                   }
                }

                break;

            //List
            case "l":
                for (Part p: items) {
                    System.out.println(p.toString());
                }

                break;

            default:
                System.out.println("Valid inputs: B/S/A/D/L/Q");
                break;
            } 

            done();
            intro();
            response = input.nextLine().toLowerCase();   
        }

        input.close();
    }
}
