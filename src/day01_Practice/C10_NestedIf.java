package day01_Practice;

public class C10_NestedIf {
    public static void main(String[] args) {

        // oy kullanma skalasi
        // yas 18'den buyukse oy kullanabilir, kücük kullanamaz
        // yas 50'den buyukse 2 oy kullanabilsin
        // yas 18-50 arasi ise 1 oy kullanabilsin

        int yas =3;

        if (yas>=18){

            if (yas>=50){
                System.out.println("2 oy kullanma hakkina sahipsiniz");
            } else {
                System.out.println("1 oy kullanma hakkina sahipsiniz");
            }

        }else System.out.println("Yas 18'den kucuk oldugu icin oy kullanamaz");
    }
}
