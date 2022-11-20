package day04_Practice;

import java.util.Scanner;

public class C12_MeslekYazdirma {

    /*
		 *  Kullanicidan IT alanini isteyerek
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		yazdiriniz
		 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen IT alaninizi giriniz: " +
                "\nQA icin: 1 \nDev icin: 2 \nBA icin: 3 \nPm icin: 4'e basin");
        int meslekAdi = scan.nextInt();

        switch (meslekAdi) {

            case 1:
                System.out.println("QA ==> Quality Analyst");
                break;
            case 2:
                System.out.println("Dev ==> Developer");
                break;
            case 3:
                System.out.println("BA ==> Busines Analyst");
                break;
            case 4:
                System.out.println("PM ==> Project Manager");
                break;
            default:
                System.out.println("Gecersiz giris yaptiniz");
        }

    }
}
