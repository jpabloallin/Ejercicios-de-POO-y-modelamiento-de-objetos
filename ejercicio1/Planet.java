package ejercicio1;

public class Planet {
    int id;
    String name;
    Double mass;
    Double density;
    Double diameter;
    Double distanceFromSun;
    
    public Planet(int id, String name, Double mass, Double density, Double diameter, Double distanceFromSun) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceFromSun = distanceFromSun;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public Double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(Double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    @Override
    public String toString() {
        return "id: " + id + " name: " + name + " mass: " + mass + " density: " + density + " diameter: " + diameter + " distanceFromSun: " + distanceFromSun;
    }

    
}


