package Bai4;

public class Nguoi {
	public String hoTen;
	public int tuoi;
	public String ngheNghiep;
	public int soCMND;
	
	public Nguoi(String hoTen, int tuoi, String ngheNghiep, int soCMND) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.ngheNghiep = ngheNghiep;
		this.soCMND = soCMND;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}
	
	public void setSoCMND(int soCMND) {
		this.soCMND = soCMND;
	}
	
	public String getHoTen() {
		return this.hoTen;
	}
	
	public int getTuoi() {
		return this.tuoi;
	}
	
	public String getNgheNghiep() {
		return this.ngheNghiep;
	}
	
	public int getSOCMND() {
		return this.soCMND;
	}
	
}
