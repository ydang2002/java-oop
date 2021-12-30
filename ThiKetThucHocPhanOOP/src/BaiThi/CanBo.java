package BaiThi;
abstract class CanBo {
	static  int dem = 0;
	public int thuTu;
	public String hoTen;
	public int Tuoi;
	public String gioiTinh;
	public String diaChi;
	public String loaiCanBo;
    protected long luongCanBo;
    public int soNgayLamThem;
	
	public CanBo() {
	}
	
	public CanBo(int thuTu, String hoTen, int Tuoi, String gioiTinh, String diaChi, String loaiCanBo/*, int soNgayLamThem*/) {
		this.thuTu = thuTu;
		this.hoTen = hoTen;
		this.Tuoi = Tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.loaiCanBo = loaiCanBo;
	}
	
	public int getThuTu() {
		return thuTu;
	}

	public void setThuTu(int thuTu) {
		this.thuTu = thuTu;
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
	
	public String getLoaiCanBo() {
        return loaiCanBo;
    }
 
    public void setLoaiCanBo(String loaiCanBo) {
        this.loaiCanBo = loaiCanBo;
    }  
	
	public void nhapThongTin() {
		thuTu = ++dem;
		
		System.out.println("Nhap ho ten: ");
		hoTen = Nhap.sc.nextLine();
		
		System.out.println("Nhap tuoi: ");
		Tuoi = Nhap.sc.nextInt();
		
		System.out.println("nhap gioi tinh: ");
		gioiTinh = Nhap.sc.nextLine();
		gioiTinh = Nhap.sc.nextLine();
		
		System.out.println("Nhap dia chi: ");
		diaChi = Nhap.sc.nextLine();
		
	}
	
	public void xuatThongTin() {
		System.out.println("CanBo [" + "Thu tu: " + thuTu +", hoTen: " + hoTen + ",Tuoi: " + Tuoi + ", gioiTinh: " + gioiTinh + ", diaChi: " + diaChi  );
	}
	
	public void xuatThongTinLuong() {
		System.out.println("CanBo [hoTen: " + hoTen + ",Tuoi: " + Tuoi + ", gioiTinh: " + gioiTinh + ", diaChi: " + diaChi+ ", luong can bo:" + luongCanBo +" VND");
	}

	public void tinhLuong(long luongCanBoTren10Nam, long luongCanBoiDuoi10Nam, long luonglamthem) {
	        if (loaiCanBo.equals("Duoi 10 nam")) {
	        	luongCanBo = luongCanBoiDuoi10Nam + soNgayLamThem *luonglamthem;
	        } else if (loaiCanBo.equals("Tren 10 nam")) {
	        	luongCanBo = luongCanBoTren10Nam + soNgayLamThem *luonglamthem; 
	        }
		}

	public void tinhLuong(long luongCanBoTren10Nam, long luongCanBoiDuoi10Nam) {
		if (loaiCanBo.equals("Duoi 10 nam")) {
	    	luongCanBo = luongCanBoiDuoi10Nam;
	    } else if (loaiCanBo.equals("Tren 10 nam")) {
	    	luongCanBo = luongCanBoTren10Nam; 
	    }
	}
	
	public void tinhLuong(long luongCanBoTren10Nam, long luongCanBoiDuoi10Nam, long luonglamthem, long LuongThuong) {
        if (loaiCanBo.equals("Duoi 10 nam")) {
        	luongCanBo = luongCanBoiDuoi10Nam + soNgayLamThem *luonglamthem + LuongThuong;
        } else if (loaiCanBo.equals("Tren 10 nam")) {
        	luongCanBo = luongCanBoTren10Nam + soNgayLamThem *luonglamthem + LuongThuong; 
        }
	}

}
