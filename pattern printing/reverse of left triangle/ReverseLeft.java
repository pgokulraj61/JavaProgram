//Q7.Write a Java program to print a reverse left angle triangle pattern..


import java.util.Scanner;
public class ReverseLeft
{
	public static void main(String[] args) {
	    int n=5;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++){
	            if(i==1 || j==1 || i+j==6|| i==2 && j==2||i==3&&j==2||i==2&&j==3)
	            System.out.print("* ");
	            else
	            System.out.print("  ");
	        }
	        System.out.println();
	    }
		
	}
}
