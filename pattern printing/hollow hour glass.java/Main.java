//Q20.Write a Java program to print a hollow hour glass pattern.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

       
        for (int i = 0; i < n; i++) {

            
            for (int s = 0; s < i; s++) {
                System.out.print("  ");
            }

           
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                if (i == 0 || j == 0 || j == 2 * (n - i) - 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        
        for (int i = 1; i < n; i++) {
