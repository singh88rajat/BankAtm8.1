import java.util.Scanner;

public class BankAtmDemo {

	public static void main(String[] args) {
		BankAtm bobj= new BankAtm(10000);// initialize the balance
		//BankAtm bobj1= new BankAtm(9000); if balance is less than 10000 withdrawal is not allowed		
        int num;
       
		
		do {
	   
		Scanner sc=new Scanner(System.in); 
		System.out.println("------------------------");
        System.out.println("Select a Transaction by typing number");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.println("------------------------");
         num = sc.nextInt();
        //display options based on choice
        if(num==1){
        	System.out.println("Enter Deposit Amount:");  
   		   double depositamount=sc.nextInt();
   		   bobj.deposit(depositamount);
        	
        }
        else if (num == 2)
        {
        	System.out.println("Enter Withdrawal Amount:");  
  		   double withdrawamount=sc.nextInt();   
  	   try {
  		bobj.withdraw(withdrawamount);
  		//bobj1.withdraw(withdrawamount);
  	} 
  	   catch (BankAtmException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  		System.out.println(e.getMessage());
  	}	
        	
        }	
        
        else if (num == 3)
        {
        System.out.println("Your Balance is "+bobj.getBalance());	
        }
      
	}while (num!= 4);
		 System.out.println("------------------------");
		 System.out.println("Good Bye!");
		 System.out.println("------------------------");	
	}
}
