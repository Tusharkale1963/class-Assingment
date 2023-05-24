package Com.Assignment_5;

import java.util.Scanner;

public class PositivNigativNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" plz enter number = ");
	int	num=sc.nextInt();
		if(num>=0) {
			System.out.println(num +" =>it is a positive number  ");
		}
		else {System.out.println(num+" =>it is a negative number");
	}

}}
