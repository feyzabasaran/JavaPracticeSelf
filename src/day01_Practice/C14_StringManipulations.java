package day01_Practice;

import java.util.Scanner;

public class C14_StringManipulations {
    public static void main(String[] args) {

        // Kullanicidan isim ve soyisim alin, butun ismini buyuk harfle yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz: ");
        String isim = scan.nextLine();

        System.out.print("Lutfen soyisminizi girin: ");
        String soyIsim = scan.nextLine();

        String buyukIsimSoyisim = isim.toUpperCase()+ " " +  soyIsim.toUpperCase();

        System.out.println(buyukIsimSoyisim);



    }
}
