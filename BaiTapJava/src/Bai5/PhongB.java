package Bai5;

public class PhongB extends Phong {
	
	public PhongB(int soNgayThue, String loaiPhong, Nguoi []thongTinNguoiThuePhong) {
		super(soNgayThue, loaiPhong, thongTinNguoiThuePhong);
		this.giaPhong = 300;
	}
	
	public double getGiaPhong() {
		return this.giaPhong;
	}
	
}
