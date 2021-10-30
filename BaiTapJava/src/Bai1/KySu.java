package Bai1;

public class KySu extends CanBo {
	public String nganhDaoTao;
	
	public KySu() {
		
	}
	public KySu(String hoTen, int Tuoi, String gioiTinh, String diaChi, String nganhDaoTao ){
		super(hoTen, Tuoi, gioiTinh, diaChi);
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
		// TODO Auto-generated method stub
		super.xuatThongTin();
		System.out.println("nganhDaoTao: " + nganhDaoTao);
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.println("Nhap nganh dao tao: ");
		nganhDaoTao = Nhap.sc.nextLine();
		
	}
	
}
