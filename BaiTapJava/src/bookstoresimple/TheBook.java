/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoresimple;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hana6
 */
public class TheBook {
    public static TheBook[] myBookListInStore;
    private String id;
    private String name;
    private double price;
    private int qtyInstock;
    private Author[] authors;
    private int numOfAuthors;
    private Scanner input = new Scanner(System.in);
    
    //phương thức khởi tạo một quyển sách mới chưa được quản lý
    public TheBook(String name,boolean isNew,int newID){
        if(isNew){
            this.setId(String.format("%04d", newID));
        }
        this.name=name;
        authors = new Author[1];
        authors[0]=new Author();
    }
    
    //phương thức khởi tạo một quyển sách có đầy đủ thông tin
    public TheBook(String id, String name, double price, int qtyInstock, Author[] authors, int numOfAuthors) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qtyInstock = qtyInstock;
        this.authors = authors;
        this.numOfAuthors = numOfAuthors;
    }

    //phương thức khởi tạo một quyển sách với tên sách
    public TheBook(String name) {
        this.name = name;
        authors = new Author[1];
        authors[0]=new Author();
    }

    //phương thức khởi tạo một quyền sách với tên sách và thông tin tác giả
    public TheBook(String name, Author[] authors) {
        this.name = name;
        this.authors = authors;
    }   
    
    //phương thức khởi tạo một quyển sách mặc định
    public TheBook() {
        this.name = "";
        authors = new Author[1];
        authors[0]=new Author();
    }
    
    //phương thức nhập thêm sách với số lượng sách
    public void stockIn(int num){
        this.qtyInstock+=num;
    }

    //phương thức trả về id của sách
    public String getId() {
        return id;
    }

    //phương thức gán id cho sách
    public void setId(String id) {
        this.id = id;
    }
    
    //phương thức thêm 1 tác giả cho sách
    public boolean addAuthor(Author a){
        for(Author x : authors){
            if(x.equals(a)){
                return false;
            }
        }
        authors=Arrays.copyOf(authors, authors.length);
        authors[authors.length]=a;
        return true;
    }

    //phương thức trả về tên sách
    public String getName() {
        return name;
    }

    //phương thức gán tên cho sách
    public void setName(String name) {
        this.name = name;
    }

    //phương thức trả về giá sách
    public double getPrice() {
        return price;
    }

    //phương thức gán giá cho sách
    public void setPrice(double price) {
        this.price = price;
    }

    //phương thức lấy ra số lượng sách trong kho
    public int getQtyInstock() {
        return qtyInstock;
    }

    //phương thức gán số lượng sách trong kho
    public void setQtyInstock(int qtyInstock) {
        this.qtyInstock = qtyInstock;
    }

    //phương thức lấy ra danh sách tác giả
    public Author[] getAuthors() {
        return authors;
    }

    //phương thức gán danh sách tác giả
    public void setAuthors(Author[] authors) {
        this.authors = authors;
        this.numOfAuthors+=authors.length;
    }
    
    //phương thức trả về số lượng tác giả
    public int getNumOfAuthors() {
        return numOfAuthors;
    }

    //phương thưcs gán số lượng tác giả
    public void setNumOfAuthors(int numOfAuthors) {
        this.numOfAuthors = numOfAuthors;
    }
    
    //phương thức lấy ra tên của các tác giả
    public String getAuthorName(){
        String s="";
        for(int i=0;i<this.authors.length;i++){
            s+=authors[i].getName();
            if(i!=authors.length-1){
                s+=" - ";
            }
        }
        return s;
    }
    
    //phương thức gán thông tin cho sách
    public void setInfo(){
        System.out.println("Vui lòng nhập thông tin cho sách.");
        System.out.println("Vui lòng nhập tên sách.");
        String name = input.nextLine();
        this.setName(name);
        String num;
        System.out.print("Nhập số lượng sách: ");
        do{
            num=input.nextLine();
        }while(!MyBookStore.checkInput(Integer.MAX_VALUE, num));
        this.setQtyInstock(Integer.parseInt(num));
        System.out.println("Vui lòng nhập giá bán: ");
        do{
            num=input.nextLine();
        }while(!MyBookStore.checkInput(Integer.MAX_VALUE, num));
        this.setPrice(Double.parseDouble(num));
        setAuthorsInfo();
    }
    
    //phương thức gán thông tin tác giả
    public void setAuthorsInfo(){
        System.out.println("Xin vui lòng nhập số lượng tác giả: ");
        System.out.println("Nhập 0: Thoát.");
        String num;
        do{
            num=input.nextLine();
        }while(!MyBookStore.checkInput(Integer.MAX_VALUE, num));
        int authorsNum=Integer.parseInt(num);
        if(authorsNum>0){
            this.authors = new Author[authorsNum];
            this.numOfAuthors=authorsNum;
            for(int i=0;i<authorsNum;i++){
                authors[i]=new Author();
                authors[i].setInfo();
            }
        }
    }
    
    //phương thức so sánh có giống với một quyển sách
    public boolean equals(TheBook book) {
        return this.getId()==book.getId();
    }

    @Override
    public String toString() {
        return id +"##" + name + "##" + price + "##" +
               qtyInstock + "##" + getAuthorName() + "##" + numOfAuthors;
    }
    
    
}
