package com.shu.ping.Dao;

import com.shu.ping.javaBean.Student;


import java.util.List;

public interface StudentDao {
    List<Student> getStudentByName(String name);
}
