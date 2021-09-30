package PP_SapXep;

import java.util.Scanner;

public class PP_SapXepChon_SelectionSort {

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
	
	public void selectionSort(int arr[], int n)
	{
	    int i, j, min_idx;
	    // Di chuyển ranh giới của mảng đã sắp xếp và chưa sắp xếp
	    for (i = 0; i < n-1; i++)
	    {
	    // Tìm phần tử nhỏ nhất trong mảng chưa sắp xếp
	    min_idx = i;
	    for (j = i+1; j < n; j++)
	        if (arr[j] < arr[min_idx])
	        min_idx = j;
	 
	    // Đổi chỗ phần tử nhỏ nhất với phần tử đầu tiên
	        int temp = arr[min_idx];
	        arr[min_idx] = arr[i];
	        arr[i] = temp;
	    }
	}
	
	/*Thuật toán sắp xếp chọn sẽ sắp xếp một mảng bằng cách đi tìm phần tử có giá trị nhỏ nhất(giả sử với sắp xếp mảng tăng dần) trong đoạn đoạn chưa được sắp xếp và đổi cho phần tử nhỏ nhất đó với phần tử ở đầu đoạn chưa được sắp xếp(không phải đầu mảng). Thuật toán sẽ chia mảng làm 2 mảng con

1.Một mảng con đã được sắp xếp
2.Một mảng con chưa được sắp xếp
Tại mỗi bước lặp của thuật toán, phần tử nhỏ nhất ở mảng con chưa được sắp xếp sẽ được di chuyển về đoạn đã sắp xếp.

Ví dụ minh họa

arr[] = 62 24 15 22 1
 
// Tìm phần tử nhỏ nhất trong trong arr[0...4]
// và đổi chỗ nó với phần tử đầu tiên
[1] 24 15 22 62
 
// Tìm phần tử nhỏ nhất trong trong arr[1...4]
// và đổi chỗ nó với phần tử đầu tiên của arr[1...4]
1 [15] 24 22 62
 
// Tìm phần tử nhỏ nhất trong trong arr[2...4]
// và đổi chỗ nó với phần tử đầu tiên của arr[2...4]
1 15 [22] 24 62
 
// Tìm phần tử nhỏ nhất trong trong arr[3...4]
// và đổi chỗ nó với phần tử đầu tiên của arr[3...4]
11 12 22 [24] 62
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PP_SapXepChon_SelectionSort ob = new PP_SapXepChon_SelectionSort();
        Scanner scanner = new Scanner(System.in);
		System.out.print("nhap n phan tu: ");
		int n = scanner.nextInt();
		int a[] = new int[n];
		ob.NhapMang(n,a);
		ob.selectionSort(a,n);
		ob.XuatMang(n, a);
	}
/*link tham khảo
 * https://nguyenvanhieu.vn/thuat-toan-sap-xep-chon/*/
}
