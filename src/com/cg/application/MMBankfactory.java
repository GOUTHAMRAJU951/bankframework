package com.cg.application;

import com.cg.framework.Bankfactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class MMBankfactory extends Bankfactory{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		MMSavingAcc mmsaving=new MMSavingAcc(accNo, accNm, accBal, isSalary);
		return mmsaving ;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float criditLimit) {
		MMcurrentAcc mmcurrent=new MMcurrentAcc(accNo, accNm, accBal, criditLimit);
		return mmcurrent;
	}


	

}
