package day02_Practice;

public class C15_NestedLoop_CarpimTablosu {
    // 1*1 =1
    // 1*2 =2
    // 1*3 =3
    // 1*4 =4
    // 1*5 =5
    // 1*6 =6
    // 1*7 =7
    // 1*8 =8
    // 1*9 =9
    // 1*10 =10
    //yukarıdaki carpim tablosunu yazdirin
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {

            System.out.println("---------------");

            for (int j = 1; j <=10 ; j++) {

                System.out.println(i+"*"+j+ " = "+ (i*j));
            }

        }
    }

}
