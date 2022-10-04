package LabBooks;
/*import java.util.Scanner;
public class WhileLoopDmo {
	public static void main(String[] args) {
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number less than 10");
		number=sc.nextInt();
		while(number<=10) {
			sum+=number;
			number++;
		}
		System.out.println(sum);
	}

}*/
import java.util.Scanner;
public class WhileLoopD1mo {
public static void main(String[] args) {
 int number, sum = 0;
 Scanner sc = new Scanner(System.in);

 System.out.println("n Please Enter any integer Value below 10: ");  number = sc.nextInt();

 while (number <= 10) {
 sum = sum + number;
 number++;
 }
 System.out.format(" Sum of the Numbers From the While Loop is: %d ", sum);
 }
}
