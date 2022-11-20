package day04_Practice;

import java.util.Scanner;

public class C05_IfStatements {

    /*Problem Tanımı
    Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
    ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.
    TRICK: her else komutundan sonra return; komutu kullanınız...
    Örnek Ekran Çıktısı
    Lütfen günü giriniz: 10
    Lütfen ayı giriniz: 02
    Lütfen yılı giriniz: 2009
    Gün ay yıl: 10.02.2009
    Ay gün yıl: 02.10.2009
    Yıl ay gün: 2009.02.10

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen gunu giriniz: ");
        int gun = scan.nextInt();
        System.out.print("Lütfen ayı giriniz: ");
        int ay = scan.nextInt();
        System.out.print("Lütfen yili giriniz: ");
        int yil = scan.nextInt();

        System.out.println("Gün ay yıl: " +gun + "." + ay + "." + yil);

    }


}
