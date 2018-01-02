package __arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Bank {

	private List<Account> accounts = new ArrayList<>();
	public boolean add(Account ac){
		//Add a new Account ensuring that its account number is unique
		Boolean found = false;
		for(Account acct : accounts) {
		    if(acct != null && ac.getAccount_number().equals(acct.getAccount_number())) {
		        found = true;
		    }
		}
		return found ? false : accounts.add(ac);
	}
	public boolean exists(String acNum){
		//Check if the account exists given its account number (acNum)
		Boolean found = false;
		for(Account acct : accounts) {
		    if(acct != null && acct.getAccount_number().equals(acNum)) {
		        found = true;
		    }
		}
		return found;
	}
	public List<String> listByName(){
		//Return a list of account names
		List<String> list = new ArrayList<String>();
		  for (Account acct : accounts) {
			  if (acct != null){
				  list.add(acct.getAccount_name());
			  }
		  }
		  return list;
	}
	public Account getAccount(String acNum){
		//return the account whose account number is given(acNum)
		// must ensure that encapsulation is not broken
		Account find = null;
		for (Account acct : accounts) {
			if (acct.getAccount_number().equals(acNum)){
				find = acct;
			}
		}
		return find;
	}
	public void upDateBalances(List<Account> lst){ //assume all accounts exist
		//Given a list of accounts update the balances
	}
	public double totalBalance(){
		//Calculate the total balance of all accounts
		double totalAccountBalance = 0;
		for(Account acct: accounts){
			totalAccountBalance += acct.getAccount_balance();
		}
	    return totalAccountBalance;
	}
	public void display(){
		//display a list of accounts sorted by name
		Collections.sort(accounts);
	}


}
