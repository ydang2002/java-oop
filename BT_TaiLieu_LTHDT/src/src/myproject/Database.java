package myproject;

interface Information {
    void getInfoByDepartment(String input);

    void getInfoByAge(String input);

    void getInfoByGender(String input);

    void getInfoBySalary(String salary);
}

interface Database {
    void sortDataByAge(String input);

    void sortDataBySalary(String input);
}
