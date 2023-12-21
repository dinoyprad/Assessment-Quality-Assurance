package project;

import java.util.Scanner;

public class Soal19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input kalimat = ");
        String kalimat = scan.nextLine().trim();

        scan.close();
        cara3(kalimat);
    }
    static void cara3(String kalimat){
        kalimat = kalimat.toLowerCase();
        boolean isPangram = true; //asumsi awal true semua
        for(char i = 'a'; i <='z'; i++){
            System.out.println("Sekarang = " + String.valueOf(i));
            if(!kalimat.contains(String.valueOf(i))){ //dari karakter ke string
                System.out.println("Not found = " + String.valueOf(i));
                isPangram = false; //ex kalo gada x yaudh gaush ke y dan z
                break; // sekali ketemu false, break
            }
        }
        if(isPangram){
            System.out.println(kalimat + " is Pangram");
        }
        else {
            System.out.println(kalimat + " is Not Pangram");
        }
    }
}
