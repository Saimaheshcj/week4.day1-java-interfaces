package week4.day1;

public  class Bank1 extends SBI {

	@Override
	public void ItLoan() {
		// TODO Auto-generated method stub
	System.out.println("the It Loan ");
	}
	
	public void bankbalance() {
		System.out.println("the bank balance in account");
	}
	public void  maximumLoanAmount() {
		System.out.println("the maximum LoanAmount in account");
	}
	public static void main(String[] args) {
		Bank1 bb=new Bank1();
		bb.bankbalance();
		bb.maximumLoanAmount();
		bb.ItLoan();
		
		
		SBI bb1 =new Bank1();
		bb1.bankbalance();
		bb1.ItLoan();
		bb1.maximumLoanAmount();
	}

	
	
		
	}

 