package Tema;

import org.testng.annotations.Test;

public class Fruct {

    // descriere fruct  6-7 fructe,

    public String nume;

    public String culoare;

    public String dimensiune;

    public Integer recoltare;

    public Double greutate;

    public Float pret;

    public Boolean estedesezon;

    public char dulce;

    @Test


    public void descriereFruct()

    {

        System.out.println("+++Fruct2+++");
        afisareoricefruct("Nuca", "maro","2cm",2020, 0.20, 0.40f, true, 'n' );

        System.out.println("+++Fruct3+++");
        afisareoricefruct("Rosie","rosie","7cm", 2024,20.1,1.5f, true,'y');

        System.out.println("+++Fruct4+++");
        afisareoricefruct("Bortocala","portocalie","9cm", 2024, 2.5,2f,false,'y' );

        System.out.println("+++Fruct5+++");
        afisareoricefruct("Banana","galben", "10cm",2024, 1.3, 1.4f, false, 'y');

        System.out.println("+++Fruct6+++");
        afisareoricefruct("Papaya","portocaliu", "7cm", 2056, 0.8, 2.6f, true, 'Y');

        System.out.println("+++Fruct7+++");
        afisareoricefruct("Dragon fruit","roz","8cm", 2033, 0.9, 3.4f, true,'y');

        System.out.println("+++Fruct8+++");
        afisareultimfruct("ananas","galben","22cm", true, 'y');





        nume = "pepene";
        culoare = "verde";
        dimensiune = "27cm";
        recoltare = 2023;
        greutate = 12.3;
        pret = 124.3f;
        estedesezon = true;
        dulce = 'Y';

        System.out.println("Fuctul este un " + nume);
        System.out.println("Fructu are culoarea " + culoare);
        System.out.println("Fructul are dimensiunea de " + dimensiune);
        System.out.println("Data recoltare " + recoltare);
        System.out.println("Fructul are greutatea de " + greutate);
        System.out.println("Fructul este de sezon " + estedesezon);
        System.out.println("Fructul are un gust dulce " + dulce);


    }


    public void afisareoricefruct(String nume, String culoare, String dimensiune, Integer recoltare, Double greutate, Float pret, Boolean estedesezon, char dulce)
    {

        System.out.println("Fuctul este un " + nume);
        System.out.println("Fructu are culoarea " + culoare);
        System.out.println("Fructul are dimensiunea de " + dimensiune);
        System.out.println("Data recoltare " + recoltare);
        System.out.println("Fructul are greutatea de " + greutate);
        System.out.println("Fructul este de sezon " + estedesezon);
        System.out.println("Fructul are un gust dulce " + dulce);
    }
    public void afisareultimfruct(String nume, String culoare, String dimensiune,Boolean estedesezon, char dulce) {

        System.out.println("Fuctul este un " + nume);
        System.out.println("Fructu are culoarea " + culoare);
        System.out.println("Fructul are dimensiunea de " + dimensiune);
        System.out.println("Fructul este de sezon " + estedesezon);
        System.out.println("Fructul are un gust dulce " + dulce);
    }
}



