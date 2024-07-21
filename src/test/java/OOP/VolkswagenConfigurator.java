package OOP;

import java.util.List;

public class VolkswagenConfigurator extends MasinaConfigurator {

    public String linieDeEchipare;
    public String motor;
    public String vopsea;
    public String roti;
    public String tapiterie;
    public List<String> dotariOptionale;


    public VolkswagenConfigurator(String marca, String model, Integer an, String linieDeEchipare, String motor, String vopsea, String roti,
                                  String tapiterie, List<String> dotariOptionale) {
        super(marca, model, an);

        this.linieDeEchipare = linieDeEchipare;
        this.motor = motor;
        this.vopsea = vopsea;
        this.roti = roti;
        this.tapiterie = tapiterie;
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

        for (Integer i = 0; i < dotariOptionale.size(); i++) {
            System.out.println(dotariOptionale.get(i));

        }
        calculPretStandard();
        calculPretFinal();
    }
    public void trapaPanoramica(){
        System.out.println("Trapa panormaica este electrica");

    }
    public void scaune(){
        System.out.println("Scaunele se actioneaza electric");
    }

    public void calculPretStandard() {

        if (model.equals("Polo")) {
            if (linieDeEchipare.equals("Life")) {
                pretStandard = 20.194;
            }
            if (linieDeEchipare.equals("Advanced")) {
                pretStandard = 20.675;
            }
            if (linieDeEchipare.equals("Style")) {
                pretStandard = 21.088;
            }
            if (linieDeEchipare.equals("R-Line")) {
                pretStandard = 21.601;
            }
            if (linieDeEchipare.equals("GTI")) {
                pretStandard = 31.784;
            }
        }
        System.out.printf("Pretul standard este: %,.3f\n", pretStandard); //metoda de afisare nr cu multiple decimale
        // \n comand new line from string
    }

    public void calculPretFinal() {
        double pretDotariOptionale = 0.000;

        for (String dotariOptionale : dotariOptionale) {
            switch (dotariOptionale) {
                case "Pachet Confort":
                    pretDotariOptionale += 0.673;
                    break;
                case "Trapa de sticla panormaica":
                    pretDotariOptionale += 0.890;
                    break;
                case "Alarma antifurt":
                    pretDotariOptionale += 0.290;
                    break;
                case "keyless Access":
                    pretDotariOptionale += 0.358;
                    break;
            }

        }
        if (model.equals("Polo")) {
            if (linieDeEchipare.equals("Life")) {
                switch (vopsea) {
                    case "Albastru":
                        pretDotariOptionale += 0.518;       //+= shortcut pt pretOptiuni = pretOptiuni +0.460
                        break;
                    case "White":
                        pretDotariOptionale += 0.000;
                        pretFinal = pretStandard += 0.000;
                        break;
                }
                switch (roti) {
                    case "Tabla 16":
                        pretDotariOptionale += 0.399;
                        break;
                }
                switch (tapiterie) {
                    case "Stofa":
                        pretDotariOptionale += 0.366;
                        break;
                }
            }
        }
        pretFinal = pretStandard + pretDotariOptionale;
        System.out.printf("Pretul final este: %,.3f\n", pretFinal);
    }
}