import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class CafeYonetimSistemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] yiyecekler = {"Döner","Hamburger","Pizza","Makarna"};
        int [] yiyecekFiyat = {320,200,225,180};
        String [] icecekler = {"Ayran","Kola","Su","Sprite","Çay","Türk Kahvesi"};
        int [] icecekFiyat = {30,50,15,50,25,60};

        ArrayList <String> siparisler = new ArrayList<>();

        System.out.print("Lüften bakiyenizi giriniz: ");
        int bakiye = scanner.nextInt();

        boolean devam = true;

        while(devam) {
            System.out.println("--------------MENÜ---------------");
            System.out.println("1- Yiyecekler");
            System.out.println("2- İçecekler");
            System.out.println("3- Siparişlerimi Listele");
            System.out.println("4- Çıkış Yap");
            System.out.println("\n");
            System.out.print("Lüften yapmak istediğiniz işlemi seçiniz: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Yiyecek menüsüne hoş geldiniz.");
                    for (int i = 0; i < yiyecekler.length; i++) {
                        System.out.println(yiyecekler[i] + " : " + yiyecekFiyat[i] + "TL");
                    }
                        System.out.println("\n");
                        System.out.println("İstediğiniz yiyeceği sipariş vermek için ismini yazabilirisiniz: ");
                        String yemek = scanner.next();
                        if (yemek.equalsIgnoreCase("Döner")) {
                            System.out.println("İşleminiz başarılı. !! Döner siparişiniz verilmiştir.");
                            System.out.println("Ücret hesabınızdan çekilmiştir.");
                            siparisler.add(yiyecekler[0]);
                            bakiye -=yiyecekFiyat[0];
                        }
                        else if(yemek.equalsIgnoreCase("Hamburger")){
                            System.out.println("İşleminiz başarılı. !! Hamburger siparişiniz verilmiştir.");
                            System.out.println("Ücret hesabınızdan çekilmiştir.");
                            siparisler.add(yiyecekler[1]);
                            bakiye -=yiyecekFiyat[1];
                        }
                        else if(yemek.equalsIgnoreCase("Pizza")){
                            System.out.println("İşleminiz başarılı. !! Pizza siparişiniz verilmiştir.");
                            System.out.println("Ücret hesabınızdan çekilmiştir.");
                            siparisler.add(yiyecekler[2]);
                            bakiye -=yiyecekFiyat[2];
                        }
                        else if(yemek.equalsIgnoreCase("Makarna")){
                            System.out.println("İşleminiz başarılı. !! Makarna siparişiniz verilmiştir.");
                            System.out.println("Ücret hesabınızdan çekilmiştir.");
                            siparisler.add(yiyecekler[3]);
                            bakiye -=yiyecekFiyat[3];
                        }
                        else {
                            System.out.println("Yanlış giriş yaptınız !!!!");
                        }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("İçecek menüsüne hoş geldiniz.");
                    for (int i = 0; i < yiyecekler.length; i++) {
                        System.out.println(icecekler[i] + " : " + icecekFiyat[i] + "TL");
                    }
                    System.out.println("\n");
                    System.out.println("İstediğiniz içeceği sipariş vermek için ismini yazabilirisiniz: ");
                    String icecek = scanner.next();
                    if (icecek.equalsIgnoreCase("Ayran")) {
                        System.out.println("İşleminiz başarılı. !! Ayran siparişiniz verilmiştir.");
                        System.out.println("Ücret hesabınızdan çekilmiştir.");
                        siparisler.add(icecekler[0]);
                        bakiye -=icecekFiyat[0];
                    }
                    else if(icecek.equalsIgnoreCase("Kola")){
                        System.out.println("İşleminiz başarılı. !! Kola siparişiniz verilmiştir.");
                        System.out.println("Ücret hesabınızdan çekilmiştir.");
                        siparisler.add(icecekler[1]);
                        bakiye -=icecekFiyat[1];
                    }
                    else if(icecek.equalsIgnoreCase("Su")){
                        System.out.println("İşleminiz başarılı. !! Su siparişiniz verilmiştir.");
                        System.out.println("Ücret hesabınızdan çekilmiştir.");
                        siparisler.add(icecekler[2]);
                        bakiye -=icecekFiyat[2];
                    }
                    else if(icecek.equalsIgnoreCase("Sprite")){
                        System.out.println("İşleminiz başarılı. !! Sprite siparişiniz verilmiştir.");
                        System.out.println("Ücret hesabınızdan çekilmiştir.");
                        siparisler.add(icecekler[3]);
                        bakiye -=icecekFiyat[3];
                    }
                    else if(icecek.equalsIgnoreCase("Çay")){
                        System.out.println("İşleminiz başarılı. !! Çay siparişiniz verilmiştir.");
                        System.out.println("Ücret hesabınızdan çekilmiştir.");
                        siparisler.add(icecekler[4]);
                        bakiye -=icecekFiyat[4];
                    }
                    else if(icecek.equalsIgnoreCase("Türk Kahvesi")){
                        System.out.println("İşleminiz başarılı. !! Türk Kahvesi siparişiniz verilmiştir.");
                        System.out.println("Ücret hesabınızdan çekilmiştir.");
                        siparisler.add(icecekler[5]);
                        bakiye -=icecekFiyat[5];
                    }
                    else {
                        System.out.println("Yanlış giriş yaptınız !!!!");
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Siparişleriniz: " + siparisler);
                    System.out.println("Kalan bakiyeniz: " + bakiye);
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor, Afiyet olsunnnn.");
                    System.out.println(":)");
                    devam = false;
                    System.out.println("\n");
                    break;
            }
        }

    }
}
