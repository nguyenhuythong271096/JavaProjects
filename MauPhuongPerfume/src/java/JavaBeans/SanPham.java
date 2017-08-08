/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBeans;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author hv
 */
public class SanPham implements Serializable{
    private int id ;
    private String tenSanpham;
    private String moTa;
    private String hinhAnh;
    private int donGia;
    private int donGiaKM;
    private int soLuong;
    private Date ngayTao;
    private String Hienthi;
    private int id_loai;
    private int id_thuonghieu;

    public SanPham() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanpham() {
        return tenSanpham;
    }

    public void setTenSanpham(String tenSanpham) {
        this.tenSanpham = tenSanpham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getDonGiaKM() {
        return donGiaKM;
    }

    public void setDonGiaKM(int donGiaKM) {
        this.donGiaKM = donGiaKM;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getHienthi() {
        return Hienthi;
    }

    public void setHienthi(String Hienthi) {
        this.Hienthi = Hienthi;
    }

    public int getId_loai() {
        return id_loai;
    }

    public void setId_loai(int id_loai) {
        this.id_loai = id_loai;
    }

    public int getId_thuonghieu() {
        return id_thuonghieu;
    }

    public void setId_thuonghieu(int id_thuonghieu) {
        this.id_thuonghieu = id_thuonghieu;
    }
    
    
}
