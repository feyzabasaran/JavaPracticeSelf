package day02_Practice;

public class C11_MethodCreations {
    /*
    String parametreli bir method yazin ve girilen Stirng icindeki digitlerin
    toplamini dondursun

    input: ade1a4d3
    output: 8

    Ipucu:
    Character.isDigit()
    Integer.valueOf()

     */

    public static void main(String[] args) {

        String str= "ade1r4d3";

        System.out.println(sayilariBulTopla(str)); // 8

    }

    public static int sayilariBulTopla (String str){

        int toplam=0;
        for (int i = 0; i <str.length() ; i++) {

            if (Character.isDigit(str.charAt(i))){
                toplam+=Integer.valueOf("" +str.charAt(i));

            }


        }
        return toplam;
    }
}
