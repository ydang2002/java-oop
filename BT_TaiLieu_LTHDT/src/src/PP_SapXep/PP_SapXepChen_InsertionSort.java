package PP_SapXep;

import java.util.Scanner;

public class PP_SapXepChen_InsertionSort {

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
	
	/* Hàm sắp xếp sử dụng thuật toán sắp xếp chèn */
	public void insertionSort(int a[], int n)
	{
	   int i, key, j;
	   for (i = 1; i < n; i++)
	   {
	       key = a[i];
	       j = i-1;
	 
	       /* Di chuyển các phần tử có giá trị lớn hơn giá trị 
	       key về sau một vị trí so với vị trí ban đầu
	       của nó */
	       while (j >= 0 && a[j] > key)
	       {
	           a[j+1] = a[j];
	           j = j-1;
	       }
	       a[j+1] = key;
	   }
	}
	
	/*Thuật toán sắp xếp chèn thực hiện sắp xếp dãy số theo cách duyệt từng phần tử và chèn từng phần tử đó vào đúng vị trí trong mảng con(dãy số từ đầu đến phần tử phía trước nó) đã sắp xếp sao cho dãy số trong mảng sắp đã xếp đó vẫn đảm bảo tính chất của một dãy số tăng dần.

1.Khởi tạo mảng với dãy con đã sắp xếp có k = 1 phần tử(phần tử đầu tiên, phần tử có chỉ số 0)
2.Duyệt từng phần tử từ phần tử thứ 2, tại mỗi lần duyệt phần tử ở chỉ số i thì đặt phần tử đó vào một vị trí nào đó trong đoạn từ [0…i] sao cho dãy số từ [0…i] vẫn đảm bảo tính chất dãy số tăng dần. Sau mỗi lần duyệt, số phần tử đã được sắp xếp k trong mảng tăng thêm 1 phần tử.
3.Lặp cho tới khi duyệt hết tất cả các phần tử của mảng.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PP_SapXepChen_InsertionSort ob = new PP_SapXepChen_InsertionSort();
        Scanner scanner = new Scanner(System.in);
		System.out.print("nhap n phan tu: ");
		int n = scanner.nextInt();
		int a[] = new int[n];
		ob.NhapMang(n,a);
		ob.insertionSort(a,n);
		ob.XuatMang(n, a);
	}
/* link tham khao
 * https://nguyenvanhieu.vn/thuat-toan-sap-xep-chen/*/
}
