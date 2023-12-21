package project;

import java.util.Scanner;

public class Soal17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //pisah spasi
        System.out.println("Input perjalanan Hattori = ");
        String[] perjalanan = scan.nextLine().trim().split(" ");
        scan.close();
        cara0(perjalanan);
    }   

    static void cara0(String[] perjalanan){
        int ketinggian = 0;
        int gunung = 0;
        int lembah = 0;

        for(int i = 0; i < perjalanan.length; i++){
            String jalan = perjalanan[i];

            //Jika N -> +1
            //Jika T -> -1
            if(jalan.equals("N")){
                ketinggian++;
            }
            else if(jalan.equals("T")){
                ketinggian--;
            }

            if(ketinggian == 0 && jalan.equals("N")){
                lembah++;
            } 
            else if(ketinggian == 0 && jalan.equals("T")){
                gunung++;
            }
        }
        System.out.println("Gunung dan Lembah yang sudah dilewati Hattori = " + gunung + " Gunung " + lembah + " Lembah ");
    }
}
