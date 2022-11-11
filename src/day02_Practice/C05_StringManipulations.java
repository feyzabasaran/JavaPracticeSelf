package day02_Practice;

import java.util.Scanner;

public class C05_StringManipulations {
    // Kullanicidan isim ve soyisim girmesini isteyin hangisinin daha uzun oldugunu yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.next();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = scan.next();

        if (isim.length()>soyIsim.length()){
            System.out.println("isim, soyisim'den daha uzundur.");
        }else if (soyIsim.length()>isim.length()){
            System.out.println("soyisim, isim'den daha uzundur.");
        }else {
            System.out.println("isim ve soyisim uzunluklari ayni");
        }
    }
}
