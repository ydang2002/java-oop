package Bai5;

public class Nguoi {
	public String hoTen;
	public int tuoi;
	public int soCMND;
	
	public Nguoi() {
		
	}
	
	public Nguoi(String hoTen, int tuoi, int soCMND) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.soCMND = soCMND;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public void setsoCMND(int soCMND) {
		this.soCMND = soCMND;
	}
	
	public String getHoTen() {
		return this.hoTen;
	}
	
	public int getTuoi() {
		return this.tuoi;
	}
	
	public int getsoCMND() {
		return this.soCMND;
	}
	
}
