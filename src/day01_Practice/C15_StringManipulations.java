package day01_Practice;

public class C15_StringManipulations {
    public static void main(String[] args) {

        // kullanicidan isim ve soyisim alan ve bunlari birlestirip yazdiran bir method yapiniz.
        String isim = "Mehmet";
        String soyIsim = "Can";

        IsimBirlestirmeMethodu(isim,soyIsim);
    }

    public static void IsimBirlestirmeMethodu (String isim, String soyIsim) {

        String tamIsim= isim + " " + soyIsim;

        System.out.println(tamIsim);
    }
}
