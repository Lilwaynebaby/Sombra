package jv.webshop.servlets;

import jv.webshop.store.UserStorage;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Владимир on 19.01.2016.
 */
public class UserViewServlet extends HttpServlet {

    private final UserStorage USER_STORAGE = new UserStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("users" , this.USER_STORAGE.values());
        RequestDispatcher dispatcher = req.getRequestDispatcher("views/user/UserView.jsp");
        dispatcher.forward(req, resp);
    }
}
