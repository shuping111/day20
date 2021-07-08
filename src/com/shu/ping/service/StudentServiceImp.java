package com.shu.ping.service;

import com.shu.ping.Dao.StudentDao;
import com.shu.ping.Dao.StudentDaoImp;
import com.shu.ping.javaBean.Student;

import java.util.List;

public class StudentServiceImp implements StudentService{
    @Override
    public List<Student> getStudentByName(String name) {
        StudentDao sd = new StudentDaoImp();
        return sd.getStudentByName(name);
    }
}
