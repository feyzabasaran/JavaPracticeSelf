package day01_Practice;

import java.util.Scanner;

public class C19_StringManipulations {
    /*
    kullanicidan 4 kelime isteyin
    cumle düzenine gore yazdirin
    cumlenin ilk harfi buyuk gerisi kucuk olacak

    Ornek: Cumle bu sekilde olmali
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen birinci kelime giriniz");
        String kelime1= scan.next();
        System.out.println("Lutfen ikinci kelime giriniz");
        String kelime2= scan.next();
        System.out.println("Lutfen ucunucu kelime giriniz");
        String kelime3= scan.next();
        System.out.println("Lutfen dorduncu kelime giriniz");
        String kelime4= scan.next();

        String duzenlenmisKelime1= kelime1.substring(0,1).toUpperCase()+kelime1.substring(1).toLowerCase();
        String duzenlenmisKelime2= kelime2.toLowerCase();
        String duzenlenmisKelime3= kelime3.toLowerCase();
        String duzenlenmisKelime4= kelime4.toLowerCase();

        String cumle = duzenlenmisKelime1+ " " +duzenlenmisKelime2 + " " +duzenlenmisKelime3 + " " + duzenlenmisKelime4;

        System.out.println(cumle);
    }
}
