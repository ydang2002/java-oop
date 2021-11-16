package DeMoDOAn;


public class Main {

	public static void main(String[] args) {
		QuanLiNhanVien qlnv = new QuanLiNhanVien();
		
		while(true) {
			System.out.println("chon cac hinh thuc sau");
			
			System.out.println("1: Them nhan vien");
			System.out.println("2: Tim nhan vien");
			System.out.println("3: Xuat danh sach nhanvien ");
			System.out.println("4: xoa nhan vien");
			System.out.println("5: sua nhan vien");
			System.out.println("0: Thoat");
			String luaChon = Nhap.sc.nextLine();
			switch(luaChon) {
				case "1":{
					qlnv.themNhanVien();
					break;
				}
				case "2":{
					qlnv.timKiem();
					break;
				}
				case "3":{
					qlnv.xuatDanhSachNhanVien();
					break;
				}
				case "4":{
					qlnv.xoaNhanVien();
					break;
				}
				case "5":{
					qlnv.suaNhanVien();
					break;
				}
				case "0":{
					return;
				}
					
				default :
				System.out.println("vui long chon đung hinh thuc");
			}
		}

		
	}

}
