package com.test1;

public class BaseTransferObject {
	private Integer workflowCode;
	private String workflowType;
	private String refId;
	private String screenId;
	private Integer crId;
	private Integer crTypeCode;
	private Integer userId;
	private String keyAtttr;
	private String crDesc;
	private String ketAttrValue;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public BaseTransferObject() {

	}

	public BaseTransferObject(Integer workflowCode, String workflowType, String refId, String screenId, Integer crId,
			Integer crTypeCode, Integer userId, String keyAtttr, String crDesc, String ketAttrValue,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.workflowCode = workflowCode;
		this.workflowType = workflowType;
		this.refId = refId;
		this.screenId = screenId;
		this.crId = crId;
		this.crTypeCode = crTypeCode;
		this.userId = userId;
		this.keyAtttr = keyAtttr;
		this.crDesc = crDesc;
		this.ketAttrValue = ketAttrValue;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getWorkflowCode() {
		return workflowCode;
	}

	public void setWorkflowCode(Integer workflowCode) {
		this.workflowCode = workflowCode;
	}

	public String getWorkflowType() {
		return workflowType;
	}

	public void setWorkflowType(String workflowType) {
		this.workflowType = workflowType;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	public Integer getCrId() {
		return crId;
	}

	public void setCrId(Integer crId) {
		this.crId = crId;
	}

	public Integer getCrTypeCode() {
		return crTypeCode;
	}

	public void setCrTypeCode(Integer crTypeCode) {
		this.crTypeCode = crTypeCode;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getKeyAtttr() {
		return keyAtttr;
	}

	public void setKeyAtttr(String keyAtttr) {
		this.keyAtttr = keyAtttr;
	}

	public String getCrDesc() {
		return crDesc;
	}

	public void setCrDesc(String crDesc) {
		this.crDesc = crDesc;
	}

	public String getKetAttrValue() {
		return ketAttrValue;
	}

	public void setKetAttrValue(String ketAttrValue) {
		this.ketAttrValue = ketAttrValue;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
