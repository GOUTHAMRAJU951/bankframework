package com.cg.framework;

abstract public class BankAcc {
	private int accno;
	private String accNm;
	private float accBal;
	
	public BankAcc(int accno, String accNm, float accBal) {
		super();
		this.accno = accno;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	public void withdraw(float accBal)
	{
		System.out.println("Remaining account balance: +accBal");
	}
	public void deposite(float accBal) 
	{
		System.out.println("after the deposite the account balnce is : +accBal");
	}
	@Override
	public String toString() {
		return "BankAcc [accno=" + accno + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	
	

}
