package Bai4;
import java.util.List;
public class HoGiaDinh  {
	public int soThanhVien;
	public int soNha;
	public List<Nguoi> thongTinMoiNguoi;
	
	public HoGiaDinh() {
		
	}
	
	public HoGiaDinh(int soThanhVien, int soNha, List<Nguoi> thongTinMoiNguoi) {
		this.thongTinMoiNguoi = thongTinMoiNguoi;
		this.soThanhVien = soThanhVien;
		this.soNha = soNha;
	}
	
	public void setThongTinMoiNguoi(List<Nguoi> thongTinMoiNguoi) {
		this.thongTinMoiNguoi = thongTinMoiNguoi;
	}
	
	public List<Nguoi> getThongTinMoiNguoi() {
		return this.thongTinMoiNguoi;
	}
	
	public void setSoThanhVien(int soThanhVien) {
		this.soThanhVien = soThanhVien;
	}
	
	public void setSoNha(int soNha) {
		this.soNha = soNha;
	}
	
	public int getSoThanhVien() {
		return this.soThanhVien;
	}
	
	public int getSoNha() {
		return this.soNha;
	}
	
	
}
