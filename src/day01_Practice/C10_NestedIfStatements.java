package day01_Practice;

public class C10_NestedIfStatements {
    public static void main(String[] args) {

        // hayvan mekani 15 yaş ustu aliyor
        // kedi severler saga, kopek severler sola gitsin

        int yas= 5;
        String sevdigiHayvan= "Kedi";

        if (yas>15){

            if (sevdigiHayvan.equalsIgnoreCase("kedi")){
                System.out.println("Lutfen sag taraftan ilerleyin");
            }else if (sevdigiHayvan.equalsIgnoreCase("kopek")){
                System.out.println("Lutfen sol taraftan ilerleyin");
            }
        }else
            System.out.println("Yasiniz tutmuyor");


    }
}
