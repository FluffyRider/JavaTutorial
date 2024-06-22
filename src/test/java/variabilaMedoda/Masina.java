package variabilaMedoda;

import org.testng.annotations.Test;

public class Masina {

    public String marca;

    public String model;

    public Float pret;

    public Integer an;

    public Boolean estedecapotata;

    public Double greutate;

    @Test
    public void metodaTest() {
        afisareMasina();

        System.out.println("=== Exemplul 2===");
        afisareOriceMasina("Honda","civic", 169.9f, 2022,  true, 245.7);

        System.out.println("+++ Exemplul 3+++");
        afisareOriceMasina("Dacia","Logan", 18.9f, 2002,  false, 134.5);

    }


            // Descriem o masina


            public void afisareMasina () {

                marca = "Mercedes";
                model = "GLS";
                pret = 2565.5f;
                an = 2010;
                estedecapotata = true;
                greutate = 54.0;
                System.out.println("Marca masinii este " + marca);
                System.out.println("Modelul masinii este " + model);
                System.out.println("Greutatea masinii este " + greutate);
                System.out.println("Pretul masinii este " + pret);
                System.out.println("Este masina decapotata " + estedecapotata);
                System.out.println("Anul masinii este " + an);

            }
            //descriem orice masina

            public void afisareOriceMasina(String marca, String model, Float pret, Integer an, Boolean estedecapotata, Double greutate){

                System.out.println("Marca masinii este " + marca);
                System.out.println("Modelul masinii este " + model);
                System.out.println("Greutatea masinii este " + greutate);
                System.out.println("Pretul masinii este " + pret);
                System.out.println("Este masina decapotata " + estedecapotata);
                System.out.println("Anul masinii este " + an);


            }

        }
