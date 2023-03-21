package com.hkz.hkz_demo.test;

import com.hkz.hkz_demo.dao.Ani_infoDao;
import com.hkz.hkz_demo.domain.Ani_info;
import com.hkz.hkz_demo.servletimp.Ani_infoServletimp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestAni_info {
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
    public void getAni_infoList() {
        // 创建 SqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 用 Sqlsession 对象执行查询
        Ani_infoDao ani_infoDao = sqlSession.getMapper(Ani_infoDao.class);
        List<Ani_info> ani_info_list =ani_infoDao.getAni_infoList();
        List<Ani_info> a_toplist = new ArrayList<Ani_info>();
        for (Ani_info ani : ani_info_list){
            if (ani.getPriority() != 0){
                a_toplist.add(ani);
            }
        }

        Collections.sort(a_toplist);
        for (Ani_info idx: a_toplist){
            System.out.println(idx);
        }
    }

    @Test
    public void getInfoByName(){
        // 创建 SqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 用 Sqlsession 对象执行查询
        Ani_infoDao ani_infoDao = sqlSession.getMapper(Ani_infoDao.class);
        List<Ani_info> ani_info = ani_infoDao.getInfoByName("进击的巨人");
        for (Ani_info ani_info1: ani_info){
            System.out.println(ani_info1);
        }
    }

    @Test
    public void getSimpleInfoByName(){
        // 创建 SqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 用 Sqlsession 对象执行查询
        Ani_infoDao ani_infoDao = sqlSession.getMapper(Ani_infoDao.class);
        Ani_info ani = ani_infoDao.getSimpleInfoByName("海贼王");
        System.out.println(ani);
    }


}
