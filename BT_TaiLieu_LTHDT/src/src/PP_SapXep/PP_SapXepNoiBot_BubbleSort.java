package PP_SapXep;

import java.util.Scanner;

public class PP_SapXepNoiBot_BubbleSort {
	
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
	
	void bubbleSort(int n, int a[]) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
        
                }
            }
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PP_SapXepNoiBot_BubbleSort b = new PP_SapXepNoiBot_BubbleSort();
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap n phan tu: ");
		int n = scanner.nextInt();
		int a[] = new int[n];
		b.NhapMang(n,a);
		b.bubbleSort(n,a);
		b.XuatMang(n,a);

	}
/*link tham khao
 * https://nguyenvanhieu.vn/thuat-toan-sap-xep-noi-bot/*/
}
