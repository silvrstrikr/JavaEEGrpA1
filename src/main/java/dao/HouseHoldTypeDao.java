package dao;

import bean.HouseHoldSize;
import bean.HouseHoldType;

import java.sql.*;

public class HouseHoldTypeDao {
    public static final String UPDATE = "INSERT INTO householdtype"+
            "(id,description) VALUES"+
            "(?,?);";
    public static final String GET = "SELECT * FROM householdtype "+
            "WHERE id=?;";
    public static final String GET_ALL = "SELECT * FROM householdtype;";
    public static final String DELETE = "DELETE from householdtype "+
            "WHERE id=?;";
    public static Connection connection;

    public HouseHoldTypeDao() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","admin","root");
    }

    public static int update(HouseHoldType houseHoldType) {
        int result=0;
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(UPDATE);

            preparedStatement.setInt(1, houseHoldType.getId());
            preparedStatement.setString(2,houseHoldType.getDescription());
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
