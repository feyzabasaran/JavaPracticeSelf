package day05_Practice;

import java.util.Scanner;

public class C02_StringManipulations {
    /*
        name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik"
		yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
     */
    public static void main(String[] args) {

        isimOrtasinaIsimYerlestirme();
    }

    private static void isimOrtasinaIsimYerlestirme() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk ismi girin");
        String name1 = scan.nextLine();
        System.out.println("Lutfen ikinci ismi giriniz");
        String name2 = scan.nextLine();

        if (name1.length()%2==0){
            System.out.println(name1.substring(0,name1.length()/2)+name2+(name1.substring(name1.length()/2)));

        }else System.out.println("name1 cift sayi olmadigi icin ortasina yerlestiremedik");
    }


}
