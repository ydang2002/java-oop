package Bai1;


public class NhanVien extends CanBo {
	public String congViec;
	
	public NhanVien() {
		
	}
	public NhanVien(String hoTen, int Tuoi, String gioiTinh, String diaChi, String congViec) {
		super(hoTen, Tuoi, gioiTinh, diaChi);
		this.congViec = congViec;
	}
	
	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	public String getCongViec() {
		return this.congViec;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.println(" cong Viec: " + congViec);
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("Nhap nganh cong viec: ");
		congViec = Nhap.sc.nextLine();
	}
	
	 
	
}
