package com.cg.client;
import com.cg.application.MMcurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.application.MMBankfactory;
import com.cg.framework.SavingAcc;
import com.cg.framework.CurrentAcc;
import com.cg.framework.Bankfactory;

public class client {
		public static void main(String[] args) {
			Bankfactory b1 = new MMBankfactory();
			SavingAcc b3=new MMSavingAcc(8847512,"Goutham raju",1250,true);
			b3.withdraw(b3.getAccBal());
			b3.toString();
			
			CurrentAcc b2=new MMcurrentAcc(79217824,"roopesh",5000,2000);
			b2.withdraw(b2.getCriditLimit());
			b2.toString();
		}

}
