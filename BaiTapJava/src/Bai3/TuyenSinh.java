package Bai3;

import java.util.*;

public class TuyenSinh {

	public List<ThongTinThiSinh> thongTinThiSinhs;
	
	public TuyenSinh() {
		this. thongTinThiSinhs = new ArrayList<>();
	}
	
	public void themThiSinh() {
		while(true) {
			System.out.println("chon cac hinh thuc sau");
			System.out.println("1. Them thi sinh khôi A");
			System.out.println("2. Them thi sing khoi B");
			System.out.println("3. Them thi sing khoi C");
			System.out.println("0. Thoat");
			String luaChon = Nhap.sc.nextLine();
			
			switch(luaChon) {
			case "1":{
				ThiSinhKhoiA thiSinhKhoiA = new ThiSinhKhoiA();
				thiSinhKhoiA.nhapThongTin();
				this.thongTinThiSinhs.add(thiSinhKhoiA);
				break;
			}
			case "2":{
				ThiSinhKhoiB thiSinhKhoiB = new ThiSinhKhoiB();
				thiSinhKhoiB.nhapThongTin();
				this.thongTinThiSinhs.add(thiSinhKhoiB);
				break;
			}
			case "3":{
				ThiSinhKhoiC thiSinhKhoiC = new ThiSinhKhoiC();
				thiSinhKhoiC.nhapThongTin();
				this.thongTinThiSinhs.add(thiSinhKhoiC);
			}
			case "0":{
				return;
			}
			
			default:
				System.out.println("vui long nhap dung lua chon");
			}
		}
	}
	
	public void hienThiSinhVien() {
		for(ThongTinThiSinh thongTinThiSinh: thongTinThiSinhs) {
			thongTinThiSinh.xuatThongTin();
		}
	}
	
	public void timKiemThiSinh() {
		System.out.println("moi ban nhap so bao danh de tim kiem");
		String soBaoDanh = Nhap.sc.nextLine();
		for(ThongTinThiSinh thongTinThiSinh: thongTinThiSinhs) {
			if(thongTinThiSinh.getSoBaoDanh().equals(soBaoDanh)) {
				thongTinThiSinh.xuatThongTin();
			}
			else {
				System.out.println("khong tim thay so bao danh");
			}
		}
	}
	
}
