package com.hkz.hkz_demo.servletimp;

import com.hkz.hkz_demo.dao.Ani_infoDao;
import com.hkz.hkz_demo.dao.UserDao;
import com.hkz.hkz_demo.domain.User;
import com.hkz.hkz_demo.servlet.UserServlet;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class UserServletimp implements UserServlet {
    private UserDao userDao;
    private SqlSessionFactory sqlSessionFactory;

    public UserServletimp(){
        try {
            this.init();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void init() throws IOException {
        // 创建SqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 加载 mybatis.config.xml 文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 创建 SqlSessionFactory 对象
        this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        // 创建 SqlSession 对象
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        // 用 Sqlsession 对象执行查询
        this.userDao = sqlSession.getMapper(UserDao.class);
    }
    @Override
    public User getUserByName(String username) {
        return userDao.getUserByName(username);
    }
}
