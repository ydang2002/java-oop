package myproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Department extends Data {
    ArrayList<Department> list = new ArrayList<Department>();
    String[] InfoDepartment;
    String nameDepartment;
    String departmentID;
    String HeadOfDepartment;

    public void readInfoDepartment() {
        try {
            FileReader fr = new FileReader("danhsachphongban.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String []temp;
            while (true) {
                Department dp = new Department();
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] data = line.split(", ");
                dp.InfoDepartment = data;
                dp.nameDepartment = data[0];
                dp.departmentID = data[1];
                temp = data[2].split(": ");
                dp.HeadOfDepartment = temp[1];
                list.add(dp);
            }
            fr.close();
            br.close();
        } catch (Exception e) {
            System.out.println("khong tim thay file");
        }
    }

    public void printInfoDepartment(ArrayList<Department> list) {
        File file = new File("output.txt");
        String currentPath = file.getAbsolutePath();
        System.out.println("\n\tDa in ra danh sach cac phong ban trong cong ty!!!");
        System.out.println("\tDuong dan cua file output.txt: " + currentPath);
        try {
            FileWriter fw = new FileWriter("./output.txt", Charset.forName("UTF8"));
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Danh sách phòng ban trong công ty: ");
            bw.newLine();
            for (Department dp : list) {
                bw.write(dp.nameDepartment + ", ");
                bw.write(dp.departmentID + ", ");
                bw.write("Truong phong: ");
                bw.write(dp.HeadOfDepartment);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
}
