package project;

import java.util.Scanner;

public class Soal20 {
    public static void main(String[] args) {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input jarak awal = ");
            int jarakAwal = Integer.parseInt(input.nextLine());
            System.out.print("Input suit untuk A = ") ;
            String[] suitA = input.nextLine().trim().split(" ");
            System.out.print("Input suit untuk B = ");
            String[] suitB = input.nextLine().trim().split(" ");
    
            input.close();
            int letakA = 0;
            int letakB = letakA+jarakAwal;
    
            for (int i = 0; i < suitA.length; i++) {
                if(suitA[i].equalsIgnoreCase("G")){
                    if(suitB[i].equalsIgnoreCase("B")){
                        letakA -=1;
                        letakB -=2;
                        if(letakA == letakB){
                            System.out.println("B Menang");
                            break;
                        }
                    } else if(suitB[i].equalsIgnoreCase("K")){
                        letakA +=2;
                        letakB +=1;
                        if(letakA == letakB){
                            System.out.println("A Menang");
                            break;
                        }
                    }
                } else if(suitA[i].equalsIgnoreCase("B")){
                    if(suitB[i].equalsIgnoreCase("K")){
                        letakA -=1;
                        letakB -=2;
                        if(letakA == letakB){
                            System.out.println("B Menang");
                            break;
                        }
                    } else if(suitB[i].equalsIgnoreCase("G")){
                        letakA +=2;
                        letakB +=1;
                        if(letakA == letakB){
                            System.out.println("A Menang");
                            break;
                        }
                    }
                } else if(suitA[i].equalsIgnoreCase("K")){
                    if(suitB[i].equalsIgnoreCase("G")){
                        letakA -=1;
                        letakB -=2;
                        if(letakA == letakB){
                            System.out.println("B Menang");
                            break;
                        }
                    } else if(suitB[i].equalsIgnoreCase("B")){
                        letakA +=2;
                        letakB +=1;
                        if(letakA == letakB){
                            System.out.println("A Menang");
                            break;
                        }
                    }
                }
            }
            if(letakA != letakB){
                System.out.println("Draw");
            }
        }    
}
