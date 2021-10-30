package Bai1;


public class CongNhan extends CanBo {
	public String capBac;
	
	public CongNhan() {
		
	}
	public CongNhan(String hoTen, int Tuoi, String gioiTinh, String diaChi, String capBac ){
		super(hoTen, Tuoi, gioiTinh, diaChi);
		this.capBac = capBac;
		
	}
	
	public void setCapBac(String capBac) {
		this.capBac = capBac;
	}
	
	public String getCapBac() {
		return this.capBac;
	}
	
	 

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("cap bac: " + capBac);
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.println("Nhap cap bac");
		capBac = Nhap.sc.nextLine();
		//sc.close();
	}
	
	 
}
