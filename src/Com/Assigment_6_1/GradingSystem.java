package Com.Assigment_6_1;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("plz enter your marks= ");
		int marks=sc.nextInt();
		if(marks>80) {
			System.out.println("your Grade is \"A\"");
		}
		else if(marks<=80 && marks>60) {
			System.out.println("your Grade is \"B\"");
		}
		else if(marks<60 && marks>=50) {
			System.out.println("your Grade is \"C\"");
		}
		else if(marks<50 && marks>=45) {
			System.out.println("your Grade is \"D\"");
		}
		else if(marks<45 && marks>=25) {
			System.out.println("your Grade is \"E\"");
		}
		
		else  {
			System.out.println("your Grade is \"F\"");
		}
	}

}
