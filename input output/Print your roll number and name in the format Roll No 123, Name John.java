import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int rollNo=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name=sc.nextLine();
        System.out.println("Roll No:"+rollNo+",Name:"+name);
    }
}
