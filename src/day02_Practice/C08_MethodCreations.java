package day02_Practice;

import java.util.Scanner;

public class C08_MethodCreations {
    /*
    Basit 4 islem yapan bir hesap makinesi kodlayiniz.
    Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayiniz
    Kullanicidan iki sayi girmesini isteyin
    Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdiriniz.
     */
    public static void main(String[] args) {

        hesapMakinesi();

    }

    public static void hesapMakinesi(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yapmak istediginiz islemi seciniz: /+-/*");
        char chr = scan.next().charAt(0);

        System.out.println("birinci sayi");
        int int1 = scan.nextInt();
        System.out.println("ikinci sayi");
        int int2 = scan.nextInt();

        switch (chr){
            case '+' :
                System.out.println(int1+int2);
                break;
            case '-':
                if (int1>int2){
                    System.out.println(int1-int2);
                }else System.out.println(int2-int1);
                break;
            case '*':
                System.out.println(int1*int2);
                break;
            case '/':
                if (int1>int2){
                    System.out.println(int1/int2);
                }else System.out.println(int2/int1);
                break;
            default:
                System.out.println("gecersiz giris yaptiniz");
        }


    }
}
