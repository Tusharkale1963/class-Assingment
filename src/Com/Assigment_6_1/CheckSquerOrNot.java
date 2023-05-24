package Com.Assigment_6_1;

import java.util.Scanner;

public class CheckSquerOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length= ");
		int Length=sc.nextInt();
		System.out.println("Enter Breadth= ");
		int Breadth=sc.nextInt();
if(Breadth==Length) {
	System.out.println("It is a Square");
}
else {
	System.out.println("It is a Rectangle");
}
	}

}
