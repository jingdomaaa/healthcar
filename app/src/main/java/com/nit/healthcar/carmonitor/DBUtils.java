package com.nit.healthcar.carmonitor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import android.util.Log;
public class DBUtils {
    public static Connection getConnection(String s) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); //加载驱动
            Log.e("DBUtils","加载成功");
            String url = "jdbc:mysql://140.143.116.206:10013/" + s;
            conn = DriverManager.getConnection(url,"root","yyfyyf2019");
            Log.e("DBUtils","连接成功");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
    public static int getUserInfoByAccount(String account,String password) {
        Connection conn = getConnection("demo");
        try {
            Statement st = conn.createStatement();
            String sql;
            sql = "select * from users where idusers = '" + account + "' and userpsw = '" + password + "'";
            ResultSet ans = st.executeQuery(sql);
            Log.e("DBUtils",ans + "? ");
            if(ans == null) {
                Log.e("DBUtils","数据库语句失败");
                return 0;
            }
            else {
                Log.e("DBUtils","数据库语句成功");
                return 1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
