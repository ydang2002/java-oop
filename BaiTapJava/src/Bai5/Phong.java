package Bai5;

public class Phong {
	public int soNgayThue;
	public String loaiPhong;
	public Nguoi thongTinNguoiThuePhong[];
	public double giaPhong;
	
	public Phong() {
		
	}
	
	public Phong(int soNgayThue, String loaiPhong, Nguoi []thongTinNguoiThuePhong) {
		this.soNgayThue = soNgayThue;
		this.loaiPhong = loaiPhong;
		this.thongTinNguoiThuePhong = thongTinNguoiThuePhong;
	}
	
	public void setSoNgayThue(int soNgayThue) {
		this.soNgayThue = soNgayThue;
	}
	
	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}
	
	public void setThongTinNguoiThuePhong(Nguoi []thongTinNguoiThuePhong) {
		this.thongTinNguoiThuePhong = thongTinNguoiThuePhong;
	}
	
	public int getSoNgayThue() {
		return this.soNgayThue;
	}
	
	public String getLoaiPhong() {
		return this.loaiPhong;
	}
	
	public Nguoi[] getThongTinNguoiThuePhong() {
		return this.thongTinNguoiThuePhong;
	}
	
	public double tinhTienPhong() {
		double tinhTien = this.soNgayThue*this.giaPhong;
		return tinhTien;
	}
	
}
