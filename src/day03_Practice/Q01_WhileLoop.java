package day03_Practice;

import java.util.Scanner;

public class Q01_WhileLoop {
    //girilen sayinin basamaklarindaki toplamini bulunuz

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi girin");
        int girilenSayi = scan.nextInt();

        int toplam =0;
        int rakam =0;

        while (girilenSayi!=0){
            rakam= girilenSayi%10;
            toplam+=rakam;
            girilenSayi=girilenSayi/10;
        }
        System.out.println(toplam);
    }
}
