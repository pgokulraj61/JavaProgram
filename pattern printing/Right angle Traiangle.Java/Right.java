//Q4.Write a Java program to print a right angle triangle pattern.

import java.util.Scanner;
public class Right
{
	public static void main(String[] args) {
	    int n=5;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++){
	            if(i==5 || j==1 || i==j ||i==3&&j==2 ||i==4&&j==2||i==4&&j==3)
	            System.out.print("* ");
	            else
	            System.out.print("  ");
	        }
	        System.out.println();
	    }
		
	}
}
