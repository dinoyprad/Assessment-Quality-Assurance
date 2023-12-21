package project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Soal13 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input jam hh:mm AM/PM = ");
        String waktu = scan.nextLine().trim();

        scan.close();

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        Date time = timeFormat.parse(waktu);//
        // System.out.println(getTime);
        String jam = new SimpleDateFormat("hh").format(time);
        // System.out.println("Jam format 12H = " + jam);
        String menit = new SimpleDateFormat("mm").format(time);
        // System.out.println("Menit format 12H = " + menit);
        // System.out.println(menit);

        int intJam = Integer.parseInt(jam);
        System.out.println("Jamnya = " + intJam);

        int intMenit = Integer.parseInt(menit);
        System.out.println("Menitnya = " + intMenit);

        double alfa =  (30 * intJam) + (0.5 * intMenit); //360:12 = 30
        double beta = 6 * intMenit; //360:60 = 6

        double sudutJam = Math.abs(alfa - beta);

        if (sudutJam > 180){
            sudutJam = 360-sudutJam;
        }

        System.out.println( "Sudut terkecilnya adalah = " + sudutJam + " derajat");
    
    }
}
