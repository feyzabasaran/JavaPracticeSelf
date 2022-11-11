package day02_Practice;

import java.util.Scanner;

public class C12_Methods {
     /*
    Kullanicidan alinan bir tamsayi kadar (47'den kucuk) Fibonacci dizisi olusturun
    0-1-1-2-3-5-8-11.....
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin");
        int sayi = scan.nextInt();

        finonacciSerisi(sayi);
    }

    public static void finonacciSerisi (int sayi){
        int birinciSayi=0;
        int ikinciSayi =1;

        if (sayi<47){

            System.out.print(birinciSayi+ "-");
            System.out.print(ikinciSayi+ "-");

            for (int i = 0; i < sayi; i++) {
                int sayi3=birinciSayi+ikinciSayi;
                System.out.print(sayi3+"-");

                birinciSayi=ikinciSayi;
                ikinciSayi=sayi3;

            }
        }
    }
}
