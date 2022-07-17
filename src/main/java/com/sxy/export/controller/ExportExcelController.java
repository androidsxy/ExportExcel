package com.sxy.export.controller;

import com.sxy.export.annotation.ParmAnnotation;
import com.sxy.export.component.SpringContextUtil;
import com.sxy.export.dto.UserDto;
import com.sxy.export.service.ExportExcelService;
import com.sxy.export.uilt.ExportExcel;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ShuXinYuan  舒新元
 * @Date 2022/07/16 --星期六  上午 09:23
 **/
@RestController
@Slf4j
public class ExportExcelController {
    /**
     * 导出数据到excel表格
     * @param request
     * @param response
     */
    @RequestMapping("/export")
    @ResponseBody
    public void export(HttpServletRequest request, HttpServletResponse response, @RequestParam String serveName){
        try{
            ExportExcelService bean = SpringContextUtil.getBean(serveName);
            List userList = bean.getList();
            //创建excel表头
            //反射获取表头
            Object o = userList.get(0);
            Class<?> aClass = o.getClass();

            Field[] declaredFields = aClass.getDeclaredFields();
            List<String> column = new ArrayList<String>();
            for (Field declaredField : declaredFields) {
                //获取注解里的表头
                ParmAnnotation annotation = declaredField.getAnnotation(ParmAnnotation.class);
                column.add(annotation.name());
            }
            //表头对应的数据
            List<Map<String,Object>> data = new ArrayList<Map<String, Object>>();
            //遍历获取到的需要导出的数据，k要和表头一样
            for (int i = 0; i < userList.size(); i++) {
                Map<String,Object> dataMap = new HashMap<String,Object>();
                Object user = userList.get(i);
                Class<? extends Object> aClass1 = user.getClass();
                Field[] declaredFields1 = aClass1.getDeclaredFields();
                for (Field field : declaredFields1) {
                    //私有
                    field.setAccessible(true);
                    //获取表头和属性值
                    dataMap.put(field.getAnnotation(ParmAnnotation.class).name(),field.get(user).toString());
                }
                data.add(dataMap);
            }
            //调用导出工具类
            ExportExcel.exportExcel("工作人员表",column,data,request,response);
        }catch (Exception e){
            log.error("--------",e.getMessage(),e);
        }

    }

}
