package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.example.Main.log;

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

    public Felino(String nombre, Boolean esAlfa) {
        this.nombre = nombre;
        this.esAlfa = esAlfa;
    }

    public Boolean esAlfaMayor(){
        Boolean esAM= esAlfa &&  edad > 10;
        if(esAM){ log1.info("el tigre es mayor y alfa "+ this.esAlfa +" "+ this.edad);}
        return esAM;
    }

    public void correr (){
        log1.info("El leon esta corriendo a esta hora");

    }

    public boolean esMayorA10(){
return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        if(edad >= 0){
            this.edad = edad;
        }
        else{
            log1.error("ingresó un edad inválida valor:"+ edad );
            throw new IllegalArgumentException("Ingrese una edad válida");
        }
    }

    public Boolean getEsAlfa() {
        return esAlfa;
    }

    public void setEsAlfa(Boolean esAlfa) {
        this.esAlfa = esAlfa;
    }
}
