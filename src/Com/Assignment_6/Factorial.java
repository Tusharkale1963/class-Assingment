package Com.Assignment_6;

import java.util.Scanner;

public class Factorial {
	  void fact(int num1) {
		  int num=num1;
		  int Fact=1;
		 for( int i=1;i<=num;i++) {
			 Fact= Fact*i;
			   //System.out.println(Fact);
		   }
		 System.out.println("your factorial is = "+Fact);
	   }

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("plz enter any number = ");
	 int result=sc.nextInt();
	 Factorial obj=new Factorial();
	 obj.fact(result);
	}

}
