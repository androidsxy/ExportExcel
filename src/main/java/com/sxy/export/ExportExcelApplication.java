package com.sxy.export;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ShuXinYuan  舒新元
 * @Date 2022/07/16 --星期六  上午 09:01
 **/

@SpringBootApplication
public class ExportExcelApplication{
    public static void main(String[] args) {
     SpringApplication.run(ExportExcelApplication.class,args);
    }
}
