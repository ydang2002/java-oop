package BaiThi;
public class KySu extends CanBo {
	public String nganhDaoTao;
	private int luaChon;
	public KySu() {
		
	}
	public KySu(int thuTu, String hoTen, int Tuoi, String gioiTinh, String diaChi, String nganhDaoTao, String loaiCanBo){
		super(thuTu, hoTen, Tuoi, gioiTinh, diaChi,loaiCanBo/*, SoNgayLamThem*/);
		this.nganhDaoTao= nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	public String getNganhDaoTao() {
		return this.nganhDaoTao;
	}
	
	 

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("nganhDaoTao: " + nganhDaoTao +" ]");
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.println("Nhap nganh dao tao: ");
		nganhDaoTao = Nhap.sc.nextLine();
		System.out.print("Nhap loai can bo (1 - Tren 10 nam, 2 - Duoi 10 nam): ");
		luaChon = Nhap.sc.nextInt();
		switch (luaChon) {
	        case 1:
	            loaiCanBo = "Tren 10 nam";
	            break;
	        case 2:
	        	loaiCanBo = "Duoi 10 nam";
	            break;
	        default:
	            System.out.println("Nhap loai cong nhan khong dung!");
	            break;
	    }
	}
	@Override
	public void xuatThongTinLuong() {
		super.xuatThongTinLuong();
		System.out.println("nganh dao tao: "+ nganhDaoTao + ", loai ky su: " + loaiCanBo +" ]");
	}
	
}
