package day03_Practice;

public class Q06_Arrays {
    // dizi elemanlarinin ortalama degerini hesaplayan
    // ve elemanlari yazdiran bir program yazin
    // input = {1,2,3,4,5,6,7}
    // output = 4
    public static void main(String[] args) {

        int toplam =0;

        int[] input =  {1,2,3,4,5,6,7};

        for (int i = 0; i < input.length; i++) {
            toplam += input[i];
        }
        int ort = toplam/input.length;
        System.out.println("Girilen array'İn ortalamasi: " + ort);

        for (int i = 0; i <input.length ; i++) {
            if (input[i]>ort){
                System.out.print(input[i] + "-"); // 5-6-7-
            }
        }

    }
}
