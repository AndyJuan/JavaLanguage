

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException {
       try{
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("数据库连接成功");
           Connection c = DriverManager
                   .getConnection(
                           "jdbc:mysql://127.0.0.1:3306/howTEST?characterEncoding=UTF-8",
                           "root", "admin123");

           System.out.println("连接成功，获取连接对象： " + c);

       } catch (ClassNotFoundException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       } catch (SQLException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }

    }

}
