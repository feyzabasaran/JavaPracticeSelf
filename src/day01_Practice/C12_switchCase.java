package day01_Practice;

import java.util.Scanner;

public class C12_switchCase {
    public static void main(String[] args) {

        // ders programi
        // azartesi-sali : Java Dersi
        // perşembe-cuma: Selenium Dersi
        // carşamba- cumartesi : SQl Dersi
        // diger gunler : izin gunu
        Scanner scan = new Scanner(System.in);
        System.out.print("Gun isminin ilk harfini buyuk sekilde giriniz: ");
        String gun = scan.nextLine();

        switch (gun){
            case "Pazartesi":
            case "Sali":
                System.out.println("Java Dersi");
                break;
            case "Persembe":
            case "Cuma":
                System.out.println("Selenium Dersi");
                break;
            case "Carsamba":
            case "Cumartesi":
                System.out.println("SQL dersi");
                break;
            default:
                System.out.println("izin gunu");
        }
    }
}
