package Bai3;

public class Main {

	public static void main(String[] args) {
		TuyenSinh tuyenSinh = new TuyenSinh();
		
		while(true) {
			System.out.println("\nmoi chom cac hinh thuc sau");
			System.out.println("1. Them moi thi sinh");
			System.out.println("2. Hien thi thong tin cua thi sinh va khoi thi cua thi sinh");
			System.out.println("3. Tim kiem Thi Sinh");
			System.out.println("0. Thoat");
			String luaChon = Nhap.sc.nextLine();
			
			switch(luaChon) {
			case "1":
				tuyenSinh.themThiSinh();
				break;
			case "2":
				tuyenSinh.hienThiSinhVien();
				break;
			case "3":
				tuyenSinh.timKiemThiSinh();
				break;
			case "0":
				return;
			default: System.out.println("vui long chon dung lua chon"); 
			}
		}
		
	}

}
