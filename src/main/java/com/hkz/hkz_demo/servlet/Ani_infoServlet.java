package com.hkz.hkz_demo.servlet;

import com.hkz.hkz_demo.domain.Ani_info;

import java.util.List;

public interface Ani_infoServlet {
    public List<Ani_info> show_leftlist();

    public List<Ani_info> show_toplist();

    public List<Ani_info> getInfoByName(String name);

    public Ani_info getSimpleInfoByName(String name);

    public  List<Ani_info> getNameByWeek(String week);
}
