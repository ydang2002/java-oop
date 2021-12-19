package Bai2;

public class Main {

	public static void main(String[] args) {
		QuanLySach quanLiSach = new QuanLySach();
		
		while(true) {
			System.out.println("chon cac hinh thuc sau");
			System.out.println("1. Them moi tai lieu");
			System.out.println("2. Xoa tai lieu theo ma tai lieu");
			System.out.println("3. Hien thi thong tin ve tai lieu");
			System.out.println("4. Tim kiem tai lieu");
			System.out.println("0. Thoat");
			String luaChon = Nhap.sc.nextLine();
			switch(luaChon) {
			case "1":{
				quanLiSach.themTaiLieu();
				break;
			}
			case "2":{
				quanLiSach.xoaTaiLieu();
				break;
			}
			case "3":{
				quanLiSach.hienThiTaiLieu();
				break;
			}
			case "4":{
				quanLiSach.timKiem();
				break;
			}
			case "0":{
				return;
			}
			default: System.out.println("vui long chon dung hinh thuc");
			
			}
		}
	}

}
