package jv.webshop.servlets;

import jv.webshop.models.user.User;
import jv.webshop.store.UserCache;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Владимир on 19.01.2016.
 */
public class UserCreateServlet extends HttpServlet {
    final AtomicInteger ids = new AtomicInteger();

    private final UserCache USER_STORAGE = new UserCache();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
        this.USER_STORAGE.add(new User(this.ids.incrementAndGet(),req.getParameter("login"),req.getParameter("mail")));
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/index.html"));

    }

}

