package com.bj;

import com.bj.dao.StudentDao;
import com.bj.domain.Student;
import com.bj.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMybatis {
    @Test
    public void testSellectStudents(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        /*
        * 通过返回值判断到底调用StudentDao里面什么方法
        * */

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> stus = dao.selectStudents();
        for(Student stu:stus){
            System.out.println("学生=" + stu);
        }
    }
    @Test
    public void testInsertStudents(){
        //StudentDao dao = new StudentDaoImpl();
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student stu = new Student();
        stu.setAge(27);
        stu.setId(765);
        stu.setName("曹操");
        stu.setEmail("caocao@qq.com");
        Integer stuNUM = dao.insertStudent(stu);
        sqlSession.commit();
        System.out.println("执行结果" + "=" + stuNUM);
    }
}
