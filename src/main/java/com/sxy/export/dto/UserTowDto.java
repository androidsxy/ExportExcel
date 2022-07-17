package com.sxy.export.dto;

import com.sxy.export.annotation.ParmAnnotation;
import lombok.Data;

/**
 * @Author ShuXinYuan  舒新元
 * @Date 2022/07/17 --星期日  上午 10:20
 **/

@Data
public class UserTowDto {
    @ParmAnnotation(name = "代理人名称")
    private String agentName;
    @ParmAnnotation(name="代理人编码")
    private String agentCode;
}
