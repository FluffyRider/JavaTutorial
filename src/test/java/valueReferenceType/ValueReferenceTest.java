package valueReferenceType;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ValueReferenceTest {
    //Primitive: - int, double, float, char, boolean, long
    //Non-Primitive (referinta) - String, Object, Array
    //Static - valoare care se pastreaza pentru toate instantele dintr-o clasa
    //Final - defineste o constanta care nu isi poate modifica valoarea intiala
    //Wrapper class - constructie de clasa care este facut pe baza unui tip de data primitiva (int Int)

        //Primitiva
    public int originalInt = 10;
    public String originalString = "Alt Exemplu";
    public Curs cursTestare = new Curs("Curs testare automata", "Testare Automata", 1);
    public final int nrCursanti = 16;
    public Integer defaultWrapper;
    public int defaultPrimnitive;

    @Test
    public void metodaTest(){
        System.out.println("1. VALUE TYPE");
        valueTyoeExample(originalInt);
        System.out.println("valoarea initiala este: " + originalInt);

        System.out.println("2.Reference type String");
        referenceTypeStringExample(originalString);
        System.out.println("Valoarea initiala este: " + originalString );

        System.out.println("3 reference Type object");
        referenceTypeObjectExample(cursTestare);
        System.out.println("valoare initiala este: ");
        cursTestare.perzentareCurs();
        System.out.println("4 Constant");
        //nrCursanti = nrCursanti +10;


        System.out.println("5 Value Type Wrapper Class");

        defaultValue();

    }

    public void valueTyoeExample(int value){
        value = value + 5;
        System.out.println("valoarea noue este:" + value);
    }

    public void referenceTypeStringExample(String value){
        value= value + "Exemplu";
        System.out.println("valoarea noue este:" + value);

    }
    public void referenceTypeObjectExample(Curs Obiect){
        Obiect.perzentareCurs();
        Obiect.setTitlu("Testare manuala");
        Obiect.perzentareCurs();

    }
    public void defaultValue(){
        System.out.println(defaultWrapper);
        System.out.println(defaultPrimnitive);

        Integer [] Array = new Integer[5];
        List<Integer> list = new ArrayList<>();


    }

}
