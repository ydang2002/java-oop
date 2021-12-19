package Bai5;


public class PhongC extends Phong{
	
	public PhongC(int soNgayThue, String loaiPhong, Nguoi[] thongTinNguoiThue) {
		super(soNgayThue, loaiPhong, thongTinNguoiThue);
		this.giaPhong = 300;
	}
	
	public double getGiaPhong() {
		return this.giaPhong;
	}
	
}
