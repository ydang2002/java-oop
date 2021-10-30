package BaiTapNhom;

public class Main {

	public static void main(String[] args) {
		//minh họa overriding method
		System.out.println("minh họa overriding method: ");
		ConHo ch = new ConHo();
		ch.eat();
		//minh họa tính đa hình
		System.out.println("minh họa tính đa hình: ");
		DongVat dv = new ConVoi();// upcasting
		dv.eat();
		//minh họa tinh ke thua
		System.out.println("minh họa tinh ke thua: ");
		CaHeo caheo = new CaHeo();
		caheo.eat();
		caheo.bieuDien();
		caheo.nghiNgoi();
	}

}
