package LabBooks;
/*import java.util.Scanner;
public class AreaOfTriangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the width of the triangle:");
	double width=sc.nextDouble();
	System.out.println("Enter the height of the triangle:");
	double height=sc.nextDouble();
	double area=(width*height)/2;
	System.out.println("Area of triangle:"+area);
}
}*/
import java.util.Scanner;
class AreaOfTriangle
{
public static void main(String args[]) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter the width of the Triangle:");  double base = scanner.nextDouble();
 System.out.println("Enter the height of the Triangle:");  double height = scanner.nextDouble();
 //Area = (width*height)/2
double area = (base* height)/2;
 System.out.println("Area of Triangle is: " + area);
 }
}
