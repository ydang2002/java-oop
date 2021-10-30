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
		
	
		/*CanBo cb = new CanBo();
		cb.nhapThongTin();
		this.danhSachCanBo.add(cb);*/
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
	
}
