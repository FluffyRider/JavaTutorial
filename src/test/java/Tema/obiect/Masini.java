package Tema.obiect;

public class Masini {

    public String marca;
    public String model;
    public String culoare;
    public Integer anfabricatie;
    public Integer numarkm;
    public Integer costmasina;
    public Boolean masinaveche;
    public Integer impozit;

    //Constructor

    public Masini(String marca, String model, String culoare, Integer anfabricatie, Integer numarkm,
                  Integer costmasina, boolean masinaveche){
                     this.marca = marca;
                     this.model=model;
                     this.culoare=culoare;
                     this.anfabricatie=anfabricatie;
                     this.numarkm=numarkm;
                     this.costmasina=costmasina;
                     this.masinaveche=masinaveche;
    }

    public Masini(String marca, String model, String culoare, Integer anfabricatie, Integer numarkm,
                  Integer costmasina, Boolean masinaveche, Integer impozit) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.anfabricatie = anfabricatie;
        this.numarkm = numarkm;
        this.costmasina = costmasina;
        this.masinaveche = masinaveche;
        this.impozit = impozit;
    }

    public void prezentareMasina(){
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este  " + model);
        System.out.println("culoarea masinii este " + culoare );
        System.out.println("Anul fabricatiei masinii este " + anfabricatie);
        System.out.println("Numarul de km al masinii este " + numarkm);
        System.out.println("Pretul masinii este " +costmasina);
        System.out.println("Estere masina veche? " + masinaveche);
        if (impozit!=null){
            System.out.println("Impozitul masinii este "  + impozit);
        }

    }

    public void verificareVechime(){
        if (anfabricatie<2000){
            System.out.println("Masina este de epoca");
        }
        else{
            System.out.println("Masina este noua");
        }
    }

    public void calculImpozit(){
        if (anfabricatie>=2000 && anfabricatie<=2004){
            System.out.println("Masina are impozitul de " +impozit );
        } else if (anfabricatie<2000) {
            System.out.println("Masina este de epoca si nu se plateste impozit " +impozit);
        }

    }



}
