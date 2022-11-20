package day04_Practice;

import java.util.Scanner;

public class C09_KarakterKontrol {

    /*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
		hatali giris seklinde kod yazniz
		 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        if (harf >= 'a' && harf <= 'z') System.out.println("Girilen harf kucuk harftir");
        else if (harf >= 'A' && harf <= 'Z') System.out.println("Girilen harf buyuk harftir");
        else System.out.println("Hatali giris yaptiniz");


    }
}
