package LabBooks;

public class SumOfArrayValues {
public static void main(String[] args) {
	int[] array= {10,20,30,40,50,60,70,80,90,100};
	int sum=0;
	for(int num:array) {
		sum+=num;
	}
	System.out.println("Sum = "+sum);
	
}
}
