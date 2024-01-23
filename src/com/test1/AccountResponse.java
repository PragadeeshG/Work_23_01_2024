package com.test1;

public class AccountResponse {
	private Integer accountid;
	private String accountOwner;
	private boolean activeAccount;
	private Integer accountTypeId;
	private String accountType;
	private String accountStatus;
	private Integer accountDescription;
	private Integer userGroupsCount;
	private String userCountries;
	private Integer userCountriesCount;
	private String userGroups;
	private String status;
	private String remarks;

	public AccountResponse() {

	}

	public AccountResponse(Integer accountid, String accountOwner, boolean activeAccount, Integer accountTypeId,
			String accountType, String accountStatus, Integer accountDescription, Integer userGroupsCount,
			String userCountries, Integer userCountriesCount, String userGroups, String status, String remarks) {
		super();
		this.accountid = accountid;
		this.accountOwner = accountOwner;
		this.activeAccount = activeAccount;
		this.accountTypeId = accountTypeId;
		this.accountType = accountType;
		this.accountStatus = accountStatus;
		this.accountDescription = accountDescription;
		this.userGroupsCount = userGroupsCount;
		this.userCountries = userCountries;
		this.userCountriesCount = userCountriesCount;
		this.userGroups = userGroups;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getAccountid() {
		return accountid;
	}

	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public boolean isActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(boolean activeAccount) {
		this.activeAccount = activeAccount;
	}

	public Integer getAccountTypeId() {
		return accountTypeId;
	}

	public void setAccountTypeId(Integer accountTypeId) {
		this.accountTypeId = accountTypeId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Integer getAccountDescription() {
		return accountDescription;
	}

	public void setAccountDescription(Integer accountDescription) {
		this.accountDescription = accountDescription;
	}

	public Integer getUserGroupsCount() {
		return userGroupsCount;
	}

	public void setUserGroupsCount(Integer userGroupsCount) {
		this.userGroupsCount = userGroupsCount;
	}

	public String getUserCountries() {
		return userCountries;
	}

	public void setUserCountries(String userCountries) {
		this.userCountries = userCountries;
	}

	public Integer getUserCountriesCount() {
		return userCountriesCount;
	}

	public void setUserCountriesCount(Integer userCountriesCount) {
		this.userCountriesCount = userCountriesCount;
	}

	public String getUserGroups() {
		return userGroups;
	}

	public void setUserGroups(String userGroups) {
		this.userGroups = userGroups;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
