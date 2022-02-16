package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    ArrayList<Planet> planetList = new ArrayList<Planet>();
    ArrayList<Planet> planetSelected = new ArrayList<Planet>();

    Scanner entry = new Scanner(System.in);

    /**
     * Display a menu, prompts for user input (int selection), and returns the
     * input.
     *
     * @return int
     */
    public int mainMenu() {
        int option;
        System.out.print("\nQué te gustaría hacer? \n" +
                "1- Añadir planeta de lista de planetas\n" +
                "2- Ver planetas escogidos \n" +
                "\n\nSeleccionar opción: ");
        option = entry.nextInt();
        System.out.print("\n");
        return option;
    }

    /**
     * Displays menu from showMenu(): Contains a switch,
     * executes case based on returned int from showMenu().
     * Creation of an exception handling in case the user enters an input different
     * from int.
     */
    public void runMenu() {
        int option = mainMenu();
        switch (option) {
            case 1:
                runMenu();
                break;
            case 2:
                runMenu();
                break;
            default:
                System.out.println("\nNo es una selección válida!\n");
                runMenu();
        }
    }

    public void planetList() {
        planetList.add(new Planet(1, "Mercurio", 3.303E23, 5427.0, 4879.0, 5.79E7));
        planetList.add(new Planet(2, "Venus", 4.87E24, 5243.0, 12104.0, 1.082E8));
        planetList.add(new Planet(3, "Tierra", 5.976E24, 5514.0, 12756.0, 1.496E8));
        planetList.add(new Planet(4, "Marte", 6.42E23, 3933.0, 6794.0, 2.279E8));
        planetList.add(new Planet(5, "Júpiter", 1.90E27, 1326.0, 142984.0, 7.786E8));
        planetList.add(new Planet(6, "Saturno", 5.69E26, 687.0, 120536.0, 1.4335E9));
        planetList.add(new Planet(7, "Urano", 8.7E25, 1271.0, 51118.0, 2.8725E9));
        planetList.add(new Planet(8, "Neptuno", 1.03E26, 1638.0, 49528.0, 4.4951E9));
    }


}
