package project;

import java.util.Scanner;

public class Soal18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input list jam = ");
        String[] jam = input.nextLine().trim().split(" ");
        //System.out.println(Arrays.toString(jam));
        System.out.print("Input list kalori = ");
        String[] kalori = input.nextLine().trim().split(" ");
        //System.out.println(Arrays.toString(kalori));
        System.out.print("Input waktu olahraga = ");
        Integer pukul = input.nextInt();
        input.close();

        double menit = 0;
        for (int i = 0; i < kalori.length; i++) {
            menit += 0.1*(Integer.parseInt(kalori[i]))*(pukul - Integer.parseInt(jam[i]));
        }

        int total = ((int)menit)/30*100+500;
        System.out.println("Total air = " + total + " cc");
    }
}
