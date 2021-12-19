package Bai3;

public class ThongTinThiSinh {
	public String soBaoDanh;
	public String hoTen;
	public String diaChi;
	public String mucUuTien;
	
	public ThongTinThiSinh(String soBaoDanh, String hoTen, String diaChi, String mucUuTien){
		this.soBaoDanh = soBaoDanh;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
	}
	
	public ThongTinThiSinh() {
		
	}
	
	public void setSoBaoDanh(String soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void setMucUuTien(String mucUuTien) {
		this.mucUuTien = mucUuTien;
	}
	
	public String getSoBaoDanh() {
		return this.soBaoDanh;
	}
	
	public String getHoTen() {
		return this.hoTen;
	}
	
	public String getDiaChi() {
		return this.diaChi;
	}
	
	public String getMucUuTien() {
		return this.mucUuTien;
	}
	
	public void nhapThongTin() {
		System.out.println("moi man nhap so bao danh");
		soBaoDanh = Nhap.sc.nextLine();
		System.out.println("moi ban nhap ho ten");
		hoTen = Nhap.sc.nextLine();
		System.out.print("moi ban nhap dia chi");
		diaChi = Nhap.sc.nextLine();
		System.out.println("moi ban nhap muc uu tien");
		mucUuTien = Nhap.sc.nextLine();
	}
	
	public void xuatThongTin() {
		System.out.print("so bao danh: " + soBaoDanh + ",ho ten: " + hoTen + ",dia chi: " + diaChi + ",muc uu tien: " + mucUuTien);
	}
}
