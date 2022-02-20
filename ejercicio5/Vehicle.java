package ejercicio5;

/** 
 * Creación clase abstracta Vehiculo.
 *  @author Juan Pablo Allin Cañas
 *  @version 1.0 
 */
public abstract class Vehicle implements IVehicle{
    
    String brand;
    String model;
    int passengerNumber;
    int numbWheels;
    String color;
    int plateNumber;

    protected Vehicle(String brand, String model, int passengerNumber, int numbWheels, String color, int plateNumber) {
        this.brand = brand;
        this.model = model;
        this.passengerNumber = passengerNumber;
        this.numbWheels = numbWheels;
        this.color = color;
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public int getNumbWheels() {
        return numbWheels;
    }

    public void setNumbWheels(int numbWheels) {
        this.numbWheels = numbWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + " Model: " + model + " Color: "+ color + " NumbWheels: " + numbWheels + " passengerNumber: "
                + passengerNumber + " plateNumber: " + plateNumber;
    }

    @Override
    public abstract String proposal();
  
}