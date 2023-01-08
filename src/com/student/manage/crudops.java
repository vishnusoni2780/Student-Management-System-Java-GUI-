package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.*; 
import java.util.*;

public class crudops {
    static Connection con;
    public void addStudent(Student st) {
        try{
        con =  dbconnection.createC();
        
        String query = "insert into student_details(name, email, phone, city) VALUES(?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1,st.getName());
        pstmt.setString(2,st.getEmail());
        pstmt.setString(3,st.getPhone());
        pstmt.setString(4,st.getCity());
        
        pstmt.executeUpdate();
        System.out.println("Student Added Successfully.");
        con.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public void delStudent(int sid) {
        try{
        con =  dbconnection.createC();
        
        String query = "delete from student_details where sid = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1,sid);
        
        pstmt.executeUpdate();
        System.out.println("Student Deleted Successfully.");
        con.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
   
    public ResultSet displayStudent() {
        try{
            con =  dbconnection.createC();
            String query = "select * from student_details";
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(query);
            System.out.println("Student Details Fetched Successfully.");
            return set;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public static String input(){
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        return inp;
    }
    
    
    public ResultSet getStudentForUpd(int sid) {
        try{
            con =  dbconnection.createC();
            String query = "select * from student_details where sid = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1,sid);
            ResultSet set = pstmt.executeQuery();
            System.out.println("Student Details Fetched Successfully.");
            return set;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
    public void updStudent(Student st, int sid){
        try{
            con =  dbconnection.createC();
            String query = "update student_details SET name=?, email=?, phone=?, city=? WHERE sid=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,st.getName());
            pstmt.setString(2,st.getEmail());
            pstmt.setString(3,st.getPhone());
            pstmt.setString(4,st.getCity());
            pstmt.setInt(5,sid);

            pstmt.executeUpdate();
            System.out.println("Student Updated Successfully.");
            
            con.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
