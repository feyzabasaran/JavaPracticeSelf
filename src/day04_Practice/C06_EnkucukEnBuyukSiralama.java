package day04_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class C06_EnkucukEnBuyukSiralama {

    /*
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve
    en kucuk olanlarini konsola yazdiriniz
    int num1
    int num2
    int num3
*/


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 numara giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int [] numbers = {num1, num2,num3};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("En buyuk numara: " + numbers[numbers.length-1]);
        System.out.println("En kucuk numara: " + numbers[0]);

    }

}
