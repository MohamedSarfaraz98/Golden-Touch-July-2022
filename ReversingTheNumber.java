package LabBooks;
import java.util.Scanner;
public class ReversingTheNumber {
public static void main(String[] args) {
	int reverse=0,reminder;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int number=sc.nextInt();
	while(number!=0) {
		reminder=number%10;
		reverse=reverse*10+reminder;
		number/=10;
		}
	System.out.println("Reversed Number ="+reverse);
}
}
