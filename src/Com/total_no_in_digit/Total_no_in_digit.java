package Com.total_no_in_digit;

import java.util.Scanner;

public class Total_no_in_digit {
 void mymethod() {
	 int rem;
	 int count=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter any number = ");
	 int num=sc.nextInt();
	 int num1=num;
	 while(num1>0) {
		 rem=num1%10;
		// System.out.print(rem+" ");
		 count++;
		 num1=num1/10;
		
	 }
	 
	 System.out.println("the total digit in number ==> "+count);
 }
	public static void main(String[] args) {
		Total_no_in_digit obj=new Total_no_in_digit();
		obj.mymethod();

	}

}
