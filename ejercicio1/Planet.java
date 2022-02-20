package ejercicio1;

/** 
 *  @author Juan Pablo Allin Cañas
 *  @version 1.0 
 */
public class Planet extends SystemObject {

    /**
     * Instancia del objeto planeta.
     * @param name Nombre del planeta.
     * @param mass Masa del planeta.
     * @param middleDistance Distancia media del planeta al objeto de referencia.
     * @param diameter Diámetro del planeta.
     * @param referenceObject Objeto donde realiza la órbita.
     */
    public Planet(String name, double mass, double middleDistance, 
            double diameter, SystemObject referenceObject) {
        super(name, mass, middleDistance,diameter, referenceObject);
    }
}