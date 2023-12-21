package project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Soal3 {
 public static void main(String[] args) throws ParseException {
    Scanner scan = new Scanner(System.in);

        // dd/MM/yyyy-HH:mm  
        System.out.println("Masuk parkir = "); //01/06/2019-13:00
        String masuk = scan.nextLine().trim(); 

        System.out.println("Keluar parkir = ");//04/06/2019-09:06
        String keluar = scan.nextLine().trim();

        scan.close();

        //Tarif parkir:
        // 8 jam pertama: 1.000/jam
        // 8 jam 1 detik – 24 jam: 8.000 flat
        // 24 jam 1 detik – 8 jam kemudian: 15.000 flat + 1.000/jam

        //buat program untuk menghitung tarif parkir
        // cara1(masuk, keluar);
        cara2(masuk, keluar);
    }
    static void cara2(String masuk, String keluar)
        throws ParseException {
        long tarif = 0;
        int countHari = 0;
        int countJam = 0;
        

        int perHari = 15000;
        int perJamPertama = 1000;
        int perJamBerikutnya = 8000;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy-HH:mm:ss");
        Date dateMasuk = dateFormat.parse(masuk);
        Date dateKeluar = dateFormat.parse(keluar);

        long diffMSec = dateKeluar.getTime() - dateMasuk.getTime();
        long diffMin = diffMSec / (60 * 1000);

        while (diffMin >= 1440) {
            countHari += 1;
            diffMin -= 1440;
        }
        while (diffMin >= 60) {
            countJam += 1;
            diffMin -= 60;
        }

        // hitung per hari
        tarif = (countHari * perHari);
        // hitung sisa jam
        if (countJam <= 8) {
            tarif = (tarif + (countJam*perJamPertama));
        } else if (countJam > 8) {
            tarif = (tarif + perJamBerikutnya);
        }

        System.out.println(countHari + " Hari " + countJam + " Jam " + diffMin + " Menit");
        System.out.println("Tarif : " + tarif);
    }
 }   

