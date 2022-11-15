package day03_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q16_Arrays {
    /*
    Rastgele kullanici adi olusturan Java kodu yaziniz

    1. Kullanicidan ismini isteyelim
    2. Kullanici adindaki bosluklari silelim
    3. Kullanici adinin alinabilir olup olmadigina bakalim
    4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun
    5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim ve gosterelim
     */

    public static void main(String[] args) {

        List<String> kullaniciIsimleri = new ArrayList<>();
        kullaniciIsimleri.add("Ali");
        kullaniciIsimleri.add("Veli");
        kullaniciIsimleri.add("Can");
        kullaniciIsimleri.add("Kıvanc");
        System.out.println(kullaniciIsimleri); // [Ali, Veli, Can, Kıvanc]

        // 1. adim kullaniidan isim alma
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String yeniIsim = scan.nextLine();

        // 2. adim alinan isimdeki bosluklar silindi
        yeniIsim= yeniIsim.replace(" ","");

        // girilen isim listede varsa sonuna sayi eklenip listeye ekleniyor, gosteriliyor
        if (kullaniciIsimleri.contains(yeniIsim)){
            System.out.println("Bu isim daha once alinmis");
            int rastgeleSayi =  new Random().nextInt(100);
            yeniIsim+=rastgeleSayi;
            kullaniciIsimleri.add(yeniIsim);
            System.out.println(kullaniciIsimleri);

            // listede girilen isim yoksa listeye ekleniyor, gosteriliyor
        }else {
            kullaniciIsimleri.add(yeniIsim);
            System.out.println(kullaniciIsimleri);
        }

    }
}
