//Q5.Write a Java program to print a reverse right angle triangle pattern.

import java.util.Scanner;
public class HollowRight
{
	public static void main(String[] args) {
	    int n=5;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++){
	            if(i==1 || j==5 || i==j ||i==2&&j==3 ||i==2&&j==4||i==3&&j==4)
	            System.out.print("* ");
	            else
	            System.out.print("  ");
	        }
	        System.out.println();
	    }
		
	}
}
