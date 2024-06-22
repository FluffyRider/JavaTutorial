package Tema.obiect;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Masina2Test {


    @Test
    public void metodaTest(){
        System.out.println("+++Masina+++");
        Map<String,String> loganmotorizare=new HashMap<>(); // AIci m gresit, trebuia sa pun motorizari!!!
        loganmotorizare.put("Transmisie ","Fata");
        loganmotorizare.put("Norma Poluare ","Euro4");
        loganmotorizare.put("Cutie de viteze ","Manuala");
        loganmotorizare.put("Putere ", "120 cp");
        loganmotorizare.put("Cilindree", "1600");

        Map<String,String>loganDotari=new HashMap<>();
        loganDotari.put("Audio si tehnologie ", "Radio");
        loganDotari.put("Confort si echipamente optionale ", "Aer conditionat, Tapiterie stofa");
        loganDotari.put("Sisteme de asistenta", "Servodirectie");
        loganDotari.put("Performanta", "Jante de otel");

        List<String> logan2Stare=new ArrayList<>();
        logan2Stare.add("Fara acte");
        logan2Stare.add("Pocnita");
        logan2Stare.add("Flower Power");
        logan2Stare.add(("DE ULTIMU' DRUM"));

        Masina2 loganunu = new Masina2("Dacia", "Logan",2018, "6000 E", "Combi",
                loganmotorizare, loganDotari,logan2Stare);

        //Masina2 Ford = new Masina2("Ford", "Kuga", 2020, "8000 E", "Break",loganSpecificatii,
               // loganSpecificatii,logan2Stare);

        loganunu.InformatiiMasina();

        //Ford.InformatiiMasina();


    }
}
