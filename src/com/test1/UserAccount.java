package com.test1;

public class UserAccount {
	private Integer accountOwner;
	private String accountName;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private Integer locale;
	private String countryCode;
	private String isPrivileged;
	private String lastLogin;
	private Integer contactId;
	private Integer addressId;
	private String userGrp;
	private String requesttype;

	public UserAccount() {

	}

	public UserAccount(Integer accountOwner, String accountName, String firstName, String lastName, String emailAddress,
			Integer locale, String countryCode, String isPrivileged, String lastLogin, Integer contactId,
			Integer addressId, String userGrp, String requesttype) {
		super();
		this.accountOwner = accountOwner;
		this.accountName = accountName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.locale = locale;
		this.countryCode = countryCode;
		this.isPrivileged = isPrivileged;
		this.lastLogin = lastLogin;
		this.contactId = contactId;
		this.addressId = addressId;
		this.userGrp = userGrp;
		this.requesttype = requesttype;
	}

	public Integer getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(Integer accountOwner) {
		this.accountOwner = accountOwner;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Integer getLocale() {
		return locale;
	}

	public void setLocale(Integer locale) {
		this.locale = locale;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getIsPrivileged() {
		return isPrivileged;
	}

	public void setIsPrivileged(String isPrivileged) {
		this.isPrivileged = isPrivileged;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getUserGrp() {
		return userGrp;
	}

	public void setUserGrp(String userGrp) {
		this.userGrp = userGrp;
	}

	public String getRequesttype() {
		return requesttype;
	}

	public void setRequesttype(String requesttype) {
		this.requesttype = requesttype;
	}

}
