package dao;

import bean.TotalIncome;

import java.sql.*;


public class TotalIncomeDao {
    public static final String UPDATE = "INSERT INTO user"+
            "(id,description) VALUES"+
            "(?,?);";
    public static final String GET = "SELECT * FROM user "+
            "WHERE id=?;";
    public static final String GET_ALL = "SELECT * FROM user;";
    public static final String DELETE = "DELETE from user "+
            "WHERE id=?;";
    public static Connection connection;

    public TotalIncomeDao() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","root","Test12@");
    }

    public static int update(TotalIncome totalIncome) {
        int result=0;
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(UPDATE);

            preparedStatement.setInt(1, totalIncome.getId());
            preparedStatement.setString(2,totalIncome.getDescription());
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

    public static int delete(Integer id){
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
