package com.gyh.internalcommon.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DriverWorkTime {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_driver_work_time.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_driver_work_time.driver_id
     *
     * @mbggenerated
     */
    private Integer driverId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_driver_work_time.work_start
     *
     * @mbggenerated
     */
    private Date workStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_driver_work_time.work_end
     *
     * @mbggenerated
     */
    private Date workEnd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_driver_work_time.work_duration
     *
     * @mbggenerated
     */
    private BigDecimal workDuration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_driver_work_time.work_day
     *
     * @mbggenerated
     */
    private Date workDay;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_driver_work_time.id
     *
     * @return the value of tbl_driver_work_time.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_driver_work_time.id
     *
     * @param id the value for tbl_driver_work_time.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_driver_work_time.driver_id
     *
     * @return the value of tbl_driver_work_time.driver_id
     *
     * @mbggenerated
     */
    public Integer getDriverId() {
        return driverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_driver_work_time.driver_id
     *
     * @param driverId the value for tbl_driver_work_time.driver_id
     *
     * @mbggenerated
     */
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_driver_work_time.work_start
     *
     * @return the value of tbl_driver_work_time.work_start
     *
     * @mbggenerated
     */
    public Date getWorkStart() {
        return workStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_driver_work_time.work_start
     *
     * @param workStart the value for tbl_driver_work_time.work_start
     *
     * @mbggenerated
     */
    public void setWorkStart(Date workStart) {
        this.workStart = workStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_driver_work_time.work_end
     *
     * @return the value of tbl_driver_work_time.work_end
     *
     * @mbggenerated
     */
    public Date getWorkEnd() {
        return workEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_driver_work_time.work_end
     *
     * @param workEnd the value for tbl_driver_work_time.work_end
     *
     * @mbggenerated
     */
    public void setWorkEnd(Date workEnd) {
        this.workEnd = workEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_driver_work_time.work_duration
     *
     * @return the value of tbl_driver_work_time.work_duration
     *
     * @mbggenerated
     */
    public BigDecimal getWorkDuration() {
        return workDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_driver_work_time.work_duration
     *
     * @param workDuration the value for tbl_driver_work_time.work_duration
     *
     * @mbggenerated
     */
    public void setWorkDuration(BigDecimal workDuration) {
        this.workDuration = workDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_driver_work_time.work_day
     *
     * @return the value of tbl_driver_work_time.work_day
     *
     * @mbggenerated
     */
    public Date getWorkDay() {
        return workDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_driver_work_time.work_day
     *
     * @param workDay the value for tbl_driver_work_time.work_day
     *
     * @mbggenerated
     */
    public void setWorkDay(Date workDay) {
        this.workDay = workDay;
    }
}