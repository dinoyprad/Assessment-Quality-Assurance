package project;

import java.util.Scanner;

public class Soal11 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.println("Input Kalimat = ");
        String input = scan.nextLine().trim();
        scan.close();

        String star = "";
        for(int i = 0; i < input.length()/2; i++){
            star += "*";
        }
        String[] split = input.split("");
        for(int i = input.length()-1; i >= 0; i--){
            System.out.println(star + split[i] + star);
        }
    }
}  
