package edu.kryait.servlets.servlets;

import edu.kryait.servlets.dao.JdbcUserDao;
import edu.kryait.servlets.dao.UserDao;
import edu.kryait.servlets.entities.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/users")
public class UsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        UserDao userDao = new JdbcUserDao();
        List<User> users = userDao.getAll();
        PrintWriter out = response.getWriter();
        users.stream().forEach(out::println);

        request.setAttribute("list", users);
        RequestDispatcher dispatcher = request.getRequestDispatcher("users.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void  doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new JdbcUserDao();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(username, password);
        userDao.insert(user);
        doGet(request, response);
    }
}
