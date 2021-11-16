package DeMoDOAn;

import java.util.*;


public class QuanLiNhanVien {
	public List<DanhSachNhanVien>  danhSachNhanVien;
	
	public QuanLiNhanVien() {
		this.danhSachNhanVien = new ArrayList<>();
	}
	
	public void themNhanVien() {
		DanhSachNhanVien dsnv = new DanhSachNhanVien();
		dsnv.nhapThongTin();
		this.danhSachNhanVien.add(dsnv);
	}
	
	public void timKiem() {
		System.out.print("moi ban nhap ma nhan vien de tim kiem: ");
		String MANV = Nhap.sc.nextLine();
		for(DanhSachNhanVien dsnv : danhSachNhanVien) {
			if(dsnv.getMANV().equals(MANV)) {
				dsnv.xuatThongTin();
			}
			else {
				System.out.println("KHONG CO MA NHAN VIEN BAN VUA NHAP, MOI BAN NHAP LAI");
			}
		}
	}
	
	public void xuatDanhSachNhanVien() {
		for (DanhSachNhanVien dsnv : danhSachNhanVien) {
			dsnv.xuatThongTin();
		}
	}
	
	public void xoaNhanVien() {
		System.out.println("chỗ này mình nhập cụ thể yêu cầu về mã như ông nói: ví dụ như mã phòng kế toán 3 số đầu ma4 phòng cộng  với các số thứ tự nhanvie6n trong phòng ");
		System.out.print("moi ban nhap ma so nhan vien de xoa: ");
		String MANV = Nhap.sc.nextLine();
		List<DanhSachNhanVien> toRemove = new ArrayList<>();
		for(DanhSachNhanVien dsnv : danhSachNhanVien) {
			if(dsnv.getMANV().equals(MANV)) {
				toRemove.add(dsnv);
			}
			else {
				System.out.println("KHONG CO MA NHAN VIEN BAN VUA NHAP, MOI BAN NHAP LAI");
			}
		}
		danhSachNhanVien.removeAll(toRemove);
	}
	
	/*public boolean suaSinhVien(SinhVien sv, String studentCode) {
			for (SinhVien s : a) {
				if (s.getstudentCode().equals(studentCode)) {
					s.setname(sv.getname());
					s.setclassCode(sv.getclassCode());
					s.settheoreticalPoint(sv.gettheoreticalPoint());
					s.setpracticePoints(sv.getpracticePoints());
					return true;
				}
			}
			return false;
		}*/
	public void suaNhanVien() {
		System.out.print("moi ban nhap ma nhan vien de sua: ");
		String MANV = Nhap.sc.nextLine();
		for(DanhSachNhanVien dsnv : danhSachNhanVien) {
			if(dsnv.getMANV().equals(MANV)) {
				dsnv.nhapThongTin();
				break;
			}
			else {
				System.out.println("KHONG CO MA NHAN VIEN BAN VUA NHAP, MOI BAN NHAP LAI");
			}
		}
	}
}

