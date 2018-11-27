https://zhuanlan.zhihu.com/p/35245956

how to learn
p/34418394


目前学习任务
数据库先
JDBC


1> import the package (java.sql.*)
2> a. load driver 
   b. register   -->  Class.forName("com.mysql.jdbc.Driver")
3> establish the connection   -->  Connection
4> create the statement 
5> execute the query
6> process result
7> close connection

required jars : mysql connector jar  (in Maven Repository)



import java.sql.*;
public class MyClass {
    public static void main(String args[]) throws Exception{
        String url = "";
        String uname = "root" // username
        String pass = "";   // password 
        // java reflection, to load class
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);  // static method
        ============== use mysql to create a database first =================   
        mysql download
        mysqlworkbench
    }   
}
