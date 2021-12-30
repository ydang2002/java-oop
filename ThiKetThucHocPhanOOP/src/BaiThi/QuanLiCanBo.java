package BaiThi;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

import jdk.incubator.vector.VectorOperators.Test;


public class QuanLiCanBo implements QuanLiCanBoChinhThuc {
	public ArrayList<CanBo> danhSachCanBo;
		
	public QuanLiCanBo() {
		this.danhSachCanBo = new ArrayList<>();
	}
	
	//ph??ng th?c thêm cán b?
	public void themCanBo() {
		
		while(true) {
			System.out.println("chon cac hinh thuc sau");
			System.out.println("1. Them cong nhan");
			System.out.println("2. Them ky su");
			System.out.println("3. Them nhan vien ");
			System.out.println("0.Thoat");
			String luaChon = Nhap.sc.nextLine();
			
			switch(luaChon) {
				case "1":{
				CongNhan cn = new CongNhan();
				  cn.nhapThongTin();
				  this.danhSachCanBo.add(cn);
				  break;
				}
				case "2":{
					KySu ks = new KySu();
					  ks.nhapThongTin();
					  this.danhSachCanBo.add(ks);
					  break;
				}
				case "3":{
					NhanVien nv = new NhanVien();
					  nv.nhapThongTin();
					  this.danhSachCanBo.add(nv);
					  break;
				}
				case "0": {
					return;
				}
			default:
				System.out.println("vui long nhap ?ung lua chon");
				
			}
		}
		
	}
	
	//phuong thuc tim kiem theo h? ten
	public void timKiem() {
		System.out.print("nhap ho ten de tim kiem: ");
        String hoTen = Nhap.sc.nextLine();
		for(CanBo cb : danhSachCanBo) {
			if (cb.getHoTen().equals(hoTen)) {
				cb.xuatThongTin();
			}
		}
	}
	
	//hi?n th? thông tin v? danh sách cán b?
	public void xuatDanhSach() {
		for(CanBo cb : danhSachCanBo) {
			cb.xuatThongTin();
		}
	}
	
	public void xoaCanBo() {
		System.out.print("Nhap  ho ten de xoa: ");
        String hoTen = Nhap.sc.nextLine();
        //N?u chúng ta mu?n gi? vòng l?p for-each, thì chúng ta c?n ??i cho ??n khi k?t thúc tr??c khi chúng ta xóa các ph?n t?.
        List<CanBo> toRemove = new ArrayList<>();
		for(CanBo cb : danhSachCanBo) {
			if(cb.getHoTen().equals(hoTen)) {
				toRemove.add(cb);
			}
		}
		danhSachCanBo.removeAll(toRemove);
	
	}
	
	public void suaCanBo() {
		System.out.print("moi ban nhap ten de sua: ");
        String hoTen = Nhap.sc.nextLine();
		for(CanBo cb : danhSachCanBo) {
			if(cb.getHoTen().equals(hoTen)) {
				cb.nhapThongTin();
				break;
			}
			else {
				System.out.println("KHONG CO TEN BAN VUA NHAP, MOI BAN NHAP LAI");
			}
		}
	}
	
	public void TinhLuongCanBo() {
		while(true) {
			System.out.println("chon cac hinh thuc sau");
			System.out.println("1. Tinh luong cong nhan");
			System.out.println("2. Tinh luong ky su");
			System.out.println("3. Tinh luong nhan vien");
			System.out.println("0. Thoat");
			String luaChon = Nhap.sc.nextLine();
			
			switch(luaChon) {
				case "1":{
					
					for(CanBo cb: danhSachCanBo) {
						if(cb instanceof CongNhan) {
						cb.tinhLuong(20000000, 10000000, 200000);
						cb.xuatThongTinLuong();
						}
					}
					  break;
				}
				case "2":{
					for(CanBo cb: danhSachCanBo) {
						if(cb instanceof KySu) {							
							cb.tinhLuong(25000000, 15000000);
							cb.xuatThongTinLuong();						
						}
					}
					break;
				}
				case "3":{
					for(CanBo cb: danhSachCanBo) {
						if(cb instanceof NhanVien) {							
							cb.tinhLuong(27000000, 18000000, 100, 500000);
							cb.xuatThongTinLuong();							
						}
					}
					break;
				}
				case "0": {
					return;
				}
			default:
				System.out.println("vui long nhap ?ung lua chon");
			}
		}
		
	}
	
	public void DoccDanhSachCanBoChinhThuc() {
		
        try {
        	File dir = new File("File");
        	if(!dir.exists()) {
        		dir.mkdir();
        	}
        	
        	File file = new File("File/DanhSachCanBoChinhThuc.txt");
        	if(!file.exists()) {
        		file.createNewFile();
        	}
        	
            FileReader fr = new FileReader(file);           
            int c= fr.read();;
            while (c != -1) {
            	System.out.print((char)c);
                c = fr.read();            
            } 
            fr.close();
        } catch (Exception e) {
           
        }
		
    }
	
}