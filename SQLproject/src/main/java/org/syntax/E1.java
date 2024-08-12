package org.syntax;

import java.sql.*;

public class E1 {
    public static void main(String[] args) {
        String dbURL="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String userName="syntax_hrm";
        String password="syntaxhrm123";

        try {
           // creates connection to database;
            Connection connection = DriverManager.getConnection(dbURL,userName,password);
           /*
           take the queries from java code execute them on the database and bring the results back
               into your java program.
            */

            Statement statement= connection.createStatement();
            String query= "select * from person";
            ResultSet resultSet= statement.executeQuery(query);
            while
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
