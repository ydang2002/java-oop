package Bai3;

public class ThiSinhKhoiB extends ThongTinThiSinh {
	public static final String toan = "Toan";
	public static final String hoa = "Hoa";
	public static final String sinh = "Sinh";
	
	public ThiSinhKhoiB() {
		
	}
	
	public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, String mucUuTien, int toan, int hoa, int sinh) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien);
	}
	
	@Override
	public void nhapThongTin() {
		// TODO Auto-generated method stub
		super.nhapThongTin();
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.print("mon hoc khoi B: " + toan +", " + sinh + ", " + hoa);
	}
	
	
}
