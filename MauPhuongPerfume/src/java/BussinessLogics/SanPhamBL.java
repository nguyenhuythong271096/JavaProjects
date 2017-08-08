/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogics;

import JavaBeans.SanPham;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hv
 */
public class SanPhamBL {
    public static SanPham DocTheoID (int id){
        SanPham sp = new SanPham();
        String sql = "select * from sanpham where id='"+id+"'";
        try (Connection ketnoi = CSDL.Layketnoi()){
            Statement stm = ketnoi.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()){
                
                sp.setId(rs.getInt("id"));
                sp.setTenSanpham(rs.getString("tensanpham"));
                sp.setMoTa(rs.getString("mota"));
                sp.setHinhAnh(rs.getString("hinhanh"));
                sp.setDonGia(rs.getInt("dongia"));
                sp.setDonGiaKM(rs.getInt("dongiaKM"));
                sp.setSoLuong(rs.getInt("soluong"));
                sp.setNgayTao(rs.getDate("ngaytao"));
                sp.setHienthi(rs.getString("hienthi"));
                sp.setId_loai(rs.getInt("id_loai"));
                sp.setId_thuonghieu(rs.getInt("id_thuonghieu"));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sp;
    }
}
