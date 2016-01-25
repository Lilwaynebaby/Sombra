package jv.webshop.servlets;

import jv.webshop.store.UserStorage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Владимир on 21.01.2016.
 */
public class UserDeleteServlet extends HttpServlet {

    private final UserStorage USER_STORAGE = new UserStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       USER_STORAGE.delete(Integer.valueOf(req.getParameter("id")));
        resp.sendRedirect(String.format("%s%s", req.getContextPath(),"/edit"));
    }
}
