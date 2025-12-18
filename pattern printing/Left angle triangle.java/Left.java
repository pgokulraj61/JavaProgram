//Q6.Write a Java program to print a left angle triangle pattern.


import java.util.Scanner;
public class LeftLeft
{
	public static void main(String[] args) {
	    int n=5;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++){
	            if(i==5 || j==5 || i+j==6|| i==3 && j==4||i==4&&j==3||i==4&&j==4)
	            System.out.print("* ");
	            else
	            System.out.print("  ");
	        }
	        System.out.println();
	    }
		
	}
}
