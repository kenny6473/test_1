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

        Student stus = dao.selectStudentByID(665);
            System.out.println("学生=" + stus);
    }
    @Test
    public void testseletAllStudent(){
        /*
        * 通过工具类获取Sqlseeion对象
        * */
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        /*
         * 通过返回值判断到底调用StudentDao里面什么方法
         * */
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> stus = dao.seletAllStudent();
        for(Student stu:stus){
            System.out.println("学生=" + stu);
        }

    }
    @Test
    public void testselectStuentByIf(){
        /*
         * 通过工具类获取Sqlseeion对象
         * */
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        /*
         * 通过返回值判断到底调用StudentDao里面什么方法
         * */
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Student stu1 = new Student();
        stu1.setName("");
        stu1.setAge(0);
        List<Student> stus = dao.selectStuentByIf(stu1);
        for(Student stu:stus){
            System.out.println("学生=" + stu);
        }
    }

    @Test
    public void testselectStuentByWhere(){
        /*
         * 通过工具类获取Sqlseeion对象
         * */
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        /*
         * 通过返回值判断到底调用StudentDao里面什么方法
         * */
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Student stu1 = new Student();
        stu1.setName("曹操");
        stu1.setAge(0);
        List<Student> stus = dao.selectStuentByWhere(stu1);
        for(Student stu:stus){
            System.out.println("学生=" + stu);
        }
    }
}
