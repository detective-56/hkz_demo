package com.hkz.hkz_demo.servletimp;

import com.hkz.hkz_demo.dao.Ani_infoDao;
import com.hkz.hkz_demo.domain.Ani_info;
import com.hkz.hkz_demo.servlet.Ani_infoServlet;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Ani_infoServletimp implements Ani_infoServlet {
    private Ani_infoDao ani_infoDao;
    private SqlSessionFactory sqlSessionFactory;

    public Ani_infoServletimp(){
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
        this.ani_infoDao = sqlSession.getMapper(Ani_infoDao.class);
    }

    public List<Ani_info> show_leftlist() {
        return ani_infoDao.getAni_infoList();
    }

    @Override
    public List<Ani_info> show_toplist() {
        List<Ani_info> ani_list = ani_infoDao.getAni_infoList();
        List<Ani_info> a_toplist = new ArrayList<Ani_info>();
        for (Ani_info ani : ani_list){
            if (ani.getPriority() != 0){
                a_toplist.add(ani);
            }
        }

        Collections.sort(a_toplist);
        return a_toplist;
    }

    @Override
    public List<Ani_info> getInfoByName(String name) {
        return ani_infoDao.getInfoByName(name);
    }

    @Override
    public Ani_info getSimpleInfoByName(String name) {
        return ani_infoDao.getSimpleInfoByName(name);
    }

    @Override
    public List<Ani_info> getNameByWeek(String week) {
        return  ani_infoDao.getNameByWeek(week);
    }


    @Test
    public void show(){
        List<Ani_info> list = ani_infoDao.getAni_infoList();
        for (Ani_info ani: list){
            System.out.println(ani);
        }
    }


}
