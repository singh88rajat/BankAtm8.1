
public class BankAtm extends Thread{

	double atmId;
	String bankName;
	String location;
    double balance;
   

public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

public BankAtm(double balance) {
		//super();
		this.balance = balance;
		//System.out.println("Current Balance in Account is "+this.balance);
	}

public void withdraw(double amt) throws BankAtmException
{
double temp=amt;
if(this.balance<10000)
{
throw new BankAtmException();	
}
else if(amt>this.balance)
{
System.out.println("Withdraw amount is greater than balance. Try again!");	
}

else{
	this.balance=this.balance-temp;
	//double temp= this.balance;
	//this.balance= temp-amt;
	System.out.println("Available Balance in ATM After Withdrawal is : "+this.balance);	
}

}
public void deposit(double amt){
	
	double temp=amt;
	this.balance=this.balance+temp;
	System.out.println("Available Balance in ATM After Depost is : "+this.balance);	
}

}
