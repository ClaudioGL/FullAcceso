/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author claug
 */
public class DerbyDaoFactory extends DAOFactory{
    private static final String BDNAME = "db_fullacceso";
    private static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    private static final String BDURL = "jdbc:derby://localhost:1527/" + BDNAME;
    private static final String USER = "grupo";
    private static final String CLAVE = "123456";

    public static Connection createConnection(){

        Connection con = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(BDURL, USER, CLAVE);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DerbyDaoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }
    
}
