/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookstoresimple;


import java.util.Scanner;

/**
 *
 * @author hana6
 */
public class MyBookStore {

    /**
     * @param args the command line arguments
     */
    private static String title=
              "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
            + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
            + "----CỬA HÀNG SÁCH XIÊU SỊN----\n\n\n";
    
    private static String[] start_notify = {
    		"Nhấn 1: Bắt đầu mua sách.",
            "Nhấn 2: Nếu bạn là quản lý.",
            "Nhấn 0: Thoát."
    };
    private static BooksManager Mystore;
    private static int start;
    private static boolean run;
    private static Scanner input=new Scanner(System.in);
    
  //phương thức in ra tên cửa hàng
    public static void printTitle(){
        System.out.print(title);
    }
    
    //phương thức cho phép hiện menu là các string lưu trên 1 mảng
    public static int showMenu(String[] menuChoice){
        String userString = "";
        int count=0;
        do{ 
            if((count++)>0){
                System.out.println("Lựa chọn ko phù hợp.\nXin vui lòng chọn lại.");
            }
            for(String x:menuChoice){
                System.out.println(x);
            }
            System.out.print("\n\n\n");
            System.out.print("Nhập lựa chọn và nhấn enter: ");
            userString = input.nextLine();
        }while(!checkInput(menuChoice.length, userString));
        
        return Integer.parseInt(userString);
    }
    
    //phương thức kiểm tra chuỗi nhập từ bàn phím
    public static boolean checkInput(int menuChoice,String userString){
        char [] arr = userString.toCharArray();
        boolean flag=!(userString.equals(""));        
        if(flag){
            for(int x:arr){
                if(x<'0'||x>'9'){
                    flag = false;
                }
            }            
        }
        if(flag){
            flag=flag && Integer.valueOf(userString)<menuChoice;
        }
        return flag;
    }
    
    //phương thức vận hành chương trình chính
    private static void main_process(){
        boolean processed = false;
        switch (MyBookStore.start){
            case 1:
                if(!processed){
                    Mystore.addOrder(new BuyBooks(Mystore));
                    processed = true;
                }
            case 2:
                if(!processed){
                    Mystore.adminProcess();
                    processed = true;
                }
            case 0:
                run = false;
        }     
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        run = true;
        Mystore = new BooksManager();
        TheBook book1=new TheBook("RasenGun Bí Thuật",true,Mystore.getBooksInStore().size()+1);
        book1.setQtyInstock(1000);
        book1.setPrice(2000.);
        Mystore.addBook(book1);
        while(run){
            printTitle();
            start = showMenu(start_notify);
            main_process();
            run = start!=0;
        }
        System.out.print(start);
    }
    
}