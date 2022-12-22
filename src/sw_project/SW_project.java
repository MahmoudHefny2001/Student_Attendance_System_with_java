/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sw_project;


import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mahmoud-hefny
 */
public class SW_project extends javax.swing.JFrame{

//    private final String url = "jdbc:postgresql://localhost/student_system";
//    private final String user = "postgres";
//    private final String password = "MA7MOUD7EFNY.";
    
    
//    public Connection connect() {
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection(url, user, password);
//            System.out.println("Connected to the PostgreSQL server successfully.");
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//        return connection;
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame = new Home();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocation(100, 100);
                
        
        SW_project app = new SW_project();
//        app.connect();
        
    }
     
}

