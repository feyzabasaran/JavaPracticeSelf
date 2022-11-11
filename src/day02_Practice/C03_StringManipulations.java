package day02_Practice;

import java.util.Scanner;

public class C03_StringManipulations {
    /*
    Kullanicidan bir kelime girmesini isteyin
    - Kelimede tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
    kelimenin ortasindaki karakteri yazdirin
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();

        if (kelime.length()%2!=0 && kelime.length()>=3){
            System.out.println(kelime.charAt((kelime.length()-1)/2));
        }else System.out.println("kelime çif sayida karakter iceriyor");
    }
}
