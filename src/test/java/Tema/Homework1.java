package Tema;

import org.testng.annotations.Test;

public class Homework1 {

    public String Salut;
    public Integer Varsta;
    public String nume;
    public String Prenume;
    public String mesajsalut;
    public String mesajhello;
    public Character litH;
    public Character litM;
    public Character Anaaremere;
    public String mesajverificare;
    public Integer SalariuAndrei;
    public Integer IDAngajat;
    public String Departament;
    public String Propozitie;


    @Test
    public void problemeRez () {
        Salut = "Hello World";
        Varsta = 33;
        nume = "Vasile";
        Prenume = "Marius";
        mesajsalut = "Salut";
        mesajhello = "Hello";
        litH = 'H';
        litM = 'M';
        Anaaremere = 'z';
        mesajverificare = "potiplecaacasadupaceitiverificmunca";
        SalariuAndrei = 2000;
        IDAngajat = 66;
        Departament = "mecanicafina";
        Propozitie = "Ana are mere pere si prune";

        String[] vectorDeCuvinte = Propozitie.split(" ");

        for ( String fiecareCuvant : vectorDeCuvinte) {
            //aici avem 1 cuvant
            //System.out.println(sTemp);
            //System.out.println(sTemp.charAt(sTemp.length()-1));
            if (fiecareCuvant.charAt(fiecareCuvant.length()-1)=='a' || fiecareCuvant.charAt(fiecareCuvant.length()-1) =='e' ) {
                //aici avem 1 cuvant care se termina in vocala
                System.out.println(fiecareCuvant +"Z");

               // for (Propozitie.fiecareCuvant.length()-1
                //System.out.print(sTemp.charAt(sTemp.length()-1);

                //System.out.print(sTemp.charAt(sTemp.length()-1);

            }
        }
        System.out.println(Salut);
        System.out.println(Varsta);
        System.out.println(nume);
        System.out.println(Prenume);
        System.out.println(mesajsalut + litH);

    }
}

