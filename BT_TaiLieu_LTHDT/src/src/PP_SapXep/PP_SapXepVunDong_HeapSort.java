package PP_SapXep;

import java.util.Scanner;

public class PP_SapXepVunDong_HeapSort {

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
	
	// Để vun đống một cây con bắt nguồn từ nút i là
    // một chỉ mục trong arr[]. n là kích thước của Heap
    void heapify(int arr[], int n, int i) {
        int largest = i; // Khởi tạo largest như root
        int l = 2 * i; // left = 2*i
        int r = 2 * i + 1; // right = 2*i + 1

        // Nếu nút con bên trái lớn hơn nút con của gốc
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Nếu nút con bên phải lớn hơn largest
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Nếu largest không phải là root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Vun đống lại các cây con bị ảnh hưởng
            heapify(arr, n, largest);
        }
    }
    
    public void sort(int arr[],int n) {

        // Xây dựng Heap (sắp xếp lại mảng)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Trích xuất từng phần tử từ Heap
        for (int i = n - 1; i > 0; i--) {
            // Di chuyển root hiện tại đến end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // gọi max - heapify trên Heap đã sắp xếp
            heapify(arr, i, 0);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-

		PP_SapXepVunDong_HeapSort ob = new PP_SapXepVunDong_HeapSort();
        Scanner scanner = new Scanner(System.in);
		System.out.print("nhap n phan tu: ");
		int n = scanner.nextInt();
		int a[] = new int[n];
		ob.NhapMang(n,a);
		ob.sort(a,n);
		ob.XuatMang(n, a);
	}
/*link tham khảo
 * https://dnmtechs.com/thuat-toan-sap-xep-vun-dong-heap-sort/
 * https://niithanoi.edu.vn/heap-sort.html
 * */
}
