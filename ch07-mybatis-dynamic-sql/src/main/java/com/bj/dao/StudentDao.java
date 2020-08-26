package com.bj.dao;

import com.bj.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    public Student selectStudentByID(Integer id);
    public List<Student> seletAllStudent();

    public List<Student> selectStuentByIf(Student stu);
    public List<Student> selectStuentByWhere(Student stu);

}
