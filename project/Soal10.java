package project;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input Kalimat = ");
        String input = scan.nextLine().trim();
        scan.close();

        cara0(input);
    }

    static void cara0(String input) {
        String[] strInput = input.split(" ");
        for(int i = 0; i < strInput.length; i++){
            String[] split = strInput[i].split("");
            for (int j = 0; j < split.length; j++){
                if(j == 0){
                    System.out.print(split[j]);
                }
                if(j == split.length-1){
                    System.out.print("***" + split[j] + " ");
                }
            }
        }
    }
}
