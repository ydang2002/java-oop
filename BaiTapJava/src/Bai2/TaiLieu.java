package Bai2;


public class TaiLieu {
	public String maTaiLieu;
	public String tenNhaSanXuat;
	public int soBanPhatHanh;
	
	public TaiLieu() {
		
	}
	
	public TaiLieu(String maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh ){
		this.maTaiLieu = maTaiLieu;
		this.tenNhaSanXuat = tenNhaSanXuat;
		this.soBanPhatHanh = soBanPhatHanh;
		
	}
	
	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}
	
	public void setTenNhaSanXuat(String tenNhaSanXuat) {
		this.tenNhaSanXuat = tenNhaSanXuat;
	}
	
	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}
	
	public String getMaTaiLieu() {
		return this.maTaiLieu;
	}
	
	public String getTenNhaSanXuat() {
		return this.tenNhaSanXuat;
	}
	
	public int getSoBanPhatHanh() {
		return this.soBanPhatHanh;
	}
	
	public void nhapThongTin() {
		System.out.println("Nhap ma tai lieu: ");
		maTaiLieu = Nhap.sc.nextLine();
		Nhap.sc.nextLine();
		System.out.println("Nhap ten nha san xuat: ");
		tenNhaSanXuat = Nhap.sc.nextLine();
		Nhap.sc.nextLine();
		System.out.println("Nhap so ban phat hanh: ");
		soBanPhatHanh = Nhap.sc.nextInt();
		Nhap.sc.nextLine();
	}
	
	public void xuatThongTin() {
		System.out.println("\nMa tai lieu: " + maTaiLieu + ", Ten nha xuat ban: " + tenNhaSanXuat + ", So ban phat hanh" + soBanPhatHanh );
	}
	
}
