package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static Logger log;

    public static void main(String[] args) {

        log = LogManager.getLogger("prueba");

        log.info("Esto es un mensaje desde el main");

        Felino gato = new Felino("gato",2,true);
        gato.correr();
        gato.esAlfaMayor();

        Felino gato1 = new Felino("Garfield", 0, true);
        gato1.correr();
        gato1.esAlfaMayor();

        Felino gato3 = new Felino("Gato3", 1, false);
        gato3.correr();
        gato3.esAlfaMayor();

        Felino gato4 = new Felino("Gato4", 11, true);
        gato4.correr();
        gato4.esAlfaMayor();

        Felino gato5 = new Felino("Gato5", true);
        gato5.setEdad(-1);

    }


}
