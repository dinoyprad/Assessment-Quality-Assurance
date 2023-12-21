package project;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Soal2 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);

        // dd/MM/yyyy
        System.out.println("Input tanggal pinjam = "); //01/03/2019
        String pinjam = scan.nextLine().trim();

        System.out.println("Input tanggal kembali = "); //15/05/2019
        String kembali = scan.nextLine().trim();

        cara1(pinjam, kembali);
    }
    
    static void cara1(String pinjam, String kembali) throws ParseException{
        SimpleDateFormat timeFormat = new SimpleDateFormat("dd/MM/yyy");
        Date timePinjam = timeFormat.parse(pinjam);
        Date timeKembali = timeFormat.parse(kembali);
        
        long totalMiliScnd = Math.abs(timeKembali.getTime()-timePinjam.getTime()); 
        //tdk perlu abs gpp karna timeKelmbali-timePinjam ga mungkin negatif
        //tp kalo pke gpp buat jaga2, takutnya pas input tanggal kebalik
        long lama = (totalMiliScnd/(1000*60*60*24)); //long kalo diconvert ke int takutnya ada data yg loss
        int lama2 = (int) lama;
        System.out.println("Lama pinjam = " + lama2 + " hari");
        int denda = 0;
        if(lama2 > 14){
            denda = (lama2 - 14) + (lama2 - 3) + (lama2 - 7) + (lama2 - 7);
        } else if (lama2 > 7){
            denda = (lama2 - 3) + (lama2 - 7) + (lama2 - 7);
        } else if (lama2 > 3){
            denda = (lama2 - 3);
        } else {
            denda = 0;
            System.out.println("Tidak ada denda!");
        }
        System.out.println("Denda = " + denda*100);
    }
}


