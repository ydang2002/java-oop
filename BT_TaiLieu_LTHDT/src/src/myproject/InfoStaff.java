package myproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class InfoStaff extends Data {
    public void writeInfoStaff() {
        File file = new File("output.txt");
        String currentPath = file.getAbsolutePath();
        System.out.println("\n\tDa in ra danh sach thong tin cua tat ca cac nhan vien trong cong ty!!!");
        System.out.println("\tDuong dan cua file output.txt: " + currentPath);
        try {
            FileWriter fw = new FileWriter("./output.txt", Charset.forName("UTF8"));
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Danh sách nhân viên trong công ty: ");
            bw.newLine();
            for (ListStaff staff : Main.listStaff) {
                bw.write(staff.name + ", ");
                bw.write(staff.ID + ", ");
                bw.write(staff.departmentID + ", ");
                bw.write(staff.age + ", ");
                bw.write(staff.birthday + ", ");
                bw.write(staff.gender + ", ");
                bw.write(String.valueOf(staff.salary));
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public void readInfoStaff() {
        try {
            FileReader fr = new FileReader("danhsachnhanvien.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String data[] = line.split(", ");
                String name = data[0];
                String ID = data[1];
                String departmentID = data[2];
                int age = Integer.parseInt(data[3]);
                String birthday = data[4];
                String gender = data[5];
                float salary = Float.parseFloat(data[6]);
                ListStaff.addNewStaff(name, ID, departmentID, age, birthday, gender, salary);
            }
            fr.close();
            br.close();
        } catch (Exception e) {
            System.out.println("File data does not exist!!!");
        }
    }
}
