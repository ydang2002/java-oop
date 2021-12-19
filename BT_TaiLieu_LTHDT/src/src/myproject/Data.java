package myproject;

public class Data implements Database, Information {
    @Override
    public void getInfoByDepartment(String input) {
        switch (Integer.parseInt(input)) {
            case (1):
                System.out.println("\n\tDanh sach nhan vien phong marketing:");
                for (int i = 0; i < Main.MKT.size(); ++i) {
                    System.out.print("\t" + Main.MKT.get(i).name + ", ");
                    System.out.print(Main.MKT.get(i).ID + ", ");
                    System.out.print(Main.MKT.get(i).departmentID + ", ");
                    System.out.print(Main.MKT.get(i).age + ", ");
                    System.out.print(Main.MKT.get(i).birthday + ", ");
                    System.out.print(Main.MKT.get(i).gender + ", ");
                    System.out.println(Main.MKT.get(i).salary);
                }
                break;
            case (2):
                System.out.println("\n\tDanh sach nhan vien phong ke toan:");
                for (int i = 0; i < Main.KTN.size(); ++i) {
                    System.out.print("\t" + Main.KTN.get(i).name + ", ");
                    System.out.print(Main.KTN.get(i).ID + ", ");
                    System.out.print(Main.KTN.get(i).departmentID + ", ");
                    System.out.print(Main.KTN.get(i).age + ", ");
                    System.out.print(Main.KTN.get(i).birthday + ", ");
                    System.out.print(Main.KTN.get(i).gender + ", ");
                    System.out.println(Main.KTN.get(i).salary);
                }
                break;
            case (3):
                System.out.println("\n\tDanh sach nhan vien phong hanh chinh:");
                for (int i = 0; i < Main.HCH.size(); ++i) {
                    System.out.print("\t" + Main.HCH.get(i).name + ", ");
                    System.out.print(Main.HCH.get(i).ID + ", ");
                    System.out.print(Main.HCH.get(i).departmentID + ", ");
                    System.out.print(Main.HCH.get(i).age + ", ");
                    System.out.print(Main.HCH.get(i).birthday + ", ");
                    System.out.print(Main.HCH.get(i).gender + ", ");
                    System.out.println(Main.HCH.get(i).salary);
                }
                break;
            case (4):
                System.out.println("\n\tDanh sach nhan vien phong nhan su:");
                for (int i = 0; i < Main.NHS.size(); ++i) {
                    System.out.print("\t" + Main.NHS.get(i).name + ", ");
                    System.out.print(Main.NHS.get(i).ID + ", ");
                    System.out.print(Main.NHS.get(i).departmentID + ", ");
                    System.out.print(Main.NHS.get(i).age + ", ");
                    System.out.print(Main.NHS.get(i).birthday + ", ");
                    System.out.print(Main.NHS.get(i).gender + ", ");
                    System.out.println(Main.NHS.get(i).salary);
                }
                break;
            case (5):
                System.out.println("\n\tDanh sach nhan vien phong ki thuat:");
                for (int i = 0; i < Main.KTH.size(); ++i) {
                    System.out.print("\t" + Main.KTH.get(i).name + ", ");
                    System.out.print(Main.KTH.get(i).ID + ", ");
                    System.out.print(Main.KTH.get(i).departmentID + ", ");
                    System.out.print(Main.KTH.get(i).age + ", ");
                    System.out.print(Main.KTH.get(i).birthday + ", ");
                    System.out.print(Main.KTH.get(i).gender + ", ");
                    System.out.println(Main.KTH.get(i).salary);
                }
                break;
        }
    }

    @Override
    public void getInfoByAge(String input) {
        System.out.println("\n\tDanh sach nhan vien:");
        switch (Integer.parseInt(input)) {
            case (1):
                for (int i = 0; i < Main.listStaff.size(); ++i) {
                    if (Main.listStaff.get(i).age == Integer.parseInt(Options.input)) {
                        System.out.print("\t" + Main.listStaff.get(i).name + ", ");
                        System.out.print(Main.listStaff.get(i).ID + ", ");
                        System.out.print(Main.listStaff.get(i).departmentID + ", ");
                        System.out.print(Main.listStaff.get(i).age + ", ");
                        System.out.print(Main.listStaff.get(i).birthday + ", ");
                        System.out.print(Main.listStaff.get(i).gender + ", ");
                        System.out.println(Main.listStaff.get(i).salary);
                    }
                }
                break;
            case (2):
                for (int i = 0; i < Main.listStaff.size(); ++i) {
                    if (Main.listStaff.get(i).age > Integer.parseInt(Options.input)) {
                        System.out.print("\t" + Main.listStaff.get(i).name + ", ");
                        System.out.print(Main.listStaff.get(i).ID + ", ");
                        System.out.print(Main.listStaff.get(i).departmentID + ", ");
                        System.out.print(Main.listStaff.get(i).age + ", ");
                        System.out.print(Main.listStaff.get(i).birthday + ", ");
                        System.out.print(Main.listStaff.get(i).gender + ", ");
                        System.out.println(Main.listStaff.get(i).salary);
                    }
                }
                break;
            case (3):
                for (int i = 0; i < Main.listStaff.size(); ++i) {
                    if (Main.listStaff.get(i).age < Integer.parseInt(Options.input)) {
                        System.out.print("\t" + Main.listStaff.get(i).name + ", ");
                        System.out.print(Main.listStaff.get(i).ID + ", ");
                        System.out.print(Main.listStaff.get(i).departmentID + ", ");
                        System.out.print(Main.listStaff.get(i).age + ", ");
                        System.out.print(Main.listStaff.get(i).birthday + ", ");
                        System.out.print(Main.listStaff.get(i).gender + ", ");
                        System.out.println(Main.listStaff.get(i).salary);
                    }
                }
                break;
        }
    }

    @Override
    public void getInfoByGender(String input) {
        System.out.println("\n\tDanh sach nhan vien:");
        switch (Integer.parseInt(input)) {
            case (1):
                for (int i = 0; i < Main.listStaff.size(); ++i) {
                    if (Main.listStaff.get(i).gender.equals("Nam")) {
                        System.out.print("\t" + Main.listStaff.get(i).name + ", ");
                        System.out.print(Main.listStaff.get(i).ID + ", ");
                        System.out.print(Main.listStaff.get(i).departmentID + ", ");
                        System.out.print(Main.listStaff.get(i).age + ", ");
                        System.out.print(Main.listStaff.get(i).birthday + ", ");
                        System.out.print(Main.listStaff.get(i).gender + ", ");
                        System.out.println(Main.listStaff.get(i).salary);
                    }
                }
                break;
            case (2):
                for (int i = 0; i < Main.listStaff.size(); ++i) {
                    if (Main.listStaff.get(i).gender.equals("Nu")) {
                        System.out.print("\t" + Main.listStaff.get(i).name + ", ");
                        System.out.print(Main.listStaff.get(i).ID + ", ");
                        System.out.print(Main.listStaff.get(i).departmentID + ", ");
                        System.out.print(Main.listStaff.get(i).age + ", ");
                        System.out.print(Main.listStaff.get(i).birthday + ", ");
                        System.out.print(Main.listStaff.get(i).gender + ", ");
                        System.out.println(Main.listStaff.get(i).salary);
                    }
                }
                break;
        }
    }

    @Override
    public void getInfoBySalary(String input) {
        System.out.println("\n\tDanh sach nhan vien:");
        switch (Integer.parseInt(input)) {
            case (1):
                for (int i = 0; i < Main.listStaff.size(); ++i) {
                    if (Main.listStaff.get(i).salary == Float.parseFloat(Options.input)) {
                        System.out.print("\t" + Main.listStaff.get(i).name + ", ");
                        System.out.print(Main.listStaff.get(i).ID + ", ");
                        System.out.print(Main.listStaff.get(i).departmentID + ", ");
                        System.out.print(Main.listStaff.get(i).age + ", ");
                        System.out.print(Main.listStaff.get(i).birthday + ", ");
                        System.out.print(Main.listStaff.get(i).gender + ", ");
                        System.out.println(Main.listStaff.get(i).salary);
                    }
                }
                break;
            case (2):
                for (int i = 0; i < Main.listStaff.size(); ++i) {
                    if (Main.listStaff.get(i).salary > Float.parseFloat(Options.input)) {
                        System.out.print("\t" + Main.listStaff.get(i).name + ", ");
                        System.out.print(Main.listStaff.get(i).ID + ", ");
                        System.out.print(Main.listStaff.get(i).departmentID + ", ");
                        System.out.print(Main.listStaff.get(i).age + ", ");
                        System.out.print(Main.listStaff.get(i).birthday + ", ");
                        System.out.print(Main.listStaff.get(i).gender + ", ");
                        System.out.println(Main.listStaff.get(i).salary);
                    }
                }
                break;
            case (3):
                for (int i = 0; i < Main.listStaff.size(); ++i) {
                    if (Main.listStaff.get(i).salary < Float.parseFloat(Options.input)) {
                        System.out.print("\t" + Main.listStaff.get(i).name + ", ");
                        System.out.print(Main.listStaff.get(i).ID + ", ");
                        System.out.print(Main.listStaff.get(i).departmentID + ", ");
                        System.out.print(Main.listStaff.get(i).age + ", ");
                        System.out.print(Main.listStaff.get(i).birthday + ", ");
                        System.out.print(Main.listStaff.get(i).gender + ", ");
                        System.out.println(Main.listStaff.get(i).salary);
                    }
                }
                break;
        }
    }

    @Override
    public void sortDataByAge(String input) {
        ListStaff temp = new ListStaff();
        System.out.print("\n\tDanh sach nhan vien theo do tuoi ");
        switch (Integer.parseInt(input)) {
            case (1):
                System.out.println("tang dan:");
                for (int i = 0; i < Main.listStaff.size() - 1; ++i) {
                    for (int j = i + 1; j < Main.listStaff.size(); ++j) {
                        if (Main.listStaff.get(i).age > Main.listStaff.get(j).age) {
                            temp = Main.listStaff.get(i);
                            Main.listStaff.set(i, Main.listStaff.get(j));
                            Main.listStaff.set(j, temp);
                        }
                    }
                }
                for (int i = 0; i < Main.listStaff.size(); ++i) {
                    System.out.print("\t" + Main.listStaff.get(i).name + ", ");
                    System.out.print(Main.listStaff.get(i).ID + ", ");
                    System.out.print(Main.listStaff.get(i).departmentID + ", ");
                    System.out.print(Main.listStaff.get(i).age + ", ");
                    System.out.print(Main.listStaff.get(i).birthday + ", ");
                    System.out.print(Main.listStaff.get(i).gender + ", ");
                    System.out.println(Main.listStaff.get(i).salary);
                }
                break;
            case (2):
                System.out.println("giam dan:");
                for (int i = 0; i < Main.listStaff.size() - 1; ++i) {
                    for (int j = i + 1; j < Main.listStaff.size(); ++j) {
                        if (Main.listStaff.get(i).age < Main.listStaff.get(j).age) {
                            temp = Main.listStaff.get(i);
                            Main.listStaff.set(i, Main.listStaff.get(j));
                            Main.listStaff.set(j, temp);
                        }
                    }
                }
                for (int i = 0; i < Main.listStaff.size(); ++i) {
                    System.out.print("\t" + Main.listStaff.get(i).name + ", ");
                    System.out.print(Main.listStaff.get(i).ID + ", ");
                    System.out.print(Main.listStaff.get(i).departmentID + ", ");
                    System.out.print(Main.listStaff.get(i).age + ", ");
                    System.out.print(Main.listStaff.get(i).birthday + ", ");
                    System.out.print(Main.listStaff.get(i).gender + ", ");
                    System.out.println(Main.listStaff.get(i).salary);
                }
                break;
        }
    }

    @Override
    public void sortDataBySalary(String input) {
        ListStaff temp = new ListStaff();
        System.out.print("\n\tDanh sach nhan vien theo muc luong ");
        switch (Integer.parseInt(input)) {
            case (1):
                System.out.println("tang dan:");
                for (int i = 0; i < Main.listStaff.size() - 1; ++i) {
                    for (int j = i + 1; j < Main.listStaff.size(); ++j) {
                        if (Main.listStaff.get(i).salary > Main.listStaff.get(j).salary) {
                            temp = Main.listStaff.get(i);
                            Main.listStaff.set(i, Main.listStaff.get(j));
                            Main.listStaff.set(j, temp);
                        }
                    }
                }
                for (int i = 0; i < Main.listStaff.size(); ++i) {
                    System.out.print("\t" + Main.listStaff.get(i).name + ", ");
                    System.out.print(Main.listStaff.get(i).ID + ", ");
                    System.out.print(Main.listStaff.get(i).departmentID + ", ");
                    System.out.print(Main.listStaff.get(i).age + ", ");
                    System.out.print(Main.listStaff.get(i).birthday + ", ");
                    System.out.print(Main.listStaff.get(i).gender + ", ");
                    System.out.println(Main.listStaff.get(i).salary);
                }
                break;
            case (2):
                System.out.println("giam dan:");
                for (int i = 0; i < Main.listStaff.size() - 1; ++i) {
                    for (int j = i + 1; j < Main.listStaff.size(); ++j) {
                        if (Main.listStaff.get(i).salary < Main.listStaff.get(j).salary) {
                            temp = Main.listStaff.get(i);
                            Main.listStaff.set(i, Main.listStaff.get(j));
                            Main.listStaff.set(j, temp);
                        }
                    }
                }
                for (int i = 0; i < Main.listStaff.size(); ++i) {
                    System.out.print("\t" + Main.listStaff.get(i).name + ", ");
                    System.out.print(Main.listStaff.get(i).ID + ", ");
                    System.out.print(Main.listStaff.get(i).departmentID + ", ");
                    System.out.print(Main.listStaff.get(i).age + ", ");
                    System.out.print(Main.listStaff.get(i).birthday + ", ");
                    System.out.print(Main.listStaff.get(i).gender + ", ");
                    System.out.println(Main.listStaff.get(i).salary);
                }
                break;
        }
    }
}
