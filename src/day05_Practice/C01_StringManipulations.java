package day05_Practice;

import java.util.Scanner;

public class C01_StringManipulations {
    /* StringMethods
           String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */
    public static void main(String[] args) {
        harfsilme();

    }

    public static String harfsilme(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();


        if (kelime.substring(0,2).equals("gh")){
            System.out.println(kelime);
        } else if (kelime.substring(0,1).equals("g")) {
            System.out.println(kelime.substring(0,1)+kelime.substring(2));
        } else if (kelime.substring(1,2).equals("h")){
            System.out.println(kelime.substring(1));
        }else System.out.println(kelime.substring(2));

        return kelime;
    }
}
