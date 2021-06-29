package library.management.system;


import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{
// 1           registering driver:
            Class.forName("com.mysql.jdbc.Driver"); 
//2            create connection:
            c =DriverManager.getConnection("jdbc:mysql:///online_library","root","root");    
// 3          create statement:
            s =c.createStatement();  
// 4           excute query with the help of statement
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
