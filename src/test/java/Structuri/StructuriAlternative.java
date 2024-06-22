package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Structuri alternative: If..Then..Else/Switch..Case


    @Test
    public void metodaTest() {
       // verificanrmaimare();
        //verificanrmaimarev2(8);
//        verificNrPar(7);
//        verificNrPar(6);
//        verificNrPar(0);
//        verificNrPar(-1);
//        verificNrPar(-2);
        zileleSaptamanii(7);


    }

    //verificam daca un numar este mai mare decat 10
    public void verificanrmaimare() {
        if (15 > 10) {
            System.out.println("Numarul 15 ii mai mare ca 10");
        } else {
            System.out.println("Numarul 15 nu ii mai mare ca 10");
        }
    }

    //verificam daca un numar este mai mare decat 10 - v2
    public void verificanrmaimarev2(Integer nr) {
        if (nr > 10) {
            System.out.println("Numarul" + nr + " ii mai mare ca 10");
        } else {
            System.out.println("Numarul" + nr + "nu ii mai mare ca 10");
        }


    }

    //verificam daca un numar este par si pozitiv

    public void verificNrPar(Integer nr) {
        //Daca vrem sa luam catul impartirii = / (divide)
        //Daca vrem s aluam restul impartirii = %(modulo)


        if (nr > 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul meu este pozitiv " + nr + " si par");

            } else {
                System.out.println("Numarul meu este pozitiv " + nr + " si impar");
            }
        } else if (nr < 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul meu este negativ " + nr + " si par");
            } else {
                System.out.println("Numarul meu este negativ " + nr + " si impar");
            }
        } else {
            System.out.println("Numarul este egal cu 0 ");

        }
    }

    //definim zilele saptamanii

    public void zileleSaptamanii (Integer zi){

        switch (zi){
            case 1:
                System.out.println("Astaazi este luni");
                break;
            case 2:
                System.out.println("Astazi este marti");
                break;
            case 3:
                System.out.println("Astazi este miercuri");
                break;
            case 4:
                System.out.println("Astazi este joi");
                break;
            case 5:
                System.out.println("Astazi este vineri");
                break;
            default:
                System.out.println("So terminat zilele  ");

        }
    }

}
