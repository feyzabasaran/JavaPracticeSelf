package day01_Practice;

import java.util.Scanner;

public class C07_IfStatements {
    public static void main(String[] args) {

        // kullanici y girdiginde yes yazdir,
        // kullanici n girdiginde no yazdir.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Y/N birini giriniz");
        String str = scan.next();

        if (str.equalsIgnoreCase("Y")){
            System.out.println("Yes");
        }
        if (str.equalsIgnoreCase("N")){
            System.out.println("No");
        }
    }

}
