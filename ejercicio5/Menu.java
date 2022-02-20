package ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    static Scanner entry = new Scanner(System.in);
    /**
     * Objeto de la lista de vehiculos.
     */
    static List<Vehicle> vehicles = new ArrayList<Vehicle>();

    public static void createVehicle(){
        int option;
        for (int index = 1; index <= 10; index++) {
            
            do {
                System.out.println("\nWhat type of vehicle do you want to create?");
                System.out.println("\n1. Car");
                System.out.println("\n2. Motorcycle");
                System.out.println("\n3. Truck");
                System.out.println("\n4. Train");
                System.out.println("\n5. Boat");
                System.out.print("\nOpción: ");
                /**
                 * Ingresar la opción correspondiente al vehiculo que se quiere crear.
                 */
                option = entry.nextInt();
                entry.nextLine();
            /**
             * Se devuelve a elegir al vehiculo que se quiere crear si la opción digitada es menor a 1 o mayor a 5.
             */
            }while(option<1 || option>5);

            switch(option){

                /**
                 * Carro.
                 */
                case 1: createCar();
                    break;

                /**
                 * Moto.
                 */
                case 2: createMotorcycle();
                    break;

                /**
                 * Camión.
                 */
                case 3: createTruck();
                    break;

                /**
                 * Tren.
                 */
                case 4: createTrain();
                    break;
                /**
                 * Barco.
                 */
                case 5: createBoat();
                    break;
            }
        }
    }

    public static void createCar(){
        String brand;
        String model;
        int passengerNumber;
        int numbWheels;
        String color;
        int plateNumber;
        int numDoors;

        System.out.print("\nBrand: ");
        brand = entry.nextLine();

        System.out.print("Model: ");
        model = entry.nextLine();

        System.out.print("Number of passengers: ");
        passengerNumber = Integer.valueOf(entry.nextLine());

        System.out.print("Number of wheels: ");
        numbWheels = Integer.valueOf(entry.nextLine());

        System.out.print("\nColor: ");
        color = entry.nextLine();

        System.out.print("Plater number: ");
        plateNumber = Integer.valueOf(entry.nextLine());

        System.out.print("Number of doors: ");
        numDoors = Integer.valueOf(entry.nextLine());
        /**
         * Objeto de la clase carro.
         */
        Car car = new Car( brand,  model,  passengerNumber,  numbWheels,  color,  plateNumber, numDoors);
        
        /**
         *Se guarda el carro dentro de la lista de vehiculos.
         */
        vehicles.add(car);
    }

    public static void createMotorcycle(){
        String brand;
        String model;
        int passengerNumber;
        int numbWheels;
        String color;
        int plateNumber;
        int velocity;

        System.out.print("\nBrand: ");
        brand = entry.nextLine();

        System.out.print("Model: ");
        model = entry.nextLine();

        System.out.print("Number of passengers: ");
        passengerNumber = Integer.valueOf(entry.nextLine());

        System.out.print("Number of wheels: ");
        numbWheels = Integer.valueOf(entry.nextLine());

        System.out.print("\nColor: ");
        color = entry.nextLine();

        System.out.print("Plater number: ");
        plateNumber = Integer.valueOf(entry.nextLine());

        System.out.print("Velocity: ");
        velocity = Integer.valueOf(entry.nextLine());
        /**
         * Objeto de la clase moto.
         */
        Motorcycle motorcycle = new Motorcycle( brand,  model,  passengerNumber,  numbWheels,  color,  plateNumber, velocity);
        
        /**
         *Se guarda la moto dentro de la lista de vehiculos.
         */
        vehicles.add(motorcycle);
    }


    public static void createTrain(){
        String brand;
        String model;
        int passengerNumber;
        int numbWheels;
        String color;
        int plateNumber;
        String powerSource;

        System.out.print("\nBrand: ");
        brand = entry.nextLine();

        System.out.print("Model: ");
        model = entry.nextLine();

        System.out.print("Number of passengers: ");
        passengerNumber = Integer.valueOf(entry.nextLine());

        System.out.print("Number of wheels: ");
        numbWheels = Integer.valueOf(entry.nextLine());

        System.out.print("\nColor: ");
        color = entry.nextLine();

        System.out.print("Plater number: ");
        plateNumber = Integer.valueOf(entry.nextLine());

        System.out.print("Power source: ");
        powerSource = entry.nextLine();
        /**
         * Objeto de la clase tren.
         */
        Train train = new Train(brand,  model,  passengerNumber,  numbWheels,  color,  plateNumber, powerSource);
        
        /**
         *Se guarda el tren dentro de la lista de vehiculos.
         */
        vehicles.add(train);
    }

    public static void createTruck(){
        String brand;
        String model;
        int passengerNumber;
        int numbWheels;
        String color;
        int plateNumber;
        int truckHeight;

        System.out.print("\nBrand: ");
        brand = entry.nextLine();

        System.out.print("Model: ");
        model = entry.nextLine();

        System.out.print("Number of passengers: ");
        passengerNumber = Integer.valueOf(entry.nextLine());

        System.out.print("Number of wheels: ");
        numbWheels = Integer.valueOf(entry.nextLine());

        System.out.print("\nColor: ");
        color = entry.nextLine();

        System.out.print("Plater number: ");
        plateNumber = Integer.valueOf(entry.nextLine());

        System.out.print("Height: ");
        truckHeight = Integer.valueOf(entry.nextLine());
        /**
         * Objeto de la clase camión.
         */
        Truck truck = new Truck( brand,  model,  passengerNumber,  numbWheels,  color,  plateNumber, truckHeight);
        
        /**
         *Se guarda el camión dentro de la lista de vehiculos.
         */
        vehicles.add(truck);
    }

    public static void createBoat(){
        String brand;
        String model;
        int passengerNumber;
        int numbWheels;
        String color;
        int plateNumber;
        int cargoCapacity;

        System.out.print("\nBrand: ");
        brand = entry.nextLine();

        System.out.print("Model: ");
        model = entry.nextLine();

        System.out.print("Number of passengers: ");
        passengerNumber = Integer.valueOf(entry.nextLine());

        System.out.print("Number of wheels: ");
        numbWheels = Integer.valueOf(entry.nextLine());

        System.out.print("Color: ");
        color = entry.nextLine();

        System.out.print("Plater number: ");
        plateNumber = Integer.valueOf(entry.nextLine());

        System.out.print("Number of doors: ");
        cargoCapacity = Integer.valueOf(entry.nextLine());
        /**
         * Objeto de la clase Bote.
         */
        Boat boat = new Boat( brand,  model,  passengerNumber,  numbWheels,  color,  plateNumber, cargoCapacity);
        
        /**
         *Se guarda el bote dentro de la lista de vehiculos
         */
        vehicles.add(boat);
    }

    public static void showVehiclesCreated(){
        /**
         * Se recorre el arreglo de los vehiculos creados y muestra las características de cada uno.
         */
        for (Vehicle vehicle: vehicles) {
            System.out.println("\n" + vehicle.toString());
            System.out.println("\nPropose: "+vehicle.proposal());   
            System.out.println("");     
        }
    }
}
