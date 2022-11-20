package day04_Practice;

import java.util.Scanner;

public class C13_NotHesaplama {
    // Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
    // 1. 0()dahil ile 50 arasi - D
    // 2. 50(dahil) ile 60 arası - C
    // 3. 60(dahil) ile 80 arası - B
    // 4. 80(dahil) ustu- A
    // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int not = scan.nextInt();

        if (not >= 80) System.out.println("A");
        else if (not >= 60) System.out.println("B");
        else if (not >= 50) System.out.println("C");
        else if (not > 0) System.out.println("D");
        else System.out.println("Gecersiz giris yaptiniz");


    }
}
