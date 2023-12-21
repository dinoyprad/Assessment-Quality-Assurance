package project;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan N = ");
        int N = scan.nextInt();

        scan.close();

        for(int i = 1; i <= N; i++){
            System.out.print(i*N + " ");
        }
    }
}
