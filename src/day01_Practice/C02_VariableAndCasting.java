package day01_Practice;

public class C02_VariableAndCasting {
    public static void main(String[] args) {

        int intVar = 3 ;

        double doubleVar = 4.8;

        doubleVar= intVar;
        System.out.println(doubleVar);

        intVar=(int) doubleVar;
        System.out.println(intVar);

    }
}
