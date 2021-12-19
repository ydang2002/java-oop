package Bai2;

public class Bao extends TaiLieu {

	public int ngayPhatHanh;
	
	public Bao() {
		
	}
	
	public Bao(String maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh, int ngayPhatHanh) {
		super(maTaiLieu, tenNhaSanXuat, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}
	
	public void setNgayPhatHanh(int ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}
	
	public int getNgayPhatHanh() {
		return this.ngayPhatHanh;
	}
	
	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.println("Nhap nagy phat hanh: ");
		ngayPhatHanh = Nhap.sc.nextInt();
		Nhap.sc.nextLine();
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.print(", ngay phat hanh: " + ngayPhatHanh );
	}
	
}
