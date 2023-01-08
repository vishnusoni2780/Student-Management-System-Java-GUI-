package sms;

import com.student.manage.Student;
import com.student.manage.dbconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.*; 
import java.util.*;

public class crudops_cmd {
    static Connection con;
    
    public static boolean addStudent(Student st) {
        boolean flag=false;
        try{
        con =  dbconnection.createC();
        
        String query = "insert into student_details(name, email, phone, city) VALUES(?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1,st.getName());
        pstmt.setString(2,st.getEmail());
        pstmt.setString(3,st.getPhone());
        pstmt.setString(4,st.getCity());
        
        pstmt.executeUpdate();
        flag = true;
        con.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }
    
    public static boolean delStudent(int sid) {
        boolean flag=false;
        try{
        con =  dbconnection.createC();
        
        String query = "delete from student_details where sid = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1,sid);
        
        pstmt.executeUpdate();
        flag = true;
        con.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }
   
    public static void displayStudent() {
        try{
        con =  dbconnection.createC();
        
        String query = "select * from student_details";
        Statement stmt = con.createStatement();
        ResultSet set = stmt.executeQuery(query);
        
        while(set.next()){
            
            int sid = set.getInt(1);
            String sname = set.getString(2);
            String semail = set.getString(3);
            String sphone = set.getString(4);
            String scity = set.getString(5);
            
            System.out.println("ID: "+ sid);
            System.out.println("Name: "+ sname);
            System.out.println("Email-id: "+ semail);
            System.out.println("Phone: "+ sphone);
            System.out.println("City: "+ scity);
            System.out.println("- - - - - - - -");
            
        }
        
        con.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static String input(){
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        return inp;
    }
    public static boolean updStudent(int sid) {
        boolean flag=false;
        try{
        con =  dbconnection.createC();
        
        String query = "select * from student_details where sid=?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1,sid);
        ResultSet set = pstmt.executeQuery();
        while(set.next()){
            
            String sname = set.getString(2);
            String semail = set.getString(3);
            String sphone = set.getString(4);
            String scity = set.getString(5);
            
            System.out.println("- - - - - - - -");
            System.out.println("ID: "+ sid);
            System.out.println("Name: "+ sname);
            System.out.println("Email-id: "+ semail);
            System.out.println("Phone: "+ sphone);
            System.out.println("City: "+ scity);
            System.out.println("- - - - - - - -");
        }
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tell me what you want to update: ");
        int opted_choice_for_upd = sc.nextInt();
        
        if (opted_choice_for_upd==2){
            System.out.println("Opted for Student Name change...");
            System.out.println("Enter new Student Name: ");
            String updName = input();
            
            String updquery = "UPDATE student_details SET name = ? WHERE sid = ?";
            PreparedStatement pstmt_for_upd = con.prepareStatement(updquery);
            pstmt_for_upd.setString(1,updName);
            pstmt_for_upd.setInt(2,sid);
            pstmt_for_upd.executeUpdate();
            flag = true;
        }
        else if (opted_choice_for_upd==3){
            System.out.println("Opted for Student E-mail change...");
            System.out.println("Enter new Student E-mail: ");
            String updEmail = input();
            
            String updquery = "UPDATE student_details SET email = ? WHERE sid = ?";
            PreparedStatement pstmt_for_upd = con.prepareStatement(updquery);
            pstmt_for_upd.setString(1,updEmail);
            pstmt_for_upd.setInt(2,sid);
            pstmt_for_upd.executeUpdate();
            flag = true;
        }
        else if (opted_choice_for_upd==4){
            System.out.println("Opted for Student Phone change...");
            System.out.println("Enter new Student Phone: ");
            String updPhn = input();
            
            String updquery = "UPDATE student_details SET phone = ? WHERE sid = ?";
            PreparedStatement pstmt_for_upd = con.prepareStatement(updquery);
            pstmt_for_upd.setString(1,updPhn);
            pstmt_for_upd.setInt(2,sid);
            pstmt_for_upd.executeUpdate();
            flag = true;
        }
        else if (opted_choice_for_upd==5){
            System.out.println("Opted for Student City change...");
            System.out.println("Enter new Student City: ");
            String updCity = input();
            
            String updquery = "UPDATE student_details SET city = ? WHERE sid = ?";
            PreparedStatement pstmt_for_upd = con.prepareStatement(updquery);
            pstmt_for_upd.setString(1,updCity);
            pstmt_for_upd.setInt(2,sid);
            pstmt_for_upd.executeUpdate();
            flag = true;
        }
        
        String q = "select * from student_details where sid = ?";
        PreparedStatement pstmt_for_updated_record = con.prepareStatement(q);
        pstmt_for_updated_record.setInt(1,sid);
        ResultSet s = pstmt_for_updated_record.executeQuery();
        while(s.next()){
            
            String sname = s.getString(2);
            String semail = s.getString(3);
            String sphone = s.getString(4);
            String scity = s.getString(5);
            
            System.out.println("- - - - - - - -");
            System.out.println("ID: "+ sid);
            System.out.println("Name: "+ sname);
            System.out.println("Email-id: "+ semail);
            System.out.println("Phone: "+ sphone);
            System.out.println("City: "+ scity);
            System.out.println("- - - - - - - -");
        }
        
        con.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }
    
}
