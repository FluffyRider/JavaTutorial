package OOP;

public class MasinaConfigurator {

    public String marca;
    public String model;
    public Integer an;
    public double pretStandard;
    public double pretFinal;

    public MasinaConfigurator(String marca, String model, Integer an) {
        this.marca = marca;
        this.model = model;
        this.an = an;
    }

    //OOP= Programare orientata obiect
    ///OOP = 4 principii-> Mostenire, Incapsulare, Polimorfism si Abstractizare
    //Mostenirea: = conceptul prin care o clasa mosteneste o alta clasa
    //clasa care este mostenita=Parinte
    //Clasa care mosteneste =copil
    //in Java putem mostenii o singura clasa
    //Mostenirea se realzizeaza cu cuvantul extends
    //Cand copilul mosteneste parintele, copilul terbuie sa apeleze constructorul din parinte.
    //Copilul va avea access la proprietatile/metodele din clasa parinte (daca se foloseste public/protected/default)
    // Ca sa apelam constructorul din parinte in copil se foloseste cuvantul 'super'
    //POLIMORFISM
    //Polimorfism= Conceptul prin care o metoda poate avea implemantari diferite
    //Polimorfismul poate fi de 2 feluri: Dinamic(Override) si Static (Overload)
    //Polimorfism Dinamic = Intro-o ieriarhie de clase obtinute prin mostenire o metoda poate avea implemantari diferite
    //Polimorfismul dinamic este prezent doar la mostenire

    //Polimorfismul Static[= daca avem nevoie ca o metoda sa fie folosita in diferite circumstante, putem definii
    //mai multe metode cu acelasi nume avand numar de parametrii/tip parametrii diferiti

    public void infoMasina(){
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinni este: " + model);
        System.out.println("Anul masinii este: " + an);

    }

    //Polimorfism Dinamic
    public void pornesteMotorul(){
        System.out.println("Masina se porneste cu ajutorul cheiei");
    }
    public void deschideGeam(){
        System.out.println("Geamurile se deschid elkectric");
    }

    //Polimorfism Static
    public void promotieDacia(){
        System.out.println("Pentru luna Iulie, Dacia nu are promotie");
    }
    public void promotieDacia(String ticket){
        System.out.println("Daca ai " + ticket + " rabla. primesti reducere ");
    }
    public void promotieDacia(Integer reducere){
        System.out.println("In luna Decembrie, Dacia primeste " + reducere + " reducere");
    }





}
