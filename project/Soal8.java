package project;

import java.util.Arrays;
import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input deret bilangan = ");
        String[] input = scan.nextLine().trim().split(" ");

        scan.close();
        cara4(input);
    }
    static void cara4(String[] input) {
        // Convert to Integer
        int size = input.length;
        int [] arr = new int [size];
        for(int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        //Sort
        Arrays.sort(arr);
        for(int i=0;i<size;i++) {
            System.out.print(arr[i] + " ");
        }

        //Min-Max Sum
        int minSum = 0;
        int maxSum = 0;
        for(int i = 0; i < 4; i++) {
            minSum = minSum + arr[i];
        }
        for(int i = size-1; i > size-5; i--) {
            maxSum = maxSum + arr[i];
        }
        System.out.println();
        System.out.println(minSum + " " + maxSum);
    }
}
