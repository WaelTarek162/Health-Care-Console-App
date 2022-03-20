/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i.clup.project;

import java.util.Scanner;

/**
 * @author The Twins
 */
public class patient extends Person {
    Scanner in = new Scanner(System.in);
    private String symptoms;
    private String payment;
    private String dignosis;
    private String HisDoctor;
    private String appointment;

    patient() {
    }
    patient(String address, String phone, String symptoms, String payment, String dignosis, String gender) {

        this.address = address;
        this.phone = phone;
        this.symptoms = symptoms;
        this.payment = payment;
        this.dignosis = dignosis;
        this.gender = gender;

    }

    public void addpatient() {
        System.out.println(" Entre Your name : ");
        name = in.nextLine();
        System.out.println(" Entre Your mail : ");
        mail = in.nextLine();
        System.out.println(" Entre Your password : ");
        password = in.nextLine();
        System.out.println(" Entre Your phone : ");
        phone = in.nextLine();
        System.out.println(" Entre Your symptoms : ");
        symptoms = in.nextLine();
        System.out.println(" Entre Your gender : ");
        gender = in.nextLine();
        System.out.println(" Entre Your address : ");
        address = in.nextLine();
        System.out.println(" Entre Your payment method : ");
        payment = in.nextLine();
    }
 public void editPatient() {
     int n=0;
        System.out.println("for edit press the number of process \n1-name\n2-mail"
                + "\n3-password\n4-phone\n5-sympotoms\n6-gender\n7-address\n8-payment method");
        if(n==1){
        System.out.println(" Entre Your name : ");
        name = in.nextLine();
        }
        else if(n==2){
        System.out.println(" Entre Your mail : ");
        mail = in.nextLine();
        }
         else if(n==3){
        System.out.println(" Entre Your password : ");
        password = in.nextLine();
         }
         else if(n==4){
        System.out.println(" Entre Your phone : ");
        phone = in.nextLine();
                 }
         else if(n==5){
        System.out.println(" Entre Your symptoms : ");
        symptoms = in.nextLine();
                 }
         else if(n==6){
        System.out.println(" Entre Your gender : ");
        gender = in.nextLine();
                 }
         else if(n==7){
        System.out.println(" Entre Your address : ");
        address = in.nextLine();
                 }
         else if(n==8){
        System.out.println(" Entre Your payment method : ");
        payment = in.nextLine();
                 }
        else
        {
            System.out.println("Error Chose from menu");
        }
        
      //  System.out.println(" Entre Your appointment : ");
       //admin appointment = in.nextLine();
    }
    @Override
    public String toString() {
        return 
                "The name='" + name + "\n" +
                "The mail='" + mail + "\n" +
                "The gender='" + gender + "\n" +
                "The address='" + address + "\n" +
                "The symptoms='" + symptoms + "\n" +
                "The dignosis='" + dignosis + "\n" +
                "The phone='" + phone + "\n" +
                "The payment='" + payment ;
    }
    
 
    

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getDignosis() {
        return dignosis;
    }

    public void setDignosis(String dignosis) {
        this.dignosis = dignosis;
    }

    public String getHisDoctor() {
        return HisDoctor;
    }

    public void setHisDoctor(String hisDoctor) {
        HisDoctor = hisDoctor;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }
    
    
    
}
