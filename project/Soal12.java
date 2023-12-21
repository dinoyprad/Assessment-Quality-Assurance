package project;

import java.util.Scanner;

public class Soal12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input deret angka (dipisah spasi) = ");
        String input = scan.nextLine().trim();
        scan.close();

        String[] deretString = input.split(" ");
        Integer[] deretAngka = new Integer [deretString.length];
        for(int i = 0; i<deretAngka.length;i++){
            deretAngka[i] = Integer.parseInt((deretString[i]));
        } // parse berfungsi untuk konversi

        cara1(deretAngka);
    }
    static void cara1(Integer[] deretAngka){
        int bil = 0;
        for(int i = 0; i < deretAngka.length; i++){
            for(int j = i + 1; j < deretAngka.length; j++){
                if(deretAngka[i] > deretAngka[j]){
                    bil = deretAngka[i];
                    deretAngka[i] = deretAngka[j];
                    deretAngka[j] = bil;
                }
            }
        }
        System.out.print("Deret setelah disortir Ascending : ");
        for(int i = 0; i < deretAngka.length; i++){
            System.out.print(deretAngka[i] + " ");
        }
    }
}
