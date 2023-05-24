package Com.Assigment_6_1;

import java.util.Scanner;

public class Sum_Of_First_10_Natural_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter number= ");
		int num1=sc.nextInt();
		 int sum=0;
		for(int i=0;i<=num1;i++) {
			sum=sum+i;
		}
System.out.println("Total of first 10 natural number= "+sum);
	}

}
