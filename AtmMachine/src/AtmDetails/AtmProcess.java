package AtmDetails;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class AtmProcess {
	Scanner input = new Scanner(System.in);
	private int customerNumber;
	private int pinNumber;
	private static double currentBalance=100000;
	private static double savingBalance=50000;
//	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber() {
		// TODO Auto-generated method stub
		return customerNumber;
	}
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber() {
		// TODO Auto-generated method stub
		return pinNumber;
	}
	
	public double getCheckingBalance() {
		return currentBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public double calcCheckingWithdrawl(double amount) {
		currentBalance = (currentBalance - amount);
		return currentBalance;
	}
	
	public double calcSavingWithdrawl(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	public double calcCheckingDeposite(double amount) {
		currentBalance = (currentBalance + amount);
		return currentBalance;
	}
	
	public double calcSavingDeposite(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	public void getCheckingWithdrawalInput() {
		System.out.println("Checking account balance: "+ 
//	moneyFormat.format(
			currentBalance
//			)
		);
		System.out.println("Amount you Want to withdraw from checking Account: ");
		double amount = input.nextDouble();
		if(currentBalance -amount >= 0) {
			calcCheckingWithdrawl(amount);
			System.out.println("New Checking account balance: "+ 
//			moneyFormat.format(
					currentBalance
//					)
					+"\n");
		}
		else {
			System.out.println("Balance can not go to negative"+"\n");
		}
	}
	
	public void getSavingWithdrawalInput() {
		System.out.println("Saving account balance: "+ 
//	moneyFormat.format(
			savingBalance
//			)
		);
		System.out.println("Amount you Want to withdraw from Saving Account: ");
		double amount = input.nextDouble();
		if(savingBalance -amount >= 0) {
			calcSavingWithdrawl(amount);
			System.out.println("New Saving account balance: "+ savingBalance +"\n");
		}
		else {
			System.out.println("Balance can not go to negative"+"\n");
		}
	}
	public void getCheckingDepositeInput() {
		System.out.println("Checking account balance: "+ 
//	moneyFormat.format(
			currentBalance
//			)
		);
		System.out.println("Amount you Want to withdraw from checking Account: ");
		double amount = input.nextDouble();
		if(currentBalance + amount >= 0) {
			calcCheckingDeposite(amount);
			System.out.println("New Checking account balance: "+ 
//			moneyFormat.format(
					currentBalance
//					)
			+"\n");
		}
		else {
			System.out.println("Balance can not go to negative"+"\n");
		}
	}
	public void getSavingDepositeInput() {
		System.out.println("Saving account balance: "+
//	moneyFormat.format(
			savingBalance
//			)
		);
		System.out.println("Amount you Want to withdraw from Saving Account: ");
		double amount = input.nextDouble();
		if(savingBalance + amount >= 0) {
			calcSavingDeposite(amount);
			System.out.println("New Saving account balance: "+ savingBalance +"\n");
		}
		else {
			System.out.println("Balance can not go to negative"+"\n");
		}
	}
	
	
}
