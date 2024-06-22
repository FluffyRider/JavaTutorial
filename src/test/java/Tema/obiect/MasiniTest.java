package Tema.obiect;

import org.testng.annotations.Test;
import variabilaMedoda.Masina;

public class MasiniTest {
    @Test

    public void testMethod() {

        Masini Dacia = new Masini("Dacia", "Sandero", "Galben", 2004,
                5000, 10500, true);

        Dacia.prezentareMasina();
        Dacia.numarkm = 130000;
        Dacia.masinaveche = false;
        Dacia.prezentareMasina();
        Dacia.verificareVechime();

        System.out.println("--------------");

        Masini Trabant = new Masini("VEB", "Trabant", "Alb", 1957, 145000,
                1000, true,0);
        Trabant.prezentareMasina();

        System.out.println("----------------------");

        Masini Skoda = new Masini("Skoda", "Octavia","verde", 2014,
                80000, null,false,60);
        Skoda.prezentareMasina();
        Skoda.verificareVechime();
                Masini Opel = new Masini("Opel","AstraJ","Negru", 2018,
                23000, 18300, false, 50);
        Opel.prezentareMasina();

        Masini Honda = new Masini("Honda", "Civic", "Albastru", 2002,
                44000, 10000, true, 80 );
        Honda.prezentareMasina();




    }


}
