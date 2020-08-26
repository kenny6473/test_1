package com.bj.dao.impl;

import com.bj.dao.StudentDao;
import com.bj.domain.Student;
import com.bj.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> selectStudents() {
        //获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String Sqlid= "com.bj.dao.StudentDao.selectStudents";
        List<Student> students = sqlSession.selectList(Sqlid);
        sqlSession.close();
        return students;
    }

    @Override
    public Integer insertStudent(Student stu) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String Sqlid= "com.bj.dao.StudentDao.insertStudent";
        Integer stuNun = sqlSession.insert(Sqlid,stu);
        sqlSession.commit();
        sqlSession.commit();
        return stuNun;
    }

}
