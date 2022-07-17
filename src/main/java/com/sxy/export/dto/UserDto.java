package com.sxy.export.dto;

import com.sxy.export.annotation.ParmAnnotation;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author ShuXinYuan  舒新元
 * @Date 2022/07/16 --星期六  上午 09:32
 **/
@Data
@Accessors(chain = true)
public class UserDto {
    @ParmAnnotation(name="姓名")
    private String name;
    @ParmAnnotation(name = "手机号")
    private String phone;
    @ParmAnnotation(name ="年龄")
    private String age;
}
