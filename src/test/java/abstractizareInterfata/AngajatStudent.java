package abstractizareInterfata;

public class AngajatStudent extends Persoana implements AngajatInterface,StudentInterface {
    public AngajatStudent(String nume, String prenume, Integer varsta, Double inaltime, Character sex) {
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
    public void mergeLaFacultate() {

    }

    @Override
    public void invata() {

    }

    @Override
    public void daExamene() {

    }

    @Override
    public void primesteNote() {

    }

    @Override
    public void mergeLaRestante() {

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

