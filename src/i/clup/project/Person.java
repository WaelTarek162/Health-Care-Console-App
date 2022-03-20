/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i.clup.project;

/**
 *
 * @author The Twins
 */
public class Person {

    protected String phone;
    protected String name;
    protected String gender;
    protected String address;
    protected String password;
    protected String mail;

    public Person(String phone, String name, String gender, String address, String password, String mail) {
        this.phone = phone;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.password = password;
        this.mail = mail;
    }

    public Person() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
