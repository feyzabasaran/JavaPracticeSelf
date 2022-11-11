package day01_Practice;

public class C17_StringManipulations {
    /*
    Asagidaki degerleri toplayabilen bir program yapiniz

    12.34$
    32.23$
     */
    public static void main(String[] args) {

        String deger1="12.34$";
        String deger2="32.23$";

        String duzeltilmisdeger1=deger1.replaceAll("\\D","");
        System.out.println("duzeltilmisdeger1= " + duzeltilmisdeger1);
        String duzeltilmisdeger2=deger2.replaceAll("\\D","");
        System.out.println("duzeltilmisdeger2= " + duzeltilmisdeger2);

        String toplam = duzeltilmisdeger1+duzeltilmisdeger2;
        System.out.println("toplam= " + toplam); // 12343223 string olduklari icin boyle yazdiriyor.

        double sayi1= Double.parseDouble(duzeltilmisdeger1)/100;
        double sayi2= Double.parseDouble(duzeltilmisdeger2)/100;

        System.out.println("sayi1= " + sayi1);
        System.out.println("sayi2= " + sayi2);

        double toplamDeger = sayi1+sayi2;
        System.out.println("toplamDeger= " + toplamDeger);



    }
}
