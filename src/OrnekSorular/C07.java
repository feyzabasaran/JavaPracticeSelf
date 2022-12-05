package OrnekSorular;

import java.util.Random;

public class C07 {

    // Rastgele sayılardan oluşmuş 100 elemanlık tamsayı dizisindeki tüm elemanların
    // ortalamasını alacak bir kod yazin.
    // Rastgele oluşan 100 elemanlık sayı kümesi program yeniden her çalıştığında değişsin.
    // Sabit elemanlı bir dizi vermeyin!

    public static void main(String[] args) {

        Random rastgeleSayi = new Random();
        int [] arr = new int[100];
        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            System.out.println("Array'in " + (i+1) + ". elemani");

            arr [i]= rastgeleSayi.nextInt(1000);
            System.out.println(arr[i]+ " , ");
            toplam += arr[i];
        }
        System.out.println("Toplam " + toplam);
        System.out.println("Elemanlarin ortalamasi " + toplam/arr.length);
    }
}
