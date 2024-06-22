package Obiect;

import org.testng.annotations.Test;

public class SportivTest {

    @Test

    public void prezentareSportiv(){
        //instantiem un obiect de tipul sportiv
        Sportiv Ionut = new Sportiv("Vasile", "Gheorghe", 28, "M", "Haltere",
                true);
        Ionut.prezentareSportiv();
        Ionut.varsta = 29;
        Ionut.sportPracticat = "Footbal";
        Ionut.prezentareSportiv();
        Ionut.verificareVarsta();
        Ionut.marireSalar(15);



        System.out.println("-----------------------------");

        Sportiv Vali = new Sportiv("Exemplu", "Vali",
                17, "M", "pilot", false);

        Vali.prezentareSportiv();
        Vali.verificareVarsta();
        Vali.marireSalar(10);

        System.out.println("----------------------------------");

       Sportiv Dascalu = new Sportiv("Dascalu","Marius", 22, "M",
               "Baschet",true, 2000 );

       Dascalu.prezentareSportiv();
       Dascalu.verificareVarsta();
       Dascalu.marireSalar(25);




    }
}
