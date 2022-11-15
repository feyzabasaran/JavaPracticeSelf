package day03_Practice;

import java.util.Arrays;

public class Q15_Arrays {
    /*
    verilen bir cumledeki bosluklar haric character sayisini bulunuz
    cumle: verilen bir cumledeki bosluklar haric character sayisini bulunuz
     */

    public static void main(String[] args) {

        String str = "verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        str = str.replace(" ","");
        System.out.println(str); // verilenbircumledekibosluklarhariccharactersayisinibulunuz

        String [] arr = str.split("");
        System.out.println(Arrays.toString(arr)); // [v, e, r, i, l, e, n, b, i, r, c, u, m, l, e, d, e, k, i, b, o, s, l, u, k, l, a, r, h, a, r, i, c, c, h, a, r, a, c, t, e, r, s, a, y, i, s, i, n, i, b, u, l, u, n, u, z,.

        System.out.println("bosluklar haric karakter sayisi: " + arr.length); // 58
    }
}
