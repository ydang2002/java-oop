package PP_SapXep;

import java.util.Scanner;

public class PP_SapXepNhanh_QuickSort {
	
	private static int low;
	private static int high;

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
	
	// ham de hoan doi gia tri
    public void swap(int a[], int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    
    public int partition (int a[], int low, int high)
    {
        int pivot = a[high];    // pivot
        int left = low;
        int right = high - 1;
        while(true){
            while(left <= right && a[left] < pivot) left++; // Tìm phần tử >= arr[pivot]
            while(right >= left && a[right] > pivot) right--; // Tìm phần tử <= arr[pivot]
            if (left >= right)  break;// Đã duyệt xong thì thoát vòng lặp
            int temp = a[left];  // Nếu chưa xong, đổi chỗ.
            	a[left] = a[right];
            	a[right] = temp;
            
            left++; // Vì left hiện tại đã xét, nên cần tăng
            right--; // Vì right hiện tại đã xét, nên cần giảm
        }
        int temp = a[left];  
    	a[left] = a[high];
    	a[high] = temp;
        return left; // Trả về chỉ số sẽ dùng để chia đổi mảng
    }
    
    /*Ví dụ cho quá trình phân đoạn
     arr[] = {10, 80, 30, 90, 40, 50, 70}
Indexes:  0   1   2   3   4   5   6 
 
pivot = 6, left = 0, right = 5
 
arr[left] = 10 < arr[pivot] = 70 và left <= right, left = 1
arr[left] = 80 > arr[pivot] = 70, tạm dừng
 
arr[right] = 50 < arr[pivot] = 70, tạm dừng
 
Do left < right, đổi chỗ arr[left], arr[right]
arr[] = {10, 50, 30, 90, 40, 80, 70}
left = 2, right = 4
 
arr[left] = 30 < arr[pivot] = 70 và left <= right, left = 3
arr[left] = 90 > arr[pivot] = 70, tạm dừng
 
arr[right] = 40 < arr[pivot] = 70, tạm dừng
 
Do left < right, đổi chỗ arr[left], arr[right]
arr[] = {10, 50, 30, 40, 90, 80, 70}
left = 4, right = 3
 
// Do left >= right
arr[] = {10, 50, 30, 40, 70, 80, 90}.  // Đổi chỗ arr[left] và arr[pivot]
 
Bây giờ, 70 đã nằm đúng vị trí, các phần từ <= 70 nằm phía trước và lớn hơn 70 nằm phía sau.
     */
    
    public void quickSort(int a[], int low, int high)
    {
        if (low < high)
        {
            /* pi là chỉ số nơi phần tử này đã đứng đúng vị trí
             và là phần tử chia mảng làm 2 mảng con trái & phải */
            int pi = partition(a, low, high);
     
            // Gọi đệ quy sắp xếp 2 mảng con trái và phải
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }
    
    /*Quy trình của thuật toán sắp xếp quick sort
Bước 1: Lấy phần tử chốt là phần tử ở cuối danh sách.
Bước 2: Chia mảng theo phần tử chốt.
Bước 3: Sử dụng sắp xếp nhanh một cách đệ qui với mảng con bên trái.
Bước 4: Sử dụng sắp xếp nhanh một cách đệ qui với mảng con bên phải.*/
    
    
    
    
    
    
	//đoạn code trong Tài liệu lập trình hướng đối tượng
    /*private void quickSort(int a[], int left, int righ) {
    	int i = left, j = righ;
    	int pivot = (left + righ) / 2, temp;
    	do {
    		while(a[i] < a[pivot] && i < righ) i++; //quét xuôi
    		while(a[j] > a[pivot] && j > left) j++; //quét ngược
    		if(i <= j) {
    			temp = a[i];
    			a[i] = a[j];
    			a[j] = temp;
    		}
    	}while(i <= j);
    	if(left < j) {
    		quickSort(a, left, j);//Sắp xếp đoạn trước chốt
    	}
    	if(i < righ) {
    		quickSort(a, i, righ);//sắp xếp đoạn sau chốt
    	}
    }*/
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		PP_SapXepNhanh_QuickSort b = new PP_SapXepNhanh_QuickSort();
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap n phan tu: ");
		int n = scanner.nextInt();
		int a[] = new int[n];
		b.NhapMang(n,a);
		b.quickSort(a, 0, a.length - 1);
		b.XuatMang(n,a);
		
	}

}
