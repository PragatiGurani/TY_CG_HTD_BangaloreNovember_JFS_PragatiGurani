package com.capgemini.loosecoupling1;

public class BankMain
{
    public static void main(String[] args) 
    {
	  Bank b1=new Bank();
	  Sbi s=new Sbi();
	  Hdfc h=new Hdfc();
	  Atm a=new Atm();
	  a.amt(s);
    }
}
