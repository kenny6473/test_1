package com.bj;

import com.bj.dao.StudentDao;
import com.bj.dao.impl.StudentDaoImpl;
import com.bj.domain.Student;
import org.junit.Test;

import java.util.List;

public class TestMybatis {
    @Test
    public void testSellectStudents(){
        StudentDao dao = new StudentDaoImpl();
        List<Student> StudentList = dao.selectStudents();
        for(Student stu:StudentList){
            System.out.println(stu);
        }
    }
    @Test
    public void testInsertStudents(){
        StudentDao dao = new StudentDaoImpl();
        Student stu = new Student();
        stu.setAge(28);
        stu.setId(665);
        stu.setName("司马懿");
        stu.setEmail("simayi@qq.com");
        Integer stuNUM = dao.insertStudent(stu);
        System.out.println("执行结果" + "=" + stuNUM);
    }
}
