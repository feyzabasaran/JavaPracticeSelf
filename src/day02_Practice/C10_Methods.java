package day02_Practice;

import java.util.Scanner;

public class C10_Methods {
    // cm olarak verilen bir sayiyi, metre ve kilometreyi donusturen bir method yazin

    public static void main(String[] args) {

        // int cmSayi = 10000000;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cm degerini giriniz");
        int cmSayi = scan.nextInt();

        System.out.println(kmVeMetreHesaplayici(cmSayi));
    }
    public static String kmVeMetreHesaplayici(int cmSayi){

        int km = cmSayi/100000;
        int metre = cmSayi/100;

        String kagit = "km : " + km + "\nm : " + metre;

        return kagit;

    }
}
