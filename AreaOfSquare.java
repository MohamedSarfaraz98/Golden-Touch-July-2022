package LabBooks;
/*import java.util.Scanner;
public class AreaOfSquare {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the side of the square:");
	double a = sc.nextDouble();
	double area=a*a;
	System.out.println("Area of square:"+area);
}
}*/
import java.util.Scanner;
class FindAreaOfSquare
{
public static void main (String[] args)
 {
 System.out.println("Enter Side of Square:");
 //Capture the user's input
 Scanner scanner = new Scanner(System.in);
//Storing the captured value in a variable
double side = scanner.nextDouble();
//Area of Square = side*side
double area = side*side;
System.out.println("Area of Square is: "+area);
}
}
