package ejercicio6;
import java.util.Scanner;
import java.util.Vector;

/** 
 * Creación clase Menu.
 *  @author Juan Pablo Allin Cañas
 *  @version 1.0 
 */
public class Menu {

    /**
     * Creación de vector de números enteros.
     */
    Vector<Integer> vector = new Vector<Integer>();
    Integer previous = null;

    public void receiveNumbers() {
        
        try (Scanner entry = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nInput a number: \n");
                int number = entry.nextInt();
                if (previous != null && previous == number){
                    break;
                }
                vector.add(number);
                previous = number;
            }
        }
        System.out.println("Vector: " + vector);
    }
}


