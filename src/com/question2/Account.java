// Auther : Gauri Chalak
//Program is Check totalBalance,Deposite the cash,Withdrawal the cash from bank


package com.question2;

import java.util.Scanner;

class InSufficientBalancedException extends Exception {
		  public InSufficientBalancedException(String message) 
		  {
		    super(message);
		  }
		}
public class Account { 
		 double balance=0;
		 double totalbalance=0;
		 double amount;
		 double totalbalance1;
			
		Scanner sc=new Scanner(System.in);
			
public void deposite()
		{
			System.out.println("enter the current balance of your account :");		
			balance=sc.nextFloat();
			System.out.println("enter the amount to deposite money :");
			amount=sc.nextFloat();	
			totalbalance=balance+amount;
			System.out.println("Total balance of your account is :"+totalbalance);		
		}
			
public void withdraw() throws InSufficientBalancedException 
		{
			float withdraw;
			System.out.println("enter the amount to be withdraw :");
			withdraw=sc.nextFloat();			
			if(totalbalance<withdraw)			
			{
				
				throw new InSufficientBalancedException("NO sufficient fund to withdraw!!!!!!!!!");
				}
				else 
				{
					System.out.println("please take money :)");
				}
				
				totalbalance1=totalbalance-withdraw;
				System.out.println("Total balance of your account after withdraw is :"+totalbalance1);
			}
		}

