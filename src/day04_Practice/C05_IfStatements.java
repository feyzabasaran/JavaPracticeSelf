package day04_Practice;

import java.text.SimpleDateFormat;
import java.util.Date;
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("gun : ");
        String gun = scanner.next();
        System.out.print("ay : ");
        String ay = scanner.next();
        System.out.print("yil : ");
        String yil = scanner.next();

        System.out.println("Gün ay yıl: " + gun + "." + ay + "." + yil);
        System.out.println("Ay gun yıl: " + ay + "." + gun + "." + yil);
        System.out.println("Yil ay gun: " + yil + "." + ay + "." + gun);







    }


}
