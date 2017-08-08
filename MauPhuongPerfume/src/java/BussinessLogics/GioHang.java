/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogics;

import JavaBeans.SanPham;
import JavaBeans.SanPhamMua;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author hv
 */
public class GioHang {
    Map <Integer,Integer> dshh;
    public GioHang(){
        dshh = new Hashtable<>();
    }
    
    public void Them (int idSanPham, int soLuongMua){
        if(dshh.containsKey(idSanPham))
            dshh.replace(idSanPham, dshh.get(idSanPham)+soLuongMua);//neu da co san pham roi thi them vao
        else 
            dshh.put(idSanPham, soLuongMua);
    }

    public List <SanPhamMua> SanPhamMua(){
         List <SanPhamMua> dsspm = new  ArrayList<>();
         for (Integer idSanPham : dshh.keySet()){
             SanPham sp = SanPhamBL.DocTheoID(idSanPham);
             SanPhamMua spm = new SanPhamMua();
             
             spm.setId(sp.getId());
             spm.setTenSanpham(sp.getTenSanpham());
         }
    } 

}
