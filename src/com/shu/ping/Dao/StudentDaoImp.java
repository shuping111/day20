package com.shu.ping.Dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.shu.ping.javaBean.Student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class StudentDaoImp implements StudentDao{
    @Override
    public List<Student> getStudentByName(String name) {
        //初始化连接池
        ComboPooledDataSource ds = new ComboPooledDataSource();
        QueryRunner qr = new QueryRunner(ds);
        List<Student> list = null;
        String sql ="select * from student where name like '%"+ name +"%'";
        try {
            list = qr.query(sql,new BeanListHandler<>(Student.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
