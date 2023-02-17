package com.gyh.internalcommon.entity;

import java.util.Date;

public class EvaluateDriver {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_evaluate_driver.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_evaluate_driver.grade
     *
     * @mbggenerated
     */
    private Integer grade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_evaluate_driver.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_evaluate_driver.order_id
     *
     * @mbggenerated
     */
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_evaluate_driver.passenger_id
     *
     * @mbggenerated
     */
    private Integer passengerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_evaluate_driver.driver_id
     *
     * @mbggenerated
     */
    private Integer driverId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_evaluate_driver.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_evaluate_driver.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_evaluate_driver.id
     *
     * @return the value of tbl_evaluate_driver.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_evaluate_driver.id
     *
     * @param id the value for tbl_evaluate_driver.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_evaluate_driver.grade
     *
     * @return the value of tbl_evaluate_driver.grade
     *
     * @mbggenerated
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_evaluate_driver.grade
     *
     * @param grade the value for tbl_evaluate_driver.grade
     *
     * @mbggenerated
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_evaluate_driver.content
     *
     * @return the value of tbl_evaluate_driver.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_evaluate_driver.content
     *
     * @param content the value for tbl_evaluate_driver.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_evaluate_driver.order_id
     *
     * @return the value of tbl_evaluate_driver.order_id
     *
     * @mbggenerated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_evaluate_driver.order_id
     *
     * @param orderId the value for tbl_evaluate_driver.order_id
     *
     * @mbggenerated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_evaluate_driver.passenger_id
     *
     * @return the value of tbl_evaluate_driver.passenger_id
     *
     * @mbggenerated
     */
    public Integer getPassengerId() {
        return passengerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_evaluate_driver.passenger_id
     *
     * @param passengerId the value for tbl_evaluate_driver.passenger_id
     *
     * @mbggenerated
     */
    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_evaluate_driver.driver_id
     *
     * @return the value of tbl_evaluate_driver.driver_id
     *
     * @mbggenerated
     */
    public Integer getDriverId() {
        return driverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_evaluate_driver.driver_id
     *
     * @param driverId the value for tbl_evaluate_driver.driver_id
     *
     * @mbggenerated
     */
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_evaluate_driver.create_time
     *
     * @return the value of tbl_evaluate_driver.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_evaluate_driver.create_time
     *
     * @param createTime the value for tbl_evaluate_driver.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_evaluate_driver.update_time
     *
     * @return the value of tbl_evaluate_driver.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_evaluate_driver.update_time
     *
     * @param updateTime the value for tbl_evaluate_driver.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}