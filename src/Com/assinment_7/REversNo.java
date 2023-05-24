package Com.assinment_7;

import java.util.Scanner;

public class REversNo {
	int reminder = 0;

	void revers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number = ");
		int number = sc.nextInt();
		int num = number;
		int reverse = 0;
		while (num > 0) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder; // hich method lava late ith 
			num = num / 10;
		}
		System.out.println(reverse);

		if (number == reverse) {
			System.out.println("it is a polindrum");
		} else {
			System.out.println(" it is not polindrum");
		}

	}

	public static void main(String[] args) {
		REversNo obj = new REversNo();
		obj.revers();
	}

}
