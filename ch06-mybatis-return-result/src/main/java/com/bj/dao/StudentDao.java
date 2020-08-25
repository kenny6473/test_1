package com.bj.dao;

import com.bj.domain.QureyParam;
import com.bj.domain.Student;
import com.bj.domain.ViewStudent;
import com.sun.org.apache.xpath.internal.objects.XObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    public Student selectStudentByID(Integer id);
    public List<ViewStudent> selectViewStudent(@Param("myid") Integer id,@Param("myage") Integer age);
    public List<ViewStudent> selectViewStudent1(@Param("myid") Integer id,@Param("myage") Integer age);
    public List<Student> selectStudentLike(String myname);//like模糊查询1
    public List<Student> selectStudentLike2(String myname);//like模糊查询2
}
