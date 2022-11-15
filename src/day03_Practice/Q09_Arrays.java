package day03_Practice;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q09_Arrays {

    /*
    kullanicidan aldigimiz 8 elemanli array'in icinde
    kac tane 3'e bolunebilen sayi vardir
    negatif sayilar dahil
     */
    public static void main(String[] args) {

        int [] arr = new int[8];
        Scanner scan = new Scanner(System.in);
        int giris =0;
        for (int i = 0; i < arr.length ; i++) {

            System.out.println("Lutfen index " + i + " elemanini giriniz");
            giris = scan.nextInt();
            arr[i]=giris;

        }
        System.out.println(Arrays.toString(arr));

        int sayac = 0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]%3==0){
                sayac++;
            }
        }
        System.out.println("3'e bolunebilen sayi sayisi: " + sayac);
    }

}
