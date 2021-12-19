package com.daihocsaigon;

import java.util.Scanner;
import java.util.concurrent.Flow;

public class Main {

    public static void main(String[] args) {
        DANHSACHNHANVIEN danhsachnhanvien = new DANHSACHNHANVIEN();
        MARKETING marketing = new MARKETING();
        KETOAN ketoan = new KETOAN();
        HANHCHINH hanhchinh = new HANHCHINH();
        NHANSU nhansu = new NHANSU();
        KYTHUAT kythuat = new KYTHUAT();
        String maphongmarket[] = new String[100];
        String maphongketoan[] = new String[100];
        String maphonghanhchinh[] = new String[100];
        String maphongnhansu[] = new String[100];
        String maphongkythuat[] = new String[100];
        String hoten[] = new String[100];
        String manv[] = new String[100];
        String maphong[] = new String[100];
        String gioitinh[] = new String[100];
        String ngaysinh[] = new String[100];
        int tuoi[] = new int[100];
        int mucluong[] = new int[100];
        Scanner nhap = new Scanner(System.in);
        System.out.printf("Nhap vao so luong nhan vien ");
        int n = nhap.nextInt();
        String c = nhap.nextLine();
        for (int i = 0;i < n; i++)
        {
            int dem = 0;
            dem++;
            System.out.printf("-----------NHAN VIEN [%d]-----------\n" ,dem);
            System.out.printf("Nhap vao ho ten nhan vien  ");
            hoten[i] = danhsachnhanvien.HOTEN = nhap.nextLine();
            System.out.printf("Nhap vao ma so nhan vien  ");
            manv[i] = danhsachnhanvien.MANV = nhap.nextLine();
            System.out.printf("Nhap vao ma phong  ");
            maphong[i] = danhsachnhanvien.MAPHONG = nhap.nextLine();
            System.out.printf("Nhap vao gioi tinh  ");
            gioitinh[i] = danhsachnhanvien.GIOITINH = nhap.nextLine();
            System.out.printf("Nhap vao ngay sinh  ");
            ngaysinh[i] = danhsachnhanvien.NGAYSINH = nhap.nextLine();
            System.out.printf("Nhap vao tuoi  ");
            tuoi[i] = danhsachnhanvien.TUOI = nhap.nextInt();
            System.out.printf("Nhap vao muc luong  ");
            mucluong[i] = danhsachnhanvien.MUCLUONG = nhap.nextInt();
            String d = nhap.nextLine();
        }
        for (int i = 0;i < n;i++)
        {
            int dem = 0;
            dem++;
            System.out.printf("-------------DANH SACH NHAN VIEN ["+ dem +"]------------\n");
            System.out.printf("Ho ten nhan vien   ");
            System.out.printf(hoten[i] + "\n");
            System.out.printf("Ma so nhan vien   ");
            System.out.printf(manv[i] + "\n");
            System.out.printf("Ma phong   ");
            System.out.printf(maphong[i] + "\n");
            System.out.printf("Gioi tinh   ");
            System.out.printf(gioitinh[i] + "\n");
            System.out.printf("Ngay sinh   ");
            System.out.printf(ngaysinh[i] + "\n");
            System.out.printf("Tuoi nhan vien   ");
            System.out.printf(tuoi[i] + "\n");
            System.out.printf("Muc luong   ");
            System.out.printf(mucluong[i] + "\n");
        }
        System.out.println("--------Nhap vao thong tin phong MARKETING--------");
        System.out.printf("Nhap vao ma phong   ");
        maphongmarket[0] = marketing.MAPHONG = nhap.nextLine();
        marketing.thongtin();
        System.out.println("--------Nhap vao thong tin phong KETOAN--------");
        System.out.printf("Nhap vao ma phong    ");
        maphongketoan[0] = marketing.MAPHONG = nhap.nextLine();
        ketoan.thongtin();
        System.out.println("--------Nhap vao thong tin phong HANHCHINH--------");
        System.out.printf("Nhap vao ma phong    ");
        maphonghanhchinh[0] = hanhchinh.MAPHONG = nhap.nextLine();
        hanhchinh.thongtin();
        System.out.println("--------Nhap vao thong tin phong NHANSU--------");
        System.out.printf("Nhap vao ma phong    ");
        maphongnhansu[0] = nhansu.MAPHONG = nhap.nextLine();
        nhansu.thongtin();
        System.out.println("--------Nhap vao thong tin phong KYTHUAT--------");
        System.out.printf("Nhap vao ma phong    ");
        maphongkythuat[0] = kythuat.MAPHONG = nhap.nextLine();
        kythuat.thongtin();
        System.out.printf("Nhap vao ma phong can tim kiem   ");
        String timkiem = nhap.nextLine();
            if (maphongmarket[0].equals(timkiem) == true)
            {
                System.out.println("BAN DA TRUY CAP MA PHONG MARKETING");
            }
            if (maphongketoan[0].equals(timkiem) == true)
            {
            System.out.println("BAN DA TRUY CAP MA PHONG KETOAN");
            }
            if (maphonghanhchinh[0].equals(timkiem) == true)
            {
            System.out.println("BAN DA TRUY CAP MA PHONG HANHCHINH");
            }
            if (maphongnhansu[0].equals(timkiem) == true)
            {
            System.out.println("BAN DA TRUY CAP MA PHONG NHANSU");
            }
            if (maphongkythuat[0].equals(timkiem) == true)
            {
            System.out.println("BAN DA TRUY CAP MA PHONG KYTHUAT");
            }
    }
}
