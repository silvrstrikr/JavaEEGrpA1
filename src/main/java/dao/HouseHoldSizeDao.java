package dao;

import bean.HouseHoldSize;
import bean.HouseHoldsByAgeRange;

import java.sql.*;

public class HouseHoldSizeDao {
    public static final String UPDATE = "INSERT INTO householdsize"+
            "(id,description) VALUES"+
            "(?,?);";
    public static final String GET = "SELECT * FROM householdsize "+
            "WHERE id=?;";
    public static final String GET_ALL = "SELECT * FROM householdsize;";
    public static final String DELETE = "DELETE from householdsize "+
            "WHERE id=?;";
    public static Connection connection;

    public HouseHoldSizeDao() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","admin","root");
    }

    public static int update(HouseHoldSize houseHoldSize) {
        int result=0;
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(UPDATE);

            preparedStatement.setInt(1, houseHoldSize.getId());
            preparedStatement.setString(2,houseHoldSize.getDescription());
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
