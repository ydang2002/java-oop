/*
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoresimple;

import java.util.Scanner;

/**
 *
 * @author hana6
 */


public class Author {
    private String name;
    private String email;
    private char gender;
    
    public Author(){
        this.name ="No name";
        this.email="Noemail@gmail.com";
        this.gender='N';
    }
    public Author(String s){
        String[] a = s.split("##");
        this.name=a[0];
        this.gender=a[1].charAt(0);
        this.email=a[2];
    }
    public Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public char getGender(){
        return this.gender;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    
    public void setInfo(){
        Scanner input = new Scanner(System.in);
        String s;
        System.out.println("Xin vui lòng nhập tên tác giả: ");
        s=input.nextLine();
        this.setName(s);
        System.out.println("Xin vui lòng nhập địa chỉ mail: ");
        s=input.nextLine();
        while(!s.contains("@")&&!s.contains(".")){
            System.out.println("Xin vui lòng nhập lại địa chỉ mail: ");
            System.out.println("Ví dụ abc@xyz.com");
            s=input.nextLine();
        }
        System.out.println("Xin vui lòng nhập giới tính: F/M");
        s=input.nextLine();
        while(!s.equals("F")&&!s.equals("M")){
            System.out.println("Xin vui lòng nhập lại giới tính F/M");
            s=input.nextLine();
        }
        this.setGender(s.charAt(0));
    }
    
    @Override
    public String toString(){
        return this.getName()+"##"+this.getGender()+"##"+this.getEmail();
    }
}
