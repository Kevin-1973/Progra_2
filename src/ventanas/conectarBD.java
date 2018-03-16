/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author wzamora
 */
public class conectarBD {
    Connection conectar =null;
    public Connection conexion() throws SQLException, ClassNotFoundException{
      
            try {
                //Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://pma.yyekk.info:3306/phpMyAdmin-4.7.1-all-languages/programacion","progra", "progra");
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, "Error "+ex);
            }
            return conectar;
        }
            
    }

