/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.projeler.DogalgazHesapTablosu;

import java.util.Scanner;

/**
 * @author mac
 */
public class DogalgazHesap {
    public static void main(String[] args) {
        int kombifiyat = 0;
        int kaloriferfiyat = 0;
        int sicaksufiyat = 0;
        int dogalgazfiyat = 0;
        int radyatorfiyat = 0;
        int vanafiyat = 0;
        int termostatikvanafiyat = 0;
        int termostatfiyat = 0;
        int dolapfiyat = 0;
        int havlupanfiyat = 0;
        int uzatmafiyat = 0;
        int dirsekfiyat = 0;
        int camfiyat = 0;
        int elektrikfiyat = 0;
        int iscilikfiyat = 0;
        int firmagiderifiyat = 0;
        int extrafiyat = 0;
        Scanner scanner = new Scanner(System.in);
        boolean isDone = false;
        while (!isDone) {
            System.out.println("**************************");
            String Kategori = "1.Kombi\n" + "2.Kalorifer Tesisatı\n" + "3.Sıcak Su Tesisatı\n" + "4.Dogalgaz Tesisatı\n" + "5.Radyatör\n" + "6.Radyatör Vanası\n" + "7.Termostatik Vana\n" + "8.Oda Termostatı\n" + "9.Kombi Dolabı\n" + "10.Havlupan\n" + "11.Baca Uzatması\n" + "12.Baca Dirseği\n" + "13.Cam Menfez\n" + "14.Elektrik\n" + "15.Işçilik\n" + "16.Firma Gideri\n" + "17.Extra Isçilik\n" + "Çıkış İçin Q'ya Basınız";
            System.out.println(Kategori);
            System.out.println("**************************");
            System.out.println("Kategori Seçiniz : ");
            String secim = scanner.nextLine();
            switch (secim) {
                case "1":
                    if (kombifiyat > 0) {
                        System.out.println("Seçilen Kombi Tipi Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();
                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String KombiTipi = "1. Bosch Condence 2500\n" + "2. Bosch Condence 2200i\n" + "3. ECA Citius Premix\n" + "4. ECA Proteus Premix";
                    System.out.println(KombiTipi);
                    System.out.println("**************************");
                    System.out.println("Kombi Tipinizi Seçiniz : ");
                    String kombitipi = scanner.nextLine();
                    if (kombitipi.equals("1")) {
                        kombifiyat = 10500;
                        System.out.println("Kombinizi Seçtiniz!!");
                        break;
                    } else if (kombitipi.equals("2")) {
                        kombifiyat = 9500;
                        System.out.println("Kombinizi Seçtiniz!!");
                        break;
                    } else if (kombitipi.equals("3")) {
                        kombifiyat = 9000;
                        System.out.println("Kombinizi Seçtiniz!!!");
                        break;
                    } else if (kombitipi.equals("4")) {
                        kombifiyat = 10000;
                        System.out.println("Kombinizi Seçtiniz!!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!!");
                    }
                    System.out.println("**************************");
                case "2":
                    if (kaloriferfiyat > 0) {
                        System.out.println("Seçilen Kalorifer Tesisatı Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();
                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String KaloriferTesisatiTipi = "1. KOMPLE\n" + "2. HAZIR\n" + "3. HAT TAŞIMALI";
                    System.out.println(KaloriferTesisatiTipi);
                    System.out.println("**************************");
                    System.out.println("Kalorifer Tesisatınızı Seçiniz : ");
                    String kalorifertesisatitipi = scanner.nextLine();
                    if (kalorifertesisatitipi.equals("1")) {
                        kaloriferfiyat = 1500;
                        System.out.println("Kalorifer Tesisatınızı Seçtiniz!!");
                        break;
                    } else if (kalorifertesisatitipi.equals("2")) {
                        kaloriferfiyat = 0;
                        System.out.println("Kalorifer Tesisatınızı Seçtiniz!!");
                        break;
                    } else if (kalorifertesisatitipi.equals("3")) {
                        kaloriferfiyat = 250;
                        System.out.println("Kalorifer Tesisatınızı Seçtiniz!!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!");
                    }
                    System.out.println("**************************");
                case "3":
                    if (sicaksufiyat > 0) {
                        System.out.println("Seçilen Sıcak Su Tesisatı Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();
                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String SıcakSuTeisatıTipi = "1. HAZIR\n" + "2. ÇEKİLECEK";
                    System.out.println(SıcakSuTeisatıTipi);
                    System.out.println("Sıcak Su Tesisatınızı Seçiniz : ");
                    String sicaksutesisatitipi = scanner.nextLine();
                    if (sicaksutesisatitipi.equals("1")) {
                        sicaksufiyat = 0;
                        System.out.println("Sıcak Su Tesisatınızı Seçtiniz!!");
                        break;
                    } else if (sicaksutesisatitipi.equals("2")) {
                        sicaksufiyat = 250;
                        System.out.println("Sıcak Su Tesisatınızı Seçtiniz!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!");
                    }
                    System.out.println("**************************");
                case "4":
                    if (dogalgazfiyat > 0) {
                        System.out.println("Seçilen Doğalgaz Tesisatı Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();
                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String DoğalgazTesisatıTipi = "1. ÇELİK_BORU\n" + "2. ESNEK_BORU";
                    System.out.println(DoğalgazTesisatıTipi);
                    System.out.println("Doğalgaz Tesisatınızı Seçiniz : ");
                    String dogalgaztesisatitipi = scanner.nextLine();
                    if (dogalgaztesisatitipi.equals("1")) {
                        dogalgazfiyat = 2000;
                        System.out.println("Doğalgaz Tesisatınızı Seçtiniz!!");
                        break;
                    } else if (dogalgaztesisatitipi.equals("2")) {
                        dogalgazfiyat = 4000;
                        System.out.println("Doğalgaz Tesisatınızı Seçtiniz!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!");
                    }
                    System.out.println("**************************");
                case "5":
                    if (radyatorfiyat > 0) {
                        System.out.println("Seçilen Radyator Tipi Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();
                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String RadyatörTipi = "1. ECA\n" + "2. WARMHAUS";
                    System.out.println(RadyatörTipi);
                    System.out.println("Radyatörünüzü Seçiniz : ");
                    String radyatortipi = scanner.nextLine();
                    if (radyatortipi.equals("1")) {
                        System.out.println("Metraj Giriniz : ");
                        float metraj = scanner.nextFloat();
                        radyatorfiyat = (int) metraj * 1300;
                        System.out.println("Radyatörünüzü Seçtiniz!!");
                        break;
                    } else if (radyatortipi.equals("2")) {
                        System.out.println("Metraj Giriniz : ");
                        float metraj = scanner.nextFloat();
                        radyatorfiyat = (int) metraj * 1150;
                        System.out.println("Radyatörünüzü Seçtiniz!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!");
                    }
                    System.out.println("**************************");
                case "6":
                    if (vanafiyat > 0) {
                        System.out.println("Seçilen Vana Tipi Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();
                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String RadyatörVanasi = "1. ECA\n" + "2. KALDE";
                    System.out.println(RadyatörVanasi);
                    System.out.println("Radyatör Vananızı Seçiniz : ");
                    String radyatorvanasi = scanner.nextLine();
                    if (radyatorvanasi.equals("1")) {
                        System.out.println("Adet Giriniz : ");
                        int adet = scanner.nextInt();
                        vanafiyat = adet * 65;
                        System.out.println("Radyatör Vananızı Seçtiniz!!");
                        break;
                    } else if (radyatorvanasi.equals("2")) {
                        System.out.println("Adet Giriniz : ");
                        int adet = scanner.nextInt();
                        vanafiyat = adet * 40;
                        System.out.println("Radyatör Vananızı Seçtiniz!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!");
                    }
                    System.out.println("**************************");
                case "7":
                    if (termostatikvanafiyat > 0) {
                        System.out.println("Seçilen Vana Tipi Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();
                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String TermostatikVana = "1. ECA\n" + "2. DANFOSS\n" + "3.YOK";
                    System.out.println(TermostatikVana);
                    System.out.println("Termostatik Vananızı Seçiniz : ");
                    String termostatikvana = scanner.nextLine();
                    if (termostatikvana.equals("1")) {
                        System.out.println("Adet Giriniz : ");
                        int adet = scanner.nextInt();
                        termostatikvanafiyat = adet * 100;
                        System.out.println("Termostatik Vananızı Seçtiniz!!");
                        break;
                    } else if (termostatikvana.equals("2")) {
                        System.out.println("Adet Giriniz : ");
                        int adet = scanner.nextInt();
                        termostatikvanafiyat = adet * 150;
                        System.out.println("Termostatik Vananızı Seçtiniz!!");
                        break;
                    } else if (termostatikvana.equals("3")) {
                        System.out.println("Termostatik Vananızı Seçtiniz!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!");
                    }
                    System.out.println("**************************");
                case "8":
                    if (termostatfiyat > 0) {
                        System.out.println("Seçilen Oda Termostatı Tipi Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();
                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String OdaTermostatı = "1. BOSCH_ON/OFF_TERMOSTAT\n" + "2. BOSCH_KABLOSUZ_TERMOSTAT\n" + "3.ECA_ON/OFF_TERMOSTAT\n" + "4.ECA_KABLOSUZ_TERMOSTAT\n" + "5.YOK";
                    System.out.println(OdaTermostatı);
                    System.out.println("Oda Termostatınızı Seçiniz : ");
                    String odatermostati = scanner.nextLine();
                    if (odatermostati.equals("1")) {
                        termostatfiyat = 300;
                        System.out.println("Oda Termostatınızı Seçtiniz!!");
                        break;
                    } else if (odatermostati.equals("2")) {
                        termostatfiyat = 1000;
                        System.out.println("Oda Termostatınızı Seçtiniz!!");
                        break;
                    } else if (odatermostati.equals("3")) {
                        termostatfiyat = 200;
                        System.out.println("Oda Termostatınızı Seçtiniz!!");
                        break;
                    } else if (odatermostati.equals("4")) {
                        termostatfiyat = 350;
                        System.out.println("Oda Termostatınızı Seçtiniz!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!");
                    }
                    System.out.println("**************************");
                case "9":
                    if (dolapfiyat > 0) {
                        System.out.println("Seçilen Kombi Dolabı Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();
                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String KombiDolabı = "1. VAR\n" + "2. YOK";
                    System.out.println(KombiDolabı);
                    System.out.println("Kombi Dolabınızı Seçiniz : ");
                    String kombidolabi = scanner.nextLine();
                    if (kombidolabi.equals("1")) {
                        dolapfiyat = 350;
                        System.out.println("Kombi Dolabınızıı Seçtiniz!!");
                        break;
                    } else if (kombidolabi.equals("2")) {
                        dolapfiyat = 0;
                        System.out.println("Kombi Dolabınızı Seçtiniz!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!");
                    }
                    System.out.println("**************************");
                case "10":
                    if (havlupanfiyat > 0) {
                        System.out.println("Seçilen Havlupan Tipi Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();
                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String Havlupan = "1. BEYAZ\n" + "2. KROM\n" + "3.YOK";
                    System.out.println(Havlupan);
                    System.out.println("Havlupanınızı Seçiniz : ");
                    String havlupan = scanner.nextLine();
                    if (havlupan.equals("1")) {
                        havlupanfiyat = 350;
                        System.out.println("Havlupanınızı Seçtiniz!!");
                        break;
                    } else if (havlupan.equals("2")) {
                        havlupanfiyat = 350;
                        System.out.println("Havlupanınızı Seçtiniz!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!");
                    }
                    System.out.println("**************************");
                case "11":
                    if (uzatmafiyat > 0) {
                        System.out.println("Seçilen Baca Uzatması Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();
                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String BacaUzatması = "1. 50cm\n" + "2. 100cm\n" + "3.YOK";
                    System.out.println(BacaUzatması);
                    System.out.println("Baca Uzatması Seçiniz : ");
                    String bacauzatmasi = scanner.nextLine();
                    if (bacauzatmasi.equals("1")) {
                        uzatmafiyat = 250;
                        System.out.println("Baca Uzatmanızı Seçtiniz!!");
                        break;
                    } else if (bacauzatmasi.equals("2")) {
                        uzatmafiyat = 350;
                        System.out.println("Baca Uzatmanızı Seçtiniz!!");
                        break;
                    } else if (bacauzatmasi.equals("3")) {
                        uzatmafiyat = 0;
                        System.out.println("Baca Uzatmanızı Seçtiniz!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!");
                    }
                    System.out.println("**************************");
                case "12":
                    if (dirsekfiyat > 0) {
                        System.out.println("Seçilen Baca Dirseği Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();
                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String BacaDirseği = "1. 45Derece\n" + "2. 90Derece\n" + "3.YOK";
                    System.out.println(BacaDirseği);
                    System.out.println("Baca Dirseği Seçiniz : ");
                    String bacadirsegi = scanner.nextLine();
                    if (bacadirsegi.equals("1")) {
                        dirsekfiyat = 200;
                        System.out.println("Baca Dirseğinizi Seçtiniz!!");
                        break;
                    } else if (bacadirsegi.equals("2")) {
                        dirsekfiyat = 250;
                        System.out.println("Baca Dirseğinizi Seçtiniz!!");
                        break;
                    } else if (bacadirsegi.equals("3")) {
                        dirsekfiyat = 0;
                        System.out.println("Baca Dirseğinizi Seçtiniz!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!");
                    }
                    System.out.println("**************************");
                case "13":
                    if (camfiyat > 0) {
                        System.out.println("Seçilen Cam Menfezi Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();

                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String CamMenfez = "1. VAR\n" + "2. YOK";
                    System.out.println(CamMenfez);
                    System.out.println("Cam Menfez Seçiniz : ");
                    String cammenfez = scanner.nextLine();
                    if (cammenfez.equals("1")) {
                        camfiyat = 50;
                        System.out.println("Cam Menfez Seçtiniz!!");
                        break;
                    } else if (cammenfez.equals("2")) {
                        camfiyat = 0;
                        System.out.println("Cam Menfez Seçtiniz!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!");
                    }
                    System.out.println("**************************");
                case "14":
                    if (elektrikfiyat > 0) {
                        System.out.println("Seçilen Elektrik Tesisatı Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();
                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String Elektrik = "1. VAR\n" + "2. YOK";
                    System.out.println(Elektrik);
                    System.out.println("Elektrik İşi Seçiniz : ");
                    String elektrik = scanner.nextLine();
                    if (elektrik.equals("1")) {
                        elektrikfiyat = 50;
                        System.out.println("Elektrik İşlemini Seçtiniz!!");
                        break;
                    } else if (elektrik.equals("2")) {
                        elektrikfiyat = 0;
                        System.out.println("Elektrik İşemini Seçtiniz!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!");
                    }
                    System.out.println("**************************");
                case "15":
                    if (iscilikfiyat > 0) {
                        System.out.println("Seçilen Işçilik Tipi Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();
                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String Işçilik = "1. KOMPLE\n" + "2. MONTAJ\n" + "3.KOMBI-GAZ";
                    System.out.println(Işçilik);
                    System.out.println("Işçilik Seçiniz : ");
                    String iscilik = scanner.nextLine();
                    if (iscilik.equals("1")) {
                        iscilikfiyat = 2000;
                        System.out.println("Işçilik Seçtiniz!!");
                        break;
                    } else if (iscilik.equals("2")) {
                        iscilikfiyat = 1500;
                        System.out.println("Işçilik Seçtiniz!!");
                        break;
                    } else if (iscilik.equals("3")) {
                        iscilikfiyat = 1000;
                        System.out.println("Işçilik Seçtiniz!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!");
                    }
                    System.out.println("**************************");
                case "16":
                    if (firmagiderifiyat > 0) {
                        System.out.println("Seçilen Firma Gideri Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();
                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String FirmaGideri = "1. VAR\n" + "2. YOK";
                    System.out.println(FirmaGideri);
                    System.out.println("Firma Gideri Seçiniz : ");
                    String firmagideri = scanner.nextLine();
                    if (firmagideri.equals("1")) {
                        firmagiderifiyat = 500;
                        System.out.println("Firma Giderinizi Seçtiniz!!");
                        break;
                    } else if (firmagideri.equals("2")) {
                        firmagiderifiyat = 0;
                        System.out.println("Firma Giderinizi Seçtiniz!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!");
                    }
                    System.out.println("**************************");
                case "17":
                    isDone = true;
                    if (extrafiyat > 0) {
                        System.out.println("Seçilen Extra Işçilik Değiştirilsin mi ?   (E / H) ");
                        String cevap = scanner.nextLine();
                        if ("E".equals(cevap)) {
                        } else if ("H".equals(cevap)) {
                            break;
                        } else {
                            System.out.println("Hatalı Giriş Yaptınız !!!  E veya H olarak giriş yapınız..");
                        }
                    }
                    String ExtraIşçilik = "1. VAR\n" + "2. YOK";
                    System.out.println(ExtraIşçilik);
                    System.out.println("Extra Işçilik Seçiniz : ");
                    String extraiscilik = scanner.nextLine();
                    if (extraiscilik.equals("1")) {
                        extrafiyat = 500;
                        System.out.println("Extra Işçilik Seçtiniz!!");
                        break;
                    } else if (extraiscilik.equals("2")) {
                        extrafiyat = 0;
                        System.out.println("Extra Işçilik Seçtiniz!!");
                        break;
                    } else {
                        System.out.println("Yanlış Bir Seçim Yaptınız !!");
                    }
                default: {
                    break;
                }
            }
        }
        int nakit = (kombifiyat + kaloriferfiyat + sicaksufiyat + dogalgazfiyat + radyatorfiyat + vanafiyat + termostatikvanafiyat + termostatfiyat + dolapfiyat + havlupanfiyat + uzatmafiyat + dirsekfiyat + camfiyat + elektrikfiyat + iscilikfiyat + firmagiderifiyat + extrafiyat);
        System.out.println("Nakit Rakam = " + (int) (nakit * 1.12));
        System.out.println("Kredi Kartı = " + (int) ((nakit * 1.12) * 1.07));
        System.out.println("12 Ay Senet = " + (int) ((nakit * 1.12) * 1.12));
        System.out.println("15 Ay Senet = " + (int) ((nakit * 1.12) * 1.15));
        System.out.println("18 Ay Senet = " + (int) ((nakit * 1.12) * 1.18));
    }
}
