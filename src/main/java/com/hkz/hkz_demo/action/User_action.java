package com.hkz.hkz_demo.action;

import com.hkz.hkz_demo.domain.User;
import com.hkz.hkz_demo.servlet.UserServlet;
import com.hkz.hkz_demo.servletimp.UserServletimp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Login")
public class User_action extends HttpServlet {
    private UserServlet userServlet= new UserServletimp();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = new String(req.getParameter("Username").getBytes("iso-8859-1"), "utf-8");
        String password = new String(req.getParameter("Password").getBytes("iso-8859-1"), "utf-8");

        User user = userServlet.getUserByName(username);

        if (user != null){
            if (user.getPassword().equals(password)) {
                resp.sendRedirect("Find_info");
            }
        }

        else resp.sendRedirect("login.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
