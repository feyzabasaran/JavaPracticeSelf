package day02_Practice;

import java.util.Scanner;

public class C16_Loops {

    /*
    Kullanicidan bir harf girmesini isteyin. Girilen harf sesli ise sesli harf oldugunu,
    degilse sessiz harf oldugunu ekrana yazdirsin. Girdigi deger harf degilse yada
    1 karakterden fazla ise hata mesaji gösterin. (Test girilen harfi buyuk yada kucuklugune duyarlidir)
    sesli harfler : a,e,i,o,u

    test data : a
    cikti : a harfi sesli harfdir.

    test data : d
    cikti : d harfi sessiz harfdir.

    test data: we yada %
    cikti : Yanlis karakter girdiniz!

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        String girilenHarf = scan.next();

        String sesliHarfler = "aeiou";
        String sessizHarfler = "bcdfghjklmnprstvywz";
        String sayilar = "1234567890";

        if (sayilar.contains(girilenHarf)){
            System.out.println("Sayi girdiniz");
        }

        if (girilenHarf.length()>1){
            System.out.println("Birden fazla harf girdiniz");
        }

        for (int i = 0; i <sesliHarfler.length() ; i++) {

            if (girilenHarf.equals(sesliHarfler.substring(i,i+1))){
                System.out.println(girilenHarf + " sesli harftir.");
            }
        }
        for (int i = 0; i <sessizHarfler.length() ; i++) {
            if (girilenHarf.equals(sessizHarfler.substring(i,i+1))){
                System.out.println(girilenHarf+ " sessiz harftir.");
            }

        }




    }

}
