package project;
import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input n bilangan (1 - 100) = ");
        int n = scan.nextInt();
        scan.close();

        cara1(n);
    }
    
    static void cara1(int n) {
        int n1 = 0, n2 = 1;
        for(int i = 1 ; i <= n; i++){
            System.out.print(n1 + " ");

            int next = n1 + n2;
            n1 = n2;
            n2 = next;
        }   
    }
}
