package DeMoDOAn;


public class DanhSachNhanVien {
    public String HOTEN;
    public String MANV;
    public String MAPHONG;
    public int TUOI;
    public int NGAYSINH;
    public String GIOITINH;
    public int MUCLUONG;
    
    public DanhSachNhanVien() {
    	
    }
    
    public DanhSachNhanVien(String HOTEN, String MANV, String MAPHONG, int TUOI, int NGAYSINH, String GIOITINH, int MUCLUONG) {
    	this.HOTEN = HOTEN;
    	this.MANV = MANV;
    	this.MAPHONG = MAPHONG;
    	this.TUOI = TUOI;
    	this.GIOITINH = GIOITINH;
    	this.NGAYSINH = NGAYSINH;
    	this.MUCLUONG = MUCLUONG;
    	 
    }

	public String getHOTEN() {
		return HOTEN;
	}

	public void setHOTEN(String hOTEN) {
		HOTEN = hOTEN;
	}

	public String getMANV() {
		return MANV;
	}

	public void setMANV(String mANV) {
		MANV = mANV;
	}

	public String getMAPHONG() {
		return MAPHONG;
	}

	public void setMAPHONG(String mAPHONG) {
		MAPHONG = mAPHONG;
	}

	public int getTUOI() {
		return TUOI;
	}

	public void setTUOI(int tUOI) {
		TUOI = tUOI;
	}

	public int getNGAYSINH() {
		return NGAYSINH;
	}

	public void setNGAYSINH(int nGAYSINH) {
		NGAYSINH = nGAYSINH;
	}

	public String getGIOITINH() {
		return GIOITINH;
	}

	public void setGIOITINH(String gIOITINH) {
		GIOITINH = gIOITINH;
	}

	public int getMUCLUONG() {
		return MUCLUONG;
	}

	public void setMUCLUONG(int mUCLUONG) {
		MUCLUONG = mUCLUONG;
	}
	
	public int DemKiTu(String s) {
		int dem = 0;
		for(int i = 0;i<s.length();i++) {
			dem++;
		}
		return dem;
	}
	

	public void nhapThongTin() {
		System.out.println("moi ban nhap ho ten: ");
		HOTEN = Nhap.sc.nextLine();
		//System.out.println("moi ban nhap ma nhan vien: ");
		//MANV = Nhap.sc.nextLine();
		do {
			System.out.println("moi ban nhap ma nhan vien: ");
			MANV = Nhap.sc.nextLine();
			if(DemKiTu(MANV) != 6);
				System.out.println("moi ban nhap lai ma nhan vien");
		}while(DemKiTu(MANV) != 6);
		System.out.println("moi ban nhap ma phong: ");
		MAPHONG = Nhap.sc.nextLine();
		System.out.println("moi ban nhap tuoi: ");
		TUOI = Nhap.sc.nextInt();
		System.out.println("moi ban nhap ngay sinh");
		NGAYSINH = Nhap.sc.nextInt();
		System.out.println("moi ban nhap gioi tinh");
		GIOITINH = Nhap.sc.nextLine();
		Nhap.sc.nextLine();
		System.out.println("moi ban nhap muc luong");
		MUCLUONG = Nhap.sc.nextInt();
	}
	
	void xuatThongTin() {
		System.out.println("ho ten: "+HOTEN + ", ma nhan vien: " + MANV + ", ma phong: " + MAPHONG + ", tuoi: " + TUOI + ", ngay sinh: " + NGAYSINH + ", muc luong: " + MUCLUONG);
	}
	
}
