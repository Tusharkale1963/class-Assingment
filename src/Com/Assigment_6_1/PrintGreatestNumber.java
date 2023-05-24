package Com.Assigment_6_1;

import java.util.Scanner;

public class PrintGreatestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("plz Enter 1st Number= ");
int num1=sc.nextInt();
System.out.println("plz Enter 2st Number= ");
int num2=sc.nextInt();
       if ((num1!=num2)&&(num1<num2)) {
    	   System.out.println("Greater number is = "+num2);}
    	   else if(num1==num2){
    		   System.out.println("Both number ARE same ");
    		   
    	   }
    	   else {
    		   System.out.println("Greater number is = "+num1);
       }



	}

}
