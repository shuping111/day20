package com.shu.ping.service;

import com.shu.ping.javaBean.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudentByName(String name);
}
