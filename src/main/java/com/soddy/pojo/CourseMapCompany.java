package com.soddy.pojo;

import java.util.Date;

/**
 * 课程和班级（连队）映射关系
 * Created by soddygosongguochao on 2017/5/15.
 */
public class CourseMapCompany {

    private String id;
    private String courseId;//课程id
    private String companyId;//单位id，班级或者连队

    private Integer weekDay;//星期，1：周一，2：周二 等等
    private Date date;//对应具体的某一天时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Integer getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(Integer weekDay) {
        this.weekDay = weekDay;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
