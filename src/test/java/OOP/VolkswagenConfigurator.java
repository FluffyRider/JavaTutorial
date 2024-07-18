package OOP;

import java.util.List;

public class VolkswagenConfigurator extends MasinaConfigurator{

    public String linieDeEchipare;
    public String motor;
    public String vopsea;
    public String roti;
    public String tapiterie;
    public List<String> dotariOptionale;


    public VolkswagenConfigurator(String marca, String model, Integer an, String linieDeEchipare,String motor, String vopsea, String roti,
                                  String tapiterie, List<String> dotariOptionale) {

        super(marca, model, an);
        this.linieDeEchipare = linieDeEchipare;
        this.motor = motor;
        this.vopsea = vopsea;
        this.roti = roti;
        this.tapiterie =tapiterie;
        this.dotariOptionale = dotariOptionale;
    }
    public void infoVolskwagen() {
        infoMasina();
        System.out.println("Linia de echipare a masinii este: " + linieDeEchipare);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Culoarea masinii este: " + vopsea);
        System.out.println("Jantele masinii sunt " + roti);
        System.out.println("Interiorul masinii este compus din " + tapiterie);
        System.out.println("Dotarile optionale ale masininii sunt: ");

        for (Integer i=0; i < dotariOptionale.size(); i++) {
            System.out.println(dotariOptionale.get(i));

        }


    }

}