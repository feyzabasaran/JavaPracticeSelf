package day04_Practice;

import java.util.Scanner;

public class C11_KoordinatYazdirma {
    // Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen x koordinatini giriniz");
        int x = scan.nextInt();
        System.out.println("Lutfen y koordinatini giriniz");
        int y = scan.nextInt();

        if (x > 0 && y > 0) System.out.println("Giridiginiz bolge 1. bolgededir");
        else if (x < 0 && y > 0) System.out.println("Giridiginiz bolge 2. bolgededir");
        else if (x < 0 && y < 0) System.out.println("Giridiginiz bolge 3. bolgededir");
        else if (x > 0 && y < 0) System.out.println("Giridiginiz bolge 4. bolgededir");
        else if (x != 0) System.out.println("Girilen nokta X ekseni uzerindedir ");
        else if (y != 0) System.out.println("Girilen nokta Y ekseni uzerindedir ");
        else System.out.println("Girdiginiz nokta Orijin'dir.");
    }
}
