package com.sxy.export.service.impl;

import com.sxy.export.dto.UserDto;
import com.sxy.export.mapper.UserMapper;
import com.sxy.export.service.ExportExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ShuXinYuan  舒新元
 * @Date 2022/07/16 --星期六  上午 10:51
 **/
@Service("exportExcelServiceImpl")
public class ExportExcelServiceImpl implements ExportExcelService<UserDto> {


    @Autowired
    private UserMapper userMapper;


    @Override
    public List<UserDto> getList() {
        List<UserDto> list = userMapper.getList();
        return list;
    }
}
