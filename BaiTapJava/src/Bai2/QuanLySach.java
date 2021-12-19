package Bai2;

import java.util.*;

import Bai1.Nhap;

public class QuanLySach {
	public List<TaiLieu> danhSachTaiLieu;
	
	public QuanLySach() {
		this.danhSachTaiLieu = new ArrayList<>();
	}
	
	public void themTaiLieu() {
		
		while(true) {
			System.out.println("chon cac hinh thuc sau");
			System.out.println("1. Them sach");
			System.out.println("2. Them bao");
			System.out.println("3. Them tap chi");
			System.out.println("0. Thoat");
			String luaChon = Nhap.sc.nextLine();
			
			switch(luaChon) {
				case "1":{
					Sach sach = new Sach();
					sach.nhapThongTin();
					this.danhSachTaiLieu.add(sach);
					break;
				}
				case "2":{
					Bao bao = new Bao();
					bao.nhapThongTin();
					this.danhSachTaiLieu.add(bao);
					break;
				}
				case "3":{
					TapChi tapChi = new TapChi();
					tapChi.nhapThongTin();
					this.danhSachTaiLieu.add(tapChi);
				}
				case "0":{
					return;
				}
			default:
				System.out.println("vi  long nhap dung lus chon");
			
			}
			
		}
	}
	
	public void xoaTaiLieu() {
		System.out.print("moi ban nhap ma tai lieu de xoa: ");
		String maTaiLieu = Nhap.sc.nextLine();
		List<TaiLieu> toRemove = new ArrayList<>();
		for(TaiLieu  tl : danhSachTaiLieu) {
			if(tl.getMaTaiLieu().equals(maTaiLieu)) {
				toRemove.add(tl);
			}
			else {
				System.out.println("KHONG CO MA TAI LIEU BAN VUA NHAP");
			}
		}
		danhSachTaiLieu.removeAll(toRemove);
	}
	
	public void hienThiTaiLieu() {
		for(TaiLieu tl: danhSachTaiLieu) {
			tl.xuatThongTin();
		}
	}
	
	public void timKiem() {
		while(true) {
			System.out.println("chon cac hinh thuc sau");
			System.out.println("1. Tim Sach");
			System.out.println("2. Tim Bao");
			System.out.println("3. Tim tap chi");
			System.out.println("0. Thoat");
			String luaChon = Nhap.sc.nextLine();
			
			switch(luaChon) {
				case "1":{
					for(TaiLieu tl: danhSachTaiLieu) {
						if(tl instanceof Sach) {
							tl.xuatThongTin();
						}
					}
					break;
				}
				case "2":{
					for(TaiLieu tl: danhSachTaiLieu) {
						if(tl instanceof Bao) {
							tl.xuatThongTin();						}
					}
					break;
				}
				case "3":{
					for(TaiLieu tl: danhSachTaiLieu) {
						if(tl instanceof TapChi) {
							tl.xuatThongTin();
						}
					}
					break;
				}
				case "0": {
					return;
				}
			default:
				System.out.println("vui long nhap đung lua chon");
			}
		}
		
	}
	
}
