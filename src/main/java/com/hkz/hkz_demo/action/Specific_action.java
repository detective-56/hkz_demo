package com.hkz.hkz_demo.action;

import com.hkz.hkz_demo.servlet.Ani_infoServlet;
import com.hkz.hkz_demo.servletimp.Ani_infoServletimp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Specific")
public class Specific_action extends HttpServlet {
    Ani_infoServlet ani_infoServlet = new Ani_infoServletimp();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = new String(req.getParameter("name").getBytes("iso-8859-1"), "utf-8");
        String num = new String(req.getParameter("num").getBytes("iso-8859-1"), "utf-8");
        String prenum = new String(req.getParameter("prenum").getBytes("iso-8859-1"), "utf-8");
        System.out.println(name +' ' +num+' '+prenum);
        req.getSession().setAttribute("info_name", name);
        req.getSession().setAttribute("info_num", num);
        req.getSession().setAttribute("info_url", ani_infoServlet.getSimpleInfoByName(name).getUrl()+prenum+".mp4");
        System.out.println(ani_infoServlet.getSimpleInfoByName(name).getUrl()+prenum+".mp4");
        resp.sendRedirect("video.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
