package com.bj;

import com.bj.dao.StudentDao;
import com.bj.domain.QureyParam;
import com.bj.domain.Student;
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
    public void testSellectStudentsParam(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        /*
         * 通过返回值判断到底调用StudentDao里面什么方法
         * */

        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> Stus = dao.selectStudentMutiParam(251,20);
        for(Student stu:Stus){
            System.out.println("角色="+stu);
        }
    }
    @Test
    public void testselectStudenQureyParam(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        /*
         * 通过返回值判断到底调用StudentDao里面什么方法
         * */

        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        QureyParam qp = new QureyParam();
        qp.setParamage(30);
        qp.setParamname("曹操");
        List<Student> Stus = dao.selectStudenQureyParam(qp);
        for(Student stu:Stus){
            System.out.println("角色="+stu);
        }
    }
    @Test
    public void testselectStudentByAddr(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        /*
         * 通过返回值判断到底调用StudentDao里面什么方法
         * */

        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> Stus = dao.selectStudentByAddr(554,20);
        for(Student stu:Stus){
            System.out.println("角色="+stu);
        }
    }
    @Test
    public void testselectStudentByMap(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        /*
         * 通过返回值判断到底调用StudentDao里面什么方法
         * */

        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Map<String,Object> map = new HashMap<>();
        map.put("myname","司马懿");
        map.put("myage",21);
        List<Student> Stus = dao.selectStudentByMap(map);
        for(Student stu:Stus){
            System.out.println("角色="+stu);
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
        //Integer stuNUM = dao.insertStudent(stu);
        sqlSession.commit();
        //System.out.println("执行结果" + "=" + stuNUM);
    }
}
