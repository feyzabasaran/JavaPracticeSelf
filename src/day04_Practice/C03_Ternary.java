package day04_Practice;

import java.util.Scanner;

public class C03_Ternary {
    // Kullanıcıdan bir pozitif tamsayı girmesini isteyin,
    // o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
    // 3 basamaklı degilse çift olup olmadigini kontrol edin.
    // Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
    // Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tamsayi giriniz: ");
        int sayi = scan.nextInt();

        System.out.println(sayi < 1000 && sayi > 99 ? ("3 Basamaklı") : (sayi % 2 == 0) ? ("3 basamaklı olmayan çift sayı") : ("3 basamaklı olmayan tek sayı"));

    }
}
