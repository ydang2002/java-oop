package Bai1;


//import Bai1.Nhap;

public class CanBo {
	public String hoTen;
	public int Tuoi;
	public String gioiTinh;
	public String diaChi;
	
	public CanBo() {
	}
	
	public CanBo(String hoTen, int Tuoi, String gioiTinh, String diaChi) {
		this.hoTen = hoTen;
		this.Tuoi = Tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public void setTuoi(int Tuoi) {
		this.Tuoi = Tuoi;
	}
	
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public String getHoTen() {
		return this.hoTen;
	}
	
	public int getTuoi() {
		return this.Tuoi;
	}
	
	public String getGioiTinh() {
		return this.gioiTinh;
	}
	
	public String getDiaChi() {
		return this.diaChi;
	}
	
	public void nhapThongTin() {
		System.out.println("Nhap ho ten: ");
		hoTen = Nhap.sc.nextLine();
		
		System.out.println("Nhap tuoi: ");
		Tuoi = Nhap.sc.nextInt();
		
		System.out.println("nhap gioi tinh: ");
		gioiTinh = Nhap.sc.nextLine();
		Nhap.sc.nextLine();
		
		System.out.println("Nhap dia chi: ");
		diaChi = Nhap.sc.nextLine();
		

	}
	
	public void xuatThongTin() {
		System.out.println("CanBo [hoTen: " + hoTen + ",Tuoi: " + Tuoi + ", gioiTinh: " + gioiTinh + ", diaChi: " + diaChi +  "]");
	}

}
