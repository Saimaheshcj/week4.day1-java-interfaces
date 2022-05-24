package week4.day1;

public class Bank implements PNB,CIBIL {
	

	public void cibilScore() {
		// TODO Auto-generated method stub
          System.out.println("The cibil score in  U R account");		
	}

	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("The maximum loan amount in u r account");
	}

	public void creditScore() {
		// TODO Auto-generated method stub
		System.out.println("The creditscore in u r account");
	}

	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("the minimumbalance in u r account");
	}

	public  void amount() {
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bac =new Bank();
		bac.cibilScore();
		bac.creditScore();
		bac.minimumBalance();
		
		CIBIL cl=new Bank();
		cl.cibilScore();
		
		PNB nb =new Bank();
	nb.creditscore();
	nb.maximumLoanAmount();
	nb.minimumBalance();
		
}

	public void creditscore() {
		// TODO Auto-generated method stub
		
	}

	
		
	}

