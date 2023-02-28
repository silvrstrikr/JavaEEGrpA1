package dao;

import bean.AgeGroup;
import bean.CensusYear;

import java.sql.*;

public class CensusYearDao {
    public static final String UPDATE = "INSERT INTO censusyear"+
            "(censusYearID,censusYear) VALUES"+
            "(?,?);";
    public static final String GET = "SELECT * FROM censusyear "+
            "WHERE censusYearID=?;";
    public static final String GET_ALL = "SELECT * FROM censusyear;";
    public static final String DELETE = "DELETE from censusyear "+
            "WHERE censusYearID=?;";
    public static Connection connection;

    public CensusYearDao() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","admin","root");
    }

    public static int update(CensusYear censusYear) {
        int result=0;
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(UPDATE);

            preparedStatement.setInt(1, censusYear.getCensusYearID());
            preparedStatement.setInt(2,censusYear.getCensusYear());
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
