//Q3.Write a Java program to print a hollow square pattern with both diagonals.



import java.util.Scanner;
public class Square
{
	public static void main(String[] args) {
	    int n=5;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++){
	            if(i==1 || j==1 || i==5 ||j==5 ||i==j||i+j==(n+1))
	            System.out.print("* ");
	            else
	            System.out.print("  ");
	        }
	        System.out.println();
	    }
	
	}
}