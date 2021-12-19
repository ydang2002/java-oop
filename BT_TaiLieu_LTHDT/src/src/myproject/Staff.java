package myproject;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Staff {

    static void add1Staff() {
        ListStaff Staff = new ListStaff();

        System.out.print("\tNhap ho ten cua nhan vien: ");
        Staff.name = Keyboard.sc.nextLine();
        Staff.setName(checkName(Staff.name));
        System.out.print("\tNhap ma phong ban cua nhan vien: ");
        Staff.departmentID = Keyboard.sc.nextLine();
        Staff.setDepartmentID(checkDepartmentID(Staff.departmentID));
        System.out.print("\tNhap so thu tu nhan vien trong phong ban: ");
        Staff.ID = Keyboard.sc.nextLine();
        Staff.setID(checkID(Staff.ID, Staff.departmentID));
        System.out.print("\tNhap so tuoi cua nhan vien: ");
        String temp = Keyboard.sc.nextLine();
        Staff.age = Integer.parseInt(temp);
        Staff.setAge(checkAge(Staff.age));
        System.out.print("\tNhap ngay sinh cua nhan vien: ");
        Staff.birthday = Keyboard.sc.nextLine();
        Staff.setBirthday(checkBirthday(Staff.birthday));
        System.out.print("\tNhap gioi tinh cua nhan vien: ");
        Staff.gender = Keyboard.sc.nextLine();
        Staff.setGender(checkGender(Staff.gender));
        System.out.print("\tNhap muc luong cua nhan vien: ");
        String temp2 = Keyboard.sc.nextLine();
        Staff.salary = Float.parseFloat(temp2);
        Staff.setSalary(checkSalary(Staff.salary));
        ListStaff.addNewStaff(Staff.name, Staff.ID, Staff.departmentID, Staff.age, Staff.birthday, Staff.gender,
                Staff.salary);
    }

    static void addStaffs() {
        String temp;
        int count;
        System.out.print("\n\tNhap 0 neu muon dung viec them nhieu nhan vien!!!"
                + "\n\tVui long nhap so luong nhan vien muon them: ");
        temp = Keyboard.sc.nextLine();
        count = Integer.parseInt(temp);
        if (count == 0) {
            Options.printOption4();
        }
        while (count < 0) {
            System.out
                    .print("\n\tBan da nhap sai so luong!!!\n" + "\tVui long nhap lai so luong nhan vien muon them: ");
            count = Keyboard.sc.nextInt();
        }
        for (int i = 1; i <= count; ++i) {
            System.out.println("\n\tNhap thong tin cua nhan vien thu " + i);
            add1Staff();
        }
        System.out.println("\n\tBan da them " + count + " nhan vien moi!!!");
    }

    static void changeInfoStaff() {
        String ID;
        System.out.print("\n\tVui long nhap ma nhan vien muon sua: ");
        ID = Keyboard.sc.nextLine();
        ID = ID.toUpperCase();
        
        ListStaff Staff = new ListStaff();
        Staff.ID = checkIDs(ID);
        Staff.setID(Staff.ID);
        Staff.setDepartmentID(ListStaff.separateID(Staff.ID));
        System.out.print("\tNhap ho ten cua nhan vien: ");
        Staff.name = Keyboard.sc.nextLine();
        Staff.setName(checkName(Staff.name));
        System.out.print("\tNhap so tuoi cua nhan vien: ");
        String temp = Keyboard.sc.nextLine();
        Staff.age = Integer.parseInt(temp);
        Staff.setAge(checkAge(Staff.age));
        System.out.print("\tNhap ngay sinh cua nhan vien: ");
        Staff.birthday = Keyboard.sc.nextLine();
        Staff.setBirthday(checkBirthday(Staff.birthday));
        System.out.print("\tNhap gioi tinh cua nhan vien: ");
        Staff.gender = Keyboard.sc.nextLine();
        Staff.setGender(checkGender(Staff.gender));
        System.out.print("\tNhap muc luong cua nhan vien: ");
        String temp2 = Keyboard.sc.nextLine();
        Staff.salary = Float.parseFloat(temp2);
        Staff.setSalary(checkSalary(Staff.salary));

        for (int i = 0; i < Main.listStaff.size(); ++i)
            if (Main.listStaff.get(i).ID.equals(Staff.ID)) {
                Main.listStaff.set(i, Staff);
            }
        switch (ListStaff.separateID(ID)) {
            case "MKT":
                for (int i = 0; i < Main.MKT.size(); ++i)
                    if (Main.MKT.get(i).ID.equals(Staff.ID))
                        Main.MKT.set(i, Staff);
                break;
            case "KTN":
                for (int i = 0; i < Main.KTN.size(); ++i)
                    if (Main.KTN.get(i).ID.equals(Staff.ID))
                        Main.KTN.set(i, Staff);
                break;
            case "HCH":
                for (int i = 0; i < Main.HCH.size(); ++i)
                    if (Main.HCH.get(i).ID.equals(Staff.ID))
                        Main.HCH.set(i, Staff);
                break;
            case "NHS":
                for (int i = 0; i < Main.NHS.size(); ++i)
                    if (Main.NHS.get(i).ID.equals(Staff.ID))
                        Main.NHS.set(i, Staff);
                break;
            case "KTH":
                for (int i = 0; i < Main.KTH.size(); ++i)
                    if (Main.KTH.get(i).ID.equals(Staff.ID))
                        Main.KTH.set(i, Staff);
                break;
        }
    }

    static void remove1Staff() {
        String ID;
        ID = Keyboard.sc.nextLine();
        ID = checkIDs(ID);
        for (int i = 0; i < Main.listStaff.size(); ++i)
            if (Main.listStaff.get(i).ID.equals(ID))
                Main.listStaff.remove(i);
        switch (ListStaff.separateID(ID)) {
            case "MKT":
                for (int i = 0; i < Main.MKT.size(); ++i)
                    if (Main.MKT.get(i).ID.equals(ID))
                        Main.MKT.remove(i);
                break;
            case "KTN":
                for (int i = 0; i < Main.KTN.size(); ++i)
                    if (Main.KTN.get(i).ID.equals(ID))
                        Main.KTN.remove(i);
                break;
            case "HCH":
                for (int i = 0; i < Main.HCH.size(); ++i)
                    if (Main.HCH.get(i).ID.equals(ID))
                        Main.HCH.remove(i);
                break;
            case "NHS":
                for (int i = 0; i < Main.NHS.size(); ++i)
                    if (Main.NHS.get(i).ID.equals(ID))
                        Main.NHS.remove(i);
                break;
            case "KTH":
                for (int i = 0; i < Main.KTH.size(); ++i)
                    if (Main.KTH.get(i).ID.equals(ID))
                        Main.KTH.remove(i);
                break;
        }
    }

    static void removeStaffs() {
        String temp;
        System.out.print("\n\tNhap 0 neu muon dung viec xoa nhieu nhan vien!!!"
                + "\n\tVui long nhap so luong nhan vien muon xoa: ");
        temp = Keyboard.sc.nextLine();
        int count = Integer.parseInt(temp);
        if (count == 0) {
            Options.printOption6();
        }
        while (count < 0) {
            System.out
                    .print("\n\tBan da nhap sai so luong!!!\n" + "\tVui long nhap lai so luong nhan vien muon them: ");
            temp = Keyboard.sc.nextLine();
            count = Integer.parseInt(temp);
        }
        for (int i = 1; i <= count; ++i) {
            System.out.print("\tNhap ma nhan vien nhan vien thu " + i + " ma ban muon xoa: ");
            remove1Staff();
        }
        System.out.println("\n\tBan da xoa " + count + " nhan vien !!!");
    }

    static void printInfoStaff() {
        System.out.print("\n\tNhap ma nhan vien can tim kiem thong tin: ");
        String ID = Keyboard.sc.nextLine();
        ID = checkIDs(ID);
        for (int i = 0; i < Main.listStaff.size(); ++i)
            if (Main.listStaff.get(i).ID.equals(ID))
            {
                System.out.println("\n\tThong tin cua nhan vien: ");
                System.out.println("\tTen nhan vien: " + Main.listStaff.get(i).name);
                System.out.println("\tMa nhan vien: " + Main.listStaff.get(i).ID);
                System.out.println("\tMa phong ban: " + Main.listStaff.get(i).departmentID);
                System.out.println("\tTuoi: " + Main.listStaff.get(i).age);
                System.out.println("\tNgay thang nam sinh: " + Main.listStaff.get(i).birthday);
                System.out.println("\tGioi tinh: " + Main.listStaff.get(i).gender);
                System.out.println("\tLuong nhan vien: " + Main.listStaff.get(i).salary);
            }
        Options.Start();
    }

    private static String checkIDs(String ID) {
        boolean hasStaff = false;
        ID = ID.toUpperCase();
        switch (ListStaff.separateID(ID)) {
            case "MKT":
                for (int i = 0; i < Main.MKT.size(); ++i)
                    if (Main.MKT.get(i).ID.equals(ID))
                        hasStaff = true;
                break;
            case "KTN":
                for (int i = 0; i < Main.KTN.size(); ++i)
                    if (Main.KTN.get(i).ID.equals(ID))
                        hasStaff = true;
                break;
            case "HCH":
                for (int i = 0; i < Main.HCH.size(); ++i)
                    if (Main.HCH.get(i).ID.equals(ID))
                        hasStaff = true;
                break;
            case "NHS":
                for (int i = 0; i < Main.MKT.size(); ++i)
                    if (Main.MKT.get(i).ID.equals(ID))
                        hasStaff = true;
                break;
            case "KTH":
                for (int i = 0; i < Main.KTH.size(); ++i)
                    if (Main.KTH.get(i).ID.equals(ID))
                        hasStaff = true;
                break;

        }
        if (hasStaff == false) {
            System.out.println("\n\tMa nhan vien ban nhap khong ton tai!!!");
            System.out.print("\tMoi ban nhap lai ma nhan vien: ");
            ID = Keyboard.sc.nextLine();
            return checkIDs(ID);
        }
        return ID;
    }

    private static String checkName(String name) {
        name = name.toLowerCase();
        Character chFirst = name.charAt(0);
        for (int i = 0; i < name.length() - 1; ++i) {
            Character ch = name.charAt(i);
            Character chNext = name.charAt(i + 1);
            if (ch == ' ' && chNext != ' ')
                name = name.replace(chNext.toString(), chNext.toString().toUpperCase());
        }
        if (chFirst != ' ')
            name = name.replace(chFirst.toString(), chFirst.toString().toUpperCase());
        return name;
    }

    private static String checkDepartmentID(String ID) {
        String temp = ID.toUpperCase();
        switch (temp) {
            case "MKT":
            case "KTN":
            case "HCH":
            case "NHS":
            case "KTH":
                ID = temp;
                break;
            default:
                System.out.print("\tMa phong ban khong ton tai!!!\n" + "\tMoi ban nhap lai ma phong ban: ");
                ID = Keyboard.sc.nextLine();
                checkDepartmentID(ID);
        }
        return ID;
    }

    private static String checkID(String ID, String departmentID) {
        switch (ID.length()) {
            case (1):
                ID = "00" + ID;
                break;
            case (2):
                ID = "0" + ID;
                break;
            case (3):
                break;
            default:
                System.out.print("\tBan da nhap sai so thu tu!!!\n" + "\tVui long nhap lai so thu tu: ");
                ID = Keyboard.sc.nextLine();
                checkID(ID, departmentID);
                break;
        }
        ArrayList<ListStaff> temp = new ArrayList<ListStaff>();
        switch (departmentID.toUpperCase()) {
            case "MKT":
                for (int i = 0; i < Main.MKT.size(); ++i) {
                    temp.add(Main.MKT.get(i));
                }
                break;
            case "KTN":
                for (int i = 0; i < Main.KTN.size(); ++i) {
                    temp.add(Main.KTN.get(i));
                }
                break;
            case "HCH":
                for (int i = 0; i < Main.HCH.size(); ++i) {
                    temp.add(Main.HCH.get(i));
                }
                break;
            case "NHS":
                for (int i = 0; i < Main.NHS.size(); ++i) {
                    temp.add(Main.NHS.get(i));
                }
                break;
            case "KTH":
                for (int i = 0; i < Main.KTH.size(); ++i) {
                    temp.add(Main.KTH.get(i));
                }
                break;
        }
        for (int i = 0; i < ListStaff.arraySerialNumber(temp).length; i++)
            if (ListStaff.arraySerialNumber(temp)[i] != null)
                if (ListStaff.arraySerialNumber(temp)[i].equals(ID)) {
                    System.out.print("\tSo thu tu ban nhap da ton tai!!!\n" + "\tXin moi ban nhap lai so thu tu: ");
                    ID = Keyboard.sc.nextLine();
                    return checkID(ID, departmentID);
                }
        return departmentID.toUpperCase() + ID;
    }

    private static int checkAge(int age) {
        String input;
        if (age < 18 || age > 80) {
            System.out.print("\tTuoi nhan vien phai tu 18 den 80!!!\n" + "\tXin moi ban nhap lai so tuoi: ");
            input = Keyboard.sc.nextLine();
            age = Integer.parseInt(input);
            return checkAge(age);
        }
        return age;
    }

    private static String checkBirthday(String birthday) {
        if (!isValidDate(birthday)) {
            System.out.println("\tNgay thang nam phai co dinh dang dd/MM/yyyy!!!");
            System.out.print("\tVui long nhap lai ngay sinh cua nhan vien: ");
            birthday = Keyboard.sc.nextLine();
            return checkBirthday(birthday);
        }
        return birthday;
    }

    private static Pattern dateRegexPattern = Pattern
            .compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");

    private static boolean isValidDate(String dateString) {
        Matcher dateMatcher = dateRegexPattern.matcher(dateString);

        if (dateMatcher.matches()) {

            dateMatcher.reset();

            if (dateMatcher.find()) {
                String day = dateMatcher.group(1);
                String month = dateMatcher.group(2);
                int year = Integer.parseInt(dateMatcher.group(3));

                if ("31".equals(day) && ("4".equals(month) || "6".equals(month) || "9".equals(month)
                        || "11".equals(month) || "04".equals(month) || "06".equals(month) || "09".equals(month))) {
                    return false; // 1, 3, 5, 7, 8, 10, 12 has 31 days
                } else if ("2".equals(month) || "02".equals(month)) {
                    // leap year
                    if (year % 4 == 0) {
                        return !"30".equals(day) && !"31".equals(day);
                    } else {
                        return !"29".equals(day) && !"30".equals(day) && !"31".equals(day);
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private static String checkGender(String gender) {
        String firstLetter = gender.substring(0, 1);
        String remainingLetters = gender.substring(1, gender.length());
        firstLetter = firstLetter.toUpperCase();
        gender = firstLetter + remainingLetters;
        if (!gender.equals("Nam") && !gender.equals("Nu")) {
            System.out.print("\tGioi tinh chi co the la nam hoac nu!!!\n" + "\tXin moi ban nhap lai gioi tinh: ");
            gender = Keyboard.sc.nextLine();
            return checkGender(gender);
        }
        return gender;
    }

    private static float checkSalary(float salary) {
        String temp;
        if (salary < 1000) {
            System.out.print("\tLuong nhan vien toi thieu la $1000!!!\n" + "\tXin moi ban nhap lai muc luong: ");
            temp = Keyboard.sc.nextLine();
            salary = Float.parseFloat(temp);
            return checkSalary(salary);
        }
        return salary;
    }
}
