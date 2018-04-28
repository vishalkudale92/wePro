package com.ip.wePro.userInfo;
import javax.persistence.*;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;
    private String name;
    private String dob;
    private String gender;
    private String address;
    private String email;
    private String phone;
    private String edu;
    private String experience;
    private String skills;
    private String password;

    protected User(){}

    public User(int userid, String name, String dob, String gender, String address, String email, String phone, String edu, String experience, String skills, String password) {
        this.userid = userid;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.edu = edu;
        this.experience = experience;
        this.skills = skills;
        this.password = password;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "userid=" + userid +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", edu='" + edu + '\'' +
                ", experience='" + experience + '\'' +
                ", skills='" + skills + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
