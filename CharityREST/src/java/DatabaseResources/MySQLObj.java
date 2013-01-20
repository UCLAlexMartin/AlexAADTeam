/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseResources;

/*import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;*/
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author localadmin
 */
public class MySQLObj {
    String dbUrl;
    java.sql.Connection conn;
    String dbUser;
    String dbPassword;
    public MySQLObj(String dbUser, String dbPassword, String dbUrl) {
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
        this.dbUrl = dbUrl;
    }
    
    public void Connect()
    {
        try {  
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(this.dbUrl,this.dbUser,this.dbPassword);
            
        } catch (Exception ex) {
            Logger.getLogger(MySQLObj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet Query(String statementTxt)
    {
        ResultSet res = null;
        Statement sta;
        try {
            sta = conn.createStatement();
            res = sta.executeQuery(statementTxt);
            return res;
        } catch (Exception ex) {
            Logger.getLogger(MySQLObj.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
    public static void main(String arg[]) 
    {
        MySQLObj mysql = new MySQLObj("root","","jdbc:mysql://localhost:3306/charity_db");
        mysql.Connect();
        ResultSet res = mysql.Query("select * from users");
        try {
            while(res.next())
            {
                int key =res.getInt(1);
                String val = res.getString(2);
                System.out.println("Key= " + key);
                System.out.println("Val= " + val);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQLObj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
