package myproject;

import java.util.ArrayList;

class ListStaff {
    String name;
    String ID;
    String departmentID;
    int age;
    String birthday;
    String gender;
    float salary;

    public ListStaff() {
    }

    // public ListStaff(String name, String ID, String departmentID, int age, String birthday, String gender,
    //         float salary) {
    //     this.name = name;
    //     this.ID = ID;
    //     this.departmentID = departmentID;
    //     this.age = age;
    //     this.birthday = birthday;
    //     this.gender = gender;
    //     this.salary = salary;
    // }

    void setName(String name) {
        this.name = name;
    }

    void setID(String ID) {
        this.ID = ID;
    }

    String getID() {
        return this.ID;
    }

    void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    void setSalary(float salary) {
        this.salary = salary;
    }

    void setStaff(String name, String ID, String departmentID, int age, String birthday, String gender, float salary) {
        setName(name);
        setID(ID);
        setDepartmentID(departmentID);
        setAge(age);
        setBirthday(birthday);
        setGender(gender);
        setSalary(salary);
    }

    static String separateID(String ID) {
        String temp = "";
        for (int i = 0; i < 3; ++i) {
            temp += ID.charAt(i);
        }
        return temp;
    }

    static String separateSerialNumber(String ID) {
        String temp = "";
        for (int i = 3; i < 6; ++i) {
            temp += ID.charAt(i);
        }
        return temp;
    }

    static String[] arraySerialNumber(ArrayList<ListStaff> list) {
        String[] temp = new String[10];
        for (int i = 0; i < list.size(); ++i) {
                temp[i] = separateSerialNumber(Main.listStaff.get(i).ID);
        }
        return temp;
    }

    static void addNewStaff(String name, String ID, String departmentID, int age, String birthday, String gender,
            float salary) {
        ListStaff Staff = new ListStaff();
        Staff.setStaff(name, ID, departmentID, age, birthday, gender, salary);
        Main.listStaff.add(Staff);
        switch (separateID(Staff.ID)) {
        case "MKT":
            Main.MKT.add(Staff);
            break;
        case "KTN":
            Main.KTN.add(Staff);
            break;
        case "HCH":
            Main.HCH.add(Staff);
            break;
        case "NHS":
            Main.NHS.add(Staff);
            break;
        case "KTH":
            Main.KTH.add(Staff);
            break;
        }
    }
}
