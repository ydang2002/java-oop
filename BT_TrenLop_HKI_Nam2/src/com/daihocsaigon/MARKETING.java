package com.daihocsaigon;

import java.util.Scanner;

public class MARKETING {
    Scanner NHAP = new Scanner(System.in);
    public String MAPHONG;
    public int SOLUONG;
    public String TRUONGPHONG;
    public void thongtin ()
    {
        System.out.printf("Nhap vao so luong nhan vien   ");
        int SOLUONG = NHAP.nextInt();
        System.out.printf("Nhap vao ten truong phong   ");
        String TRUONGPHONG = NHAP.nextLine();
        String e = NHAP.nextLine();
    }
}
