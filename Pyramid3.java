package LabBooks;
/*import java.util.Scanner;
public class Pyramid3 {
public static void main(String[] args) {
	int i,j,row;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows");
	row = sc.nextInt();
	for(i=1;i<=row;i++) {
		int number=1;
		for(j=1;j<=i;j++) {
			System.out.print(+number+" ");
			number++;
		}
		System.out.println();
	}
	}
}*/
import java.util.Scanner;
class Pyramid3
 {
 public static void main(String args[])
 {
 int rows, number = 1, counter, j;
 //To get the user's input
 Scanner input = new Scanner(System.in);
 System.out.println("Enter the number of rows for floyd's triangle:");
 //Copying user input into an integer variable named rowsrows = input.nextInt();
 rows=input.nextInt();
 System.out.println("Floyd's triangle");
 System.out.println("****************");
 for ( counter = 1 ; counter <= rows ; counter++ )
 {
 for ( j = 1 ; j <= counter ; j++ )
 {
 System.out.print(number+" ");
 //Incrementing the number value
number++;
 }
 //For new line
 System.out.println();
 }
 }
 }
