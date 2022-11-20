package day04_Practice;

import java.util.Scanner;

public class C01_Ternary {
    //Kullanicidan bir sayi aliniz
    //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
    //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
    //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi >= 0 ? sayi < 10 ? "Rakam" : "Pozitif sayi" : "Negatif sayi");
    }
}
