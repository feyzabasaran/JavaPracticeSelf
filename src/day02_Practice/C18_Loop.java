package day02_Practice;

public class C18_Loop {
    /*
    get the number of rows and columns from user.
    create a rectangle
    rows = 3 and column = 5 ==>  * * * * *
                                 * * * * *
                                 * * * * *
     */

    public static void main(String[] args) {

        for (int i = 1; i <=3 ; i++) {

            for (int j = 0; j <5 ; j++) {

                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}
