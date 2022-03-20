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
public class admin extends Person {
    Scanner in = new Scanner(System.in);

    admin() {
        mail = "admin";
        password = "admin";

    }

    public admin(String name, String password) {
        this.name = name;
        this.password = password;

    }

    void addAdmin() {
        System.out.println(" Entre Your name : ");
        name = in.nextLine();
        System.out.println(" Entre Your mail : ");
        mail = in.nextLine();
        System.out.println(" Entre Your password : ");
        password = in.nextLine();
        System.out.println(" Entre Your phone : ");
        phone = in.next();
    }
 
    public boolean validating() {
        String mail;
        String password;
        System.out.println("enter your mail");
        mail = in.next();
        System.out.println("enter your password");
        password = in.next();
        if (mail.equals(this.mail) && password.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }


}
