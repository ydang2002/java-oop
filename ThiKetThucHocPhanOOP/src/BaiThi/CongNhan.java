package BaiThi;
public class CongNhan extends CanBo {
	public String capBac;
	public int soNgayLamThem;
	private int luaChon;
	
	public CongNhan() {
		
	}
	public CongNhan(int thuTu, String hoTen, int Tuoi, String gioiTinh, String diaChi, String capBac, String loaiCanBo, int soNgayLamThem ){
		super(thuTu, hoTen, Tuoi, gioiTinh, diaChi,loaiCanBo);
		this.capBac = capBac;
		this.soNgayLamThem = soNgayLamThem;
	}
	
	public void setCapBac(String capBac) {
		this.capBac = capBac;
	}
	
	public String getCapBac() {
		return this.capBac;
	}
	
	public int getSoNgayLamThem() {
        return soNgayLamThem;
    }
 
    public void setSoNgayLamThem(int soNgayLamThem) {
        this.soNgayLamThem = soNgayLamThem;
    }

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("cap bac: " + capBac + " ]");
	}
	
	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.println("Nhap cap bac");
		capBac = Nhap.sc.nextLine();
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
	public void xuatThongTinLuong() {
		super.xuatThongTinLuong();
		System.out.println("cap bac: " + ", so ngay lam them:" + soNgayLamThem + ", loai cong nhan: " + loaiCanBo + " ]" );
	}
	
}
