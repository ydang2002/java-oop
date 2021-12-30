package BaiThi;
public class NhanVien extends CanBo {
	public String congViec;
	private int luaChon;
	public NhanVien() {
		
	}
	public NhanVien(int thuTu, String hoTen, int Tuoi, String gioiTinh, String diaChi, String congViec, String loaiCanBo) {
		super(thuTu, hoTen, Tuoi, gioiTinh, diaChi,loaiCanBo);
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
		System.out.println("Nhap cong viec: ");
		congViec = Nhap.sc.nextLine();
		System.out.print("Nhap so ngay lam them: ");
        soNgayLamThem = Nhap.sc.nextInt();
		System.out.print("Nhap loai can bo (1 - Tren 10 nam, 2 - Duoi 10 nam): ");
		luaChon = Nhap.sc.nextInt();
		switch (luaChon) {
	        case 1:
	            loaiCanBo = "Tren 10 nam";
	            break;
	        case 2:
	        	loaiCanBo = "Duoi 10 nam";
	            break;
	        default:
	            System.out.println("Nhap loai cong nhan khong dung!");
	            break;
	    }
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println(" cong Viec: " + congViec + " ]");
		
	}
	@Override
	public void xuatThongTinLuong() {
		super.xuatThongTinLuong();
		System.out.println("cong viec: " + congViec +  ", so ngay lam them:" + soNgayLamThem + ", loai cong nhan: " + loaiCanBo + " ]");
	}
}
