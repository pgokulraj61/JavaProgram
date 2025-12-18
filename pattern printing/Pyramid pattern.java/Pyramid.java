//Q8.Write a Java program to print a pyramid pattern.

import java.util.*;
public class Pyramid
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for (int i=n;i>=1;i--){
	        for (int j=n;j>=1;j--){
	            System.out.print(" ");
	        }
	        for(int k=1;k<=(2*i-1);k++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
		
	}
}
