package Bai3;

public class ThiSinhKhoiA extends ThongTinThiSinh {
	public static final String toan = "Toan";
	public static final String ly = "Ly";
	public static final String hoa = "Hoa";
	
	public  ThiSinhKhoiA() {
		
	}
	
	public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, String mucUuTien, int toan, int ly, int hoa) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien);
		/*this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;*/
	}
	
	/*public void setToan(int toan) {
		this.toan = toan;
	}
	
	public void setLy(int Ly) {
		this.ly = Ly;
	}
	
	public void setHoa(int hoa) {
		this.hoa = hoa;
	}
	
	public int getToan() {
		return this.toan;
	}
	
	public int getLy() {
		return this.ly;
	}
	
	public int getHoa() {
		return this.hoa;
	}*/
	
	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.print("mon hoc khoi A: " + toan +", " + ly + ", " + hoa);
	}

	@Override
	public void nhapThongTin() {
		// TODO Auto-generated method stub
		super.nhapThongTin();
	}
	

}
