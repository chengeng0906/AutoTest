package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass2 {


    public void stu1(){
        System.out.println(" GroupOnClass22中的stu111运行");
    }

    public void stu2(){
        System.out.println(" GroupOnClass22中的stu2222运行");
    }
}
