//Q25.Write a Java program to print a reverse alphabet palindrome pyramid.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  

        for (int i = 1; i <= n; i++) {

          
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }

           
            char ch = (char)('A' + n - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(ch-- + " ");
            }

           
            ch++;
            for (int j = 1; j < i; j++) {
                System.out.print(++ch + " ");
            }

            System.out.println();
        }
    }
}
