package dao;

import bean.HouseHoldType;
import bean.User;

import java.sql.*;

public class UserDao {
    public static final String UPDATE = "INSERT INTO user"+
            "(id,userName,password) VALUES"+
            "(?,?,?);";
    public static final String GET = "SELECT * FROM user "+
            "WHERE id=?;";
    public static final String GET_BY_NAME_PASSWORD = "SELECT * FROM user "+
            "WHERE userName=? AND password=?;";
    public static final String GET_ALL = "SELECT * FROM user;";
    public static final String DELETE = "DELETE from user "+
            "WHERE id=?;";
    public static Connection connection;

    public UserDao() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","admin","root");
    }

    public static int update(User user) {
        int result=0;
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(UPDATE);

            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2,user.getUserName());
            preparedStatement.setString(3,user.getPassword());
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

    public static ResultSet get(String userName, String password) {

        ResultSet result=null;
        try
        {
            PreparedStatement preparedStatement=connection.prepareStatement(GET_BY_NAME_PASSWORD);
            preparedStatement.setString(1,userName);
            preparedStatement.setString(2,password);
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
