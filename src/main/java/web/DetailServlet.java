package web;

import dao.AgeDao;
import dao.GeographyAreaDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.ResultSet;

@WebServlet(name = "DetailServlet", value = "/Detail")
public class DetailServlet extends HttpServlet {
    private AgeDao DBAge =new AgeDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        try{
            ResultSet rs=DBAge.getAreaPopulation(Integer.parseInt(id),1);
            request.setAttribute("resultSet", rs);
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/Detail.jsp");
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
