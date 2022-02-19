import java.util.Scanner;
public class Cau4 
{

	public static double betongMotSan(int chieuDai,int chieuRong)
	{
		double s=chieuDai*chieuRong*3.5; //3.5 mét mỗi tầng nên chiều cao là 3.
		return s;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		int cd,cr,st,tg,x;
		double bt;
		st=0; cd=0; cr=0; tg=0;
		System.out.println("*******************************************");
		System.out.printf("* CHƯƠNG TRÌNH DỰ ĐOÁN  KHỐI LƯỢNG BÊ-TÔNG  *");
		System.out.printf("\n*   1. Nhập: Chiều Dài, Chiều rộng, số tầng \n   2. Khối lượng Bê-Tông cần sử dụng       *");
		System.out.printf("\n*   3. Thời gian bơm Bê-Tông cho công trình \n   4. Kết thúc chương trình                *\n");
		System.out.println("*******************************************");
		do {
		System.out.print("Vui Lòng Chọn Nhu Cầu : ");
		int n=sc.nextInt();
		switch (n)
		{
		case 1: System.out.print("Nhập Chiều Dài : "); cd=sc.nextInt();
				System.out.print("Nhập Chiều Rộng : "); cr=sc.nextInt();
				System.out.print("Nhập Số Tầng : "); st=sc.nextInt();
				break;
		case 2:  bt=betongMotSan(cd, cr); bt=bt*st;
				 System.out.println("Khối Lượng Bê-Tông cần sử dụng là : "+bt);
				 break;
		case 3: tg=st*20+st*2;
				System.out.println("Thời Gian bơm bê : "+tg);
				break;
		case 4: System.exit(0);
		}
		System.out.print("Cần Làm Việc khác không");
		System.out.printf("\n1.Có \n2.Không\n");
		x=sc.nextInt();
		} while (x==1);
		System.out.print("\nTạm Biệt");
	}

}