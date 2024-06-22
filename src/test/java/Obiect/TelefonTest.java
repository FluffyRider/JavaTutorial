package Obiect;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelefonTest {

    @Test
    public void metodatest(){
        System.out.println("===TELEFON: IPHONE15===");

        Map<String,String>iphone15Specificatii=new HashMap<>();

        iphone15Specificatii.put("Model procesor ","Apple A16 Bionic" );
        iphone15Specificatii.put("Sistem de operare", "IOS" );
        iphone15Specificatii.put("Memorie RAM", "6 GB" );
        iphone15Specificatii.put("Rezolutie Video ", "Full HD" );
        iphone15Specificatii.put("Tip display", "Super Retina XDR");
        iphone15Specificatii.put("Porturi", "USB Type C" );

        List<String> iphone15Accesorii=new ArrayList<>();
        iphone15Accesorii.add("Telefon");
        iphone15Accesorii.add("Incarcator");
        iphone15Accesorii.add("Cablu USB");
        iphone15Accesorii.add("Casti");
        iphone15Accesorii.add("Sylus");
        iphone15Accesorii.add("Stickere");

        //Telefon Iphone15 = new Telefon("Iphone", "15","Albastru", "128 GIGA",
               // 2999, iphone15Specificatii, iphone15Accesorii,);
        //Iphone15.infoTelefon,();


        System.out.println("===TELEFON: Samsung24===");
        Map<String,String>samsung24specficatii=new HashMap<>();

        samsung24specficatii.put("Model procesor ","Apple A16 Bionic" );
        samsung24specficatii.put("Sistem de operare", "IOS" );
        samsung24specficatii.put("Memorie RAM", "6 GB" );
        samsung24specficatii.put("Rezolutie Video ", "Full HD" );
        samsung24specficatii.put("Tip display", "Super Retina XDR");
        samsung24specficatii.put("Porturi", "USB Type C" );

        List<String> samsung24Accesorii=new ArrayList<>();
        samsung24Accesorii.add("Telefon");
        samsung24Accesorii.add("Incarcator");
        samsung24Accesorii.add("Cablu USB");

        //Telefon samsung24= new Telefon("Samsung", "24","Argintiu", "254 GIGA",
               //1999, samsung24specficatii, samsung24Accesorii);
        //samsung24.infoTelefon,();

        System.out.println("===Telefon Huawei====");

        Map<String,String>huaweispecificatii=new HashMap<>();

        huaweispecificatii.put("Model procesor ","huwwawei 3241" );
        huaweispecificatii.put("Sistem de operare", "Andorid" );
        huaweispecificatii.put("Memorie RAM", "4 GB" );

        List<String> huwawei4Accesorii=new ArrayList<>();
        huwawei4Accesorii.add("Telefon");
        huwawei4Accesorii.add("Incarcator");

        Telefon Huawei = new Telefon ("Huawei", "lite", "Verde", "64 GB",
                500, huaweispecificatii,huwawei4Accesorii,true );
        Huawei.infoTelefon();






    }
}
