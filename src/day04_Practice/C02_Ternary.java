package day04_Practice;

import java.util.Scanner;

public class C02_Ternary {
    // Kullanicidan bir character girmesini isteyiniz
    // Character harf ise kucuk harf olup olmadigini kontrol ediniz
    // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
    // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
    // Harf degilse ekrana "Harf degil" yazdiriniz
    // 97:a  122:z ascii değeri

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir karakter giriniz: ");
        char karakter = scan.next().charAt(0);

        //karakter>='a' && karakter<='z' ? "Kucuk Harf" : "Buyuk Harf"
        System.out.println((!(karakter >= 'a' && karakter <= 'z') && !(karakter >= 'A' && karakter <= 'Z'))
                ? "bu bir sayi" : (karakter >= 'a' && karakter <= 'z') ? "Bu bir kucuk harf" : "Bu bir buyuk harf");


    }
}
