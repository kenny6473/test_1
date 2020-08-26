package com.bj.dao;

import com.bj.domain.QureyParam;
import com.bj.domain.Student;
import com.sun.org.apache.xpath.internal.objects.XObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    public Student selectStudentByID(Integer id);
    //传递多个参数：在形参前加入@Param("*")，*与Mapper中的sql语句#{}的内容适应

    public List<Student> selectStudentMutiParam(@Param("myid") Integer id,
                                                @Param("myage") Integer age);//直接传多个参
    public List<Student> selectStudenQureyParam(QureyParam QP);//使用对象传参

    public List<Student> selectStudentByAddr(Integer id,Integer age);//按位置传参

    public List<Student> selectStudentByMap(Map<String,Object> map);//map方式传参，但是不建议使用

}
