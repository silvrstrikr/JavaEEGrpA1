package dao;

import bean.GeographicArea;
import bean.HouseHold;

import java.sql.*;

public class HouseHoldDao {
    public static final String UPDATE = "INSERT INTO household"+
            "(id,geographicArea,householdType,householdSize,householdsByAgeRange,householdEarners,totalIncome) VALUES"+
            "(?,?,?,?,?,?,?);";
    public static final String GET = "SELECT * FROM household "+
            "WHERE id=?;";
    public static final String GET_ALL = "SELECT * FROM household;";
    public static final String DELETE = "DELETE from household "+
            "WHERE id=?;";
    public static Connection connection;

    public HouseHoldDao() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","admin","root");
    }

    public static int update(HouseHold houseHold) {
        int result=0;
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(UPDATE);

            preparedStatement.setInt(1, houseHold.getId());
            preparedStatement.setInt(2,houseHold.getGeographicArea());
            preparedStatement.setInt(3,houseHold.getHouseholdType());
            preparedStatement.setInt(4,houseHold.getHouseholdSize());
            preparedStatement.setInt(5,houseHold.getHouseholdsByAgeRange());
            preparedStatement.setInt(6,houseHold.getHouseholdEarners());
            preparedStatement.setInt(7,houseHold.getTotalIncome());
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
