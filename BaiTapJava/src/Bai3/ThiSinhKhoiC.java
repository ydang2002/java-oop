package Bai3;

public class ThiSinhKhoiC extends ThongTinThiSinh {
public static final String van = "Van";
	public static final String su = "Su";
	public static final String dia = "Dia";
	
	public ThiSinhKhoiC() {
		
	}
	
	public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, String mucUuTien, int van, int su, int dia) {
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
		System.out.print("mon hoc khoi A: " + van +", " + su + ", " + dia);
	}
	
}
