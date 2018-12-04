package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforSuite(){
        System.out.println("befor suite运行了");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("after suite运行了");
    }

    @BeforeTest
    public void test(){
        System.out.println("BeforeTest");

    }

    @AfterTest
    public void afterClass(){
        System.out.println("AfterTest");
    }
}
