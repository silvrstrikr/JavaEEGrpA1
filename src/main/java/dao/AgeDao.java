package dao;
import bean.Age;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AgeDao {
    public int registerAge (Age emp) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO age" +
                "(id, ageGroup, censusYear, geographicArea, combined, male, female) VALUES " +
                "(?, ?, ?, ?, ?, ?, ?);";
        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");
        // Get Connection
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "MyTr0ubl3M@ker");
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1,1);
            preparedStatement.setString(2, emp.getAgeGroup());
            preparedStatement.setString(3, emp.getCensusYear());
            preparedStatement.setString(4, emp.getGeographicArea());
            preparedStatement.setString(5, emp.getCombined());
            preparedStatement.setString(6, emp.getMale());
            preparedStatement.setString(7, emp.getFemale());

            result = preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return result;
    }
}
