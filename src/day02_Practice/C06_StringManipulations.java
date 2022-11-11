package day02_Practice;

public class C06_StringManipulations {
    // Kullanicidan alinan bir String'de bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir Stringin bos olup olmadigini kontrol ediniz

    public static void main(String[] args) {

        String str = "asdsaasfdf asd asds assff";

        if (str.contains(" ")){
            System.out.println("evet, bosluk var");
        }if (str.isBlank()){
            System.out.println("kelime bosluklardan olusuyor");
        }if (str.isEmpty()){
            System.out.println("sanirim yazmayi unuttunuz");
        }
    }
}
