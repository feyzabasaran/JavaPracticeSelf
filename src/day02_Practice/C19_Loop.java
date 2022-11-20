package day02_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C19_Loop {
    // Kullanıcı tarafından girilen tek sayıları toplayan, çift sayıları çarpan kodu yazınız
    // bitirmek icin 1'e basin

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        int sayi;
        int ccarpim=1,ttoplam=0;



        do{

            System.out.print("Bir Sayı Girin: ");
            sayi = reader.nextInt();

            if(sayi%2==0)
                ccarpim*=sayi;
            else
                ttoplam+=sayi;

        }while(sayi != 1);

        System.out.println("Tek Sayı Toplamı : " + ttoplam);
        System.out.println("Çift Sayı Carpim: " + ccarpim);


    }
    
}


