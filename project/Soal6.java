package project;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.print("Input sembarang teks/angka = ");
        String input = scan.nextLine().trim();
        scan.close();

        // Cetak output apakah YES Palindrome atau NOT Palindrome
        input = input.replaceAll("[^a-zA-Z0-9]", "");
        input = input.toLowerCase();
        boolean isPalindrome = true;
        for(int i = 0; i < input.length(); i++){
            char kiri = input.charAt(i);
            char kanan = input.charAt(input.length()-1-i);
            if(kiri != kanan){
                System.out.println("NOT Palindrome");
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome == true){
            System.out.println("YES Palindrome");
        }
    }
}
