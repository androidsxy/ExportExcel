package com.sxy.export;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @Author ShuXinYuan  舒新元
 * @Date 2022/09/18 --星期日  下午 10:45
 **/

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class Test01 {

    private String name;
    private String age;
    @Test
    public void test01(){

        String userName = name;
        System.out.println(name);
    }

}
