package ejercicio3;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Juan Pablo Allin Cañas
 * @version 1.0
 */

public class Menu {

    static Scanner entry = new Scanner(System.in);
    static char response;
    Double[] numbers = new Double[10];
    DecimalFormat df = new DecimalFormat("#.00");

    public int Menu() {
        int option;
        System.out.print("\nCon cuál método quieres organizar la lista? \n" +
                "1- Algoritmo de la burbuja \n" +
                "2- Quicksort\n" +
                "\nSeleccionar opción: ");
        option = entry.nextInt();
        return option;
    }

    public void chooseSortMethod() {

        /**
         * Displays menu from showMenu(): Contains a switch,
         * executes case based on returned int from showMenu().
         * Creation of an exception handling in case the user enters an input different
         * from int.
         */
        try {
            int option = Menu();
            switch (option) {
                case 1:
                    bubbleOrright();
                    chooseSortMethod();
                    break;
                case 2:
                    getArray();
                    quickSort(numbers, 0, numbers.length-1);
                    System.out.println("\nArreglo ordenado con quick sort: \n");
                    for (int i = 0; i < numbers.length; i++)
                        System.out.println(df.format(numbers[i]));
                        chooseSortMethod();
                    break;
                default:
                    System.out.println("\nNo es una selección válida!\n");
                    chooseSortMethod();
            }
        } catch (InputMismatchException e) {
            System.out.println("\nDebes ingresar un número entero! Corre de nuevo el programa\n");
            entry.nextLine();
        }
    }

    /**
     * Adds random numbers to the array.
     * 
     * @return
     */
    public Double[] getArray() {

        System.out.println("\nLista de números reales aleatorios: \n");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (Math.random() * 20 + 1);
            System.out.println(df.format(numbers[i]));
        }
        return numbers;
    }

    /**
     * 
     * @param numbers Array that's going to be orrighted.
     * @return Returns orrighted Array.
     */
    public static Double[] bubble(Double[] numbers) {
        Double aux;
        Double[] orrightedArray;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        }
        orrightedArray = numbers;
        return orrightedArray;
    }

    /**
     * Display orrighted array using Bubble algoritm.
     */
    public void bubbleOrright() {
        Double[] orrightedArray = bubble(getArray());
        System.out.println("\nArreglo ordenado con bubble sort\n");
        for (int i = 0; i < orrightedArray.length; i++)
            System.out.println(df.format(orrightedArray[i]));
    }

    /**
     * 
     * @param numbers Array
     * @param left Starting index.
     * @param right Ending index.
     */
    public static void quickSort(Double [] numbers, int left, int right) {

        /**
         *Takes first element as pivot.
         */
        Double pivot = numbers [left]; 
        int i = left;         
        int j = right;      
        Double aux;
        
        /**
         * Find the element less than the pivot and the element greater than the pivot.
         * If i < j, exchance the positions.
         */
        while (i < j){                          
            while (numbers[i] <= pivot && i < j) i++; 
            while (numbers[j] > pivot) j--; 
            if (i < j) {  
                aux= numbers[i]; 
                numbers[i]=numbers[j];
                numbers[j]=aux;
            }
        }
        /**
         * Smaller numbers to the left in the array and bigger numbers to the right.
         */
        numbers[left]=numbers[j];    
        numbers[j]=pivot;      

        if (left < j-1)
            quickSort(numbers,left,j-1);   
        if(j+1 < right)
            quickSort(numbers,j+1,right);
    }
}
