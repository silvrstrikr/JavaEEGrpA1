package dao;

import bean.Age;
import bean.AgeGroup;

import java.sql.*;

public class AgeGroupDao {
    public static final String UPDATE = "INSERT INTO agegroup"+
            "(ageGroupID,description) VALUES"+
            "(?,?);";
    public static final String GET = "SELECT * FROM agegroup "+
            "WHERE ageGroupID=?;";
    public static final String GET_ALL = "SELECT * FROM agegroup;";
    public static final String DELETE = "DELETE from agegroup "+
            "WHERE ageGroupID=?;";
    public static Connection connection;

    public AgeGroupDao() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","admin","root");
    }

    public static int update(AgeGroup ageGroup) {
        int result=0;
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(UPDATE);

            preparedStatement.setInt(1, ageGroup.getAgeGroupID());
            preparedStatement.setString(2,ageGroup.getDescription());
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
