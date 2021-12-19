package Bai2;

public class Sach extends TaiLieu {
	public String tenTacGia;
	public int soTrang;
	
	public Sach() {
		
	}
	
	public Sach(String maTaiLieu, String tenNhaSanXuat, int soBanphatHanh, String tenTacGia, int soTrang) {	
		super(maTaiLieu, tenNhaSanXuat, soBanphatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}
	
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	
	public String getTenTacGia() {
		return this.tenTacGia;
	}
	
	public int getSoTrang() {
		return this.soTrang;
	}
	
	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.println("Nhap ten tac gia: ");
		tenTacGia = Nhap.sc.nextLine();
		Nhap.sc.nextLine();
		System.out.println("Nhap so trang: ");
		soTrang = Nhap.sc.nextInt();
		Nhap.sc.nextLine();
	}
	
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.print(", Ten tac gia: " + tenTacGia + ", so trang: " + soTrang);
		
	}
	
}
