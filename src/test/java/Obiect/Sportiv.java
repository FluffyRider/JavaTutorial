package Obiect;

public class Sportiv {

        //preogramarea orientata obiect se bazeaza pe interactiunea cu obiecte
        //obiect = instanta unei clase
        //Putem defini un obiectdoar daca avem un contructor
        //Constructorul = are ca rol sa initializeze atributele unei clase
        //Intr-o clasa recunoastem un contructor dupa numele acesteia
        // Constructorul este de cele mai multe ori public
        //Intr-o clasa pot sa fie mai multi constructori diferentiati dupa numarul sau tipul de parametrii
        //Intr-o clasa avem un constructor by default fara parametri
        //In momentul cand se defineste un obiect, se apeleaza constructorul din clasa
        //Dintr-o calsa putem defini mai multe obiecte
        //Obiectele se deiferentiaza prin nume si valorile date
        //Un obiect se instanteaza folosind cuvantul "new"
        // Un obiect se poate defini in orice clasa in orice obiect
        // in momentul cand instantiem unn obiect puytem avea accesss la toate variabilele/metodele

    public String nume;
    public String prenume;
    public Integer varsta;
    public String sex;
    public String sportPracticat;
    public Boolean teamEvent;
    public Integer salariu;

    //Constructor
    // se poate generea automat> click dreapta>generate>constructor> select all>ok

    public Sportiv(String nume, String prenume, Integer varsta, String sex,
                   String sportPracticat, Boolean teamEvent) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.sportPracticat = sportPracticat;
        this.teamEvent = teamEvent;
    }

    public Sportiv(String nume, String prenume, Integer varsta, String sex,
                   String sportPracticat, Boolean teamEvent, Integer salariu) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.sportPracticat = sportPracticat;
        this.teamEvent = teamEvent;
        this.salariu = salariu;
    }

    public void prezentareSportiv (){
        System.out.println("Numele sportivului este " + nume );
        System.out.println("Prenumele sportivului este " + prenume );
        System.out.println("varsta sportivului este " + varsta);
        System.out.println("Sexul sportivului este " + sex);
        System.out.println("sportul prcaticat este " + sportPracticat);
        System.out.println("Este un sport de echipa? " + teamEvent);
        if (salariu !=null){
            System.out.println("Salariul sportivului este " + salariu);
        }



    }

    public void  verificareVarsta(){
        if (varsta>=18){
            System.out.println("Sportivul este major");
        }
        else {
            System.out.println("Sportivul este minor");
        }
    }
    public void marireSalar(Integer procent){
        if (salariu !=null) {
            Integer marire = (salariu * procent)/100;
            salariu = salariu + marire;
            System.out.println("Noul salariu este de " + salariu);
        }else {
            System.out.println("Sportivul nu are salar");
        }


    }



}
