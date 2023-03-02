package web;

import bean.User;
import dao.UserDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

@WebServlet(name = "RegisterServlet", value = "/signup")
public class RegisterServlet extends HttpServlet {
    private UserDao DBUser=new UserDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("Signup.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName=request.getParameter("username");
        String password=request.getParameter("password");

        User user=new User();
        user.setUserName(userName);
        user.setPassword(password);

        try {
            DBUser.registerUser(user);
        }
        catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        try {
            ResultSet rs=DBUser.getUser(userName,password);
            while (!rs.isLast())
            {
                rs.next();
                String uname=rs.getString("userName");
                request.setAttribute("userName",uname);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("HomePage.jsp").forward(request,response);
    }
}
