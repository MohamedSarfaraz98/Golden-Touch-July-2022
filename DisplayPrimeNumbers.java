package LabBooks;

public class DisplayPrimeNumbers {
public static void main(String[] args) {
	int i=0;
	int num=0;
	String primeNumbers = "";
	for(i=1;i<=100;i++) {
		int count=0;
		for(num=i;num>=1;num--) {
			if(i%num==0) {
				count+=1;
			}
		}
		if(count==2){
			primeNumbers=primeNumbers + i + " ";
		}
	}
	System.out.println("Prime number from 1 to 100:");
	System.out.println(primeNumbers);
}
}
