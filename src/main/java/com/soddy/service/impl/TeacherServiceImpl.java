package com.soddy.service.impl;

import com.soddy.pojo.Company;
import com.soddy.pojo.Course;
import com.soddy.pojo.CourseConfig;
import com.soddy.pojo.CourseMapCompany;
import com.soddy.service.TeacherService;
import com.soddy.util.BaseDateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 教师排课
 * Created by soddygosongguochao on 2017/5/15.
 */
public class TeacherServiceImpl implements TeacherService {


    @Override
    public void handleTeacherTime(List<Company> companies,  CourseConfig courseConfig) throws ParseException {

        List<Date> dateList = new ArrayList<>();//日期列表
        Integer totalDay = 0;


        //实验课种类数量
        List<Course> courseList = new ArrayList<>();
        for(int i =0,j=courseConfig.getCourseTotal();i<j;i++){
            Course course = new Course();
            course.setId(UUID.randomUUID().toString());
            course.setName("实验名称"+i);
            courseList.add(course);
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        //上半学期
        //1.计算日期和天数
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(courseConfig.getStartDate());//上半学期开始时间

        while (calendar.getTime().compareTo(courseConfig.getEndDate()) <= 0) {
            //todo
            //剔除周六，星期天
            Integer weekNum = BaseDateUtils.getWeekNum(calendar.getTime());
            if (weekNum == 7 || weekNum == 1) {
                continue;
            }
            totalDay++;//增加天数
            dateList.add(sdf.parse(sdf.format(calendar.getTime())));

            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        //2.当天上课的天数
        int max=courseConfig.getMaxCourseOfDay();
        int min=courseConfig.getMinCourseOfDay();
        Random random = new Random();
        int a = random.nextInt(courseConfig.getMaxCourseOfDay());

        //todo
        //枚举，班级和12种实验课进行枚举，然后随机抽取出来，选择天数上实验课。分上学期和下学期各6门实验课
        List<CourseMapCompany> result = new ArrayList<>();
        for (int i = 0; i < companies.size(); i++) {
            for (int m = 0; m < courseList.size(); m++) {
                //todo

            }
        }

    }
}
