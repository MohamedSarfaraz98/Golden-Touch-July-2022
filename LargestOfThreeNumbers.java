package LabBooks;

public class LargestOfThreeNumbers {
public static void main(String[] args) {
	double n1=2.3,n2=4.5,n3=6.7;
	if(n1>=n2 && n1>n3) {
		System.out.println("THe largest of three numbers is:"+n1);
	}
	else if(n2>=n3 && n2>=n1) {
		System.out.println("The largest of three number is:"+n2);
	}
	else {
		System.out.println("The largest of three number is:"+n3);
		
	}
}
}
/*public class LargestNumber {
 public static void main(String[] args) {
 double n1 = -5.5, n2 = 4.5, n3 = 3.5;
 if( n1 >= n2 && n1 >= n3)
 System.out.println(n1 + " is the largest number.");
 else if (n2 >= n1 && n2 >= n3)
 System.out.println(n2 + " is the largest number.");
 else
 System.out.println(n3 + " is the largest number.");
 }
}*/
