/*
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
public class BuyBooks {
    
    private static String[] shopping_notify = {
        "Nhấn 1: Chọn sách.",
        "Nhấn 2: Xem giỏ hàng.",
        "Nhấn 3: Tính tiền.",
        "Nhấn 0: Thoát."
    };
    private ArrayList<TheBook> cart;
    private boolean continueshopping=true;
    private double totalPrice;
    private boolean cast=false;
    Scanner input = new Scanner(System.in);
    
    //phương thức kiểm tra giỏ hàng đã thanh toán hay chưa
    public boolean isCast() {
        return cast;
    }
    
    //phương thức trả danh sách sách trong giỏ hàng
    public ArrayList<TheBook> getCart() {
        return cart;
    }

    //phương thức kiểm tra việc tiếp tục mua hàng
    public boolean isContinueshopping() {
        return continueshopping;
    }

    //phương thức gán trạng thái tiếp tục mua hàng
    public void setContinueshopping(boolean continueshopping) {
        this.continueshopping = continueshopping;
    }
    
    //phương thức nhận lựa chọn của người dùng dựa trên danh sách
    public int choice(ArrayList<TheBook> bookList){
        System.out.println("Nhập số STT sách muốn chọn: ");
        System.out.println("Nhập 0: Quay lại menu trước.");
        
        String choice;
        do{
            choice=input.nextLine();
        }while(!MyBookStore.checkInput(bookList.size()+1, choice));
        return Integer.parseInt(choice);
    }
    
    //phương thức thêm một quyển sách vào giỏ hàng
    public boolean addToCart(TheBook book){
        if(book.getQtyInstock()>0){
            this.cart.add(book);
            this.totalPrice+=book.getPrice();
            return true;
        }
        return false;
    }
    
    //phương thức xóa một quyển sách khỏi giỏ hàng
    public void removeFromCart(TheBook book){
        for (TheBook x : this.cart){
            if(x.equals(book)){
                this.cart.remove(x);
                this.totalPrice -= x.getPrice();
            }
        }
    }
    
    //phương thức tính tổng giá trong giỏ hàng
    public void calTotalPrice(){
        this.totalPrice = 0.;
        for (TheBook x : cart){
            totalPrice += x.getPrice();
        }
    }
    
    //phương thức lấy ra tổng giá của sản phẩm trong giỏ hàng
    public double getTotalPrice(){
        return this.totalPrice;
    }
    
    //phương thức in ra danh sách trong giỏ hàng
    public void showCart(){
        System.out.printf("%4s %50s %10s %8s %50s %2s\n","ID","Tên Sách","Giá","Cnt","Tác giả","Sl Tác giả");
        System.out.print("---------------\n");
        for (TheBook x : this.cart){
            String[] tmp = x.toString().split("##");
            System.out.printf("%4s %50s %10s %8s %50s %2s\n",tmp[0],tmp[1],tmp[2],"1",tmp[4],tmp[5]);
        }
        System.out.print("---------------\n\n\n");
        System.out.println("Số lượng sách: "+this.cart.size());
        System.out.println("Tổng tiền: "+this.getTotalPrice()+"\n\n");
    }
    
    //phương thức xử lý các lựa chọn trong quá trình mua hàng
    public void shoppingProcess(int cmd,BooksManager bookStore){
        boolean jobFinish=false;
        boolean flag=false;
        switch (cmd){            
            case 1:                
                if(!jobFinish){
                    int choice;
                    do{
                        MyBookStore.printTitle();
                        if(flag){
                            System.out.println("Đã thêm vào đơn hàng.");
                        }
                        System.out.println("Số lượng sách đã chọn :"+this.cart.size());
                        bookStore.showBooks();
                        choice=this.choice(bookStore.getBooksInStore());
                        if(choice!=0){
                            flag=this.addToCart(bookStore.getBookfromList(choice));
                        }else{
                            MyBookStore.printTitle();
                        }
                    }while(choice!=0);
                    jobFinish = true;
                }                    
                
            case 2:
                if(!jobFinish){
                    MyBookStore.printTitle();
                    this.showCart();
                    jobFinish = true;
                }
            case 3:
                if(!jobFinish){
                    calTotalPrice();
                    this.cast=true;
                    this.continueshopping=false;
                    MyBookStore.printTitle();
                    System.out.println("\n\n\n\nThanh toán thành công."
                            + "\nNhấn phím Enter để thoát.");
                    input.nextLine();
                    jobFinish = true;
                }
            case 0:
                if(!jobFinish){
                    this.setContinueshopping(false);
                    jobFinish = true;
                }
        }
    }
    
    //phương thức khỏi tạo nhận vào một booksmanager - cửa hàng
    public BuyBooks(BooksManager bookStore){
        cart = new ArrayList<>();
        totalPrice=0;
        boolean neworder =true;
        do{
            if(neworder){
                MyBookStore.printTitle();
                neworder=false;
            }           
            int command =MyBookStore.showMenu(shopping_notify);
            this.shoppingProcess(command,bookStore);
        }while(this.isContinueshopping());
    }
}
