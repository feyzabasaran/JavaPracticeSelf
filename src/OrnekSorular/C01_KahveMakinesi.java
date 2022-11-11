package OrnekSorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KahveMakinesi {
    /* 1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
       2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
       3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
    Örn:
    Hangi Kahveyi İstersiniz?
            1.Türk kahvesi
            2.Filtre Kahve
            3.Espresso

    String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
    (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
    todo 1. Koşul bölümü
    Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.
    (Dümdüz Türk kahvesi yazmayın. String hangiKahve'yi çağırın!!)

    Eğer filtre kahve ise,konsola = Filtre kahve hazırlanıyor.  yazsın. (String hangiKahve'yi kullanın !)
    Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
    Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın.
    (Hatalı tuslamadan sonra kod calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)

    todo ----------------------------------
    Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):
     "Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.
    String sut olusturun.

    todo 2.Koşul Bölümü
    Eğer String sut,  evet  e eşitse, konsola, "Süt ekleniyor..." yazısı gelsin.
     -- (Büyük küçük harf duyarlı olmaması için String methodu kullanın.
     Olması gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.

    Eğer String sut, hayır a eşit ise, konsola , "Süt eklenmiyor"  yazısı gelsin.


    todo ----------------------------------
    Sistem bize "seker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun.
    (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
    String seker oluşturunuz.

    todo 3.Koşul Bölümü
    todo if(){
    Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı. Sorunun altına int kacSeker  oluşturunuz.
    seker sayısını giriniz.
    Ve konsola   şunu yazdırınız örnek: "5 şeker ekleniyor" (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
    todo }
    todo else{
    Eğer String şeker  hayır 'a eşitse, sistem bize "�?eker eklenmiyor" cevabını versin.


    ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine koymamız gerekiyor.
    (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.

    Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :  sorusunu sorsun.
    (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
    String boyut oluşturun...

    todo 4.Koşul Bölümü
    Eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor.
    (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")

    Eğer String boyut  Orta Boy'a eşitse = "Kahveniz orta boy hazırlanıyor.." ("Kahveniz" + boyut + "hazırlanıyor.)

    Eğer String boyut  Küçük boy'a eşitse = "Kahveniz küçük boy hazırlanıyor.." yazsın. ("Kahveniz" + boyut + "hazırlanıyor.)

    todo  SONUÇ BÖLÜMÜ
    Siparişlerimizi verdik. Son hali görmek istiyoruz.

    konsola şunu yazdırın örnek :

    Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!
    (Türk kahvesi için String hangiKahveyi kullanın.     orta boy için de String boyut ' u kullanın.)
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> kahveCesitleri = new ArrayList<>();
        System.out.println("Hangi kahveyi istersiniz?");
        kahveCesitleri.add("1-Turk Kahvesi");
        kahveCesitleri.add("2-Filtre Kahve");
        kahveCesitleri.add("3-Espresso");
        System.out.println(kahveCesitleri);
        String hangiKahve = "";
        boolean girisGecerliMi =false;
        while (girisGecerliMi!=true){
            System.out.println("Hangi kahveyi icecekseniz giris yapiniz");
            hangiKahve= scan.nextLine();
            int kahveNumarasi=3;
            if (hangiKahve.equalsIgnoreCase("Turk Kahvesi")){
                System.out.println("Turk kahvesi hazirlaniyor...");
                break;
            } else if (hangiKahve.equalsIgnoreCase("Filtre Kahve")) {
                System.out.println("Filtre kahve hazirlaniyor...");
                break;
            } else if (hangiKahve.equalsIgnoreCase("Espresso")) {
                System.out.println("Espresso hazirlaniyor...");
                break;
            }else {
                System.out.println("Hatali tuslama yaptiniz");
            }
        }
        System.out.println("Sut eklemek ister misiniz? (Evet veya Hayır olarak cevaplayınız)");
        String sut =scan.nextLine();
        if (sut.equalsIgnoreCase("Evet")){
            System.out.println("Sut ekleniyor");
        }else {
            System.out.println("Sut eklenmiyor ");
        }
        System.out.println("Seker ister misiniz?(Evet veya hayir cevabını veriniz.Cevabınız hayır ise 2 kere enter'a basınız)");
        String seker = scan.nextLine();
        int kacSeker ;
        if (seker.equalsIgnoreCase("Evet")){
            System.out.println("Kac seker olsun?");
            kacSeker= scan.nextInt();
            System.out.println(kacSeker + " seker ekleniyor");
        }else if (seker.equalsIgnoreCase("Hayır")){
            System.out.println("Seker eklenmiyor");
        }
        String bosKod = scan.nextLine();
        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)");
        String boyut=scan.nextLine();
        if (boyut.equalsIgnoreCase("büyük boy")){
            System.out.println("Kahveniz "+boyut + " hazirlaniyor");
        } else if (boyut.equalsIgnoreCase("orta boy")){
            System.out.println("Kahveniz "+boyut + " hazirlaniyor");
        }else {
            System.out.println("Kahveniz "+boyut + " hazirlaniyor");
        }
        System.out.println(hangiKahve +" "+ boyut  +" hazirdir.Afiyet olsun");
    }
}
