package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端租的测试方法11111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端租的测试方法22222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端租的测试方法33333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端租的测试方法44444");
    }

    @BeforeGroups("server")
    public void  beforGroupOnerver(){
        System.out.println("这是服务端组运行之前的方法");
    }

    @AfterGroups("server")
    public void afterGroupOnSever(){
        System.out.println("这是服务端组运行之后的方法!!!!");
    }


}
