/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i.clup.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Ui {
    ArrayList<admin> admins = new ArrayList<>();
    ArrayList<patient> patients = new ArrayList<>();
    ArrayList<doctor> doctors = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    public void doctorSec() {
        System.out.println("choose from list :  ");
        System.out.println("1-Add doctor\n2-edit doctor\n3-remove\n4-display all doctors\n5-Fill your diganoisis\n8-Doctor Section\n7-Exite");
        String choose = in.next();
        switch (choose) {
            case "1":
                doctors.add(new doctor());
                doctors.get(doctors.size() - 1).add_doctor();
                doctorSec();
                break;
            case "2":
                System.out.println("enter phone number : ");
                String phonenum = in.next();
                try {
                    
                    doctors.get(SearchDoc(phonenum)).edit_doctor();
                } catch (Exception ex) {
                    System.out.println("not found !!");
                    doctorSec();
                }
                doctorSec();

                break;
            case "3":
                System.out.println("enter phone number : ");
                String phone = in.next();
                doctors.remove(SearchDoc(phone));
                doctorSec();
                break;
            case "4":
                for (int i = 0; i < doctors.size(); i++) {
                    doctors.get(i).printDoctor();
                }
                doctorSec();
                break;
            case "5":
                System.out.println("enter phone number : ");
                String pho = in.next();
                String dig="";
                try {
                    
                   System.out.println(" patient sympotoms is : ");
                   System.out.println(patients.get(Searchpatient(pho)).getSymptoms()); 
                   System.out.println("enter digonisis : ");
                     dig=in.next();
                    patients.get(Searchpatient(pho)).setDignosis(dig);
                    patientSec();
                } catch (Exception ex) {
                    System.out.println("not found !!");
                    doctorSec();
                }
                //int pos = SearchPat(phone);
                // write Dignosis
                //   sout (patients.get(pos).getSymptoms());
                // patients.get(pos).setDignosis(Dignosis);
                break;
            case "6":
                patientSec();
                case"7":
                    System.out.println("Thanks for using our System!");
                break;
            default:
                System.err.println("try again");
                doctorSec();
        }

    }
    
    public int SearchDoc(String num) {
        int i = 0;
        boolean isFound = false;
        for (i = 0; i < doctors.size(); i++) {
            if (num.equalsIgnoreCase(doctors.get(i).getPhone())) {
                System.out.println("found .. ");
                isFound = true;
                break;
            }
        }
        return (isFound == true) ? i : -1;
    }
    
    public void StartPoint(){

        System.out.println("choose your section : ");
        System.out.println("1-Doctor\n2-patient");
        String choose = in.next();
        switch (choose){
            case "1":
                doctorSec();
               break;
            case "2":
                patientSec();
                break;
            default:
                System.err.println("try again");
                StartPoint();
        }
    }
    public int Searchpatient(String num) {
        int i = 0;
        boolean isFound = false;
        for (i = 0; i < patients.size(); i++) {
            if (num.equalsIgnoreCase(patients.get(i).getPhone())) {
                System.out.println("found .. ");
                isFound = true;
                break;
            }
        }
        return (isFound == true) ? i : -1;
    }
    
    
   
 public void patientSec() {
        System.out.println("choose from list :  ");
        System.out.println("1-Add Patient\n2-edit Patient\n3-remove Patient\n4-display all Patients\n5-Make appointment\n6-patient sec\n7-Exite");
        String choose = in.next();
        switch (choose) {
            case "1":
                patients.add(new patient());
                patients.get(patients.size() - 1).addpatient();
                patientSec();
                break;
            case "2":
                System.out.println("enter phone number : ");
                String phonenum = in.next();
                try {
                    patients.get(SearchDoc(phonenum)).editPatient();
                } catch (Exception ex) {
                    System.out.println("not found !!");
                    patientSec();
                }
                patientSec();

                break;
            case "3":
                System.out.println("enter phone number : ");
                String phone = in.next();
                patients.remove(Searchpatient(phone));
                patientSec();
                break;
            case "4":
                for (int i = 0; i < patients.size(); i++) {
                    System.out.println(patients.get(i).toString());
                }
                patientSec();
                break;
            case "5":
                try{
                System.out.println("Choose From Doctors and write number of selection");
                
                for(int i=0; i<doctors.size(); i++)
                {
                    System.out.println((i+1)+"is");doctors.get(i).d_name_spc();
                }
                int selcted_doc=0;
                selcted_doc=in.nextInt();
                
                System.out.println("The available times of selected Doctor are :");
                doctors.get((selcted_doc -1)).app();
                System.out.println("Chose the the number of your Suitable appointment");
                 int pos_apoint =0;
                 pos_apoint=in.nextInt();
                doctors.remove((pos_apoint -1));
                    System.out.println(" Booking Done! ");
                    patientSec();
                } catch (Exception ex) {
                    System.out.println("erorr case 5");
                    patientSec();
                }
                break;
                      
            case "6":
                doctorSec();
                break;
            case "7":
                System.out.println("Thanks for using our System!");
                break;
            default:
                System.err.println("try again");
                patientSec();
        }

    }
    

}

