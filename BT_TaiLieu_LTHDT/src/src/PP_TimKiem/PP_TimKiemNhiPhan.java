package PP_TimKiem;

import java.util.Scanner;

public class PP_TimKiemNhiPhan {

	public void NhapMang(int n,int a[]){
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<n; i++){
			System.out.print("\nnhap phan tu thu a["+i+"]: ");
			a[i]=scanner.nextInt();
		}
	}
	
	public void XuatMang(int n,int a[]){
		System.out.print("\nmang vua nhap la: ");
		for (int i=0; i<n; i++){
			System.out.print("\t "+a[i]);
		}
		System.out.print("\n ");
	}
	
	 // Trả về chỉ mục của x nếu nó có trong arr[l..r]
    // ngược lại trả về -1
	public int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // Nếu phần tử có ở chính giữa
            if (arr[mid] == x)
                return mid;

            // Nếu phần tử nhỏ hơn giữa, thì nó chỉ có thể
            // hiện diện trong mảng con bên trái
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Ngược lại, phần tử chỉ có thể có mặt
            // trong mảng con bên phải
            return binarySearch(arr, mid + 1, r, x);
        }

        // Nếu phầnt tử không có trong mảng
        return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PP_TimKiemNhiPhan ob = new PP_TimKiemNhiPhan();
        Scanner scanner = new Scanner(System.in);
		System.out.print("nhap n phan tu: ");
		int n = scanner.nextInt();
		int a[] = new int[n];
		ob.NhapMang(n,a);
		ob.XuatMang(n, a);
		System.out.print("\nnhap gia tri x can tim: ");
		int x = scanner.nextInt();
		System.out.print("\nvi tri cua x: " + ob.binarySearch(a, 0, n - 1,x)); 
	}

}
