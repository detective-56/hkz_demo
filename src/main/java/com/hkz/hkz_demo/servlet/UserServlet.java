package com.hkz.hkz_demo.servlet;

import com.hkz.hkz_demo.domain.User;

public interface UserServlet {
    public User getUserByName(String username);
}
