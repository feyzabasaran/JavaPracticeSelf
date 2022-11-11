package day01_Practice;

import java.util.Scanner;

public class C18_StringManipulations {
    public static void main(String[] args) {

        /*
       Kullanicidan bir kelime isteyin,
       eger kelime 3 veya 3'den fazla harften olusuyorsa ilk iki harfi 3 kere yazdirin
       diger durumda kelimeyi yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime= scan.next();

        if (kelime.length()>=3) {
            System.out.print(kelime.substring(0, 2));
            System.out.print(kelime.substring(0, 2));
            System.out.print(kelime.substring(0, 2));
        }else {
            System.out.println(kelime);
        }
    }
}
