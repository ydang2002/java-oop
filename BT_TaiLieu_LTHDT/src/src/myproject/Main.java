package myproject;

import java.util.ArrayList;

public class Main {
    static ArrayList<ListStaff> listStaff = new ArrayList<ListStaff>();
    static ArrayList<ListStaff> MKT = new ArrayList<ListStaff>();
    static ArrayList<ListStaff> KTN = new ArrayList<ListStaff>();
    static ArrayList<ListStaff> HCH = new ArrayList<ListStaff>();
    static ArrayList<ListStaff> NHS = new ArrayList<ListStaff>();
    static ArrayList<ListStaff> KTH = new ArrayList<ListStaff>();

    static String[] input = { "-1", "-1", "-1"};

    public static void main(String[] args) {

        Options.Start();

        // // Tạo dữ liệu
        // // MKT
        // ListStaff.addNewStaff("Nguyen Van A", "MKT001", "MKT", 20, "09/04/2001",
        // "Nam", 5000);
        // ListStaff.addNewStaff("Tran Trong B", "MKT002", "MKT", 22, "13/04/1999",
        // "Nam", 4000);
        // ListStaff.addNewStaff("Le Van C", "MKT003", "MKT", 21, "22/04/2000", "Nam",
        // 3000);
        // ListStaff.addNewStaff("Nguyen Thi A", "MKT004", "MKT", 18, "30/11/2003",
        // "Nu", 3000);
        // ListStaff.addNewStaff("Tran Nguyen Van C", "MKT005", "MKT", 24, "12/05/1997",
        // "Nu", 3000);
        // // KTN
        // ListStaff.addNewStaff("Nguyen Thi D", "KTN001", "KTN", 19, "19/09/2002",
        // "Nu", 5000);
        // ListStaff.addNewStaff("Tran Van E", "KTN002", "KTN", 23, "13/05/1998", "Nam",
        // 4000);
        // ListStaff.addNewStaff("Bao Ngoc F", "KTN003", "KTN", 22, "22/03/1999", "Nu",
        // 3000);
        // ListStaff.addNewStaff("Huynh Huu A", "KTN004", "KTN", 21, "23/06/2000",
        // "Nam", 5000);
        // ListStaff.addNewStaff("Tran Nguyen E", "KTN005", "KTN", 28, "13/04/1993",
        // "Nam", 7000);
        // // HCH
        // ListStaff.addNewStaff("Le Tran D", "HCH001", "HCH", 21, "27/08/2000", "Nam",
        // 5000);
        // ListStaff.addNewStaff("Ha Thi F", "HCH002", "HCH", 20, "13/04/2001", "Nu",
        // 4000);
        // ListStaff.addNewStaff("Tran Thi I", "HCH003", "HCH", 18, "28/02/2003", "Nu",
        // 3000);
        // ListStaff.addNewStaff("Nguyen Hoat B", "HCH004", "HCH", 19, "01/01/2002",
        // "Nam", 5000);
        // ListStaff.addNewStaff("Nguyen Thi C", "HCH005", "HCH", 25, "22/04/1996",
        // "Nu", 6000);
        // // NHS
        // ListStaff.addNewStaff("Le Trung H", "NHS001", "NHS", 19, "09/04/2002", "Nam",
        // 6000);
        // ListStaff.addNewStaff("Nguyen Hoai M", "NHS002", "NHS", 19, "31/07/2002",
        // "Nu", 5000);
        // ListStaff.addNewStaff("Dao Van H", "NHS003", "NHS", 23, "13/02/1998", "Nam",
        // 6000);
        // ListStaff.addNewStaff("Le Van L", "NHS004", "NHS", 24, "23/10/1997", "Nam",
        // 6000);
        // ListStaff.addNewStaff("Nguyen Hoang K", "NHS005", "NHS", 27, "17/07/1994",
        // "Nu", 7000);
        // // KTH
        // ListStaff.addNewStaff("Tran Luyen B", "KTH001", "KTH", 21, "14/04/2000",
        // "Nu", 5000);
        // ListStaff.addNewStaff("Oc Thanh V", "KTH002", "KTH", 20, "10/03/2001", "Nu",
        // 4000);
        // ListStaff.addNewStaff("Le Hoai F", "KTH003", "KTH", 22, "29/05/1999", "Nu",
        // 6000);
        // ListStaff.addNewStaff("Hoai Thi I", "KTH004", "KTH", 24, "27/03/1997", "Nu",
        // 7000);
        // ListStaff.addNewStaff("Kha B", "KTH005", "KTH", 22, "27/07/1999", "Nu",
        // 6000);

        // Department dpm = new Department();
        // dpm.readInfoDepartment();
        // dpm.printInfoDepartment(dpm.list);

        // for (Department dp : dpm.readInfoDepartment()){
        // System.out.println(dp.nameDepartment + ", " + dp.departmentID + ", " +
        // dp.HeadOfDepartment);
        // }

        // System.out.println(MKT.get(4).name);
        // System.out.println(MKT.get(4).ID);
        // System.out.println(MKT.get(4).departmentID);
        // System.out.println(MKT.get(4).age);
        // System.out.println(MKT.get(4).birthday);
        // System.out.println(MKT.get(4).gender);
        // System.out.println(MKT.get(4).salary);

        // System.out.println(listStaff.get(4).name);
        // System.out.println(listStaff.get(4).ID);
        // System.out.println(listStaff.get(4).departmentID);
        // System.out.println(listStaff.get(4).age);
        // System.out.println(listStaff.get(4).birthday);
        // System.out.println(listStaff.get(4).gender);
        // System.out.println(listStaff.get(4).salary);

        // System.out.println(MKT.get(5).name);
        // System.out.println(MKT.get(5).ID);
        // System.out.println(MKT.get(5).departmentID);
        // System.out.println(MKT.get(5).age);
        // System.out.println(MKT.get(5).birthday);
        // System.out.println(MKT.get(5).gender);
        // System.out.println(MKT.get(5).salary);}

        // for (int i = 0; i < listStaff.size(); ++i) {
        // System.out.println(listStaff.get(i).name + ": " + listStaff.get(i).ID);
        // }

        // for (int i = 0; i < MKT.size(); ++i) {
        // System.out.println(MKT.get(i).name + ": " + MKT.get(i).ID);
        // }
        // for (int i = 0; i < KTN.size(); ++i) {
        // System.out.println(KTN.get(i).name + ": " + KTN.get(i).ID);
        // }
        // for (int i = 0; i < HCH.size(); ++i) {
        // System.out.println(HCH.get(i).name + ": " + HCH.get(i).ID);
        // }
        // for (int i = 0; i < NHS.size(); ++i) {
        // System.out.println(NHS.get(i).name + ": " + NHS.get(i).ID);
        // }
        // for (int i = 0; i < KTH.size(); ++i) {
        // System.out.println(KTH.get(i).name + ": " + KTH.get(i).ID);
        // }
    }
}
