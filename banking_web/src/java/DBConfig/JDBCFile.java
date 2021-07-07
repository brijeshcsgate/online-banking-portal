package DBConfig;


import java.sql.*;



public class JDBCFile {
    private static final String DBDRIVER="com.mysql.jdbc.Driver";
    private static final String DBURL="jdbc:mysql://localhost:3306/banking_app";
    private static final String DBUSERNAME="root";
    private static final String DBPASSWORD="";
    private static Connection conn=null;
    private static Statement stmt=null;
    
    private static void openConnection()throws Exception{
        Class.forName(DBDRIVER);
        conn=DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
        stmt=conn.createStatement();
    }
    
    public static int executeUpdate(String sql)throws Exception{
        openConnection();
        System.out.println(sql);
        return stmt.executeUpdate(sql);
    }
    public static ResultSet executeQuery(String sql)throws Exception{
        openConnection();
        return stmt.executeQuery(sql);
    }
    public static void closeAll()throws Exception{
        stmt.close();
        conn.close();
    }
    
}
