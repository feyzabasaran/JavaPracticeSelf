package OrnekSorular;

import java.time.LocalDate;
import java.util.Scanner;

public class C02_DateTimeSoru {

    // Task: kullanicidan dogum tarihini isteyin ve gelen tarihi LocalDate clasindan bir degiskene atayin.
    // Daha sonra kullanicidan random tarih girmesini isteyin. Random tarih dogum tarihinizden sonra ise program kabul etmesin
    // ve kullanici yeniden tarih girsin. Sonuc olarak girilen random tarih dogum gununuzden once olmali.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int dYil;
        int dAy;
        int dGun;

        // 1-kullanicidan dogum tarihini isteyin

        System.out.println("Lutfen dogum yilinizi girin");
        dYil = scan.nextInt();
        System.out.println("Lutfen dogum ayinizi girin");
        dAy  = scan.nextInt();
        System.out.println("Lutfen dogum gununuzu girin");
        dGun = scan.nextInt();

        // 2- gelen tarihi LocalDate clasindan bir degiskene atayin.

        LocalDate dogumGunu = LocalDate.of(dYil,dAy,dGun);

        System.out.println(dogumGunu);

        // Daha sonra kullanicidan random tarih girmesini isteyin.


        System.out.println("Karsilastirmak istediginiz yili girin");
        dYil = scan.nextInt();
        System.out.println("Karsilastirmak istediginiz ayi girin");
        dAy  = scan.nextInt();
        System.out.println("Karsilastirmak istediginiz gunu girin");
        dGun = scan.nextInt();

        LocalDate girilenTarih = LocalDate.of(dYil,dAy,dGun);

        // Random tarih dogum tarihinizden sonra ise program kabul etmesin
        // ve kullanici yeniden tarih girsin. Sonuc olarak girilen random tarih dogum gununuzden once olmali.


        if (girilenTarih.isAfter(dogumGunu)){
            System.out.println("Girdiginiz tarih dogum gununuzden once olmali, tekrar deneyin");
        }else {
            System.out.println("Giris kabul edildi");
        }
    }
}
