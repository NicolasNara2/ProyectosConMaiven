package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Felino {

    private String nombre;
    private Integer edad;
    private Boolean esAlfa;
    static Logger log1 = LogManager.getLogger("prueba");


    public Felino(String nombre, Integer edad, Boolean esAlfa) {
        this.nombre = nombre;
        this.edad = edad;
        this.esAlfa = esAlfa;
    }

    public void correr (){
        log1.info("El leon esta corriendo a esta hora");

    }

    public boolean esMayorA10(){
return true;
    }


}
