package project;

import java.util.Scanner;

public class Soal22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.print("Input panjang lilin = ");
        String[] n = scan.nextLine().trim().split(" ");
        scan.close();
        
        Integer[] fibo = new Integer[n.length];
        Integer[] sisa = new Integer[n.length];
        int n1 = 1, n2 = 1;
        for(int i = 0 ; i < n.length; i++){
            fibo[i] = n1;
            sisa[i] = Integer.parseInt(n[i]) - fibo[i];
            int next = n1 + n2;
            n1 = n2;
            n2 = next;
        }

        int letak=0;
        for (int i = 0; i < fibo.length-1; i++) {
            for (int j = 1; j < fibo.length; j++) {
                if(sisa[i]<sisa[j]){
                    letak = i;
                }
            }
        }

        System.out.println("Lilin yang habis meleleh pertama adalah lilin dengan panjang "+n[letak]);
    }
}
