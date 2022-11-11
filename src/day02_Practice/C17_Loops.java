package day02_Practice;

import java.util.Scanner;

public class C17_Loops {
    /*
    Kullanicidan 1'den buyuk bir tam sayi girmesini isteyin
    ve 1'den, girilen tamsayiya kadar olan sayilarin karelerinin toplamini hesaplayan kodu giriniz

    input: 4
    output: 14
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 1'den buyuk bir sayi girin");
        int girilenSayi = scan.nextInt();

        int toplam =0;

        for (int i = 1; i < girilenSayi ; i++) {

            int kareler = i*i;

            toplam+=kareler;
        }

        System.out.println(toplam);
    }

}
