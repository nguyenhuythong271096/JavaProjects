/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogics;

import JavaBeans.NguoiDung;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hv
 */
public class NguoiDungBL {
    public static NguoiDung DocTheoEmailPassword (String email ,String password){
        String sql = "select * from nguoidung where email='"+email+"' and password = '"+password+"' ";
        List <NguoiDung> dsnd = TaoDanhSach(sql);
        NguoiDung nd = null;
        if (dsnd.size()>0){
            nd= dsnd.get(0);// return dsnd o vi tri dau tien la vi tri duy nhat tim duoc
        }
        return nd ;
    }
    
    private static List<NguoiDung> TaoDanhSach (String sql){
        List<NguoiDung> dsnd = new ArrayList<>();
        try (Connection ketnoi =CSDL.Layketnoi()){
            Statement stm = ketnoi.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()){
                NguoiDung nd = new NguoiDung();
                nd.setId(rs.getInt("id"));
                nd.setEmail(rs.getString("email"));
                nd.setPassword(rs.getString("password"));
                nd.setHoTen(rs.getString("hoten"));
                nd.setDiaChi(rs.getString("diachi"));
                nd.setDtdd(rs.getString("dtdd"));
                nd.setId_vaitro(rs.getInt("id_vaitro"));
                dsnd.add(nd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsnd;
    }
}
