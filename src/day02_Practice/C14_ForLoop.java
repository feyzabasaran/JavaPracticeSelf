package day02_Practice;

public class C14_ForLoop {

    // 0-255'e kadar olan harflerin, sayi ve harf degerini ekrana yazdirin

    public static void main(String[] args) {

        for (int i = 0; i <255 ; i++) {

            char karakter = (char)i;

            System.out.println(i+" Char degeri: "+ karakter);
        }
    }
}
