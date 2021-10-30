package BaiTapNhom;

//lớp con hổ kế thừa lớp động vật
public class ConHo extends DongVat {

	// overriding eat() method của lớp DongVat
	@Override
	public void eat() {
		System.out.print("Con ho");
		//sử dụng từ khóa super để gọi eat() của lớp DongVat
		super.eat();
	}

}
