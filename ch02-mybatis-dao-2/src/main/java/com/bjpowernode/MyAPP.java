package com.bjpowernode;

import com.bjpowernode.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyAPP {

        public static void main(String[] args) throws IOException {
        String config = "mybatis.xml";
        //--------------------获取SqlSession对象用来执行sql语句------------------------------------
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        //----------------------------------------------------------
        //对应StudentDao.xml的sql语句的唯一标识
        String sqlid = "com.bjpowernode.dao.StudentDao.selectStudents";
        //执行选定sql语句
        List<Student> studentList = sqlSession.selectList(sqlid);
        //打印出studentList对象的信息
        studentList.forEach(stu -> System.out.println(stu));
        //关闭资源
        sqlSession.close();
    }
}
