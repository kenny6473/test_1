package com.bj;

import com.bj.dao.StudentDao;
import com.bj.domain.QureyParam;
import com.bj.domain.Student;
import com.bj.domain.ViewStudent;
import com.bj.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMybatis {
    @Test
    public void testSellectStudents(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        /*
        * 通过返回值判断到底调用StudentDao里面什么方法
        * */

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Student stus = dao.selectStudentByID(665);
            System.out.println("学生=" + stus);
    }
    @Test
    public void testselectViewStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        /*
         * 通过返回值判断到底调用StudentDao里面什么方法
         * */

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<ViewStudent> stus = dao.selectViewStudent(251,30);
        for(ViewStudent stu:stus){
            System.out.println("学生=" + stu);
        }

    }
    @Test
    public void testselectViewStudent1(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        /*
         * 通过返回值判断到底调用StudentDao里面什么方法
         * */

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<ViewStudent> stus = dao.selectViewStudent1(251,30);
        for(ViewStudent stu:stus){
            System.out.println("学生=" + stu);
        }

    }
    @Test
    public void testselectStudentLike(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        /*
         * 通过返回值判断到底调用StudentDao里面什么方法
         * */

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> stus = dao.selectStudentLike("%李%");
        for(Student stu:stus){
            System.out.println("学生=" + stu);
        }

    }
    @Test
    public void testselectStudentLike2(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        /*
         * 通过返回值判断到底调用StudentDao里面什么方法
         * */

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> stus = dao.selectStudentLike2("李");
        for(Student stu:stus){
            System.out.println("学生=" + stu);
        }

    }
}
