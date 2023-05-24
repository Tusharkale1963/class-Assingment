package Com.Assignment_6;

import java.util.Scanner;

public class Table {
public static  void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number= ");
	int num=sc.nextInt();
	System.out.println("Table of this number "+num);
	for (int i=1;i<=10;i++) {
		int Table=num*i;
		System.out.println(num+"*"+i+"="+Table);
	}
}	
}
