package day01_Practice;

public class C09_Ternary {
    public static void main(String[] args) {

        // urun 50 tl alti ise "ucuz" , ustu ise "pahali" yazsin

        int urunFiyat=69;

        System.out.println((urunFiyat > 50) ? ("Pahali") : ("Ucuz"));

        // fiyat 10'dan az ise "ucuz", 10 ile 20 arasinda ise "normal", 20'den fazla ise "pahali"

        int urunFiyat2= 15;

        System.out.println((urunFiyat2 < 10) ? ("ucuz") : ((urunFiyat2 < 20) ? ("normal") : ("pahali")));
    }
}
