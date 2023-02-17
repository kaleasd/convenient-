package com.gyh.internalcommon.entity;

import java.util.Date;

public class BaseInfoCompany {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_base_info_company.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_base_info_company.company_name
     *
     * @mbggenerated
     */
    private String companyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_base_info_company.identifier
     *
     * @mbggenerated
     */
    private String identifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_base_info_company.business_scope
     *
     * @mbggenerated
     */
    private String businessScope;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_base_info_company.contact_address
     *
     * @mbggenerated
     */
    private String contactAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_base_info_company.economic_type
     *
     * @mbggenerated
     */
    private String economicType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_base_info_company.reg_capital
     *
     * @mbggenerated
     */
    private String regCapital;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_base_info_company.legal_name
     *
     * @mbggenerated
     */
    private String legalName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_base_info_company.legal_id
     *
     * @mbggenerated
     */
    private String legalId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_base_info_company.legal_phone
     *
     * @mbggenerated
     */
    private String legalPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_base_info_company.legal_photo
     *
     * @mbggenerated
     */
    private String legalPhoto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_base_info_company.state
     *
     * @mbggenerated
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_base_info_company.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_base_info_company.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company.id
     *
     * @return the value of tbl_base_info_company.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company.id
     *
     * @param id the value for tbl_base_info_company.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company.company_name
     *
     * @return the value of tbl_base_info_company.company_name
     *
     * @mbggenerated
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company.company_name
     *
     * @param companyName the value for tbl_base_info_company.company_name
     *
     * @mbggenerated
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company.identifier
     *
     * @return the value of tbl_base_info_company.identifier
     *
     * @mbggenerated
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company.identifier
     *
     * @param identifier the value for tbl_base_info_company.identifier
     *
     * @mbggenerated
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company.business_scope
     *
     * @return the value of tbl_base_info_company.business_scope
     *
     * @mbggenerated
     */
    public String getBusinessScope() {
        return businessScope;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company.business_scope
     *
     * @param businessScope the value for tbl_base_info_company.business_scope
     *
     * @mbggenerated
     */
    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope == null ? null : businessScope.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company.contact_address
     *
     * @return the value of tbl_base_info_company.contact_address
     *
     * @mbggenerated
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company.contact_address
     *
     * @param contactAddress the value for tbl_base_info_company.contact_address
     *
     * @mbggenerated
     */
    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company.economic_type
     *
     * @return the value of tbl_base_info_company.economic_type
     *
     * @mbggenerated
     */
    public String getEconomicType() {
        return economicType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company.economic_type
     *
     * @param economicType the value for tbl_base_info_company.economic_type
     *
     * @mbggenerated
     */
    public void setEconomicType(String economicType) {
        this.economicType = economicType == null ? null : economicType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company.reg_capital
     *
     * @return the value of tbl_base_info_company.reg_capital
     *
     * @mbggenerated
     */
    public String getRegCapital() {
        return regCapital;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company.reg_capital
     *
     * @param regCapital the value for tbl_base_info_company.reg_capital
     *
     * @mbggenerated
     */
    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital == null ? null : regCapital.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company.legal_name
     *
     * @return the value of tbl_base_info_company.legal_name
     *
     * @mbggenerated
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company.legal_name
     *
     * @param legalName the value for tbl_base_info_company.legal_name
     *
     * @mbggenerated
     */
    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company.legal_id
     *
     * @return the value of tbl_base_info_company.legal_id
     *
     * @mbggenerated
     */
    public String getLegalId() {
        return legalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company.legal_id
     *
     * @param legalId the value for tbl_base_info_company.legal_id
     *
     * @mbggenerated
     */
    public void setLegalId(String legalId) {
        this.legalId = legalId == null ? null : legalId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company.legal_phone
     *
     * @return the value of tbl_base_info_company.legal_phone
     *
     * @mbggenerated
     */
    public String getLegalPhone() {
        return legalPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company.legal_phone
     *
     * @param legalPhone the value for tbl_base_info_company.legal_phone
     *
     * @mbggenerated
     */
    public void setLegalPhone(String legalPhone) {
        this.legalPhone = legalPhone == null ? null : legalPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company.legal_photo
     *
     * @return the value of tbl_base_info_company.legal_photo
     *
     * @mbggenerated
     */
    public String getLegalPhoto() {
        return legalPhoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company.legal_photo
     *
     * @param legalPhoto the value for tbl_base_info_company.legal_photo
     *
     * @mbggenerated
     */
    public void setLegalPhoto(String legalPhoto) {
        this.legalPhoto = legalPhoto == null ? null : legalPhoto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company.state
     *
     * @return the value of tbl_base_info_company.state
     *
     * @mbggenerated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company.state
     *
     * @param state the value for tbl_base_info_company.state
     *
     * @mbggenerated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company.create_time
     *
     * @return the value of tbl_base_info_company.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company.create_time
     *
     * @param createTime the value for tbl_base_info_company.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company.update_time
     *
     * @return the value of tbl_base_info_company.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company.update_time
     *
     * @param updateTime the value for tbl_base_info_company.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}