package com.hkz.hkz_demo.test;

import com.hkz.hkz_demo.dao.Ani_infoDao;
import com.hkz.hkz_demo.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestUser {
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        // 创建SqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 加载 mybatis.config.xml 文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 创建 SqlSessionFactory 对象
        this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }

    @Test
    public void getUserByName(){
        // 创建 SqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 用 Sqlsession 对象执行查询
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        System.out.println(userDao.getUserByName("0 1"));
    }
}
