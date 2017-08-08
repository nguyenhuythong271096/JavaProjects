/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogics;

import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hv
 */
public class CSDL {
     public static Connection Layketnoi(){
        Connection ketnoi = null;
        try {
            String url = "jdbc:mysql://localhost:3306/phuong_perfume?useUnicode=true&characterEncoding=UTF-8";
            Class.forName("com.mysql.jdbc.Driver");
            ketnoi = DriverManager.getConnection(url,"root","");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ketnoi;
        
        
    }
}
