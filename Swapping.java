package LabBooks;

public class Swapping {
public static void main(String[] args) {
	float a=2.3f,b=1.3f,temporary;
	System.out.println("Before Swapping:");
	System.out.println("a = "+a+" b = "+b);
	System.out.println("After Swapping:");
	 temporary = a;
	 a=b;
	 b=temporary;
	 System.out.println("a = "+a+" b = "+b);
}
}
/*public class SwapTwoNumbersExercise {
public static void main(String[] args) {
float first = 2.50f, second = 4.50f;
System.out.println("--Before swap--");
System.out.println("First number = " + first);
System.out.println("Second number = " + second);
// Value of first is assigned to temporary
float temporary = first;
// Value of second is assigned to first
first = second;
// Value of temporary (which contains the initial value of first) is assigned to second
second = temporary;
System.out.println("--After swap--");
System.out.println("First number = " + first);
System.out.println("Second number = " + second);
}
}*/