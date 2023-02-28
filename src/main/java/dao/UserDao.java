package dao;

import bean.User;

import java.sql.*;

public class UserDao {
    public int registerUser(User user) throws ClassNotFoundException{
        String INSERT_USERS = "INSERT INTO user"+
                "(userId,userName,password) VALUES"+
                "(?,?,?);";

        int result=0;
        Class.forName("com.mysql.jdbc.Driver");
        try
        {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","root","Test12@");
            PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USERS);

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
    public ResultSet getUser(String name, String pass) throws ClassNotFoundException
    {
        String GET_USER = "SELECT * FROM user "+
                "WHERE userName=? AND password=?;";
        ResultSet result=null;
        Class.forName("com.mysql.jdbc.Driver");
        try
        {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","root","Test12@");
            PreparedStatement preparedStatement=connection.prepareStatement(GET_USER);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,pass);
            result=preparedStatement.executeQuery();
        }
        catch (SQLException exception){
            exception.printStackTrace();
        }
        return result;
    }
}
