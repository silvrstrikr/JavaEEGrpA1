package dao;
import bean.Age;
import bean.TotalIncome;

import java.sql.*;

public class AgeDao {

    public static final String GET = "SELECT  g.name, g.code, g.level,sum(h.combined) as total FROM  geographicarea g INNER JOIN age h  ON h.geographicArea = g.geographicAreaID where g.geographicAreaID=? AND h.censusyear=? group by geographicarea;";
    public static final String GETPOPULATIONBYGENDER = "SELECT  g.name, g.code, g.level,sum(h.male) as maletotal, sum(h.female) as femaletotal FROM  geographicarea g INNER JOIN age h  ON h.geographicArea = g.geographicAreaID WHERE h.censusyear=?  group by h.geographicArea order by g.name;";

    public static Connection connection;




    public ResultSet getAreaPopulation(Integer id,Integer year) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        ResultSet result=null;
        try
        {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","root","Test12@");
            PreparedStatement preparedStatement=connection.prepareStatement(GET);
            preparedStatement.setInt(1,id);
            preparedStatement.setInt(2,year);
            result=preparedStatement.executeQuery();
        }
        catch (SQLException exception){
            exception.printStackTrace();
        }
        return result;
    }
    public ResultSet getTotalPopulation(Integer censusYear) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        ResultSet result=null;
        try
        {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","root","Test12@");
            PreparedStatement preparedStatement=connection.prepareStatement(GETPOPULATIONBYGENDER);
            preparedStatement.setInt(1,censusYear);
            result=preparedStatement.executeQuery();
        }
        catch (SQLException exception){
            exception.printStackTrace();
        }
        return result;
    }
}
