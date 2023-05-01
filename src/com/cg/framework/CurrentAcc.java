package com.cg.framework;

abstract public class CurrentAcc extends BankAcc{
	
	private float CreditLimit;

	public CurrentAcc(int accno, String accNm, float accBal, float creditLimit) {
		super(accno, accNm, accBal);
		this.CreditLimit = creditLimit;
	}
	public float getCriditLimit() {
		return CreditLimit;
	}
	public void withdraw(float creditLimit) 
	{
        System.out.println("cerditLimit is: +creditLimit");
    }
	@Override
	public String toString() {
		return "CurrentAcc [CreditLimit=" + CreditLimit + ", getCriditLimit()=" + getCriditLimit() + ", getAccno()="
				+ getAccno() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


}