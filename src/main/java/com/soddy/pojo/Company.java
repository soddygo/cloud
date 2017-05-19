package com.soddy.pojo;

import java.util.Date;

/**
 * 班级或者是连队为单位
 * 2个连队是一个班级
 * Created by soddygosongguochao on 2017/5/15.
 */
public class Company {

    private String id;
    private String name;//连队名称
    private String className;//班级名称

    private boolean splitFlag;//班级拆分的标记


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public boolean isSplitFlag() {
        return splitFlag;
    }

    public void setSplitFlag(boolean splitFlag) {
        this.splitFlag = splitFlag;
    }
}
