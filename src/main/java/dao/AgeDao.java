package dao;
import bean.Age;
import bean.TotalIncome;

import java.sql.*;

public class AgeDao {
    public static final String UPDATE = "INSERT INTO age"+
            "(ageId,ageGroup, censusYear, geographicArea, combined, male, female) VALUES"+
            "(?,?,?,?,?,?,?);";
    public static final String GET = "SELECT * FROM age "+
            "WHERE ageId=?;";
    public static final String GET_ALL = "SELECT * FROM age;";
    public static final String DELETE = "DELETE from age "+
            "WHERE ageId=?;";
    public static Connection connection;

    public AgeDao() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/census","admin","root");
    }

    public static int update(Age age) {
        int result=0;
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(UPDATE);

            preparedStatement.setInt(1, age.getAgeID());
            preparedStatement.setInt(2,age.getAgeGroup());
            preparedStatement.setInt(3,age.getCensusYear());
            preparedStatement.setInt(4,age.getGeographicArea());
            preparedStatement.setInt(5,age.getCombined());
            preparedStatement.setInt(6,age.getMale());
            preparedStatement.setInt(7,age.getFemale());
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
