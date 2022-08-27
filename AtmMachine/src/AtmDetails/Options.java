package AtmDetails;
import java.io.IOException;
import java.util.Map.Entry;
import java.text.DecimalFormat;
import java.util.*;
public class Options extends AtmProcess {

	Scanner in = new Scanner(System.in);
	int acc,pi;
	static int a[] = {9852923,8340627};
	static int b[] = {9852,8340};
//	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
//	HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
	
	
//	VAlid information of Account no. and pin
	
	public void getLogin() throws IOException{
		int x=1;
		
		do {
			try {
//				data.put(9852923,9852);
//				data.put(8340627, 8340);
				
				
				System.out.println("Welcome to Hdfc Atm");
				System.out.println("Enter the  correct account no.");
//				setCustomerNumber(in.nextInt());
				acc = in.nextInt();
				System.out.println("Enter the correct pin");
//				setPinNumber(in.nextInt());
				pi = in.nextInt();
			}catch(Exception e) {
				System.out.println("\n"+"Invalid character(s). Enter only no. \n");
				x=2;
			}
//			for(Entry<Integer, Integer> entry : data.entrySet()) {
//				if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
//					getAccountType();
//				}
//			}
			for(int i = 0; i<2;i++) {
				if(a[i] == acc && b[i] == pi) {
					getAccountType();
				}
			}
			System.out.println("\n"+"Wrong customer no. or pin no. \n");
		}while(x==1);
	}



	int selection;

private void getAccountType() {
	// TODO Auto-generated method stub
	System.out.println("Select the option");
	System.out.println("Type 1 - Current Account");
	System.out.println("Type 2 - Saving Account");
	System.out.println("Type 3 - Exit");
	System.out.println("Choice: ");
	selection= in.nextInt();
	switch(selection) {
	case 1: 
		getChecking();
		break;
	case 2: 
		getSaving();
		break;
	case 3:
		System.out.println("Thank you for using atm");
		break;
	default :
		System.out.println("InValid input");
		getAccountType();
		break;
	}
}


private void getChecking() {
	// TODO Auto-generated method stub
	System.out.println("Select the option");
	System.out.println("Type 1 - View Balance");
	System.out.println("Type 2 - withdrwal fund");
	System.out.println("Type 3- Deposite fund");
	System.out.println("Type 4- Exit");
	System.out.println("Choice: ");
	selection= in.nextInt();
	switch(selection) {
	case 1: 
		System.out.println("Checking Account BAlance = "+
//	moneyFormat.format(
				(getCheckingBalance()
//						)
						));
		getAccountType();
		break;
	case 2: 
		getCheckingWithdrawalInput();
		getAccountType();
		break;
	case 3:
		getCheckingDepositeInput();
		getAccountType();
		break;
	case 4:
		System.out.println("Thank you for using atm");
		break;
	default :
		System.out.println("InValid input");
		getChecking();
		break;
	}
}


private void getSaving() {
	// TODO Auto-generated method stub
	System.out.println("Select the option");
	System.out.println("Type 1 - View Balance");
	System.out.println("Type 2 - withdrwal fund");
	System.out.println("Type 2 - Deposite fund");
	System.out.println("Type 3 - Exit");
	System.out.println("Choice: ");
	selection= in.nextInt();
	switch(selection) {
	case 1: 
		System.out.println("Checking Account BAlance = "+
//	moneyFormat.format(
				(getSavingBalance()
//						)
				));
		getAccountType();
		break;
	case 2: 
		getSavingWithdrawalInput();
		getAccountType();
		break;
	case 3:
		getSavingDepositeInput();
		getAccountType();
		break;
	case 4:
		System.out.println("Thank you for using atm");
		break;
	default :
		System.out.println("InValid input");
		getChecking();
		break;
	}
	
}
}
