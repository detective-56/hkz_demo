package com.hkz.hkz_demo.dao;

import com.hkz.hkz_demo.domain.Ani_info;

import java.util.List;

public interface Ani_infoDao {

    public List<Ani_info> getAni_infoList();

    public List<Ani_info> getInfoByName(String name);

    public Ani_info getSimpleInfoByName(String name);

    public List<Ani_info> getNameByWeek(String week);
}
