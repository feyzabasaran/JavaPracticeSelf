package day03_Practice;

import java.util.Scanner;

public class Q03_DoWhile {
    // Kullanicidan x girilene kadar ekrana "Program calisiyor" yazan
    // ve x girildiginde ise "Program bitti" yazan programi yaziniz

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String giris ="";
        do {
            System.out.println("Program calisiyor");
            System.out.println("Lutfen bir giris yapiniz");
            giris = scan.next();

        }while (!giris.equals("x"));

        System.out.println("Program bitti");
    }


}
