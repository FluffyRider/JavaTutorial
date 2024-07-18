package OOP;

import java.util.List;

public class OpelConfigurator extends MasinaConfigurator {

    public String combustibil;
    public String vopsea;
    public String jante;
    public String designInterior;
    public List<String> pacheteOptionale;



    public OpelConfigurator(String marca, String model, Integer an,String combustibil, String vopsea, String jante,
                            String designInterior, List<String> pacheteOptionale) {
        super(marca, model, an);
        this.combustibil = combustibil;
        this.vopsea=vopsea;
        this.jante=jante;
        this.designInterior=designInterior;
        this.pacheteOptionale=pacheteOptionale;
    }
    public void infoOpel(){
        infoMasina();
        System.out.println("Combustibilul folosit este: " + combustibil);
        System.out.println("Culoarea masinii este: " + vopsea);
        System.out.println("Rotile masinii sunt: " + jante);
        System.out.println("Desing-ul interior este " + designInterior);
        System.out.println("Pachetul optional al masinii este: " + pacheteOptionale);

        for (Integer i = 0; i < pacheteOptionale.size(); i++) {
            System.out.println(pacheteOptionale.get(i));
        }

    }



}
