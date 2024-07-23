package dao;
import java.sql.*;

public class ConnectionProvider{
    public static Connection getcon(){
     try{
         Class.forName("com.mysql.jdbc.Driver");
        // Connection con= DriverManager.getConnection(" jdbc:mysql://localhost:3306/cmss?useSSL=false","root","Nishupawar@123");
         //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe?userSSL=false","root","NishuPawar@123");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?userSSL=false","root","NishuPawar@123");
         
         return con;
     }   
     catch(Exception e){
         return null;
     }
    }

   
}
