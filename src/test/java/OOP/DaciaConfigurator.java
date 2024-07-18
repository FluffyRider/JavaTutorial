package OOP;

import java.util.List;

public class DaciaConfigurator extends MasinaConfigurator {

    public String verisune;
    public String motor;
    public String culoare;
    public String jante;
    public String interior;
    public List<String> echipamente;
    public List<String> accesorii;


    public DaciaConfigurator(String marca, String model, Integer an, String versiune, String motor,
                             String culoare, String jante, String interior, List<String> echipamente, List<String> accesorii) {
        super(marca, model, an);
        this.verisune = versiune;
        this.motor = motor;
        this.culoare = culoare;
        this.jante = jante;
        this.interior = interior;
        this.echipamente = echipamente;
        this.accesorii = accesorii;
    }

    public void infodacia() {
        infoMasina();
        System.out.println("Versiunea masinii este: " + verisune);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Jantele masinii sunt " + jante);
        System.out.println(" interiorul masinii este compus din " + interior);

        System.out.println("echipamentele masininii sunt: ");
        for (Integer i = 0; i < echipamente.size(); i++) {
            System.out.println(echipamente.get(i));
        }

        System.out.println("accesoriile masininii sunt: ");
        for (Integer i = 0; i < accesorii.size(); i++) {
            System.out.println(accesorii.get(i));
        }
        calculPretStandard();
        calculPretFinal();
    }
    //Aplicam polimorfismul dinamic

    public void pornesteMotorul(){
        System.out.println("Masinile Dacia pornesc de la buton");

    }
    public void deschideGeam(){
        System.out.println("Deschidem geamul cu toporul");
    }
    //trebuie sa determinam pretul standard in functie de modelul maisinii (Dacia vs VW)

    public void calculPretStandard() {

        if (model.equals("Logan")) {
            if (verisune.equals("Essential")) {
                pretStandard = 13.500;
            }
            if (verisune.equals("Expresion")) {
                pretStandard = 14.150;
            }
            if (verisune.equals("Journey")) {
                pretStandard = 15.250;
            }
            if (verisune.equals("Journey+")) {
                pretStandard = 15.700;
            }
        }
        //System.out.println("Pretul standard este; " + pretStandard);

        System.out.printf("Pretul standard este: %,.3f\n", pretStandard); //metoda de afisare nr cu multiple decimale
        // \n comand new line from string
    }

    public void calculPretFinal() {
        double pretOptiuni = 0.000;

        for (String echipamente : echipamente) {
            switch (echipamente) {
                case "Pachet Techno":
                    pretOptiuni += 0.300;
                    break;
                case "Pachet Clima":
                    pretOptiuni += 0.300;
                    break;
                case "Pachet Parking":
                    pretOptiuni += 0.400;
                    break;

            }
        }
        for (String accesorii : accesorii) {
            switch (accesorii) {
                case "Covorase":
                    pretOptiuni += 0.300;
                    break;
                case "Scrumiera":
                    pretOptiuni += 0.300;
                    break;
                case "Suport de pahare":
                    pretOptiuni += 0.050;
                    break;
            }
        }

        if (model.equals("Logan")) {
            if (verisune.equals("Essential")) {
                switch (culoare) {
                    case "Grey":
                        pretOptiuni += 0.460;       //+= shortcut pt pretOptiuni = pretOptiuni +0.460
                        break;
                    case "White":
                        pretOptiuni += 0.000;
                        pretFinal = pretStandard += 0.000;
                        break;
                }
                switch (jante) {
                    case "Standard":
                        pretOptiuni += 2.000;
                        break;
                }
                switch (interior) {
                    case "Standard":
                        pretOptiuni += 0.000;
                        break;
                }


            }


        }
        pretFinal = pretStandard + pretOptiuni;
        System.out.printf("Pretul final este: %,.3f\n", pretFinal);
    }

}


