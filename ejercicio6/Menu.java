package ejercicio6;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Menu {
    
    Vector<Integer> vector = new Vector<Integer>();
    Integer previous = null;

    public void receiveNumbers() {
        
        try (Scanner entry = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nIngresa un número: \n");
                int number = entry.nextInt();
    
                if (previous != null && previous == number){
                    break;
                }
    
                vector.add(number);
                previous = number;
            }
        }
        System.out.println("vector: " + vector);
    }
}


