package ejercicio5;

public class Boat extends Vehicle {

    int cargoCapacity;

    public Boat(String brand, String model, int passengerNumber, int numbWheels, String color, int plateNumber, int cargoCapacity) {
        super(brand, model, passengerNumber, numbWheels, color, plateNumber);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    
    @Override
    public String toString() {
        return super.toString() +" CargoCapacity: " + cargoCapacity;
    }

    @Override
    public String proposal() {
        return "Vehicle that transports people and cargo across rivers, seas, etc";
    }
}
