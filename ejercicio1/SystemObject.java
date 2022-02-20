package ejercicio1;

/** 
 *  @author Juan Pablo Allin Cañas
 *  @version 1.0 
 * Creación de la clase System Object 
 */
public abstract class SystemObject implements Comparable<SystemObject>{

    private double mass;
    private double density;
    private double diameter;
    private double middleDistance;
    String name;
    String ordering="distance";
    final static double G = 6.6726E-11;
    private SystemObject referenceObject;

    public SystemObject(String name, double mass, double diameter) {
        this.name=name;
        this.mass=mass;
        this.middleDistance=0L;
        this.diameter=diameter;
    }
    
    public SystemObject(String name, double mass, double middleDistance, double diameter,
            SystemObject referenceObject) {
        this.name=name;
        this.mass=mass;
        this.middleDistance=middleDistance;
        this.referenceObject=referenceObject;
        this.diameter =diameter;
    }

    public double getMass() {
        return mass;
    }

    public void setMasa(double masa) {
        this.mass = masa;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getMiddleDistance() {
        return middleDistance;
    }

    public void setMiddleDistance(double middleDistance) {
        this.middleDistance = middleDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SystemObject getReferenceObject() {
        return referenceObject;
    }

    public void setReferenceObject(SystemObject referenceObject) {
        this.referenceObject = referenceObject;
    }

    public boolean equals(SystemObject objectSystem){
        return this.name.equals(objectSystem.name);
    }
    
    /**
     * Calcula la atracción entre dos objetos del sistema solar.
     * @param systemObject Objeto sobre el que se calcula la atracción gravitoria.
     * @return Valor de la atracción.
     */
    public double getAttraction(SystemObject systemObject) {
        
        double distancyBetweenOjects = this.calculateDistance(systemObject);
        double numerator=(this.mass * systemObject.mass * SystemObject.G);
        double distance=distancyBetweenOjects;
        double denominator = distance * distance;
        double attraction= numerator / denominator;
        return attraction;
    }

    /**
     * Calcula la distancia entre dos objetos del sistema planetario.
     * @param systemObject Objeto hasta el que se calcula la distancia.
     * @return Distancia.
     */
    public double calculateDistance(SystemObject objectSystem) {
        double distance1=calculateDistanceToReferenceObject(this);      
        double distance2=calculateDistanceToReferenceObject(objectSystem);
        
        return Math.abs(distance1-distance2)*1000; //metros
    }
    
    /**
     * Retorna el objeto sobre los datos.
     * @return Imprime datos.
     */
    @Override
    public String toString(){
        String textOut="";
        textOut +="Name:          " + this.name + "\n";
        textOut +="Mass:            " + (this.mass) + "Kg\n";
        textOut +="Diameter:        " + (this.diameter) + " Km\n";
        textOut +="Distance to " + this.referenceObject.name + ": " + (this.middleDistance)  + " Km\n";
        
        return textOut;
    }
    
    /**
     * Método de comparación de objetos
     * @param o Objeto a comparar
     * @return Entero
     */
    @Override
    public int compareTo(SystemObject o) {
        switch (ordering) {
            case "name":
                return this.name.compareTo(o.name);
            case "distance":
                if (calculateDistanceToReferenceObject(this) >= calculateDistanceToReferenceObject(o)) {
                    return 1;
                }
                else {
                    return -1;
                }
            case "size":
                if (this.diameter >= o.diameter) {
                    return 1;
                }
                else {
                    return -1;
                }
            case "mass":                
                if (this.mass >= o.mass) {
                    return 1;
                }
                else {
                    return -1;
                }
        }  
        return 0;
    }

    /**
     * Calcular la distancia hasta el objeto de referencia del sistema planetario.
     * @param objectInitialSystem Objeto inicial desde donde se calcula la distancia.
     * @param SystemObject Objeto hasta donde se calculará la distancia.
     * @return Distancia entre los dos objetos.
     */
    private double calculateDistanceToReferenceObject(SystemObject objectInitialSystem){
        double distance = objectInitialSystem.middleDistance;        
        if (!objectInitialSystem.referenceObject.referenceObject.equals(objectInitialSystem.referenceObject)) {
            distance += calculateDistanceToReferenceObject(objectInitialSystem.referenceObject);
        }
        return distance;
    }
}
