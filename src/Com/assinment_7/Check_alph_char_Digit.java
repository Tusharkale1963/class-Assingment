package Com.assinment_7;

import java.util.Scanner;

public class Check_alph_char_Digit {
void check() {
	Scanner sc=new Scanner(System.in);
	System.out.println("type any char ==>> ");
	
	char  num=sc.next().charAt(0);
	
	if(num>=65 && num<=90) {
		System.out.println(" than its a capital alfhabet==>> "+num);
	}
	else if(num>=97 &&num<=122) {
		System.out.println(" than its a small alfhabet ==>>"+num);
	}
	else if(num>=49 &&num<=57) {
		System.out.println(" than its a number==>> "+num);
	}
	else {
		System.out.println(" than its special character==>> "+num);
	}
}
	public static void main(String[] args) {
		Check_alph_char_Digit obj=new Check_alph_char_Digit();
		obj.check();

	}

}
