package valueReferenceType;

public class Curs {

    public String descriere;
    public String titlu;
    public Integer nrCursanti;

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Integer getNrCursanti() {
        return nrCursanti;
    }

    public void setNrCursanti(Integer nrCursanti) {
        this.nrCursanti = nrCursanti;
    }

    public Curs(String descriere, String titlu, Integer nrCursanti) {
        this.descriere = descriere;
        this.titlu = titlu;
        this.nrCursanti = nrCursanti;
    }
    public void perzentareCurs(){
        System.out.println("Descrierea cursului este " + descriere);
        System.out.println("Titlul este : " + titlu);
        System.out.println("Numarul cursantului este: " + nrCursanti);
    }
}
