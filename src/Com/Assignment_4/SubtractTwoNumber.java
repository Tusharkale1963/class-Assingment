package Com.Assignment_4;

import java.util.Scanner;

public class SubtractTwoNumber {
public void subtract() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your first number= ");
	int num1=sc.nextInt();
	System.out.println("Enter your Second number= ");
	int num2=sc.nextInt();
	int result =num1-num2;
	System.out.println("Result of  two number = "+result);
	
}
	public static void main(String[] args) {
		SubtractTwoNumber obj=new SubtractTwoNumber();
		obj.subtract();

	}

}
