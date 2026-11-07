package database;

import java.sql.*;

public abstract class Connectivity {
    private static final String username = "qadir";
    private static final String password = "Asaad@Ahmed@786";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/LifeLink";

    Connectivity(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }


    public static Connection getConnection(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url, username, password);
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return conn;
    }

    public static void closeConnection(Connection conn){
        if(conn != null){
            try{
                conn.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
