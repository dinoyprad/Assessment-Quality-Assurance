package project;

import java.util.Arrays;
import java.util.Scanner;

public class Soal14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input deret angka (pisah spasi) = ");
        String[] deret = scan.nextLine().trim().split(" ");

        System.out.println("Input n kali rotasi = ");
        int n = scan.nextInt();

        cara0(deret, n);
    }
    static void cara0(String[] deret, int n){
        String temp = "";
        for(int i = 0; i < n; i++){
            for(int j = 0; j < deret.length - 1; j++){
                temp = deret[j];
                deret[j] = deret[j+1];
                deret[j+1] = temp;
            }
        }
        for(String output : deret){
            System.out.print(output + " ");
        }
    }
}
