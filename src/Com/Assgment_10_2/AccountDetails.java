package Com.Assgment_10_2;

import java.util.Scanner;

public class AccountDetails {
	
	public void getAccountDetails() {
		Scanner scanner=new Scanner (System.in);
		System.out.println("Enter your Id ==> ");
		String id=scanner.next();
		System.out.println("Enter accountNumber ==> ");
		long accnumber=scanner.nextLong();
		System.out.println("Enter Balance ==> ");
		double balance=scanner.nextDouble();
		
		Account obj=new Account();
		obj.setId( id);
		obj.setAccountNumber(accnumber);
		obj.setBalance(balance);
		getWithdrawDetails(obj);
		}
	
	private static int getWithdrawDetails(Account account) {
		int currentBalance = 0;
		System.out.println("Enter the amount for withdrawal>>");
		Scanner scanner = new Scanner(System.in);
		int withdrawAmount = scanner.nextInt();
		if (account.getBalance() > withdrawAmount) {
		currentBalance = (int) (account.getBalance() - withdrawAmount);
		}
		
		System.out.println("Your current account balance is>>" + currentBalance);
		return currentBalance;
		}
 
	
	
}
