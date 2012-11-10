/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeimpact.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eko
 */
public class JDBCUtils {

    private static JDBCUtils singleton;
    private Connection connection;
    private String username = "username";
    private String password = "password";
    private String url = "jdbc:postgresql://localhost:5432/belajarjasper";

    private JDBCUtils() {
    }

    private void establishConnection() {
        Properties properties = new Properties();
        properties.put("user", this.username);
        properties.put("password", this.password);
        try {
            connection = DriverManager.getConnection(url, properties);
        } catch (SQLException ex) {
            Logger.getLogger(JDBCUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static synchronized JDBCUtils getInstance() {
        if (null == singleton) {
            singleton = new JDBCUtils();
            singleton.establishConnection();
        }

        return singleton;
    }

    public Connection getConnection() {
        return connection;
    }
}
