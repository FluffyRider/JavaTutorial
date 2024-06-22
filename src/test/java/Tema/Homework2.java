package Tema;

import org.testng.annotations.Test;


public class Homework2 {

    @Test
    public void metodatest() {
//afisamDA();
//afisareunutrei();
// comparatiemaimare();
// comparatiemaimmica();
        //numerepareimparezece();
        //parepanalazece();
        //numeredivizibilecu5();
        //suma2numere();
        //sumaNr10();
        //nrdivcu5(3);
        produs5();

    }

    //afisam Da de 5 ori da
    public void afisamDA() {
        for (int i = 0; i < 5; i++) {
            System.out.print(" DA ");
        }
    }

    //afisam Afisam in consola primele 3 numere de la 1 la 3
    public void afisareunutrei() {
        for (Integer i = 1; i <= 3; i++) {
            System.out.println(i);
        }
    }

    // afisam in consola nr cel mai mare
    public void comparatiemaimare() {
        int a = 15;
        int i = 20;
        if (a > i) {
            System.out.println(a);
        } else {
            System.out.println(i);
        }
    }

    // afisam in consola numarul cel mai mic
    public void comparatiemaimmica() {
        double a = 4.5;
        double i = 3.25;
        if (a < i) {
            System.out.println(a);
        } else {
            System.out.println(i);
        }
    }

    //pare impare pana la 10
    public void numerepareimparezece() {
        for (Integer i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Numarul " + i + " este par.");
            } else {
                System.out.println("Numarul " + i + " este impar.");

            }
        }
    }

    //numere pare pana la 10
    public void parepanalazece() {
        for (Integer i = 0; i <= 10; i++) {
            {
                if (i % 2 == 0) {
                    System.out.println("Numarul " + i + " este par.");

                }
            }

        }
    }
    //Afisam in consola numerele divizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    public void nrdivcu5(Integer index){
        if (index%5==0){
            System.out.println("Numarul "+index+" este divizibilcu 5");
        }
        else {
            System.out.println("Numarul "+index+" Nu este divizibil cu 5");
        }
    }


    //afisam primele 3 numere divizibile cu5
    public void numeredivizibilecu5() {
        int a = 1;
        int i = 15;
        System.out.println("Numere divizibile cu 5 ");
        for (int index = a; index <= i; index++) {
            if (index % 5 == 0) {
                System.out.println("numarul " + index + " este divizibil cu 5");

            }
        }
    }
        //Afisam adunara a doua numere
        public void suma2numere(){
        int x=235;
        int y=10;
        System.out.println(x+y);
    }
    //afisam suma numerelor pana la 10
    public void sumaNr10() {
        Integer suma = 0;
        for (Integer i=0; i<=10; i++){
            suma=suma + i;
        }
        System.out.println(suma);
    }

    //produsul numerelor pana la 5
    public void produs5(){
        Integer produs=1;
        for (Integer i=1;i<=5; i++){
            produs=produs *i;
        }
        System.out.println(produs);
    }

}
