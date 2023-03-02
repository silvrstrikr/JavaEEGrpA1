package dao;

import java.sql.*;

public class GeographyAreaDao {

    public static final String GET = "SELECT * FROM geographicarea "+
                                        "WHERE geographicAreaID=?;";
    public static final String GET_ALL = "SELECT * FROM geographicarea ORDER BY level;";

    public static Connection connection;

    public ResultSet getArea(Integer id) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        ResultSet result=null;
        try
        {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","root","Test12@");
            PreparedStatement preparedStatement=connection.prepareStatement(GET);
            preparedStatement.setInt(1,id);
            result=preparedStatement.executeQuery();
        }
        catch (SQLException exception){
            exception.printStackTrace();
        }
        return result;
    }
    public ResultSet getAll() throws ClassNotFoundException {
        ResultSet result=null;
        Class.forName("com.mysql.jdbc.Driver");
        try
        {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","root","Test12@");
            PreparedStatement preparedStatement=connection.prepareStatement(GET_ALL);
            result=preparedStatement.executeQuery();
        }
        catch (SQLException exception){
            exception.printStackTrace();
        }
        return result;
    }
    /*public GeographicArea getAlla() {
        ResultSet result=null;
        try
        {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","root","Test12@");
            PreparedStatement preparedStatement=connection.prepareStatement(GET_ALL);
            result=preparedStatement.executeQuery();
        }
        catch (SQLException exception){
            exception.printStackTrace();
        }
        return result;
    }*/
}
