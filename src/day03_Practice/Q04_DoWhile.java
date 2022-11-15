package day03_Practice;

import java.util.Scanner;

public class Q04_DoWhile {

    /*
    Kullanicidan bir kelime girmesini isteyin
    eger girilen kelimenin karakter sayisi tek ise ve 3'ten fazla ise kelimenin ortasindaki harfi yazdirin
    cift sayi ise "yanlis kelime girdiniz" yazdirin

    input: celik
    output : l
    input : elif
    output: yanlis kelime girdiniz
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String kelime = "";

        do {
            System.out.println("Lutfen bir kelime giriniz");
            kelime = scan.next();

            if (kelime.length()<3){
                System.out.println("girilen kelime 3 karakter veya daha  fazla karakter icermeli ");
            }
            if (kelime.length()%2!=1){
                System.out.println("girilen kelimedeki harf sayisi tek olmali");
            }
            if (kelime.length()<3 && kelime.length()%2!=1){
                System.out.println("yanlis kelime girdiniz");
            }
            if (kelime.length()>=3 && kelime.length()%2==1) {
            System.out.println("ortadaki karakter: " + kelime.charAt((kelime.length()-1)/2));
            }

        }while(kelime.length()<3 || kelime.length()%2!=1);


    }

}
