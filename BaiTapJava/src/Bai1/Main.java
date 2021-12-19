package Bai1;
public class Main {
	public static void main(String[] args) {
		
		QLCB qlcb = new QLCB();
		
		while(true) {
			System.out.println("chon cac hinh thuc sau");
			
			System.out.println("1: Them can bo");
			System.out.println("2: Tim can bo");
			System.out.println("3: Xuat danh sach can bo");
			System.out.println("4: xoa can bo");
			System.out.println("0: Thoat");
			String luaChon = Nhap.sc.nextLine();
			switch(luaChon) {
				case "1":{
					qlcb.themCanBo();
					break;
				}
				case "2":{
					qlcb.timKiem();
					break;
				}
				case "3":{
					qlcb.xuatDanhSach();
					break;
				}
				case "4":{
					qlcb.xoaCanBo();
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
