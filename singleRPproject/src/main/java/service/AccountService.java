package service;

import respository.AccountRepo;

public class AccountService {
	private AccountRepo acrepo;
	public AccountService() {
		this.acrepo = new AccountRepo();
	}
	
	public  int getTotalEmpSalary() {
		return acrepo.getTotalSalary();		
	}
}
