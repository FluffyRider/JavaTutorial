package abstractizareInterfata;

public class Angajat extends Persoana implements AngajatInterface{

    public Angajat(String nume, String prenume, Integer varsta, Double inaltime, Character sex) {
        super(nume, prenume, varsta, inaltime, sex);
    }


    @Override
    public void mergeLaServiciu() {

    }

    @Override
    public void desfasoaraActivitate() {

    }

    @Override
    public void beaCafea() {

    }

    @Override
    public void incheieActivitatea() {

    }

    @Override
    public void mananca() {

    }

    @Override
    public void dorme() {

    }

    @Override
    public void iaPauza() {

    }

    @Override
    public void iaSalar() {

    }
}
