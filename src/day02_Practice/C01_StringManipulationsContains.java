package day02_Practice;

public class C01_StringManipulationsContains {
/*
    girilen String icinde "xyz" dizimi varsa true degilse false yazdiran bir method yaziniz

    * input     output
    * axyzm ==  true
    * xyz   ==  true
    * x.yz  ==  false
    * xyaz  ==  false
     */

    public static void main(String[] args) {

        String str = "axyzm";

        if (str.contains("xyz")){
            System.out.println("ture");
        }else {
            System.out.println("false");
        }
    }
}
