package day04_Practice;

import java.util.Scanner;

public class C08_KanBagisi {
    // Kullanicidan  yasini ve kilosunu alaliniz
    // 18 yasindan kucuk ise kan bagisi yapamaz
    // 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
    // 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = scan.nextDouble();

        if (yas < 18) {
            System.out.println("kan bagisi yapamaz");

        } else if (kilo > 50) System.out.println("kan bagisi yapabilir");
        else System.out.println("kan bagisi yapamaz.");
    }
}
