package com;

public class Customer {
	
	private int CustID;
	private String CustName;
	private String AccountType;
	private String AccountNo;
	private int ManagerID;
	public int getCustID() {
		return CustID;
	}
	public void setCustID(int custID) {
		CustID = custID;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public String getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
	public int getManagerID() {
		return ManagerID;
	}
	public void setManagerID(int managerID) {
		ManagerID = managerID;
	}
	public Customer(int custID, String custName, String accountType,
			String accountNo, int managerID) {
		super();
		CustID = custID;
		CustName = custName;
		AccountType = accountType;
		AccountNo = accountNo;
		ManagerID = managerID;
	}
	public Customer(){
		super();
	}
	
}
