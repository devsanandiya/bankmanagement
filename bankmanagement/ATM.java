package bankmanagement;

import java.util.Scanner;

public class ATM {
Scanner sc = new Scanner(System.in);



    float balance;
    int Pin=234;
	
    public void checkpin() {
	System.out.println("enter your pin:");
	int pin=sc.nextInt();
	if(pin==Pin) {
		menu();
	}else {
		System.out.println("wrong pin");
	}
	
    }

   
        public void menu() {
		while(true) {
		System.out.println("1.checkbalance");
		System.out.println("2.deposite money");
		System.out.println("3.withrawlmoney");
		System.out.println("4.show your pin");
		System.out.println("enter your choice:");
		int choice=sc.nextInt();
		 
		switch(choice) {
		case 1:
			 checkbalance();
			break;
		case 2:
			depositmoney();
			break;
		case 3:
			 withrwalmoney();
			 break;
		case 4:
		   System.out.println(Pin);
		    break;
		}

}
        }   
  
	   
   public void withrwalmoney() {
	System.out.println("enter your amount");
	float amount=sc.nextFloat();
	if(amount>balance) {
		System.out.println("insufficient bank balance");
	}else {
		balance=balance - amount;
		System.out.println("money was succesfully withrwal");
	}
	
}

   public void depositmoney() {
	System.out.println("Enter your amount:");
	float amount=sc.nextFloat();
	balance=balance+amount;
	System.out.println("money successfully deposite");
	
}

   public void checkbalance() {
	   System.out.println("balance:"+balance);

	
   }
   

} 






	