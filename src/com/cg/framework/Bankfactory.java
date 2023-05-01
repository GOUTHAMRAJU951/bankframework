package com.cg.framework;
	
public abstract  class Bankfactory{
	public abstract SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal,boolean isSalary);
	public abstract CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal,float criditLimit);


	}


