package com.gyh.internalcommon.entity;

import java.util.Date;

public class CarLevel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_car_level.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_car_level.label
     *
     * @mbggenerated
     */
    private String label;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_car_level.icon
     *
     * @mbggenerated
     */
    private String icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_car_level.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_car_level.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_car_level.operator_id
     *
     * @mbggenerated
     */
    private Integer operatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_car_level.enable
     *
     * @mbggenerated
     */
    private Byte enable;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_car_level.id
     *
     * @return the value of tbl_car_level.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_car_level.id
     *
     * @param id the value for tbl_car_level.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_car_level.label
     *
     * @return the value of tbl_car_level.label
     *
     * @mbggenerated
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_car_level.label
     *
     * @param label the value for tbl_car_level.label
     *
     * @mbggenerated
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_car_level.icon
     *
     * @return the value of tbl_car_level.icon
     *
     * @mbggenerated
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_car_level.icon
     *
     * @param icon the value for tbl_car_level.icon
     *
     * @mbggenerated
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_car_level.create_time
     *
     * @return the value of tbl_car_level.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_car_level.create_time
     *
     * @param createTime the value for tbl_car_level.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_car_level.update_time
     *
     * @return the value of tbl_car_level.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_car_level.update_time
     *
     * @param updateTime the value for tbl_car_level.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_car_level.operator_id
     *
     * @return the value of tbl_car_level.operator_id
     *
     * @mbggenerated
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_car_level.operator_id
     *
     * @param operatorId the value for tbl_car_level.operator_id
     *
     * @mbggenerated
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_car_level.enable
     *
     * @return the value of tbl_car_level.enable
     *
     * @mbggenerated
     */
    public Byte getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_car_level.enable
     *
     * @param enable the value for tbl_car_level.enable
     *
     * @mbggenerated
     */
    public void setEnable(Byte enable) {
        this.enable = enable;
    }
}