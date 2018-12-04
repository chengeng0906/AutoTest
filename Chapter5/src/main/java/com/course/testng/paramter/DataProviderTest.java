package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testData(String name, int age) {
        System.out.println("name=" + name + "  age=" + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"zhagsan", 10},
                {"lisi", 20},
                {"wanger", 30},

        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test1方法  name=" + name + " age=" + age);
    }


    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test1方法  name=" + name + " age=" + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"zhangsan", 30},
                    {"sili", 40},

            };

        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"王五",30},
                    {"sili", 40},
            };

        }

        return result;
    }
}
