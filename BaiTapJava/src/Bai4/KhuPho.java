package Bai4;
import java.util.*; 
public class KhuPho {
	public List<HoGiaDinh> thongTinHoGiaDinh;
	
	public KhuPho() {
		this.thongTinHoGiaDinh = new ArrayList<>();
	}
	
	public List<HoGiaDinh> getThongTinHoGiaDinh(){
		return thongTinHoGiaDinh;
	}
	
	public void setThongTinHoGiaDinh(List<HoGiaDinh> thongTinHoGiaDinh) {
		this.thongTinHoGiaDinh = thongTinHoGiaDinh;
	}
	
}
