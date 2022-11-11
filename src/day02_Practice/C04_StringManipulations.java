package day02_Practice;

public class C04_StringManipulations {
    // "    Java ogrenmek123 Cok guzel@    " Stringi "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {

        String str = "    Java ogrenmek123 Cok guzel@    ";

        String kelime= str.trim().replaceAll("\\d","").replace("@","");
        System.out.println(kelime);

        String yeniKelime = kelime.substring(0,1).toUpperCase()+ kelime.substring(1).toLowerCase();
        System.out.println(yeniKelime);



    }
}
