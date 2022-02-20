package ejercicio1;

import java.util.Scanner;

/** 
 *  @author Juan Pablo Allin Cañas
 *  @version 1.0 
 */
public class Main {

    static SolarSystem sl=new SolarSystem("Solar System");
    static Scanner entry = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu();
    }
    
    private static void mainMenu() {
        int optionMenu;
        System.out.println("\n1- Calculate distance between two objects of solar system" +  
                            "\n2- Calculate gravitacional attraction" +
                            "\n3- Display solar system") ;
       
        do {
            System.out.println("\nSelect the option: ");
            optionMenu = entry.nextInt();
            entry.nextLine();
            
            switch (optionMenu) {
                case 1:
                    sl.displaySolarSystem();
                    System.out.println("\nInput the name of the first object: ");
                    String str1 = entry.nextLine();
                    String str2="";
                    SystemObject obj1=sl.getObject(str1);
                    SystemObject obj2=null;
                    if (obj1==null) {
                        System.out.println("\nThe object does not exist");
                    }
                    else {
                        System.out.println("\nInput the name of the second object: ");
                        str2 = entry.nextLine();
                        obj2=sl.getObject(str2);
                        if (obj2==null) {
                            System.out.println("\nThe object does not exist.");
                        }
                        else { 
                            System.out.println("\nThe distance between the two objects is: " + (obj1.calculateDistance(obj2)/1000) + " Km");
                        }
                    }
                    mainMenu();
                    break;
                case 2:
                    System.out.println("\nInput the name of the first object: ");
                    String str3 = entry.nextLine();
                    String str4="";
                    SystemObject obj3=sl.getObject(str3);
                    SystemObject obj4=null;
                    if (obj3==null) {
                        System.out.println("\nThe object does not exist.");
                    }
                    else {
                        System.out.println("\nInput the name of the second object: ");
                        str4 = entry.nextLine();
                        obj4=sl.getObject(str4);
                        if (obj4==null) {
                            System.out.println("\nThe object does not exist.");
                        }
                        else { 
                            double calculo=obj3.getAttraction(obj4);
                            System.out.println("\nThe gravitacional attraction is: " + calculo + " Newton");
                        }
                    }
                    mainMenu();
                    break;
                case 3:
                    sl.displaySolarSystem();
                    mainMenu();
                
                default:
                System.out.println("\nNo es una selección válida!\n");
                mainMenu();
            }
        } while (optionMenu <1 || optionMenu >=4);
        System.out.println("\nThe program is over.");
    }
}