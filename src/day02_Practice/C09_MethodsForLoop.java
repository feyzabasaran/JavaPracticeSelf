package day02_Practice;

public class C09_MethodsForLoop {
    // Bir String icindeki tum karakterleri en fazla bir kez yazdiran bir method yaziniz.
    // test Data :
    // input: "aaaabbbcccddaaaaa"
    // output: abcd

    public static void main(String[] args) {

        String str1="aaaabbbcccddaaaaa";

        System.out.println(essizHarfleriBul(str1));


    }

    public static String essizHarfleriBul(String str1){

        String str2="";

        for (int i = 0; i <str1.length() ; i++) {

            if (!str2.contains(str1.substring(i,i+1))){

                str2=str2 + str1.substring(i,i+1);
            }
        }
        return str2;
    }
}
