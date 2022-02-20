package ejercicio5;

/** 
 * Creación clase Moto.
 *  @author Juan Pablo Allin Cañas
 *  @version 1.0 
 */
public class Motorcycle extends Vehicle {

    int velocity;

    public Motorcycle(String brand, String model, int passengerNumber, int numbWheels, String color, int plateNumber, int velocity) {
        super(brand, model, passengerNumber, numbWheels, color, plateNumber);
        this.velocity = velocity;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return super.toString() + " Velocity:" + velocity;
    }

    @Override
    public String proposal() {
        return "Vehicle with 2 wheels that transports people and it's a great option to make fast delivery of products";
    }
    
}
