package ejercicio5;

public class Train extends Vehicle {

    String powerSource;

    public Train(String brand, String model, int passengerNumber, int numbWheels, String color, int plateNumber, String powerSource) {
        super(brand, model, passengerNumber, numbWheels, color, plateNumber);
        this.powerSource = powerSource;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    @Override
    public String toString() {
        return super.toString() + " powerSource=" + powerSource;
    }

    @Override
    public String proposal() {
        return "Large vehicle that transports a lot of people and cargo, it's an economic and fast service";
    }
}
