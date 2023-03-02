package web;

import dao.AgeDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.ResultSet;

@WebServlet(name = "TotalPopulationServlet", value = "/Census")
public class TotalPopulationServlet extends HttpServlet {
    private AgeDao DBAge =new AgeDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            ResultSet rs=DBAge.getTotalPopulation(1);
            ResultSet rs1=DBAge.getTotalPopulation(2);
            request.setAttribute("resultSet1", rs);
            request.setAttribute("resultSet2", rs1);
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/Census.jsp");
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
