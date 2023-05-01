package com.cg.framework;

abstract public class SavingAcc extends BankAcc {
	private boolean issalaried;
	private float MINBAL=500;
	
	
	public SavingAcc(int accno, String accNm, float accBal, boolean issalaried, float mINBAL) {
		super(accno, accNm, accBal);
		this.issalaried = issalaried;
		
		
		
	}
	public void withdraw(float accBal)
	{
		System.out.println("account balance is: +accBal");
	}
	@Override
	public String toString() {
		return "SavingAcc [issalaried=" + issalaried + ", MINBAL=" + MINBAL + ", getAccno()=" + getAccno()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	

}
