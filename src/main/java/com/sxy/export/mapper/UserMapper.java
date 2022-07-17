package com.sxy.export.mapper;

import com.sxy.export.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author ShuXinYuan  舒新元
 * @Date 2022/07/17 --星期日  上午 10:43
 **/

@Mapper
public interface UserMapper {
    List<UserDto> getList();
}
