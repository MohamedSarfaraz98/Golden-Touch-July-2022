package LabBooks;
import java.util.Scanner;

public class PrintANumber {
public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter a number:");
	int number=reader.nextInt();
	System.out.println("Entered number = "+number);
	
}
}
/*import java.util.Scanner;
public class PrintANumber {
 public static void main(String[] args) {
 // Creates a reader instance which takes
// input from standard input - keyboard
 Scanner reader = new Scanner(System.in);
 System.out.print("Enter a number: ");
 // nextInt() reads the next integer from the keyboard
int number = reader.nextInt();
 // println() prints the following line to the output screen System.out.println("You entered: " + number);
 }
} */