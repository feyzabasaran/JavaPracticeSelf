package day04_Practice;

import java.util.Scanner;

public class C17_VucutKitleIndexi {
    /*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo*10000 /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu cm cinsinden giriniz");
        double boy = scan.nextDouble();
        System.out.println("Lutfen kilonuzu kg cinsinden giriniz");
        double kilo = scan.nextDouble();

        double vke = kilo * 10000 / (boy * boy);
        System.out.println("Vucut kitle index'iniz: " + vke);

        if (vke > 30) System.out.println("Obez grubundasiniz");

        else if (vke > 25) System.out.println("Sisman grubundasiniz");

        else if (vke > 20) System.out.println("Normal sinirlardasiniz");

        else if (vke > 0) System.out.println("oldukca zayifsiniz");

        else System.out.println("Yanlis giris yaptiniz");

    }
}
