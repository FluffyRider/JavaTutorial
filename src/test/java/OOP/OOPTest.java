package OOP;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class OOPTest {


    @Test
    public void testMethod() {
        //Dam o comanda de o masina Dacia
        /*
          List<String> echipamenteLogan = Arrays.asList("Pachet Techno", "pachet Clima", "Pachet Parking");
        List<String> accesoriiLogan = Arrays.asList("Covorase", "Scrumiera", "Suport de pahare");

        DaciaConfigurator Logan = new DaciaConfigurator("Dacia", "Logan", 2024,  "Essential",
                "dasdsada4", "Grey", "Standard", "Expression", echipamenteLogan, accesoriiLogan);

        Logan.infodacia();
        Logan.pornesteMotorul();
        Logan.deschideGeam();
        Logan.promotieDacia();
        Logan.promotieDacia("TICKET");
        Logan.promotieDacia(25);
        Logan.trapaPanoramica();
        Logan.scaune();
*/
        //dam o comanda de o maisna Volskwagen
        List<String>dotariOptionalePolo = Arrays.asList("Pachet Confort", "Trapa de sticla panormaica", "Alarma antifurt",
                "imobilizator", "keyless Access");
               VolkswagenConfigurator Polo = new VolkswagenConfigurator("Volskwagen", "Polo", 2023,  "Life", "Tasdad",
                       "Albastru","Tabla 16", "Stofa",dotariOptionalePolo);

        Polo.infoVolskwagen();
        Polo.pornesteMotorul();
        Polo.deschideGeam();
        Polo.promotieDacia();
        Polo.promotieDacia("RABLABLBA");
        Polo.promotieDacia(7);
        Polo.trapaPanoramica();
        Polo.scaune();

        // Dam comanda de o masina Opel Corsa

        //List<String> pacheteOptionale = Arrays.asList("Pachet Tehnic Parcare", "Pachet Confort");

        //OpelConfigurator Corsa = new OpelConfigurator("Opel", "Corsa",2022, "benzina",
                  //      "Galben","16 spitate","Malawa Black", pacheteOptionale);
        //Corsa.infoOpel();

        //Dam comanda de un opel Astra
        //List<String> pacheteOptionaleAstra = Arrays.asList("pachet Tehnic Edition, Pachet Infotainment, Pachet confort");

        //OpelConfigurator Astra = new OpelConfigurator("Opel", "Astra", 2024, "Hybrid",
               // "Rosu Kardio", "Diamantate 17", "Stofa neagra", pacheteOptionaleAstra);
        //Astra.infoOpel();

    }

}
