package project;

import java.util.Scanner;

public class Soal15 {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // jam & menit
    System.out.println("Input jam (12h/12H) = ");
    String input = scan.nextLine().trim();
    scan.close();

        String output = "";
        //format 12H -> 24H
        if(input.length() == 11){
            if(input.charAt(9) == 'A' || input.charAt(9) == 'a'){
                if(input.substring(0, 2).equals("12")){
                    output = "00" + input.substring(2, 8);
                } else {
                    output = input.substring(0, 8);
                }
            }
            else if(input.charAt(9) == 'P' || input.charAt(9) == 'p'){
                if(input.substring(0, 2).equals("12")){
                    output = input.substring(0, 8);
                } else {
                    int hour = Integer.parseInt(input.substring(0, 2));
                    hour = hour + 12;
                    output = hour + input.substring(2, 8);
                }
            }
        }
        System.out.println("Hasil konversi = " + output);        
    }   
}
