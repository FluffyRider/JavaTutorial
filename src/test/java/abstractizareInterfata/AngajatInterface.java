package abstractizareInterfata;

public interface AngajatInterface extends CommonInterface {


    //Recunoastem intr-un fisier Java o interfata dupa cuvantul interface;
    //O interfata cointine numai metode abstracte (metode care nu au body);
    //Toate metodele dintr-o interfata sunt By Default publice;
    //Intr-o interfata putem avea atat metode void cat si return;
    //O interfata nu poate contrin un constructor;
    //Dintr-o interfata nu putem sa facem un obiect;
    // O interfata se implementeaza;
    //Clasa care implementeaza interfata trebuie sa implementeze toate metodele abstracte din interfata;
    //O clasa poate implemanta mai multe interfete;
    //O interfata poate mosteni o alta interfata;


    void mergeLaServiciu();
    void desfasoaraActivitate();
    void beaCafea();
    void incheieActivitatea();

}

