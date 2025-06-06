import java.util.ArrayList;
import java.util.Scanner;
public class ATM_Simülasyonu {
    public static void main(String[] args) {
        String[] kullanicilar = {"Hasan Çavdar", "Ahmet Korkmaz", "Osman Yıldırım"};
        int[] sifreler = {8705, 1234, 1973};
        int bakiyeHasan = 1000;
        int bakiyeAhmet = 500;
        int bakiyeOsman = 200;
        String isimSoyisim = "";
        Scanner scanner = new Scanner(System.in);
        int parolaDenemeHakki = 3;


        boolean devam = true;
        while (devam) {
            System.out.print("Giriş Yapmak İçin Adınızı ve Soyadınızı Giriniz -> (Örnek: Emre Demir)  : ");
            isimSoyisim = scanner.nextLine();
            System.out.print("Giriş Yapmak İçin Şifrenizi Giriniz: ");
            int girisSifre = scanner.nextInt();
            scanner.nextLine();
            if (isimSoyisim.equalsIgnoreCase(kullanicilar[0]) && girisSifre == sifreler[0]) {
                System.out.println("Sayın " + isimSoyisim.toUpperCase() + " Hoş Geldiniz");
                System.out.println("Bakiyeniz: " + bakiyeHasan + "\n");
                break;
            } else if (isimSoyisim.equalsIgnoreCase(kullanicilar[1]) && girisSifre == sifreler[1]) {
                System.out.println("Sayın " + isimSoyisim.toUpperCase() + " Hoş Geldiniz");
                System.out.println("Bakiyeniz: " + bakiyeAhmet + "\n");
                break;
            } else if (isimSoyisim.equalsIgnoreCase(kullanicilar[2]) && girisSifre == sifreler[2]) {
                System.out.println("Sayın " + isimSoyisim.toUpperCase() + " Hoş Geldiniz");
                System.out.println("Bakiyeniz: " + bakiyeOsman + "\n");
                break;
            } else {
                parolaDenemeHakki--;
                System.out.println("Ad Soyad veya Parolanız Yanlış !!!   Kalan Deneme Hakkınız: " + parolaDenemeHakki);
                if (parolaDenemeHakki == 0) {
                    devam = false;
                    System.out.println("UYARI: Hesabınız Bloke Oldu Bankanızla İletişime Geçiniz !!");
                }
            }
        }
        boolean calistir = true;
        while (calistir) {
            if (parolaDenemeHakki != 0) {
                System.out.println("------ ATM MENÜSÜ ------");
                System.out.println("1- Bakiye Görüntüle");
                System.out.println("2- Para Çek");
                System.out.println("3- Para Yatır");
                System.out.println("4- Para Transferi");
                System.out.println("5- Şifre değişikliği");
                System.out.println("6- Çıkış Yap");

                System.out.print("\nLüften Yapmak İstediğiniz İşlemi Seçiniz: ");
                int secim = scanner.nextInt();
                switch (secim) {
                    case 1:
                        if (isimSoyisim.equalsIgnoreCase(kullanicilar[0])) {
                            System.out.println("Güncel Bakiyeniz: " + bakiyeHasan + " TL");
                        } else if (isimSoyisim.equalsIgnoreCase(kullanicilar[1])) {
                            System.out.println("Güncel Bakiyeniz: " + bakiyeAhmet + " TL");
                        } else if (isimSoyisim.equalsIgnoreCase(kullanicilar[2])) {
                            System.out.println("Güncel Bakiyeniz: " + bakiyeOsman + " TL");
                        }
                        break;
                    case 2:
                        System.out.println("Çekmek İstediğiniz Tutarını Giriniz: ");
                        int ceklilenMiktar = scanner.nextInt();
                        if (isimSoyisim.equalsIgnoreCase(kullanicilar[0]))
                            if (bakiyeHasan >= ceklilenMiktar) {
                                System.out.println("İşlemi Onaylıyor Musunuz? " + ceklilenMiktar + " TL Çekme işlemi");
                                System.out.println("Onaylıyorsanız Evet, Onaylamıyorsanız Hayır Yazın");
                                String onay = scanner.next();
                                if (onay.equalsIgnoreCase("Evet")) {
                                    System.out.println("Para Çekme İşlemi Başarılı Kartınızı ve Paranızı Almayı Unutmayın!");
                                    bakiyeHasan -= ceklilenMiktar;
                                } else if (onay.equalsIgnoreCase("Hayır")) {
                                    System.out.println("Para Çekme İşleminden Vazgeçildi.");
                                } else {
                                    System.out.println("Geçerli Bir Değer Giriniz !");
                                }
                            } else {
                                System.out.println("Bakiyeniz Çekmek İstediğiniz Tutar İçin Yeterli Değil.");
                            }
                        else if (isimSoyisim.equalsIgnoreCase(kullanicilar[1])) {
                            if (bakiyeAhmet >= ceklilenMiktar) {
                                System.out.println("İşlemi Onaylıyor Musunuz?" + ceklilenMiktar + " TL Çekme işlemi");
                                System.out.println("Onaylıyorsanız Evet, Onaylamıyorsanız Hayır Yazın");
                                String onay = scanner.next();
                                if (onay.equalsIgnoreCase("Evet")) {
                                    System.out.println("Para Çekme İşlemi Başarılı Kartınızı ve Paranızı Almayı Unutmayın!");
                                    bakiyeAhmet -= ceklilenMiktar;
                                } else if (onay.equalsIgnoreCase("Hayır")) {
                                    System.out.println("Para Çekme İşleminden Vazgeçildi.");
                                } else {
                                    System.out.println("Geçerli Bir Değer Giriniz !");
                                }
                            } else {
                                System.out.println("Bakiyeniz Çekmek İstediğiniz Tutar İçin Yeterli Değil.");
                            }
                        } else if (isimSoyisim.equalsIgnoreCase(kullanicilar[2])) {
                            if (bakiyeOsman >= ceklilenMiktar) {
                                System.out.println("İşlemi Onaylıyor Musunuz?" + ceklilenMiktar + " TL Çekme işlemi");
                                System.out.println("Onaylıyorsanız Evet, Onaylamıyorsanız Hayır Yazın");
                                String onay = scanner.next();
                                if (onay.equalsIgnoreCase("Evet")) {
                                    System.out.println("Para Çekme İşlemi Başarılı Kartınızı ve Paranızı Almayı Unutmayın!");
                                    bakiyeOsman -= ceklilenMiktar;
                                } else if (onay.equalsIgnoreCase("Hayır")) {
                                    System.out.println("Para Çekme İşleminden Vazgeçildi.");
                                } else {
                                    System.out.println("Geçerli Bir Değer Giriniz !");
                                }
                            } else {
                                System.out.println("Bakiyeniz Çekmek İstediğiniz Tutar İçin Yeterli Değil.");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("\n Yatırmak İstediğiniz Tutarını Giriniz: ");
                        int yatirilanMiktar = scanner.nextInt();
                        if (isimSoyisim.equalsIgnoreCase(kullanicilar[0])) {
                            System.out.println("İşlemi Onaylıyor Musunuz? " + yatirilanMiktar + " TL Yatırma işlemi");
                            System.out.println("Onaylıyorsanız Evet, Onaylamıyorsanız Hayır Yazın");
                            String onayYatirilan = scanner.next();
                            if (onayYatirilan.equalsIgnoreCase("Evet")) {
                                System.out.println("Para Yatırma İşlemi Başarılı");
                                bakiyeHasan += yatirilanMiktar;
                            } else if (onayYatirilan.equalsIgnoreCase("Hayır")) {
                                System.out.println("Para Yatırma İşleminden Vazgeçildi.");
                            } else {
                                System.out.println("Geçeri Bir Değer Giriniz !");
                            }
                        } else if (isimSoyisim.equalsIgnoreCase(kullanicilar[1])) {
                            System.out.println("İşlemi Onaylıyor Musunuz?" + yatirilanMiktar + " TL Yatırma işlemi");
                            System.out.println("Onaylıyorsanız Evet, Onaylamıyorsanız Hayır Yazın");
                            String onayYatirilan = scanner.next();
                            if (onayYatirilan.equalsIgnoreCase("Evet")) {
                                System.out.println("Para Yatırma İşlemi Başarılı");
                                bakiyeAhmet += yatirilanMiktar;
                            } else if (onayYatirilan.equalsIgnoreCase("Hayır")) {
                                System.out.println("Para Yatırma İşleminden Vazgeçildi.");
                            } else {
                                System.out.println("Geçeri Bir Değer Giriniz !");
                            }
                        } else if (isimSoyisim.equalsIgnoreCase(kullanicilar[2])) {
                            System.out.println("İşlemi Onaylıyor Musunuz?" + yatirilanMiktar + " TL Yatırma işlemi");
                            System.out.println("Onaylıyorsanız Evet, Onaylamıyorsanız Hayır Yazın");
                            String onayYatirilan = scanner.next();
                            if (onayYatirilan.equalsIgnoreCase("Evet")) {
                                System.out.println("Para Yatırma İşlemi Başarılı");
                                bakiyeOsman += yatirilanMiktar;
                            } else if (onayYatirilan.equalsIgnoreCase("Hayır")) {
                                System.out.println("Para Yatırma İşleminden Vazgeçildi.");
                            } else {
                                System.out.println("Geçeri Bir Değer Giriniz !");
                            }
                        }break;
                    case 4:
                        System.out.println("Göndermek İstediğiniz Tutarını Giriniz: ");
                        int gonderilenMiktar = scanner.nextInt();
                        if (isimSoyisim.equalsIgnoreCase(kullanicilar[0]))
                            if (bakiyeHasan >= gonderilenMiktar) {
                                System.out.println("İşlemi Onaylıyor Musunuz? " + gonderilenMiktar + " TL Gönderme işlemi");
                                System.out.println("Onaylıyorsanız Evet, Onaylamıyorsanız Hayır Yazın");
                                String onayGonderme = scanner.next();
                                if (onayGonderme.equalsIgnoreCase("Evet")) {
                                    System.out.println("Para Gönderme İşlemi Başarılı Kartınızı ve Paranızı Almayı Unutmayın!");
                                    bakiyeHasan -= gonderilenMiktar;
                                } else if (onayGonderme.equalsIgnoreCase("Hayır")) {
                                    System.out.println("Para Gönderme İşleminden Vazgeçildi.");
                                } else {
                                    System.out.println("Geçerli Bir Değer Giriniz !");
                                }
                            } else {
                                System.out.println("Bakiyeniz Göndermek İstediğiniz Tutar İçin Yeterli Değil.");
                            }
                        else if (isimSoyisim.equalsIgnoreCase(kullanicilar[1])) {
                            if (bakiyeAhmet >= gonderilenMiktar) {
                                System.out.println("İşlemi Onaylıyor Musunuz?" + gonderilenMiktar + " TL Gönderme işlemi");
                                System.out.println("Onaylıyorsanız Evet, Onaylamıyorsanız Hayır Yazın");
                                String onayGonderme = scanner.next();
                                if (onayGonderme.equalsIgnoreCase("Evet")) {
                                    System.out.println("Para Gönderme İşlemi Başarılı, Kartınızı ve Paranızı Almayı Unutmayın!");
                                    bakiyeAhmet -= gonderilenMiktar;
                                } else if (onayGonderme.equalsIgnoreCase("Hayır")) {
                                    System.out.println("Para Gönderme İşleminden Vazgeçildi.");
                                } else {
                                    System.out.println("Geçerli Bir Değer Giriniz !");
                                }
                            } else {
                                System.out.println("Bakiyeniz Gönderme İstediğiniz Tutar İçin Yeterli Değil.");
                            }
                        }
                        else if (isimSoyisim.equalsIgnoreCase(kullanicilar[2])) {
                            if (bakiyeOsman >= gonderilenMiktar) {
                                System.out.println("İşlemi Onaylıyor Musunuz?" + gonderilenMiktar + " TL Gönderme işlemi");
                                System.out.println("Onaylıyorsanız Evet, Onaylamıyorsanız Hayır Yazın");
                                String onayGonderme = scanner.next();
                                if (onayGonderme.equalsIgnoreCase("Evet")) {
                                    System.out.println("Para Gönderme İşlemi Başarılı Kartınızı ve Paranızı Almayı Unutmayın!");
                                    bakiyeOsman -= gonderilenMiktar;
                                } else if (onayGonderme.equalsIgnoreCase("Hayır")) {
                                    System.out.println("Para Gönderme İşleminden Vazgeçildi.");
                                } else {
                                    System.out.println("Geçerli Bir Değer Giriniz !");
                                }
                            } else {
                                System.out.println("Bakiyeniz Göndermek İstediğiniz Tutar İçin Yeterli Değil.");
                            }
                        }
                        break;
                    case 5:   //geçici olarak şifre değişikliği yapar kapatıp açınca sıfırlar ramdekini :( düzeltilecek
                        System.out.print("Mevcut Şifrenizi Giriniz: ");
                        int mevcutSifre = scanner.nextInt();
                        System.out.print("Yeni Şifrenizi Giriniz: ");
                        int yeniSifre = scanner.nextInt();
                        if (isimSoyisim.equalsIgnoreCase(kullanicilar[0]) && mevcutSifre == sifreler[0]) {
                            sifreler[0] = yeniSifre;
                            System.out.println("Şifreniz Başarıyla Değiştirildi.");
                        } else if (isimSoyisim.equalsIgnoreCase(kullanicilar[1]) && mevcutSifre == sifreler[1]) {
                            sifreler[1] = yeniSifre;
                            System.out.println("Şifreniz Başarıyla Değiştirildi.");
                        } else if (isimSoyisim.equalsIgnoreCase(kullanicilar[2]) && mevcutSifre == sifreler[2]) {
                            sifreler[2] = yeniSifre;
                            System.out.println("Şifreniz Başarıyla Değiştirildi.");
                        } else {
                            System.out.println("Mevcut şifreniz hatalı. Şifre değiştirilemedi.");
                        }
                        break;
                    case 6:
                        System.out.println("Çıkış Yapılıyor Kartınızı Almayı Unutmayın");
                        System.out.println("İyi Günler");
                        calistir = false;
                        break;
                }



            }
        }
    }
}