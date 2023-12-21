package project;

import java.util.Scanner;

public class Soal4 {
    // Fungsi untuk mengecek apakah suatu bilangan prima atau bukan
    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Fungsi untuk menampilkan n bilangan prima pertama
    static void generatePrimes(int n) {
        System.out.println("n bilangan prima pertama adalah:");

        for (int num = 2, count = 0; count < n; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan n = ");
        int n = input.nextInt(); 
        generatePrimes(n);
    }
}
