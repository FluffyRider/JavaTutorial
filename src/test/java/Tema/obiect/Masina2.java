package Tema.obiect;

import java.util.List;
import java.util.Map;

public class Masina2 {

    public String marca;
    public String model;
    public Integer an;
    public String pret;
    public String caroserie;
    public Map<String,String> motorizare;
    public Map<String,String> dotari;
    public List<String> stare;

    public Masina2(String marca, String model, Integer an, String pret, String caroserie, Map<String,
            String> motorizare, Map<String, String> dotari, List<String> stare) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.pret = pret;
        this.caroserie = caroserie;
        this.motorizare = motorizare;
        this.dotari = dotari;
        this.stare= stare;}

    public void InformatiiMasina (){
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Anul fabricatiei este " + an);
        System.out.println("Pretul de achizitie este " + pret);
        System.out.println("Caroseria masinii este " + caroserie);

        for(String key:motorizare.keySet()){
            System.out.println(key +" " + motorizare.get(key));
        }
        System.out.println("DOTARILE MASINII SUNT");
        for (String key:dotari.keySet()){
            System.out.println(key + " " + dotari.get(key));
        }
        System.out.println("STAREA MASINII ESTE");
        for(Integer index=0; index<stare.size();index++){
            System.out.println(stare.get(index));
        }

    }
}
