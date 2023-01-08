package sms;
import com.student.manage.Student;
import java.util.*;

public class SMS {
    
    public static Student input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name: ");
        String name = sc.nextLine();
                
        System.out.println("Enter the student email: ");
        String email = sc.nextLine();
                
        System.out.println("Enter the student phone: ");
        String phone = sc.nextLine();
                
        System.out.println("Enter the student city: ");
        String city = sc.nextLine();
                
        Student st = new Student(name, email, phone, city);
        return st;
    }
    
    /*
    public static void main(String[] args) {
        System.out.println("Welcome to Student Management System.");
        
        while(true){
            System.out.println("\nPRESS 1: Add Student");
            System.out.println("PRESS 2: Delete Student");
            System.out.println("PRESS 3: Show Student");
            System.out.println("PRESS 4: Update Student");
            System.out.println("PRESS 5: Exit");
            
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice==1){
                // Add Student
                Student st = input();
                //System.out.println(st);
                boolean flag = crudops_cmd.addStudent(st);
                if(flag){
                    System.out.println("Student Added Successfully.");
                }
                else{
                    System.out.println("Something went wrong!");
                }
            }
            else if (choice==2){
                // Delete Student
                System.out.println("Enter student id to Delete Student: ");
                int sid = sc.nextInt();
                boolean flag = crudops_cmd.delStudent(sid);
                if(flag){
                    System.out.println("Student Deleted Successfully.");
                }
                else{
                    System.out.println("Something went wrong!");
                }
            }
            else if (choice==3){
                // Show Student
                System.out.println("Show Student");
                crudops_cmd.displayStudent();
            }
            else if (choice==4){
                // Update Student
                System.out.println("Enter student id to Update Student: ");
                int sid = sc.nextInt();
                boolean flag = crudops_cmd.updStudent(sid);
                if(flag){
                    System.out.println("Student Updated Successfully.");
                }
                else{
                    System.out.println("Something went wrong!");
                }
            }
            else if (choice==5){
                // Exit
                System.out.println("GoodBye!");
                break;
            }
            else {
                System.out.println("Invalid Choice!");
            }
        }
        System.out.println("Thanks for using.");
    }*/
}
