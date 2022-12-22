// Auther : Gauri Chalak
//Program is Check totalBalance,Deposite the cash,Withdrawal the cash from bank


package com.question2;

public class Account_Main {

	public static void main(String[] args) {
		
				Account a=new Account();		
				a.deposite();			
				try
				{
					a.withdraw();		
				}
				catch(InSufficientBalancedException e)		
				{
					//throwing an exception because the balance of the account is not enough to cover the withdrawal.
					e.printStackTrace();
				} 
			}
		}
		

	//}


