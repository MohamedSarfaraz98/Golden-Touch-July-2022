package LabBooks;
import java.util.Scanner;
public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int i=sc.nextInt();
		System.out.println("Enter the second number:");
		int j=sc.nextInt();
		int mul=i*j;
		System.out.println("Multiplication of two numbers = "+mul);
		
	}

}
/*import java.util.Scanner;
public class Basic2 {
public static void main(String[] args) {
 Scanner scan=new Scanner(System.in);

 System.out.println("Enter value for i..:");

 int i=scan.nextInt(); 
 System.out.println("Enter value for j...:");

 int j=scan.nextInt();

 int mul=i*j;

 System.out.println("The Multiplication of i and j is..:"+mul);  }
} */