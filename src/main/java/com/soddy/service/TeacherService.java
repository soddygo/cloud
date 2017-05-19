package com.soddy.service;

import com.soddy.pojo.Company;
import com.soddy.pojo.Course;
import com.soddy.pojo.CourseConfig;
import com.soddy.pojo.Teacher;

import java.text.ParseException;
import java.util.List;

/**
 * 教师排课
 * Created by soddygosongguochao on 2017/5/15.
 */
public interface TeacherService {


     void handleTeacherTime(List<Company> companies, CourseConfig courseConfig) throws ParseException;

}
