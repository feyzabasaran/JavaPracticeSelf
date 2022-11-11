package day02_Practice;

public class C13_ForLoop {
    /*
    100'den 0'a kadar 13'e tam bolunebilen sayilari ekrana yazdiriniz(buyukten kucuge)
    output asagidaki gibi olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
    91
    78
    65
    52
    39
    26
    13
     */
    public static void main(String[] args) {

        int toplam = 0;

        for (int i = 100; i >0 ; i--) {
            if (i%13==0){
                System.out.println(i);
                toplam+=i;
            }

        }
        System.out.println("toplam deger: " +toplam);
    }
}
