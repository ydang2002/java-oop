package Bai6;

public class HocSinh {
	
	public String hoTen;
	public int tuoi;
	public String queQuan;
	
	public HocSinh() {
		
	}
	
	public HocSinh(String hoTen, int tuoi, String queQuan) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.queQuan = queQuan;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public void setTuoi(int tuoi) {
		this.tuoi =tuoi;
	}
	
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	
	public String getHoTen() {
		return this.hoTen;
	}
	
	public int getTuoi() {
		return this.tuoi;
	}
	
	public String getQueQuan() {
		return this.queQuan;
	}
}
