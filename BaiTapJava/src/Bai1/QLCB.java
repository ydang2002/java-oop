package Bai1;

import java.util.*;  

public class QLCB {
	public List<CanBo> danhSachCanBo;
	
	
	public QLCB() {
		this.danhSachCanBo = new ArrayList<>();
	}
	
	//phương thức thêm cán bộ
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
				System.out.println("vui long nhap đung lua chon");
				
			}
		}
		
	}
	
	//phuong thuc tim kiem theo họ ten
	public void timKiem() {
		System.out.print("nhap ho ten de tim kiem: ");
        String hoTen = Nhap.sc.nextLine();
		for(CanBo cb : danhSachCanBo) {
			if (cb.getHoTen().equals(hoTen)) {
				cb.xuatThongTin();
			}
		}
	}
	
	//hiển thị thông tin về danh sách cán bộ
	public void xuatDanhSach() {
		for(CanBo cb : danhSachCanBo) {
			cb.xuatThongTin();
		}
	}
	
	public void xoaCanBo() {
		System.out.print("Nhap  ho ten de xoa: ");
        String hoTen = Nhap.sc.nextLine();
        //Nếu chúng ta muốn giữ vòng lặp for-each, thì chúng ta cần đợi cho đến khi kết thúc trước khi chúng ta xóa các phần tử.
        List<CanBo> toRemove = new ArrayList<>();
		for(CanBo cb : danhSachCanBo) {
			if(cb.getHoTen().equals(hoTen)) {
				toRemove.add(cb);
			}
		}
		danhSachCanBo.removeAll(toRemove);
	
	}
	
	/*public void suaCanBo() {
		while(true) {
			System.out.println("chon cac hinh thuc sau de sua thong tin");
			System.out.println("1. Sua thong tin cong nhan");
			System.out.println("2. Sua thong tin ky su");
			System.out.println("3. Sua thong tin nhan vien ");
			System.out.println("0.Thoat");
			String luaChon = Nhap.sc.nextLine();
			switch(luaChon) {
				case "1":{
					/*CongNhan cn = new CongNhan();*/
					/*System.out.println("nhap ho ten de sua thong tin cong nhan: ");
			        String hoTen = Nhap.sc.nextLine();
			        CongNhan cn ;
					for(CanBo cb : danhSachCanBo) {
						if(cb.getHoTen().equals(hoTen)) {
							cb.setTuoi
						}
						else {
							System.out.println("khong sua thong tin thanh cong");
						}
					}
					
					break;
				}
				case "2":{
					System.out.println("nhap ho ten de sua thong tin ky su: ");
			        String hoTen = Nhap.sc.nextLine();
					for(CanBo cb : danhSachCanBo) {
						if(cb.getHoTen().equals(hoTen)) {
							KySu ks = new KySu();
							cb.setTuoi(ks.getTuoi());
							cb.setGioiTinh(ks.getGioiTinh());
							cb.setDiaChi(ks.getDiaChi());
						}
					}
					break;
				}
				case "3":{
					System.out.println("nhap ho ten de sua thong tin nhan vien: ");
			        String hoTen = Nhap.sc.nextLine();
					for(CanBo cb : danhSachCanBo) {
						if(cb.getHoTen().equals(hoTen)) {
							NhanVien nv = new NhanVien();
							cb.setTuoi(nv.getTuoi());
							cb.setGioiTinh(nv.getGioiTinh());
							cb.setDiaChi(nv.getDiaChi());
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
		
	}*/
}