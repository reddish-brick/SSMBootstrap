package com.tmh.dao;

import com.tmh.model.PagingVO;
import com.tmh.model.TeacherCustom;

import java.util.List;

/**
 * Created by Jacey on 2017/6/29.
 */
public interface TeacherMapperCustom {

    //分页查询老师信息
    List<TeacherCustom> findByPaging(PagingVO pagingVO) throws Exception;

    //获取
}
