package dao;

import bean.HouseHold;
import bean.HouseHoldEarners;

import java.sql.*;

public class HouseHoldEarnersDao {
    public static final String UPDATE = "INSERT INTO householdearners"+
            "(id,description) VALUES"+
            "(?,?);";
    public static final String GET = "SELECT * FROM householdearners "+
            "WHERE id=?;";
    public static final String GET_ALL = "SELECT * FROM householdearners;";
    public static final String DELETE = "DELETE from householdearners "+
            "WHERE id=?;";
    public static Connection connection;

    public HouseHoldEarnersDao() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","admin","root");
    }

    public static int update(HouseHoldEarners houseHoldEarners) {
        int result=0;
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(UPDATE);

            preparedStatement.setInt(1, houseHoldEarners.getId());
            preparedStatement.setString(2,houseHoldEarners.getDescription());
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
