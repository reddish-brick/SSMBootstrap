package com.tmh.dao;

import com.tmh.model.Student;
import com.tmh.model.StudentExample;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 *
 *
 */
public class StudentMapperTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
    }


    @Test
    public void selectByExample() throws Exception {
        StudentMapper studentMapper = (StudentMapper) applicationContext.getBean("studentMapper");

        //自定义条件查询对象
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();

        //自定义查询条件
        criteria.andUsernameLike("%小%");
        List<Student> list = studentMapper.selectByExample(studentExample);

        System.out.println();

    }

}