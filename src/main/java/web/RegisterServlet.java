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

    public RegisterServlet() throws SQLException, ClassNotFoundException {
    }

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

        //emp.setId(generateId());

        DBUser.update(user);
        try {
            ResultSet rs=DBUser.get(userName,password);
            while (!rs.isLast())
            {
                rs.next();
                String uname=rs.getString("userName");
                request.setAttribute("userName",uname);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("HomePage.jsp").forward(request,response);

    }
    public int generateId(){
        long a=System.currentTimeMillis()*(new Random()).nextInt();
        String asString=" "+a;
        String as5String=asString.substring((asString.length()-5),(asString.length()));
        return Integer.parseInt(as5String);
    }
}
