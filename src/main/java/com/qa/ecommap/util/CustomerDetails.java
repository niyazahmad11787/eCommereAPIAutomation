// customerDetails.java
package com.qa.ecommap.util;
import java.sql.*;

public class CustomerDetails {

    public Customer getCustomerDetails() throws Exception {
        String jdbcURL = "jdbc:postgresql://ecomm-backend.chfh7l48r6z1.ap-south-1.rds.amazonaws.com:5432/hippoecomm";
        String username = "niyaz_read";
        String password = "Test01";

        ResultSet resultSet = null;
        Connection connection = null;
        Statement statement = null;
        String phone = null;
        String email = null;
        String firstName = null;

        try {
            // Establish a connection
            connection = DriverManager.getConnection(jdbcURL, username, password);
            statement = connection.createStatement();

            String query = "select c.phone, c.email, c.first_name from customer c where c.phone ='9869869866'";
            resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                phone = resultSet.getString("phone");
                email = resultSet.getString("email");
                firstName = resultSet.getString("first_name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return new Customer(phone, email, firstName);
    }

//    public static void main(String[] args) {
//        try {
//            CustomerDetails details = new CustomerDetails();
//            Customer customer = details.getCustomerDetails();
//            System.out.println("Customer Phone: " + customer.getPhone());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
