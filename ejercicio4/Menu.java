package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** 
 *  @author Juan Pablo Allin Cañas
 *  @version 1.0 
 */
public class Menu {
    int passengerNumber;
    int numbWheels;
    int plateNumber;

    Scanner entry = new Scanner(System.in);
    List<Vehicle> vehicles = new ArrayList<Vehicle>();

    public void addVehicle() {
        // Read vehicle information from the user
        for (int index = 1; index <= 10; index++) {
            
            System.out.print("\nEnter brand, empty will end: ");
            String brand = entry.nextLine();
            if (brand.isEmpty()) {
                break;
            }

            System.out.print("\nEnter the model of the vehicle " + brand + ": ");

            String model = entry.nextLine();
            
            try {
                System.out.print("\nEnter the number of passengers in the vehicle " + brand + ": ");
                passengerNumber = Integer.valueOf(entry.nextLine());
            } catch (java.lang.NumberFormatException e) {
                System.out.println("\nYou must input an integer number! Run the program again!\n");
                break;
            }
            
            try {
                System.out.print("\nEnter the number of wheels of the vehicle " + brand + ": ");
                numbWheels = Integer.valueOf(entry.nextLine());
            } catch (java.lang.NumberFormatException e) {
                System.out.println("\nYou must input an integer number! Run the program again!\n");
                break;
            }
            
            System.out.print("\nEnter the color of the vehicle " + brand + ": ");
            String color = entry.nextLine();
            try {
                System.out.print("\nEnter the plate number of the vehicle " + brand + ": ");
                plateNumber = Integer.valueOf(entry.nextLine());
            } catch (java.lang.NumberFormatException e) {
                System.out.println("\nYou must input an integer number! Run the program again!\n");
                break;
            }
            
            // Add a new vehicle to the list.
            // The vehicle's informaton was decided by the user
            vehicles.add(new Vehicle(brand, model, passengerNumber, numbWheels, color, plateNumber));
        }

        // Print the number of the inputted vehicles, and the vehicless themselves
        System.out.println();
        System.out.println("Total number of vehicles: " + vehicles.size());
        System.out.println("\nVehicles: \n");

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
