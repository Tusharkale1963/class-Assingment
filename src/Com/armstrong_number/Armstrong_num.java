package Com.armstrong_number;

import java.util.Scanner;

public class Armstrong_num {
	int num=0,rem=0,cube=0;
	 int number=153;
	 
	void check() {
// int number=153;
		int amstrom =number;
	while(amstrom>0) {
		
		rem=amstrom%10;
		  cube=rem*rem*rem;
		  System.out.print(" cube is = "+cube);
		amstrom=amstrom/10;
		num=num+cube;
		System.out.println("total num=> "+num);
	
	}
	}
	 //num=num+cube;
	 //System.out.println("total num=> "+num);
	void condition() {
	 if(number==num) {
		 System.out.println(" this is  a armtsong num ");
	 }
	 else {
		 System.out.println("this is not a armtsong num"+num);
	 }}
	
	
	
	public static void main(String[] args) {
		Armstrong_num obj=new Armstrong_num();
		obj.check();
		obj.condition();

	}

}
