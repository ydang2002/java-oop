package myproject;

public class Options {
    static InfoStaff staff = new InfoStaff();
    static Department dpm = new Department();
    static String input;

    static void Start() {
        staff.readInfoStaff();
        dpm.readInfoDepartment();
        System.out.print("\n\t\t-----Staff Management Tool-----\n"
                + "\t1. In danh sach tat ca cac nhan vien, phong ban trong cong ty\n"
                + "\t2. In danh sach nhan vien theo yeu cau\n" + "\t3. Sap xep theo yeu cau\n"
                + "\t4. Them thong tin nhan vien\n" + "\t5. Sua thong tin nhan vien\n"
                + "\t6. Xoa thong tin nhan vien\n" + "\t7. Tim kiem thong tin nhan vien\n" + "\t0. Thoat\n");
        System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
        Main.input[0] = Keyboard.sc.nextLine();
        while (Integer.parseInt(Main.input[0]) < 0 || Integer.parseInt(Main.input[0]) > 9) {
            System.out.println("\tBan da nhap sai. Vui long nhap lai!!!");
            System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
            Main.input[0] = Keyboard.sc.nextLine();
        }
        checkInput(Main.input[0]);
    }

    static void Start_bonus() {
        System.out.print("\n\t\t-----Staff Management Tool-----\n"
                + "\t1. In danh sach tat ca cac nhan vien, phong ban trong cong ty\n"
                + "\t2. In danh sach nhan vien theo yeu cau\n" + "\t3. Sap xep theo yeu cau\n"
                + "\t4. Them thong tin nhan vien\n" + "\t5. Sua thong tin nhan vien\n"
                + "\t6. Xoa thong tin nhan vien\n" + "\t7. Tim kiem thong tin nhan vien\n" + "\t0. Thoat\n");
        System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
        Main.input[0] = Keyboard.sc.nextLine();
        while (Integer.parseInt(Main.input[0]) < 0 || Integer.parseInt(Main.input[0]) > 9) {
            System.out.println("\tBan da nhap sai. Vui long nhap lai!!!");
            System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
            Main.input[0] = Keyboard.sc.nextLine();
        }
        checkInput(Main.input[0]);
    }

    private static void checkInput(String idOptions) {
        if (Integer.parseInt(Main.input[0]) == 2 && Integer.parseInt(Main.input[1]) == 1
                && Integer.parseInt(Main.input[2]) != -1) {
            switch (idOptions) {
                case ("1"):
                case ("2"):
                case ("3"):
                case ("4"):
                case ("5"):
                    staff.getInfoByDepartment(Main.input[2]);
                    Main.input[2] = "-1";
                    printOption2_1();
                    break;
                case ("9"):
                    Main.input[1] = "-1";
                    Main.input[2] = "-1";
                    printOption2();
                    break;
            }
        }
        if (Integer.parseInt(Main.input[0]) == 2 && Integer.parseInt(Main.input[1]) == 2
                && Integer.parseInt(Main.input[2]) != -1) {
            switch (idOptions) {
                case ("1"):
                case ("2"):
                case ("3"):
                    staff.getInfoByAge(Main.input[2]);
                    Main.input[1] = "-1";
                    Main.input[2] = "-1";
                    printOption2();
                    break;
                case ("9"):
                    Main.input[1] = "-1";
                    Main.input[2] = "-1";
                    printOption2();
                    break;
            }
        }
        if (Integer.parseInt(Main.input[0]) == 2 && Integer.parseInt(Main.input[1]) == 3
                && Integer.parseInt(Main.input[2]) != -1) {
            switch (idOptions) {
                case ("1"):
                case ("2"):
                case ("3"):
                    staff.getInfoByGender(Main.input[2]);
                    Main.input[2] = "-1";
                    printOption2_3();
                    break;
                case ("9"):
                    Main.input[1] = "-1";
                    Main.input[2] = "-1";
                    printOption2();
                    break;
            }
        }
        if (Integer.parseInt(Main.input[0]) == 2 && Integer.parseInt(Main.input[1]) == 4
                && Integer.parseInt(Main.input[2]) != -1) {
            switch (idOptions) {
                case ("1"):
                case ("2"):
                case ("3"):
                    staff.getInfoBySalary(Main.input[2]);
                    Main.input[1] = "-1";
                    Main.input[2] = "-1";
                    printOption2();
                    break;
                case ("9"):
                    Main.input[1] = "-1";
                    Main.input[2] = "-1";
                    printOption2();
                    break;
            }
        }
        if (Integer.parseInt(Main.input[0]) == 3 && Integer.parseInt(Main.input[1]) == 1
                && Integer.parseInt(Main.input[2]) != -1) {
            switch (idOptions) {
                case ("1"):
                case ("2"):
                    staff.sortDataByAge(Main.input[2]);
                    Main.input[2] = "-1";
                    printOption3_1();
                    break;
                case ("9"):
                    Main.input[1] = "-1";
                    Main.input[2] = "-1";
                    printOption3();
                    break;
            }
        }
        if (Integer.parseInt(Main.input[0]) == 3 && Integer.parseInt(Main.input[1]) == 2
                && Integer.parseInt(Main.input[2]) != -1) {
            switch (idOptions) {
                case ("1"):
                case ("2"):
                    staff.sortDataBySalary(Main.input[2]);
                    Main.input[2] = "-1";
                    printOption3_2();
                    break;
                case ("9"):
                    Main.input[1] = "-1";
                    Main.input[2] = "-1";
                    printOption3();
                    break;
            }
        } else {
            switch (idOptions) {
                case ("1"):
                    if (Integer.parseInt(Main.input[0]) == 1 && Integer.parseInt(Main.input[1]) == -1) {
                        Main.input[1] = "-1";
                        printOption1();
                    }
                    if (Integer.parseInt(Main.input[0]) == 1 && Integer.parseInt(Main.input[1]) == 1) {
                        Main.input[1] = "-1";
                        staff.writeInfoStaff();
                        printOption1();
                    }
                    if (Integer.parseInt(Main.input[0]) == 2 && Integer.parseInt(Main.input[1]) == 1) {
                        printOption2_1();
                    }
                    if (Integer.parseInt(Main.input[0]) == 3 && Integer.parseInt(Main.input[1]) == 1) {
                        printOption3_1();
                    }
                    if (Integer.parseInt(Main.input[0]) == 4) {
                        Main.input[1] = "-1";
                        Staff.add1Staff();
                        System.out.println("\n\tBan da them thong tin cua 1 nhan vien!!!");
                        printOption4();
                    }
                    if (Integer.parseInt(Main.input[0]) == 5) {
                        Main.input[1] = "-1";
                        System.out.print("\n\tNhap ma nhan vien cua nhan vien ma ban muon sua thong tin: ");
                        Staff.changeInfoStaff();
                        System.out.println("\n\tBan da sua thong tin cua 1 nhan vien!!!");
                        printOption5();
                    }
                    if (Integer.parseInt(Main.input[0]) == 6) {
                        Main.input[1] = "-1";
                        System.out.print("\n\tNhap ma nhan vien cua nhan vien ma ban muon xoa thong tin: ");
                        Staff.remove1Staff();
                        System.out.println("\n\tBan da xoa thong tin cua 1 nhan vien!!!");
                        printOption6();
                    }
                    break;
                case ("2"):
                    if (Integer.parseInt(Main.input[0]) == 1) {
                        Main.input[1] = "-1";
                        dpm.printInfoDepartment(dpm.list);
                        printOption1();
                    }
                    if (Integer.parseInt(Main.input[0]) == 2 && Integer.parseInt(Main.input[1]) == -1) {
                        Main.input[1] = "-1";
                        printOption2();
                    }
                    if (Integer.parseInt(Main.input[0]) == 2 && Integer.parseInt(Main.input[1]) == 2
                            && Integer.parseInt(Main.input[2]) == -1) {
                        String age;
                        System.out.println("\n\tIn danh sach nhan vien theo do tuoi cho truoc: ");
                        System.out.print("\tMoi ban nhap vao do tuoi cho truoc: ");
                        age = Keyboard.sc.nextLine();
                        while (Integer.parseInt(age) < 18 || Integer.parseInt(age) > 80) {
                            System.out.print(
                                    "\n\tTuoi nhan vien phai tu 18 den 80!!!\n" + "\tXin moi ban nhap lai so tuoi: ");
                            age = Keyboard.sc.nextLine();
                        }
                        input = age;
                        printOption2_2(age);
                    }
                    if (Integer.parseInt(Main.input[0]) == 3 && Integer.parseInt(Main.input[1]) == 2) {
                        printOption3_2();
                    }
                    if (Integer.parseInt(Main.input[0]) == 4) {
                        Main.input[1] = "-1";
                        Staff.addStaffs();
                        printOption4();
                    }
                    if (Integer.parseInt(Main.input[0]) == 6) {
                        Main.input[1] = "-1";
                        Staff.removeStaffs();
                        printOption6();
                    }
                    break;
                case ("3"):
                    if (Integer.parseInt(Main.input[0]) == 2 && Integer.parseInt(Main.input[1]) == 3) {
                        printOption2_3();
                    }
                    if (Integer.parseInt(Main.input[0]) == 3 && Integer.parseInt(Main.input[1]) == -1) {
                        printOption3();
                    }
                    break;
                case ("4"):
                    if (Integer.parseInt(Main.input[0]) == 4) {
                        Main.input[1] = "-1";
                        printOption4();
                    }
                    if (Integer.parseInt(Main.input[0]) == 2 && Integer.parseInt(Main.input[1]) == 4
                            && Integer.parseInt(Main.input[2]) == -1) {
                        String salary;
                        System.out.println("\n\tIn danh sach nhan vien theo muc luong cho truoc: ");
                        System.out.print("\tMoi ban nhap vao muc luong cho truoc: ");
                        salary = Keyboard.sc.nextLine();
                        while (Float.parseFloat(salary) < 1000) {
                            System.out.print("\n\tLuong nhan vien toi thieu la $1000!!!\n"
                                    + "\tXin moi ban nhap lai muc luong: ");
                            salary = Keyboard.sc.nextLine();
                        }
                        input = salary;
                        printOption2_4(salary);
                    }
                    break;
                case ("5"):
                    if (Integer.parseInt(Main.input[0]) == 5) {
                        Main.input[1] = "-1";
                        printOption5();
                    }
                    break;
                case ("6"):
                    if (Integer.parseInt(Main.input[0]) == 6) {
                        Main.input[1] = "-1";
                        printOption6();
                    }
                    break;
                case ("7"):
                    if (Integer.parseInt(Main.input[0]) == 7) {
                        Main.input[1] = "-1";
                        Staff.printInfoStaff();
                    }
                    break;
                case ("9"):
                    switch (Integer.parseInt(Main.input[0])) {
                        case (1):
                        case (2):
                        case (3):
                        case (4):
                        case (5):
                        case (6):
                        case (7):
                            Main.input[1] = "-1";
                            Start_bonus();
                            break;
                    }
                    break;
                case ("0"):
                    System.exit(0);
            }
        }
    }

    private static void printOption1() {
        System.out
                .println("\n\tIn danh sach thong tin theo yeu cau:");
        System.out.println("\t1. In danh sach thong tin cua tat ca cac nhan vien trong cong ty");
        System.out.println("\t2. In danh sach thong tin cua cac phong ban trong cong ty");
        System.out.println("\t9. Back\n" + "\t0. Exit");
        System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
        Main.input[1] = Keyboard.sc.nextLine();
        while (Integer.parseInt(Main.input[1]) != 1 && Integer.parseInt(Main.input[1]) != 2
                && Integer.parseInt(Main.input[1]) != 0 && Integer.parseInt(Main.input[1]) != 9) {
            System.out.println("\tBan da nhap sai. Vui long nhap lai!!!");
            System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
            Main.input[1] = Keyboard.sc.nextLine();
        }
        checkInput(Main.input[1]);
    }

    private static void printOption2() {
        System.out.println("\n\tIn danh sach nhan vien theo yeu cau:");
        System.out.println("\t1. In danh sach nhan vien theo tung phong ban");
        System.out.println("\t2. In danh sach nhan vien theo tuoi");
        System.out.println("\t3. In danh sach nhan vien theo gioi tinh");
        System.out.println("\t4. In danh sach nhan vien theo muc luong");
        System.out.println("\t9. Back\n" + "\t0. Exit");
        System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
        Main.input[1] = Keyboard.sc.nextLine();
        while (Integer.parseInt(Main.input[1]) != 1 && Integer.parseInt(Main.input[1]) != 2 &&
                Integer.parseInt(Main.input[1]) != 3 && Integer.parseInt(Main.input[1]) != 4
                && Integer.parseInt(Main.input[1]) != 0 && Integer.parseInt(Main.input[1]) != 9) {
            System.out.println("\tBan da nhap sai. Vui long nhap lai!!!");
            System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
            Main.input[1] = Keyboard.sc.nextLine();
        }
        checkInput(Main.input[1]);
    }

    static void printOption2_1() {
        System.out.println("\n\tIn danh sach nhan vien theo phong ban: ");
        System.out.println("\t1. Phong marketing (MKT)");
        System.out.println("\t2. Phong ke toan (KTN)");
        System.out.println("\t3. Phong hanh chinh (HCH)");
        System.out.println("\t4. Phong nhan su (NHS)");
        System.out.println("\t5. Phong ky thuat (KTH)");
        System.out.println("\t9. Back\n" + "\t0. Exit");
        System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
        Main.input[2] = Keyboard.sc.nextLine();
        while (Integer.parseInt(Main.input[2]) != 1 && Integer.parseInt(Main.input[2]) != 2 &&
                Integer.parseInt(Main.input[2]) != 3 && Integer.parseInt(Main.input[2]) != 4
                && Integer.parseInt(Main.input[2]) != 5 && Integer.parseInt(Main.input[2]) != 0
                && Integer.parseInt(Main.input[2]) != 9) {
            System.out.println("\tBan da nhap sai. Vui long nhap lai!!!");
            System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
            Main.input[2] = Keyboard.sc.nextLine();
        }
        checkInput(Main.input[2]);
    }

    private static void printOption2_2(String age) {
        System.out.println("\t1. Nhan vien bang " + age + " tuoi");
        System.out.println("\t2. Nhan vien lon hon " + age + " tuoi");
        System.out.println("\t3. Nhan vien nho hon " + age + " tuoi");
        System.out.println("\t9. Back\n" + "\t0. Exit");
        System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
        Main.input[2] = Keyboard.sc.nextLine();
        while (Integer.parseInt(Main.input[2]) != 1 && Integer.parseInt(Main.input[2]) != 2 &&
                Integer.parseInt(Main.input[2]) != 3 && Integer.parseInt(Main.input[2]) != 0
                && Integer.parseInt(Main.input[2]) != 9) {
            System.out.println("\tBan da nhap sai. Vui long nhap lai!!!");
            System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
            Main.input[2] = Keyboard.sc.nextLine();
        }
        checkInput(Main.input[2]);
    }

    private static void printOption2_3() {
        System.out.println("\n\tIn danh sach sinh vien theo gioi tính:");
        System.out.println("\t1. Nam");
        System.out.println("\t2. Nu");
        System.out.println("\t9. Back\n" + "\t0. Exit");
        System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
        Main.input[2] = Keyboard.sc.nextLine();
        while (Integer.parseInt(Main.input[2]) != 1 && Integer.parseInt(Main.input[2]) != 2
                && Integer.parseInt(Main.input[2]) != 0 && Integer.parseInt(Main.input[2]) != 9) {
            System.out.println("\tBan da nhap sai. Vui long nhap lai!!!");
            System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
            Main.input[2] = Keyboard.sc.nextLine();
        }
        checkInput(Main.input[2]);
    }

    private static void printOption2_4(String salary) {
        System.out.println("\t1. Nhan vien co muc luong " + salary);
        System.out.println("\t2. Nhan vien co muc luong lon hon " + salary);
        System.out.println("\t3. Nhan vien co muc luong nho hon " + salary);
        System.out.println("\t9. Back\n" + "\t0. Exit");
        System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
        Main.input[2] = Keyboard.sc.nextLine();
        while (Integer.parseInt(Main.input[2]) != 1 && Integer.parseInt(Main.input[2]) != 2 &&
                Integer.parseInt(Main.input[2]) != 3 && Integer.parseInt(Main.input[2]) != 0
                && Integer.parseInt(Main.input[2]) != 9) {
            System.out.println("\tBan da nhap sai. Vui long nhap lai!!!");
            System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
            Main.input[2] = Keyboard.sc.nextLine();
        }
        checkInput(Main.input[2]);
    }

    static void printOption3() {
        System.out.println("\n\tSap xep danh sach nhan vien theo yeu cau:");
        System.out.println("\t1. Theo do tuoi");
        System.out.println("\t2. Theo muc luong");
        System.out.println("\t9. Back\n" + "\t0. Exit");
        System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
        Main.input[1] = Keyboard.sc.nextLine();
        while (Integer.parseInt(Main.input[1]) != 1 && Integer.parseInt(Main.input[1]) != 2
                && Integer.parseInt(Main.input[1]) != 0 && Integer.parseInt(Main.input[1]) != 9) {
            System.out.println("\tBan da nhap sai. Vui long nhap lai!!!");
            System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
            Main.input[1] = Keyboard.sc.nextLine();
        }
        checkInput(Main.input[1]);
    }

    static void printOption3_1() {
        System.out.println("\n\tSap xep danh sach nhan vien theo do tuoi:");
        System.out.println("\t1. Tang dan");
        System.out.println("\t2. Giam dan");
        System.out.println("\t9. Back\n" + "\t0. Exit");
        System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
        Main.input[2] = Keyboard.sc.nextLine();
        while (Integer.parseInt(Main.input[2]) != 1 && Integer.parseInt(Main.input[2]) != 2
                && Integer.parseInt(Main.input[2]) != 0 && Integer.parseInt(Main.input[2]) != 9) {
            System.out.println("\tBan da nhap sai. Vui long nhap lai!!!");
            System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
            Main.input[2] = Keyboard.sc.nextLine();
        }
        checkInput(Main.input[2]);
    }

    static void printOption3_2() {
        System.out.println("\n\tSap xep danh sach nhan vien theo muc luong:");
        System.out.println("\t1. Tang dan");
        System.out.println("\t2. Giam dan");
        System.out.println("\t9. Back\n" + "\t0. Exit");
        System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
        Main.input[2] = Keyboard.sc.nextLine();
        while (Integer.parseInt(Main.input[2]) != 1 && Integer.parseInt(Main.input[2]) != 2
                && Integer.parseInt(Main.input[2]) != 0 && Integer.parseInt(Main.input[2]) != 9) {
            System.out.println("\tBan da nhap sai. Vui long nhap lai!!!");
            System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
            Main.input[2] = Keyboard.sc.nextLine();
        }
        checkInput(Main.input[2]);
    }

    static void printOption4() {
        System.out.print("\n\tThem nhan vien theo yeu cau:\n" + "\t1. Them thong tin cua 1 nhan vien\n"
                + "\t2. Them thong tin cua mot so nhan vien\n" + "\t9. Back\n" + "\t0. Exit\n");
        System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
        Main.input[1] = Keyboard.sc.nextLine();
        while (Integer.parseInt(Main.input[1]) != 0 && Integer.parseInt(Main.input[1]) != 9
                && Integer.parseInt(Main.input[1]) != 1 && Integer.parseInt(Main.input[1]) != 2) {
            System.out.println("\tBan da nhap sai. Vui long nhap lai!!!");
            System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
            Main.input[1] = Keyboard.sc.nextLine();
        }
        checkInput(Main.input[1]);
    }

    private static void printOption5() {
        System.out.print("\n\t1. Sua thong tin cua 1 nhan vien theo ma nhan vien\n"
                + "\t9. Back\n" + "\t0. Exit\n");
        System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
        Main.input[1] = Keyboard.sc.nextLine();
        while (Integer.parseInt(Main.input[1]) != 1
                && Integer.parseInt(Main.input[1]) != 9 && Integer.parseInt(Main.input[1]) != 0) {
            System.out.println("\tBan da nhap sai. Vui long nhap lai!!!");
            System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
            Main.input[1] = Keyboard.sc.nextLine();
        }
        checkInput(Main.input[1]);
    }

    static void printOption6() {
        System.out.print("\n\tXoa nhan vien theo yeu cau:\n" + "\t1. Xoa thong tin cua 1 nhan vien\n"
                + "\t2. Xoa thong tin cua mot so nhan vien\n" + "\t9. Back\n" + "\t0. Exit\n");
        System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
        Main.input[1] = Keyboard.sc.nextLine();
        while (Integer.parseInt(Main.input[1]) != 0 && Integer.parseInt(Main.input[1]) != 1
                && Integer.parseInt(Main.input[1]) != 2 && Integer.parseInt(Main.input[1]) != 9) {
            System.out.println("\tBan da nhap sai. Vui long nhap lai!!!");
            System.out.print("\tNhap vao lua chon cua ban roi nhan Enter: ");
            Main.input[1] = Keyboard.sc.nextLine();
        }
        checkInput(Main.input[1]);
    }
}
