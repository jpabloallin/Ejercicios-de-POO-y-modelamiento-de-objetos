package ejercicio1;

/** 
 *  @author Juan Pablo Allin Cañas
 *  @version 1.0 
 */
public class Star extends SystemObject {
    
    /**
     * Instancia del objeto Estrella
     * @param name Nombre de la estrella.
     * @param mass Masa de la estrella.
     * @param diameter Diametro de la estrella.
     */
    public Star(String name, double mass, double diameter) {
        super(name, mass, diameter);
        this.setReferenceObject(this);
    }
}
