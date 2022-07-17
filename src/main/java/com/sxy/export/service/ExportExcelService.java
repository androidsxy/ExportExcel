package com.sxy.export.service;

import java.util.List;

/**
 * @Author ShuXinYuan  舒新元
 * @Date 2022/07/16 --星期六  上午 10:49
 **/
public interface ExportExcelService<T>{
    List<T> getList();
}
