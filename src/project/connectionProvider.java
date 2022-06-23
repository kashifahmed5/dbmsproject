/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;

/**
 *
 * @author kashi
 */
public class connectionProvider {
    public static Connection getconn(){
        try
        {
//                Class.forName("com.mysql.jdbc.Driver");
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection com =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","1122");
                return com;
        }
         catch(Exception e){
                 System.out.println("e");
                 return null;
                 }
             
    }
    
}
