import java.util.Scanner;
public class OyunDagitimSistemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lüften bakiyeniizi giriniz: ");
        int bakiye = scanner.nextInt();

        String oyun1 = "GTA V ";
        String oyun2 = "God of War";

        int oyun1fiyat = 500;
        int oyun1fiyatk = 120;
        int oyun2fiyat = 750;
        int oyun2fiyatk = 250;


        boolean calisiyorMu = true;
        while (calisiyorMu) {
            System.out.println("\nLütfen hangi işemi yapmak istediğini seçiniz");
            System.out.println("Oyun satın almak için 1");
            System.out.println("Oyun satın kiralamak için 2");
            System.out.println("Oyun iadesi olursturmak için 3");
            System.out.println("Çıkış için 4'e basınız");
            int secim = scanner.nextInt();
            if (secim == 1) {
                System.out.println("Merhaba Steam e oyun satıl alma hizmetine hoş geldiniz oyun fiyatlarımız aşağıda listelenmiştir.");
                System.out.println(oyun1 + "'in satın alma fiyatı: " + oyun1fiyat + " -> bunu satın almak için 1");
                System.out.println(oyun2 + "'in satın alma fiyatı: " + oyun2fiyat + " -> bunu satın almak için 2 \n\n");
                System.out.print("Seçtiniz oyun(rakam):");
                int oyunsecs = scanner.nextInt();

                if (oyunsecs == 1) {
                    if (bakiye >= oyun1fiyat) {
                        bakiye -= oyun1fiyat;
                        System.out.println(oyun1 + "'i satın aldınız ve yeni bakiyeniz = " + (bakiye));

                    } else {
                        System.out.println("Bakiyeniz " + oyun1 + "'i satın almak için yeterli değil isterseniz kiralayabilirsiniz");
                    }
                } else if (oyunsecs == 2) {
                    if (bakiye > oyun2fiyat) {
                        bakiye -= oyun2fiyat;
                        System.out.println(oyun2 + "'i satın aldınız ve yeni bakiyeniz = " + (bakiye));

                    } else {
                        System.out.println("Bakiyeniz " + oyun2 + "'i satın almak için yeterli değil isterseniz kiralayabilirsiniz");
                    }
                } else {
                    System.out.println("Yanlıs giriş yaptınız");
                }
            } else if (secim == 2) {
                System.out.println("Merhaba Steam e oyun kiralama hizmetine hoş geldiniz oyun kiralama fiyatlarımız aşağıda listelenmiştir \n");
                System.out.println(oyun1 + "'in kiralama fiyatı: " + oyun1fiyatk + " -> bunu satın almak için 1");
                System.out.println(oyun2 + "'in kiralama fiyatı: " + oyun2fiyatk + " -> bunu satın almak için 2 " + "\n\n");
                System.out.print("Seçtiniz oyun(rakam):");
                int oyunseck = scanner.nextInt();
                if (oyunseck == 1) {
                    if (bakiye >= oyun1fiyatk) {
                        bakiye -= oyun1fiyatk;
                        System.out.println(oyun1 + "'i kiraladınız ve yeni bakiyeniz = " + (bakiye));

                    } else {
                        System.out.println("Bakiyeniz " + oyun1 + "'i kiralamak için yeterli değil");
                    }
                } else if (oyunseck == 2) {
                    if (bakiye > oyun2fiyatk) {
                        bakiye -= oyun2fiyatk;
                        System.out.println(oyun2 + "'i kiraladınız ve yeni bakiyeniz = " + (bakiye));
                    } else {
                        System.out.println("Bakiyeniz " + oyun2 + "'i kiralamak için yeterli değil");
                    }
                } else {
                    System.out.println("Yanlıs giriş yaptınız");
                }
            } else if (secim == 3) {
                System.out.println("İade etmek istediğiniz oyunu seçin \n1- " + oyun1 + " Satın alım iptali için");
                System.out.println("2- " + oyun2 + " Satın alım iptali için");
                System.out.println("3- " + oyun1 + " Kiralama iptali için");
                System.out.println("4- " + oyun2 + " Kiralama iptali için");
                int iadeOyun = scanner.nextInt();
                if (iadeOyun == 1) {
                    {
                        System.out.println("Satın alım işleminiz iade edilmiştir. İadeniz için üzgünüz :( ");
                        bakiye += oyun1fiyat;
                        System.out.println("Bakiyeniz: " + bakiye);
                    }
                }
                else if (iadeOyun == 2){
                    System.out.println("Satın alım işleminiz iade edilmiştir. İadeniz için üzgünüz :( ");
                    bakiye += oyun2fiyat;
                    System.out.println("Bakiyeniz: " + bakiye);
                }
                else if (iadeOyun == 3) {
                    System.out.println("kiralama işleminiz iade edilmiştir. İadeniz için üzgünüz :( ");
                    bakiye += oyun1fiyatk;
                    System.out.println("Bakiyeniz: " + bakiye);
                }
                else if (iadeOyun == 4) {
                    System.out.println("kiralama işleminiz iade edilmiştir. İadeniz için üzgünüz :( ");
                    bakiye += oyun2fiyatk;
                    System.out.println("Bakiyeniz: " + bakiye);
                }
                else{
                    System.out.println("Hatalı giriş yapıldı lütfen tekrar deneyiniz");
                }
            } else if (secim == 4) {
                System.out.println("Programdan çıkılıyorrrr.....)");
                System.out.println("Bakiyeniz: " + bakiye);
                calisiyorMu = false;
            }
        }
    }
}




















