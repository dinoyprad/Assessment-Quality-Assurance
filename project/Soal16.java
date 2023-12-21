package project;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input harga makanan (pisah spasi) = ");
        String[] harga = scan.nextLine().trim().split(" ");
        scan.close();

        cara1(harga);
    }
        static void cara1(String[] harga) {
        double bayarIkan = 0;
        double bayarNonIkan = 0;
        double hargaPajak;
        
        for(int i = 0; i<harga.length; i++){
            hargaPajak = Double.parseDouble(harga[i]) + Double.parseDouble(harga[i]) * 0.15;
            if(i==0){
                bayarIkan += hargaPajak/3;
            } else {
                bayarNonIkan += hargaPajak/4;
                bayarIkan += hargaPajak/4;
            }
        }
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Harga per orang yang alergi ikan = " + df.format(bayarNonIkan));
        System.out.println("Harga per orang yang tidak alergi ikan = " + df.format(bayarIkan));
    }
}
