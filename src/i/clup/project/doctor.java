/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i.clup.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author The Twins
 */
public class doctor extends Person {
    int time = 5;
    ArrayList<String>times=new ArrayList<>();
    Scanner in = new Scanner(System.in);
    private String specialty;

    doctor() {
    }

    doctor(String address, String phone, String specialty) {

        this.address = address;
        this.phone = phone;
        this.specialty = specialty;
    }


    public void add_doctor() {
        System.out.println("Enter Your name : ");
        name = in.nextLine();
        System.out.println("Enter Your mail : ");
        mail = in.nextLine();
        System.out.println("Enter Your password : ");
        password = in.nextLine();
        System.out.println("Enter Your phone : ");
        phone = in.nextLine();
        System.out.println("Enter Your gender : ");
        gender = in.nextLine();
        System.out.println("Enter Your address : ");
        address = in.nextLine();
        System.out.println("Enter Your specialty : ");
        specialty = in.nextLine();
        System.out.println("Enter Your times number : ");
        time = in.nextInt();
        String t="";
        for (int i = 0 ; i < time ; i++){
            System.out.println("Enter time " + (i+1) + "is");
            t=in.next();
            times.add(t);
        }

    }

    public void edit_doctor() {
        
        int n=0;
        System.out.println("for edit press the number of process \n1-name\n2-mail\n3-password\n4-phone\n5-gender\n6-address\n7-specialty");
        n=in.nextInt();
        if(n==1){
        System.out.println("Enter Your name : ");
        name = in.next();
        }
        else if(n==2){
        System.out.println("Enter Your mail : ");
        mail = in.next();
        }
        else if(n==3)
        {
        System.out.println("Enter Your password : ");
        password = in.next();
        }
        else if(n==4)
        {
        System.out.println("Enter Your phone : ");
        phone = in.next();
        }
        else if(n==5)
        {
        System.out.println("Enter Your gender : ");
        gender = in.next();
        }
        else if(n==6)
        {
        System.out.println("Enter Your address : ");
        address = in.next();
        }
        else if(n==7)
        {
        System.out.println("Enter Your specialty : ");
        specialty = in.next();
        }
        else
        {
            System.out.println("Error Chose from menu");
        }
        

    }
    
    public void d_name_spc(){
        System.out.println("The Name is:"+name+"\n The Specialty is:"+specialty);
    
    
    }
    
    

    
   // @Override
    public void printDoctor(){
        System.out.println(
                "The specialty is :" + specialty+ "\n" +
                "The phone is :" + phone + "\n" +
                "The name is :" + name + "\n" +
                "The gender is :" + gender + "\n" +
                "The address is :" + address + "\n" +
                "The mail is :" + mail );
        app();
    }
    public void app(){
        System.out.println("Your appointments");
        for(int i=0; i<time;i++){
        
            System.out.println("time"+(i+1)+ "is"+times.get(i));
        
        }
    }
   
   

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }




}
