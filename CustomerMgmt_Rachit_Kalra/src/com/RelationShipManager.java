package com;

public class RelationShipManager {
	private int ManagerID;
	private String ManagerName;
	private String Branch;
	public int getManagerID() {
		return ManagerID;
	}
	public void setManagerID(int managerID) {
		ManagerID = managerID;
	}
	public String getManagerName() {
		return ManagerName;
	}
	public void setManagerName(String managerName) {
		ManagerName = managerName;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public RelationShipManager(int managerID, String managerName, String branch) {
		super();
		ManagerID = managerID;
		ManagerName = managerName;
		Branch = branch;
	}
	public RelationShipManager(){
	super();
	}
	

}
