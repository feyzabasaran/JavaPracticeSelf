package day03_Practice;

public class Q11_Arrays {
    /*
    arr1= {{0,2,-1},{3,8,9},{7}}  ve arr2= {{-7,6,-9},{0,12},{19}} veriliyor
    bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz

    method ile yapiniz
     */

    public static void main(String[] args) {

        int [][] arr1 = {{0,2,-1},{3,8,9},{7} };
        int [][] arr2 = {{-7,6,-9},{0,12},{19}};
        int genelToplam=0;

        genelToplam += arraylElemanToplaminiBul(arr1) +arraylElemanToplaminiBul(arr2);
        System.out.println("İki array'in elemanlarinin toplami: " + genelToplam);
    }

    private static int arraylElemanToplaminiBul(int[][] arr1) {

        int toplam1 = 0;

        for (int i = 0; i < arr1.length ; i++) {

            for (int j = 0; j <arr1[i].length ; j++) {

                toplam1+=arr1[i][j];
            }

        }
        return toplam1;
    }

}