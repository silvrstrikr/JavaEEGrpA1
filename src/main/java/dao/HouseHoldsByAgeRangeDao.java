package dao;

import bean.HouseHoldEarners;
import bean.HouseHoldsByAgeRange;

import java.sql.*;

public class HouseHoldsByAgeRangeDao {
    public static final String UPDATE = "INSERT INTO householdsbyagerange"+
            "(id,description) VALUES"+
            "(?,?);";
    public static final String GET = "SELECT * FROM householdsbyagerange "+
            "WHERE id=?;";
    public static final String GET_ALL = "SELECT * FROM householdsbyagerange;";
    public static final String DELETE = "DELETE from householdsbyagerange "+
            "WHERE id=?;";
    public static Connection connection;

    public HouseHoldsByAgeRangeDao() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","admin","root");
    }

    public static int update(HouseHoldsByAgeRange houseHoldsByAgeRange) {
        int result=0;
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(UPDATE);

            preparedStatement.setInt(1, houseHoldsByAgeRange.getId());
            preparedStatement.setString(2,houseHoldsByAgeRange.getDescription());
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
