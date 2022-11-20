package day01_Practice;

import java.util.Scanner;

public class C14_switchCase {
    public static void main(String[] args) {
        // Kullanicidan alinan harfe gore

        // A >> "Java cok kolay"
        // B >> "Java cok eglenceli"
        // C >> "Javayi cok seviyorum"

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir buyuk harf girin");

        char harf= scan.next().charAt(0);

        switch (harf){
            case 'A':
                System.out.println("Java cok kolay");
                break;

            case 'B':
                System.out.println("Java cok eglenceli");
                break;

            case 'C':
                System.out.println("Javayi cok seviyorum");
                break;

            default:
                System.out.println("gecersiz giris Lutfen A,B,C harflerini giriniz");
        }
    }
}
