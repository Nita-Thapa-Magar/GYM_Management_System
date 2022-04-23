
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Connectivity {
    final static String JDBC_DRIVER="com.mysql.jdbc.Driver";
    final static String DB_URL="jdbc:mysql://localhost:3306/gym_management_system";
    final static String USER= "root";
    final static String PASS="";
    
     public static Connection openConnection()
    {
        try
        {
            Class.forName(JDBC_DRIVER);
            Connection conn= (Connection)DriverManager.getConnection(DB_URL, USER,PASS);
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
