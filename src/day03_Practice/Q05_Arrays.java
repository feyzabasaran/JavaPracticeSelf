package day03_Practice;

import java.util.Arrays;

public class Q05_Arrays {

    // verilen array'in elemanlarin karelerini yazdirin
    // input : [2,4,5,6]  output: [4,16,25,36]

    public static void main(String[] args) {

        int [] arr = {2,6,4,5,8,9};


        for (int i = 0; i <arr.length ; i++) {

            arr [i] = arr [i]*arr [i] ;
        }

        System.out.println(Arrays.toString(arr)); // [4, 36, 16, 25, 64, 81]
    }
}
