package PP_TimKiem;

import java.util.Scanner;

public class PP_TimKiemTuyenTinh {

	Scanner scanner = new Scanner(System.in);

	public void NhapMang(int n,int a[]){
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<n; i++){
			System.out.print("\nnhap phan tu thu a["+i+"]: ");
			a[i]=scanner.nextInt();
		}
	}
	
	public void XuatMang(int n,int a[]){
		System.out.print("mang vua nhap la: ");
		for (int i=0; i<n; i++){
			System.out.print("\t "+a[i]);
		}
	}
	
	public int search(int a[],int n) 
	{  
		System.out.print("\nnhap gia tri x can tim: ");
		int x = scanner.nextInt();
	    for(int i = 0; i < n; i++) 
	    { 
	        if(a[i] == x) 
	            return i; 
	    } 
	    return -1; 
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PP_TimKiemTuyenTinh ob = new PP_TimKiemTuyenTinh();
        Scanner scanner = new Scanner(System.in);
		System.out.print("nhap n phan tu: ");
		int n = scanner.nextInt();
		int a[] = new int[n];
		ob.NhapMang(n,a);
		System.out.print("\nvi tri cua x: " + ob.search(a,n)); 
	}

}
