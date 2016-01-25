package jv.webshop.servlets;

import jv.webshop.models.user.User;
import jv.webshop.store.UserStorage;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Владимир on 20.01.2016.
 */
public class UserEditServlet extends HttpServlet {

    final AtomicInteger ids = new AtomicInteger();
    private final UserStorage USER_STORAGE = new UserStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("user", this.USER_STORAGE.get(Integer.valueOf(req.getParameter("id"))));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/user/UserEdit.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.USER_STORAGE.edit(new User(this.ids.incrementAndGet(),req.getParameter("login"),req.getParameter("mail")));
        resp.sendRedirect(String.format("%s%s",req.getContextPath(), "/view"));
    }
}
