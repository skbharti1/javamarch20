package com.capgemini.bank.bean;

import java.math.BigDecimal;

public class Wallet {
private BigDecimal balance;

public Wallet(BigDecimal amount) {
	this.balance=amount;
}

public Wallet() 
{
	
}

public BigDecimal getBalance() {
	return balance;
}

public void setBalance(BigDecimal balance) {
	this.balance = balance;
}

@Override
	public String toString() {
	return "\n\tBalance = "+balance;
}

}
