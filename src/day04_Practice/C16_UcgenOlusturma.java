package day04_Practice;

import java.util.Scanner;

public class C16_UcgenOlusturma {
    /*
    *  Kullanicidan 3 tene pozitif  tam sayi alniz.
    *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
       eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

        Ã¼Ã§gen olma sarti :herhangi iki kenar toplami diger kenardan bÃ¼yÃ¼k,
         herhangi iki kenar farkÄ± diger kenardan bÃ¼yÃ¼k olmali
        a+b>c>a-b
        a+c>b>a-c
        b+c>a>b-c
       a=b=c ise es kenar ucgen
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen 3 pozitif sayi girin: ");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("Eskenar ucgen");
        } else if (kenar1 + kenar2 > kenar3 && kenar3 > kenar1 - kenar2) {
            System.out.println("ucgen olsturulabilir");
        } else if (kenar1 + kenar3 > kenar2 && kenar2 > kenar1 - kenar3) {
            System.out.println("ucgen olsturulabilir");
        } else if (kenar2 + kenar3 > kenar1 && kenar1 > kenar2 - kenar3) {
            System.out.println("ucgen olsturulabilir");
        }
    }
}
