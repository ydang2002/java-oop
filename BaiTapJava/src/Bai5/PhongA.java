package Bai5;

public class PhongA extends Phong{
	
	
	public PhongA(int soNgayThue, String loaiPhong, Nguoi[] thongTinNguoiThuePhong) {
		super(soNgayThue, loaiPhong, thongTinNguoiThuePhong);
		this.giaPhong =500;
		
	}
	
	public double getGiaPhong() {
		return this.giaPhong;
	}
	
}
