package day02_Practice;

public class C07_Stringmanipulations {
    // kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {

        String str = "asdf";

        if (str.length()==4){
            System.out.print(str.charAt(3));
            System.out.print(str.charAt(2));
            System.out.print(str.charAt(1));
            System.out.print(str.charAt(0));
        }
    }

}
