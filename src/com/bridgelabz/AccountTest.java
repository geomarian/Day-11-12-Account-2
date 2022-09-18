/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author ASUS
 *
 *
 */
public class AccountTest extends Account {
	
	
int debit;
int debitMoney = 1000;
int ACCOUNT_BALANCE = 5000;
int debitCash = 6000;

	public void debitMoney() {
		
		
	debit = ACCOUNT_BALANCE - debitMoney;
	System.out.println("The available balance is : " + debit);
	}
	
	public void debitWholeCash() {
		debitCash = ACCOUNT_BALANCE - debitMoney;
		
	if(ACCOUNT_BALANCE >= debitCash) {
		System.out.println("―Debit amount exceeded account balance.");
	}
	else {
		System.out.println("Amount is withdrawn" + debitCash);
	}
		
		
		
		
	}
	
	
}

