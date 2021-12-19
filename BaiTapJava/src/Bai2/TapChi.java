package Bai2;

public class TapChi extends TaiLieu {
	public int soPhatHanh;
	public int thangPhatHanh;
	
	public TapChi() {
		
	}
	
	public TapChi(String maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, tenNhaSanXuat, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh; 
	}
	
	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}
	
	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}
	
	public int getSoPhatHanh() {
		return this.soPhatHanh;
	}
	
	public int gretThangPhatHanh() {
		return this.thangPhatHanh;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.println("Nhap so phat hanh: ");
		soPhatHanh = Nhap.sc.nextInt();
		Nhap.sc.nextLine();
		System.out.println("Nhap thang phat hanh: ");
		thangPhatHanh = Nhap.sc.nextInt();
		Nhap.sc.nextLine();
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.print(", so phat hanh: " + soPhatHanh + ", thang phat hanh: " + thangPhatHanh);

	}
}
