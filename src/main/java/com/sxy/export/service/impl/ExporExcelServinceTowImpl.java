package com.sxy.export.service.impl;

import com.sxy.export.dto.UserDto;
import com.sxy.export.dto.UserTowDto;
import com.sxy.export.service.ExportExcelService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ShuXinYuan  舒新元
 * @Date 2022/07/17 --星期日  上午 10:20
 **/
@Service("exporExcelServinceTowImpl")
public class ExporExcelServinceTowImpl implements ExportExcelService<UserTowDto> {
    @Override
    public List<UserTowDto> getList() {
        List<UserTowDto> userList = new ArrayList<UserTowDto>();

        UserTowDto userDto = new UserTowDto();
        userDto.setAgentCode("81126");
        userDto.setAgentName("书信元");
        userList.add(userDto);
        return userList;
    }
}
