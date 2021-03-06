package com.oa.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Leave {
    private final static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:00");
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave.id
     *
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    private Byte id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave.applicantId
     *
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    private Integer applicantid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave.startTime
     *
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    private Date starttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave.endTime
     *
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    private Date endtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave.reason
     *
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    private String reason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave.ApplicationStatus
     *
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    private String applicationstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave.ApproverId
     *
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    private Integer approverid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave.approveTime
     *
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    private Date approvetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave.id
     *
     * @return the value of leave.id
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    public Byte getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave.id
     *
     * @param id the value for leave.id
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    public void setId(Byte id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave.applicantId
     *
     * @return the value of leave.applicantId
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    public Integer getApplicantid() {
        return applicantid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave.applicantId
     *
     * @param applicantid the value for leave.applicantId
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    public void setApplicantid(Integer applicantid) {
        this.applicantid = applicantid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave.startTime
     *
     * @return the value of leave.startTime
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave.startTime
     *
     * @param starttime the value for leave.startTime
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public void setStarttime(String starttime) throws ParseException {
        this.starttime = format.parse(starttime);
    }
    public void setEndtime(String starttime) throws ParseException {
        this.endtime = format.parse(starttime);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave.endTime
     *
     * @return the value of leave.endTime
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave.endTime
     *
     * @param endtime the value for leave.endTime
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave.reason
     *
     * @return the value of leave.reason
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave.reason
     *
     * @param reason the value for leave.reason
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave.ApplicationStatus
     *
     * @return the value of leave.ApplicationStatus
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    public String getApplicationstatus() {
        return applicationstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave.ApplicationStatus
     *
     * @param applicationstatus the value for leave.ApplicationStatus
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    public void setApplicationstatus(String applicationstatus) {
        this.applicationstatus = applicationstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave.ApproverId
     *
     * @return the value of leave.ApproverId
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    public Integer getApproverid() {
        return approverid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave.ApproverId
     *
     * @param approverid the value for leave.ApproverId
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    public void setApproverid(Integer approverid) {
        this.approverid = approverid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave.approveTime
     *
     * @return the value of leave.approveTime
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    public Date getApprovetime() {
        return approvetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave.approveTime
     *
     * @param approvetime the value for leave.approveTime
     * @mbg.generated Wed Jun 07 09:28:24 CST 2017
     */
    public void setApprovetime(Date approvetime) {
        this.approvetime = approvetime;
    }
}