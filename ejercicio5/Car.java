package ejercicio5;

/** 
 * Creación clase Carro.
 *  @author Juan Pablo Allin Cañas
 *  @version 1.0 
 */
public class Car extends Vehicle {

    int numDoors;

    public Car(String brand, String model, int passengerNumber, int numbWheels, String color, int plateNumber,
            int numDoors) {
        super(brand, model, passengerNumber, numbWheels, color, plateNumber);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return super.toString() + " NumDoors: " + numDoors;
    }

    @Override
    public String proposal() {
        return "Vehicle with 4 wheels that transports people on the ground";
    }
    
}
