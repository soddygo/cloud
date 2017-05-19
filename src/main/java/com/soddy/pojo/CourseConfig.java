package com.soddy.pojo;

import java.util.Date;

/**
 * 课程配置信息
 * Created by soddygosongguochao on 2017/5/15.
 */
public class CourseConfig {


    private String id;
    private Integer courseTotal = 12;//实验课数量
    private Integer courseTermNum = 6;//一个班一学期上6个实验课
    private Integer maxCourseOfDay= 12;//一天最多上实验课上限
    private Integer minCourseOfDay= 10;//一天最少上实验课上限


    private Date startDate;//实验课开始课程时间
    private Date endDate;//实验课结束课程时间

     private Date startDate2;//下学期实验课开始课程时间
    private Date endDate2;//实验课结束课程时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCourseTotal() {
        return courseTotal;
    }

    public void setCourseTotal(Integer courseTotal) {
        this.courseTotal = courseTotal;
    }

    public Integer getCourseTermNum() {
        return courseTermNum;
    }

    public void setCourseTermNum(Integer courseTermNum) {
        this.courseTermNum = courseTermNum;
    }

    public Integer getMaxCourseOfDay() {
        return maxCourseOfDay;
    }

    public void setMaxCourseOfDay(Integer maxCourseOfDay) {
        this.maxCourseOfDay = maxCourseOfDay;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate2() {
        return startDate2;
    }

    public void setStartDate2(Date startDate2) {
        this.startDate2 = startDate2;
    }

    public Date getEndDate2() {
        return endDate2;
    }

    public void setEndDate2(Date endDate2) {
        this.endDate2 = endDate2;
    }

    public Integer getMinCourseOfDay() {
        return minCourseOfDay;
    }

    public void setMinCourseOfDay(Integer minCourseOfDay) {
        this.minCourseOfDay = minCourseOfDay;
    }
}
