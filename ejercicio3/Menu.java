package ejercicio3;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    static Scanner entry = new Scanner(System.in);
    static char response;
    Double [] numbers = new Double[5];
    DecimalFormat df = new DecimalFormat("#.00");
    
    public int Menu() {
        int option;
        System.out.print("\nCon cuál método quieres organizar la lista? \n" +
                "1- Algoritmo de la burbuja \n" +
                "2- Salir \n" +
                "3- Salir" +
                "\n\nSeleccionar opción: ");
        option = entry.nextInt();
        System.out.print("\n");
        return option;
    }

    public void chooseSortMethod() {

        /**
         * Displays menu from showMenu(): Contains a switch,
         * executes case based on returned int from showMenu().
         * Creation of an exception handling in case the user enters an input different from int.
         */
            try {
                int option = Menu();
                switch (option) {
                    case 1:
                        BubbleOrder();
                        chooseSortMethod();
                        break;                    
                    case 2:
                        System.exit(option);
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
     * @return
     */    
    public Double[] getArray() {
        
        System.out.println("\nLista de números reales aleatorios: \n");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (Math.random() *20 + 1);
            System.out.println(df.format(numbers[i]));
        }
        return numbers;
    }
    /**
     * 
     * @param numbers Array that's going to be ordered.
     * @return Returns ordered Array.
     */
    public static Double[] Burbuja(Double[] numbers) {
        Double auxiliar;
        Double[] arregloOrdenado;
        for(int i = 1; i < numbers.length; i++) {
            for(int j = 0;j < numbers.length-i;j++) {
                if(numbers[j] > numbers[j+1]) {
                    auxiliar = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = auxiliar;
                }   
            }
        }
        arregloOrdenado = numbers;
        return arregloOrdenado;
    }
    /**
     * Display ordered array using Bubble algoritm.
     */
    public void BubbleOrder(){
        Double arregloOrdenado[] = Burbuja(getArray());
        System.out.println("\nArreglo ordenado con bubble sort\n");
        for(int i = 0; i < arregloOrdenado.length;i++)
            System.out.println(df.format(arregloOrdenado[i]));
    }
    
}
