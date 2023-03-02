package web;

import dao.GeographyAreaDao;
import dao.UserDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

@WebServlet(name = "GeographicAreaServlet", value = "/GeographicArea")
public class GeographicAreaServlet extends HttpServlet {
    private GeographyAreaDao DBGeographicalArea =new GeographyAreaDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{
            ResultSet rs=DBGeographicalArea.getAll();
            request.setAttribute("resultSet", rs);
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/GeographicArea.jsp");
            requestDispatcher.forward(request,response);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
