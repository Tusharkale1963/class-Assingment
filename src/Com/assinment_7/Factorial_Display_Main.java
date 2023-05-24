package Com.assinment_7;

import java.util.Scanner;

public class Factorial_Display_Main {

	public static void main(String[] args) {
		Factorial_Display obj = new Factorial_Display();
		Scanner sc=new Scanner (System.in);
		System.out.println("type number you want to factor = ");
		int k=sc.nextInt();
		obj.factorialmethod(k);
		

	}

}
