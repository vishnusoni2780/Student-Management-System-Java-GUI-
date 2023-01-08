package com.student.manage;

public class Student {
    private int sid;
    private String name;
    private String email;
    private String phone;
    private String city;

    public int getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public Student(String name, String email, String phone, String city) {
        super();
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.city = city;
    }
    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" + "sid=" + sid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", city=" + city + '}';
    }
    
    
}
