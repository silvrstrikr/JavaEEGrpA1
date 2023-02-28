package dao;

import bean.CensusYear;
import bean.GeographicArea;

import java.sql.*;

public class GeographyAreaDao {
    public static final String UPDATE = "INSERT INTO geographicarea"+
            "(geographicAreaID,code,level,name,alternativeCode) VALUES"+
            "(?,?,?,?,?);";
    public static final String GET = "SELECT * FROM geographicarea "+
            "WHERE geographicAreaID=?;";
    public static final String GET_ALL = "SELECT * FROM geographicarea;";
    public static final String DELETE = "DELETE from geographicarea "+
            "WHERE geographicAreaID=?;";
    public static Connection connection;

    public GeographyAreaDao() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","admin","root");
    }

    public static int update(GeographicArea geographicArea) {
        int result=0;
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(UPDATE);

            preparedStatement.setInt(1, geographicArea.getGeographicAreaID());
            preparedStatement.setString(2,geographicArea.getCode());
            preparedStatement.setString(3,geographicArea.getLevel());
            preparedStatement.setString(4,geographicArea.getName());
            preparedStatement.setString(5,geographicArea.getAlternativeCode());
            result=preparedStatement.executeUpdate();
        }
        catch (SQLException exception){
            exception.printStackTrace();
        }
        return result;
    }

    public static ResultSet get(Integer id) {

        ResultSet result=null;
        try
        {
            PreparedStatement preparedStatement=connection.prepareStatement(GET);
            preparedStatement.setInt(1,id);
            result=preparedStatement.executeQuery();
        }
        catch (SQLException exception){
            exception.printStackTrace();
        }
        return result;
    }

    public static ResultSet getAll() {

        ResultSet result=null;
        try
        {
            PreparedStatement preparedStatement=connection.prepareStatement(GET_ALL);
            result=preparedStatement.executeQuery();
        }
        catch (SQLException exception){
            exception.printStackTrace();
        }
        return result;
    }

    public static Integer delete(Integer id){
        int result=0;
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(DELETE);

            preparedStatement.setInt(1, id);
            result=preparedStatement.executeUpdate();
        }
        catch (SQLException exception){
            exception.printStackTrace();
        }
        return result;
    }
}
