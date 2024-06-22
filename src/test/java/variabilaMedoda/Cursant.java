package variabilaMedoda;

import org.testng.annotations.Test;

public class Cursant {

    // Asta este un comentariu
    // Recunoastem o clasa intr-un fisier Java dupa cuvantul cheie class
    // Intr-un fisier Java putem avea o multime de clase pe care le diferentiem prin numele lor
    // Nu este un practice bun in Java sa avem intr-un fisier mai multe clase
    // In fiecare clasa trebuie sa definim un nume
    // Intelegem printr-o clasa ca fiind un sablon specific din viata reala
    // Intr-o clasa putem definii variabile si metode
    // Variabila = propietatea unei clase
    // Intr-o clasa putem avea o multime de variabile (ex. nume varsta adresa etc)
    // Variabilele se diferentiaza prin tip si nume
    // variabilele pot fi de doua feluri: global si local
    // Variabila globala = proprietate vizibila oriunde in cod
    // Variabila locala = proprietate vizibila doar in locul definit
    // Tipuri de date: string (sir de caractere), integer (numar intreg), double/float (numar cu zecimale/real), character (cand folosesti un singur caracter Y/N), boolean (true or false)

    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;

    // Metoda = actiunea unei clase
    // Intr-o clasa putem avea o multime de metode diferentiate prin numele acestora
    // Exista doua tipuri d emetode: void si return
    // Metoda Void = actiune pe care vrem sa o afisam/interpretam fara a fi nevoie sa o returnam
    // Pentru o metoda trebuie sa specificam un accces control (public), () si {}
@Test
    public void descrieCursantul () {
        nume = "Dascalu";
        prenume = "Marius";
        varsta = 41;
        adresa = "Traian Vasile, nr. 27";
        inaltime = 1.81;
        greutate = 95.00f;
        sex = 'M';
        areRestante = true;

        System.out.println(nume + "-" + prenume + "-" + varsta); // concatenare
        System.out.println("Numele cursantului este "  + nume);
        System.out.println("Prenumele cursantului este " + prenume);
        System.out.println("Cursantul are " + varsta + " de ani");
        System.out.println("Cursantul are adresa " + adresa + ".");
        System.out.println("Cursantul are inaltimea " + inaltime + ".");
        System.out.println("Cursantul are greutatea " + greutate + ".");
        System.out.println("Sexul " + sex +".");
        System.out.println("Restante " + areRestante);




    }
@Test
public void metodaTest(){
descrieCursant();
primestebursa();
}

    public void primestebursa(){
    Integer bursa=1000;
    System.out.println("Bursa cursantului este " +bursa);
}

public void descrieCursant(){
    nume = "Dascalu";
    prenume = "Marius";
    varsta = 41;
    adresa = "Traian Vasile, nr. 27";
    inaltime = 1.81;
    greutate = 95.00f;
    sex = 'M';
    areRestante = true;

    System.out.println(nume + "-" + prenume + "-" + varsta); // concatenare
    System.out.println("Numele cursantului este "  + nume);
    System.out.println("Prenumele cursantului este " + prenume);
    System.out.println("Cursantul are " + varsta + " de ani");
    System.out.println("Cursantul are adresa " + adresa + ".");
    System.out.println("Cursantul are inaltimea " + inaltime + ".");
    System.out.println("Cursantul are greutatea " + greutate + ".");
    System.out.println("Sexul " + sex +".");
    System.out.println("Restante " + areRestante);


}


}

