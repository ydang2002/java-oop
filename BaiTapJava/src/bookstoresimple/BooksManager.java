/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoresimple;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hana6
 */
public class BooksManager {
    private String[] admin_notify={
        "Nhấn 1: Xem doanh thu.",
        "Nhấn 2: Nhập thêm số lượng cho sách sẵn có.",
        "Nhấn 3: Thêm 1 loại sách mới.",
        "Nhấn 4: Ngưng bán 1 loại sách.",
        "Nhấn 0: Thoát"
    };
    
    private ArrayList<TheBook> booksInStore; //index in list = id-1
    private ArrayList<BuyBooks> saleOrderList;
    public double totalSales;
    Scanner input = new Scanner(System.in);
    
    //phương thức khởi tạo
    public BooksManager(){
        booksInStore = new ArrayList<>();
        saleOrderList = new ArrayList<>();
    }
    
    //phương thức nhập sách đã có sẵn trong danh sách
    public void stockIn(){
        MyBookStore.printTitle();
        System.out.println("Giao diện Quản lý: Nhập kho sách đang bán.\n");
        this.showBooks();
        System.out.println("Nhập số ID để chọn sách cần thêm số lượng.");
        System.out.println("Nhập 0: Thoát. ");
        String id,num;
        do{
            id=input.nextLine();
        }while(!MyBookStore.checkInput(this.booksInStore.size()+1, id));
        if(Integer.parseInt(id)>0){
            System.out.print("Nhập số lượng thêm: ");
            do{
                num=input.nextLine();
            }while(!MyBookStore.checkInput(Integer.MAX_VALUE, num));
            TheBook tmp = this.getBookfromList(Integer.parseInt(id));
            tmp.stockIn(Integer.parseInt(num));
            this.booksInStore.set(Integer.parseInt(id)-1,tmp);
        }
        MyBookStore.printTitle();
        System.out.println("Giao diện Quản lý: Nhập kho sách đang bán.\n");
        this.showBooks();
        System.out.println("Thêm thành công. Nhấn enter để thoát.");
        input.nextLine();
    }
    
    //phương thức nhập mới sách
    public void newStock(){
        MyBookStore.printTitle();
        System.out.println("Giao diện Quản lý: Nhập kho sách mới.\n");
        TheBook tmp = new TheBook("",true,booksInStore.size()+1);
        tmp.setInfo();
        this.addBook(tmp);
        System.out.println("Thêm mới thành công. Nhấn enter để thoát.");
        input.nextLine();
    }
    
    //phương thức chuyển trạng thái ngưng bán sách bằng cách gán stock =0
    public void stopStock(){
        MyBookStore.printTitle();
        System.out.println("Giao diện Quản lý: Dừng bán 1 loại sách.\n");
        int choice;
        do{
            MyBookStore.printTitle();
            this.showBooks();
            choice=this.choice();
            if(choice!=0){
                TheBook tmp=booksInStore.get(choice-1);
                tmp.setQtyInstock(0);
                booksInStore.set(choice-1, tmp);
            }
        }while(choice!=0);
        System.out.println("Dừng bán thành công. Nhấn enter để thoát.");
        input.nextLine();
    }
    
    //phương thức nhận lựa chọn từ người dùng
    public int choice(){
        System.out.println("Nhập số STT sách muốn chọn: ");
        System.out.println("Nhập 0: Quay lại menu trước.");
        
        String choice;
        do{
            choice=input.nextLine();
        }while(!MyBookStore.checkInput(this.getBooksInStore().size()+1, choice));
        return Integer.parseInt(choice);
    }
    
    //phương thức sử lý các lựa chọn chính
    public void adminProcess(){        
        boolean signin=true;
        while(signin){
            MyBookStore.printTitle();
            int cmd=MyBookStore.showMenu(admin_notify);
            boolean processed=false;
            switch (cmd){
                case 1:
                    if(!processed){
                        MyBookStore.printTitle();
                        System.out.println("Giao diện Quản lý: Xem doanh thu.\n");
                        System.out.println("Doanh thu trong ngày: "+this.totalSales+"VND");
                        System.out.println("\n\nNhấn phím Enter để thoát.");
                        input.nextLine();
                        processed=true;
                    }
                case 2:
                    if(!processed){
                        stockIn();
                        processed=true;
                    }
                case 3:
                    if(!processed){
                        newStock();
                        processed=true;
                    }
                case 4:
                    if(!processed){
                        stopStock();
                        processed=true; 
                    }
                case 0:
                    if(!processed){
                        signin=false;
                    }
            }
        }
        
    }

    //phương thức lấy ra danh sách trong cửa hàng
    public ArrayList<TheBook> getBooksInStore() {
        return booksInStore;
    }
    
    //phương thức thêm một đơn hàng bán thành công vào danh sách đơn hàng
    public void addOrder(BuyBooks order){
        if(order.isCast() && !(order.getCart().isEmpty())){
            saleOrderList.add(order);
            totalSales+=order.getTotalPrice();
            for(TheBook x:order.getCart()){
                soldBook(x);
            }
        }
    }
    
    //phương thức lấy ra một quyển sách từ danh sách trong cửa hàng bằng id
    public TheBook getBookfromList(int id){
        return this.booksInStore.get(id-1);
    }
    
    //phương thức thêm một quyển sách vào danh sách trong cửa hàng
    public void addBook(TheBook book){
        int index = Integer.valueOf(book.getId()) - 1;
        if(index <this.booksInStore.size()){
            book.setQtyInstock(book.getQtyInstock()+booksInStore.get(index).getQtyInstock());
            this.booksInStore.set(index, book);
        }
        else{
            this.booksInStore.add(index, book);
        }
    }
    
    //phương thức bán một quyển sách
    public boolean soldBook(TheBook book){
        if(booksInStore.get(Integer.valueOf(book.getId())-1).getQtyInstock()>=0){
            book.setQtyInstock(book.getQtyInstock()-1);
            booksInStore.set(Integer.valueOf(book.getId())-1, book);
            return true;
        }
        return false;
    }
    
    //phương thức hiển thị danh sách trong cửa hàng
    public void showBooks(){
        int count=1;
        System.out.printf("%3s %4s %50s %10s %8s %50s %2s\n","STT","ID","Tên Sách","Giá","Hiện còn","Tác giả","SL Tác giả");
        System.out.print("---------------\n");
        for (TheBook x : booksInStore){
            String[] tmp = x.toString().split("##");
            System.out.printf("%3s %4s %50s %10s %8s %50s %2s\n",String.valueOf(count++),tmp[0],tmp[1],tmp[2],tmp[3],tmp[4],tmp[5]);
        }
        System.out.print("---------------\n\n\n");
    }
}
