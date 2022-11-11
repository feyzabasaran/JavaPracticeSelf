package day01_Practice;

import java.util.Scanner;

public class C16_StringManipulations {
    public static void main(String[] args) {

        // kullanicidan isim ve soyisim alıp, ismin bas harfi buyuk, gerisi kucuk
        // soyismin tamamini buyuk yazdiran program

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.print("Lutfen soyisminizi giriniz");
        String soyIsim= scan.nextLine();

        String duzeltilmisIsim = isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "
                +soyIsim.toUpperCase();

    }

    public static void IsimDuzeltme(String isim,String soyIsim){



    }
}
