package com.daihocsaigon;

import java.util.Scanner;

public class KETOAN {
    Scanner NHAP = new Scanner(System.in);
    public String MAPHONG;
    public int SOLUONG;
    public String TRUONGPHONG;
    public void thongtin()
    {
        System.out.printf("Nhap vao so luong nhan vien   ");
        int soluong = NHAP.nextInt();
        System.out.printf("Nhap vao ten truong phong   ");
        String truongphong = NHAP.nextLine();
        String e = NHAP.nextLine();
    }
}
