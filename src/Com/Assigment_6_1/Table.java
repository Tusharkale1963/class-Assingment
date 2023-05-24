package Com.Assigment_6_1;

import java.util.Scanner;

public class Table {
void table(int num) {
	int multy=1;
for(int i=1;i<=10;i++) {
multy=num*i;
System.out.println(num+"*"+i+"="+multy);
}
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("plz Enter any number for Table= ");
		int num=sc.nextInt();
		Table obj=new Table();
		obj.table(num);
		System.out.println("plz Enter any number for Table= ");
		int num1=sc.nextInt();
		obj.table(num1);
		System.out.println("plz Enter any number for Table= ");
		int num2=sc.nextInt();
		obj.table(num2);
//		int multy=1;
//for(int i=1;i<=10;i++) {
//	multy=num*i;
//	System.out.println(num+"*"+i+"="+multy);
//}
	}

}
