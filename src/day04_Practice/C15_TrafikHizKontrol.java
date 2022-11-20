package day04_Practice;

import java.util.Scanner;

public class C15_TrafikHizKontrol {
    /* Problem tanimi : Kulanicidan aracacinin hizini aliniz Trafik cezasinin
     * degerini hesaplayin. 45 hiz siniridir.
     * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
     * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
     * Eger Hiziniz 85 -94 arainda ise: Ceza 320 $'dir.
     * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
     * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
     * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
     * -----------------------------------------
     * Orn;
     * currentSpeed(Hiziniz) 87 ve isDriverLicenceAvailable(Ehliyeti var mi) = true;
     * sonuc 320 olmalidir.
     * currentSpeed(Hiziniz) 65 ve isDriverLicenceAvailable(Ehliyeti var mÄ±?) =
     * false; sonuc 300 olmalidir.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen hizinizi giriniz");
        double hiz = scan.nextDouble();
        System.out.println("Ehliyetiniz varsa E yoksa H giriniz");
        char ehliyetVarMi = scan.next().charAt(0);

        if (ehliyetVarMi == 'E') {
            if (hiz <= 45) System.out.println("Hiz sinirina uydugunuz icin tesekkürler.");
            else if (hiz >= 55 && hiz <= 74) System.out.println("Hiz sinirini gectiniz cezaniz: 100$");
            else if (hiz >= 75 && hiz <= 84) System.out.println("Hiz sinirini gectiniz cezaniz: 150$");
            else if (hiz >= 85 && hiz <= 94) System.out.println("Hiz sinirini gectiniz cezaniz: 320$");
            else if (hiz > 94) System.out.println("Hiz sinirini gectiniz cezaniz: 500$");

        } else {
            if (hiz <= 54)
                System.out.println("Hiz sinirina uydugunuz icin tesekkürler ama ehliyetiniz yok cezaniz 200$");
            else if (hiz >= 55 && hiz <= 74)
                System.out.println("Ehliyetiniz yok ve Hiz sinirini gectiniz cezaniz: 300$");
            else if (hiz >= 75 && hiz <= 84)
                System.out.println("Ehliyetiniz yok ve Hiz sinirini gectiniz cezaniz: 350$");
            else if (hiz > 85 && hiz <= 94)
                System.out.println("Ehliyetiniz yok ve Hiz sinirini gectiniz cezaniz: 520$");
            else if (hiz > 94) System.out.println("Ehliyetiniz yok ve Hiz sinirini gectiniz cezaniz: 700$");


        }

    }
}
