package Bai2;
import java.util.Scanner;

public class Nhap {
public static Scanner sc = new Scanner(System.in);
}
/*public List<KySu> DocDanhSachCanBo() {
List<KySu> list = new ArrayList<>();
try {
	File dir = new File("File");
	if(!dir.exists()) {
		dir.mkdir();
	}
	
	File file = new File("File/DanhSachCanBoChinhThuc.txt");
	if(!file.exists()) {
		file.createNewFile();
	}
	
    FileReader fr = new FileReader(file);
    //System.out.println("qua buoc đọc file");
    BufferedReader br = new BufferedReader(fr);
    //System.out.println("qua BufferedReader");
    String line = "";
    while (true) {
        line = br.readLine();
        //line = fr.read();
        System.out.println((String)line);
        //System.out.println((String)line);
        if (line == null) {
            break;
        }
        String txt[] = line.split(";");
        int thuTu = Integer.parseInt(txt[0]);
        String hoTen = txt[1];
        int Tuoi = Integer.parseInt(txt[2]);
        String gioiTinh = txt[3];
        String diaChi = txt[4];
        String nganhDaoTao = txt[5];
        String loaiCanBo = txt[6];
        //long luongCanBo =Long.parseLong(txt[6]) ;
        //int soNgayLamThem = Integer.parseInt(txt[7]);
        list.add(new  KySu (thuTu, hoTen, Tuoi, gioiTinh, diaChi, nganhDaoTao, loaiCanBo));
    } 
    fr.close();
    br.close();
} catch (Exception e) {
    System.out.println("khong tim thay file");
}
return list;
}*/