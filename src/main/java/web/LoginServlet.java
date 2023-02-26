package web;

import dao.UserDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.ResultSet;

@WebServlet(name = "Login", value = "/login")
public class LoginServlet extends HttpServlet {
    private UserDao DBUser =new UserDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName=request.getParameter("username");
        String password=request.getParameter("password");
        try {
            ResultSet rs=DBUser.getUser(userName,password);
            if (!rs.isBeforeFirst() && rs.getRow()==0){
                request.getRequestDispatcher("Signup.jsp").forward(request,response);
            }
            else
            {
                while (!rs.isLast())
                {
                    rs.next();
                    String uname=rs.getString("userName");
                    request.setAttribute("userName",uname);
                }

                request.getRequestDispatcher("HomePage.jsp").forward(request,response);
            }
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }

    }
}
