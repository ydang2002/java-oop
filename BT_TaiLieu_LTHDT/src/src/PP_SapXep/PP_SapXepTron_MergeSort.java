package PP_SapXep;

import java.util.Scanner;

public class PP_SapXepTron_MergeSort {
	
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
	// Merge hai mảng con của arr[].
    // Mảng con thứ nhất là arr[l..m]
    // Mảng con thứ hai là arr[m+1..r]
    public void merge(int arr[], int l, int m, int r) {

        // Tìm kích thước của 2 mảng con để merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Tạo mảng tạm
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy dữ liệu vào mảng tạm
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge các mảng tạm lại

        // Chỉ mục ban đầu của 2 mảng con
        int i = 0, j = 0;

        // Chỉ mục ban đầu của mảng phụ được hợp nhất
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Sao chép các phần tử còn lại của L[] nếu có
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Sao chép các phần tử còn lại của R[] nếu có
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    /*Cách hàm merge hoạt động khi gộp hai mảng con
Với trường hợp khi 2 mảng con chỉ có 1 phần tử, ta chỉ việc xem phần tử nào nhỏ hơn và đẩy lên đầu, phần tử còn lại đặt phía sau. Do vậy, các mảng con cần gộp lại có tính chất luôn được sắp tăng dần.

Giả sử ta có 2 mảng con lần lượt là:
arr1 = [1 9 10 10] , n1 = 4 // chiều dài của mảng con
arr2 = [3 5 7 9], n2 = 4
sort_arr = [] // Mảng lưu lại tiến trình gộp
Khởi tạo i = 0, j = 0 tương ứng là chỉ số bắt đầu của arr1 và arr2
Xét thấy arr1[i] < arr2[j] => chèn arr1[i] vào cuối mảng sort_arr, tăng i lên 1 đơn vị
=> sort_arr = [1], i = 1
Xét thấy arr1[i] > arr2[j] => chèn arr2[j] vào cuối mảng sort_arr, tăng j lên 1 đơn vị
=> sort_arr = [1, 3], i = 1, j = 1
Xét thấy arr1[i] > arr2[j] => chèn arr2[j] vào cuối mảng sort_arr, tăng j lên 1 đơn vị 
=> sort_arr = [1, 3, 5], i = 1, j = 2
Xét thấy arr1[i] > arr2[j] => chèn arr2[j] vào cuối mảng sort_arr, tăng j lên 1 đơn vị 
=> sort_arr = [1, 3, 5, 7], i = 1, j = 3
Xét thấy arr1[i] = arr2[j] => chèn arr1[i] hoặc arr2[j] vào cuối mảng sort_arr
Giả sử tôi chọn arr1, tăng i lên 1 đơn vị 
=> sort_arr = [1, 3, 5, 7, 9], i = 2, j = 3
Xét thấy arr1[i] > arr2[j] => chèn arr2[j] vào cuối mảng sort_arr, tăng j lên 1 đơn vị 
=> sort_arr = [1, 3, 5, 7, 9, 9], i = 1, j = 4
Do j >= n2, tiếp tục tăng i chừng nào i < n1 thi thêm phần tử ở arr1[i]ư vào sort_arr.
Sau cùng ta được mảng đã sắp xếp là sort_arr = [1, 3, 5, 7, 9, 9, 10, 10]*/

    public void sort(int arr[], int l, int r) {
        if (l < r) {

            // Tìm điểm chính giữa
            int m = (l + r) / 2;

            // Hàm đệ quy tiếp tục chia đôi
            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }
    
    /*mergeSort(arr[], l,  r)
If r > l
     1. Tìm chỉ số nằm giữa mảng để chia mảng thành 2 nửa:
             middle m = (l+r)/2
     2. Gọi đệ quy hàm mergeSort cho nửa đầu tiên:   
             mergeSort(arr, l, m)
     3. Gọi đệ quy hàm mergeSort cho nửa thứ hai:
             mergeSort(arr, m+1, r)
     4. Gộp 2 nửa mảng đã sắp xếp ở (2) và (3):
             merge(arr, l, m, r)*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        PP_SapXepTron_MergeSort ob = new PP_SapXepTron_MergeSort();
        Scanner scanner = new Scanner(System.in);
		System.out.print("nhap n phan tu: ");
		int n = scanner.nextInt();
		int a[] = new int[n];
		ob.NhapMang(n,a);
		ob.sort(a, 0, a.length - 1);
		ob.XuatMang(n, a);
	}
/*link tham khảo
 * https://nguyenvanhieu.vn/thuat-toan-sap-xep-merge-sort/*/
}
