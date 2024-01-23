package com.test1;

public class GlobalBankStructure {
	private Integer recordKey;
	private Integer bankCountryCode;
	private String bankCountryCodePosition;
	private String bankCountryCodeLength;
	private String bankCheckDigitsPosition;
	private String bankCheckDigitsLength;
	private boolean bankIdentifierPostion;
	private String bankIdentifierLength;
	private String branchIdentifierPosition;
	private String branchIdentifierLength;
	private String bankNationalIdLength;
	private String acccountNumberPosition;
	private String accountNumberLength;
	private String bankTotalLength;

	public GlobalBankStructure() {

	}

	public GlobalBankStructure(Integer recordKey, Integer bankCountryCode, String bankCountryCodePosition,
			String bankCountryCodeLength, String bankCheckDigitsPosition, String bankCheckDigitsLength,
			boolean bankIdentifierPostion, String bankIdentifierLength, String branchIdentifierPosition,
			String branchIdentifierLength, String bankNationalIdLength, String acccountNumberPosition,
			String accountNumberLength, String bankTotalLength) {
		super();
		this.recordKey = recordKey;
		this.bankCountryCode = bankCountryCode;
		this.bankCountryCodePosition = bankCountryCodePosition;
		this.bankCountryCodeLength = bankCountryCodeLength;
		this.bankCheckDigitsPosition = bankCheckDigitsPosition;
		this.bankCheckDigitsLength = bankCheckDigitsLength;
		this.bankIdentifierPostion = bankIdentifierPostion;
		this.bankIdentifierLength = bankIdentifierLength;
		this.branchIdentifierPosition = branchIdentifierPosition;
		this.branchIdentifierLength = branchIdentifierLength;
		this.bankNationalIdLength = bankNationalIdLength;
		this.acccountNumberPosition = acccountNumberPosition;
		this.accountNumberLength = accountNumberLength;
		this.bankTotalLength = bankTotalLength;
	}

	public Integer getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(Integer recordKey) {
		this.recordKey = recordKey;
	}

	public Integer getBankCountryCode() {
		return bankCountryCode;
	}

	public void setBankCountryCode(Integer bankCountryCode) {
		this.bankCountryCode = bankCountryCode;
	}

	public String getBankCountryCodePosition() {
		return bankCountryCodePosition;
	}

	public void setBankCountryCodePosition(String bankCountryCodePosition) {
		this.bankCountryCodePosition = bankCountryCodePosition;
	}

	public String getBankCountryCodeLength() {
		return bankCountryCodeLength;
	}

	public void setBankCountryCodeLength(String bankCountryCodeLength) {
		this.bankCountryCodeLength = bankCountryCodeLength;
	}

	public String getBankCheckDigitsPosition() {
		return bankCheckDigitsPosition;
	}

	public void setBankCheckDigitsPosition(String bankCheckDigitsPosition) {
		this.bankCheckDigitsPosition = bankCheckDigitsPosition;
	}

	public String getBankCheckDigitsLength() {
		return bankCheckDigitsLength;
	}

	public void setBankCheckDigitsLength(String bankCheckDigitsLength) {
		this.bankCheckDigitsLength = bankCheckDigitsLength;
	}

	public boolean isBankIdentifierPostion() {
		return bankIdentifierPostion;
	}

	public void setBankIdentifierPostion(boolean bankIdentifierPostion) {
		this.bankIdentifierPostion = bankIdentifierPostion;
	}

	public String getBankIdentifierLength() {
		return bankIdentifierLength;
	}

	public void setBankIdentifierLength(String bankIdentifierLength) {
		this.bankIdentifierLength = bankIdentifierLength;
	}

	public String getBranchIdentifierPosition() {
		return branchIdentifierPosition;
	}

	public void setBranchIdentifierPosition(String branchIdentifierPosition) {
		this.branchIdentifierPosition = branchIdentifierPosition;
	}

	public String getBranchIdentifierLength() {
		return branchIdentifierLength;
	}

	public void setBranchIdentifierLength(String branchIdentifierLength) {
		this.branchIdentifierLength = branchIdentifierLength;
	}

	public String getBankNationalIdLength() {
		return bankNationalIdLength;
	}

	public void setBankNationalIdLength(String bankNationalIdLength) {
		this.bankNationalIdLength = bankNationalIdLength;
	}

	public String getAcccountNumberPosition() {
		return acccountNumberPosition;
	}

	public void setAcccountNumberPosition(String acccountNumberPosition) {
		this.acccountNumberPosition = acccountNumberPosition;
	}

	public String getAccountNumberLength() {
		return accountNumberLength;
	}

	public void setAccountNumberLength(String accountNumberLength) {
		this.accountNumberLength = accountNumberLength;
	}

	public String getBankTotalLength() {
		return bankTotalLength;
	}

	public void setBankTotalLength(String bankTotalLength) {
		this.bankTotalLength = bankTotalLength;
	}

}
