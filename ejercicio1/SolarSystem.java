package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

/** 
 *  @author Juan Pablo Allin Cañas
 *  @version 1.0 
 */
public class SolarSystem {
    
    /**
     * Instancia del sistema solar
     * @param name 
     */
    public SolarSystem(String name){
        this.name=name;
        createSolarSystem();
    }
    
    String name;
    public ArrayList<SystemObject> solarSystem = new ArrayList();
            
    /**
     * Ordena el ArrayList de objetos del sistema
     * @param orden Orden 
     */
    public  void sort(String order){
        for (SystemObject obj : solarSystem) {
            obj.ordering=order;
        }
        Collections.sort(solarSystem);
    }
    
    /**
     * Obtiene un objeto con el nombre
     * @param name Nombre del objeto
     * @return Objeto del sistema
     */
    public SystemObject getObject(String name){
        for (SystemObject objectSystem : solarSystem) {
            if (objectSystem.name.toUpperCase().contains(name.toUpperCase())) {
                return objectSystem;
            }
        }
        return null;
    }
    
    private void createSolarSystem(){
        Star sol=new Star("Sol", 1.9891E30, 1392000);
        
        Planet mercurio=new Planet("Mercurio",3.302E23,57909175, 4879.4, sol);
        Planet venus=new Planet("Venus",5.9742E24,108200000,12103.6, sol);
        Planet tierra=new Planet("Tierra",5.9742E24,149597870,12742, sol);
        Planet marte=new Planet("Marte", 6.4191E23, 227936640,6779, sol);
        Planet jupiter=new Planet("Jupiter",1.8987E27,778412010,139822, sol);
        Planet saturno=new Planet("Saturno",5.6851E26,1426725400f,116464,sol);
        Planet urano=new Planet("Urano", 8.6849E25, 2870972200f,50724, sol);
        Planet neptuno=new Planet("Neptuno",1.0244E26,4498252900f,49244, sol);
        Planet pluton=new Planet("Pluton",1.25E22,5913520000f,2320, sol);
                
        solarSystem.add(sol);
        solarSystem.add(mercurio);
        solarSystem.add(venus);
        solarSystem.add(tierra);
        solarSystem.add(marte);
        solarSystem.add(jupiter);
        solarSystem.add(saturno);
        solarSystem.add(urano);
        solarSystem.add(neptuno);
        solarSystem.add(pluton);
    }

    public void displaySolarSystem(){
        for (int i = 0; i < solarSystem.size(); i++) {
            System.out.println(solarSystem.get(i).toString());
        }
    }
}
