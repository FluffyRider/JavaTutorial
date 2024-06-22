package Multimi;

import org.checkerframework.framework.qual.DefaultQualifier;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {
    //multimi = array, list (arraylist), map


    @Test

    public void metodatest() {
        // afisareColegiArray();
        //afisareColegiArraylist();
        //obiecteMap();
        //tariOrase();
        //reteteingrediente();
    }


    //afisam numele colegilor d ela curs
    public void afisareColegiArray() {
        String[] colegi = new String[6];
        colegi[0] = "Marius";
        colegi[1] = "Larisa";
        colegi[2] = "Daniel";
        colegi[3] = "Vlad";
        colegi[4] = "Corina";
        colegi[5] = "Alex";
        for (Integer index = 0; index < colegi.length; index++) {
            System.out.println("Numele cursantului este: " + colegi[index]);
        }
    }
    //afisam numele colegilor de la curs (arraylist)

    public void afisareColegiArraylist() {
        List<String> colegi = new ArrayList<>();
        colegi.add("Marius");
        colegi.add("Larisa");
        colegi.add("Daniel");
        colegi.add("Vlad");
        colegi.add("Corina");
        colegi.add("Alex");
        for (Integer index = 0; index < colegi.size(); index++)
            System.out.println("Numele cursantului este: " + colegi.get(index));


        //key-value


    }

    //Key value
    public void obiecteMap() {
        Map<String, String> obiecte = new HashMap<>();
        obiecte.put("Fruct", "mar");
        obiecte.put("Masina", "BMW");
        obiecte.put("Telefon", "Samsung");
        obiecte.put("Banca", "Raiffeisen");
        for (String key : obiecte.keySet()) {
            System.out.println("Cheia este " + key);
            System.out.println("valoarea este " + obiecte.get(key));
        }
    }

    // afisam cateva tari cu orasele aferente
    public void tariOrase() {
        Map<String, List<String>> tari = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Bucuresti ");
        oraseRomania.add("Cluj ");
        oraseRomania.add("Iasi");
        oraseRomania.add("Timisoara");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Milano ");
        oraseItalia.add("Roma");
        oraseItalia.add("verona");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseRomania.add("Valencia");
        oraseSpania.add("Madrid ");

        tari.put("Romania", oraseRomania);
        tari.put("Italia", oraseItalia);
        tari.put("Spania", oraseSpania);

        for (String key : tari.keySet()) {
            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt " + tari.get(key));
        }


    }

    public void reteteingrediente() {

        Map<String, List<String>> retete = new HashMap<>();

        List<String> ingredienteCiorba = new ArrayList<>();
        ingredienteCiorba.add("Carne");
        ingredienteCiorba.add("Morcovi");
        ingredienteCiorba.add("Telina");
        ingredienteCiorba.add("Albitura");
        ingredienteCiorba.add("Ceapa");
        ingredienteCiorba.add("Cartofi");
        ingredienteCiorba.add("Bors");
        ingredienteCiorba.add("Patrunjel");
        ingredienteCiorba.add("Leustean");
        ingredienteCiorba.add("Sare");
        ingredienteCiorba.add("piper");

        List<String> ingredienteTocanita = new ArrayList<>();
        ingredienteTocanita.add("Carne");
        ingredienteTocanita.add("Ceapa");
        ingredienteTocanita.add("Morcov");
        ingredienteTocanita.add("Ardei Gras");
        ingredienteTocanita.add("Bulion");
        ingredienteTocanita.add("Marar");
        ingredienteTocanita.add("Sare");
        ingredienteTocanita.add("Piper");

        List<String> ingredienteSaramura = new ArrayList<>();
        ingredienteSaramura.add("2 Crapi");
        ingredienteSaramura.add("3 Rosioare");
        ingredienteSaramura.add("Caras");
        ingredienteSaramura.add("Ardei gras");
        ingredienteSaramura.add("Ardei iute");
        ingredienteSaramura.add("Patrunjel");
        ingredienteSaramura.add("Usturoi");
        ingredienteSaramura.add("Rosii coapte");
        ingredienteSaramura.add("Sare");
        ingredienteSaramura.add("Piper");

        retete.put("Ciorba", ingredienteCiorba);
        retete.put("Tocanita", ingredienteTocanita);
        retete.put("Saramura", ingredienteSaramura);

        for (String key : retete.keySet()) {
            System.out.println("Reteta este " + key);
            System.out.println("Ingredientele sunt " + retete.get(key));

        }
    }


}