package ejercicio5;
/** 
 * Creación clase Camión.
 *  @author Juan Pablo Allin Cañas
 *  @version 1.0 
 */
public class Truck extends Vehicle{

    int truckHeight;

    public Truck(String brand, String model, int passengerNumber, int numbWheels, String color, int plateNumber,
            int truckHeight) {
        super(brand, model, passengerNumber, numbWheels, color, plateNumber);
        this.truckHeight = truckHeight;
    }

    public int getTruckHeight() {
        return truckHeight;
    }

    public void setTruckHeight(int truckHeight) {
        this.truckHeight = truckHeight;
    }
    
    @Override
    public String toString() {
        return super.toString() + " TruckHeight: " + truckHeight;
    }

    @Override
    public String proposal() {
        return "Big vehicle that transports people but it's mostly used to transport large amounts of goods";
    }
}
