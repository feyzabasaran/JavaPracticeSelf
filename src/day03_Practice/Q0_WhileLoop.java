package day03_Practice;

import java.util.Scanner;

public class Q0_WhileLoop {

    /*
    Girilen bir sayiya kadar olan sayilardan sadece tek olanlarini ekrana yazdirin
    girilen sayi dahil
     */
    public static void main(String[] args) {

       int girilenSayi = 45;

        for (int i = 0; i <= girilenSayi; i++) {

            if (i%2 !=0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("-----------");
        int loopSayisi=0;

        while (loopSayisi<=girilenSayi){

            if (loopSayisi %2 != 0){
                System.out.print(loopSayisi+ " ");
            }
            loopSayisi++;
        }
    }
}
