package GUIs;

import com.student.manage.Student;
import com.student.manage.crudops;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Upd_Screen extends javax.swing.JFrame {
    public Upd_Screen() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JTextField();
        Exit_Button = new javax.swing.JButton();
        S_ID_Label = new javax.swing.JTextField();
        S_ID_Val = new javax.swing.JTextField();
        Get_Button = new javax.swing.JButton();
        S_Name_Label = new javax.swing.JTextField();
        S_Email_Label = new javax.swing.JTextField();
        S_Phn_Label = new javax.swing.JTextField();
        S_City_Label = new javax.swing.JTextField();
        S_Name_Val = new javax.swing.JTextField();
        S_Email_Val = new javax.swing.JTextField();
        S_Phone_Val = new javax.swing.JTextField();
        S_City_Val = new javax.swing.JTextField();
        Upd_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));

        Logo.setBackground(new java.awt.Color(0, 0, 0));
        Logo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 102, 0));
        Logo.setText("             Student Management System");
        Logo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoActionPerformed(evt);
            }
        });

        Exit_Button.setBackground(new java.awt.Color(0, 0, 0));
        Exit_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Exit_Button.setForeground(new java.awt.Color(255, 102, 0));
        Exit_Button.setText("Exit");
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });

        S_ID_Label.setBackground(new java.awt.Color(0, 0, 0));
        S_ID_Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        S_ID_Label.setForeground(new java.awt.Color(255, 102, 0));
        S_ID_Label.setText("Student ID:");
        S_ID_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_ID_LabelActionPerformed(evt);
            }
        });

        S_ID_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_ID_ValActionPerformed(evt);
            }
        });

        Get_Button.setBackground(new java.awt.Color(0, 0, 0));
        Get_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Get_Button.setForeground(new java.awt.Color(255, 102, 0));
        Get_Button.setText("Get Details");
        Get_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Get_ButtonActionPerformed(evt);
            }
        });

        S_Name_Label.setBackground(new java.awt.Color(0, 0, 0));
        S_Name_Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        S_Name_Label.setForeground(new java.awt.Color(255, 102, 0));
        S_Name_Label.setText("Student Name");
        S_Name_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_Name_LabelActionPerformed(evt);
            }
        });

        S_Email_Label.setBackground(new java.awt.Color(0, 0, 0));
        S_Email_Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        S_Email_Label.setForeground(new java.awt.Color(255, 102, 0));
        S_Email_Label.setText("Student Email");
        S_Email_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_Email_LabelActionPerformed(evt);
            }
        });

        S_Phn_Label.setBackground(new java.awt.Color(0, 0, 0));
        S_Phn_Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        S_Phn_Label.setForeground(new java.awt.Color(255, 102, 0));
        S_Phn_Label.setText("Student Phone");
        S_Phn_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_Phn_LabelActionPerformed(evt);
            }
        });

        S_City_Label.setBackground(new java.awt.Color(0, 0, 0));
        S_City_Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        S_City_Label.setForeground(new java.awt.Color(255, 102, 0));
        S_City_Label.setText("Student City");
        S_City_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_City_LabelActionPerformed(evt);
            }
        });

        S_Name_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_Name_ValActionPerformed(evt);
            }
        });

        S_Email_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_Email_ValActionPerformed(evt);
            }
        });

        S_Phone_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_Phone_ValActionPerformed(evt);
            }
        });

        S_City_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_City_ValActionPerformed(evt);
            }
        });

        Upd_Button.setBackground(new java.awt.Color(0, 0, 0));
        Upd_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Upd_Button.setForeground(new java.awt.Color(255, 102, 0));
        Upd_Button.setText("Update");
        Upd_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upd_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(S_ID_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(S_ID_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(Get_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(Upd_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(S_City_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(S_City_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(S_Name_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(S_Email_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(S_Phn_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(S_Name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(S_Email_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(S_Phone_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S_ID_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_ID_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_Name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_Name_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Get_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(S_Email_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S_Email_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S_Phone_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_Phn_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(S_City_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S_City_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Upd_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    private void S_ID_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_ID_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_ID_LabelActionPerformed

    private void S_ID_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_ID_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_ID_ValActionPerformed

    private void Get_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Get_ButtonActionPerformed
        // TODO add your handling code here:
        //new Upd_Data_Screen().setVisible(true);
        int sid = Integer.parseInt(S_ID_Val.getText());
        ResultSet set = new crudops().getStudentForUpd(sid);
        try {
            while(set.next())
            {
                String id = String.valueOf(set.getInt("sid"));
                String Student_Name =set.getString("name");
                String Student_Email =set.getString("email");
                String Student_Phone =set.getString("phone");
                String Student_City =set.getString("city");
                
                S_Name_Val.setText(Student_Name);
                S_Email_Val.setText(Student_Email);
                S_Phone_Val.setText(Student_Phone);
                S_City_Val.setText(Student_City);
            } 
            JOptionPane.showMessageDialog(null, "Student Details have fetchd Successfully. Please Update then & there.", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_Get_ButtonActionPerformed

    private void S_Name_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_Name_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_Name_LabelActionPerformed

    private void S_Email_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_Email_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_Email_LabelActionPerformed

    private void S_Phn_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_Phn_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_Phn_LabelActionPerformed

    private void S_City_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_City_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_City_LabelActionPerformed

    private void S_Name_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_Name_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_Name_ValActionPerformed

    private void S_Email_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_Email_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_Email_ValActionPerformed

    private void S_Phone_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_Phone_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_Phone_ValActionPerformed

    private void S_City_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_City_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_City_ValActionPerformed

    private void Upd_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upd_ButtonActionPerformed
        // TODO add your handling code here:
        int sid = Integer.parseInt(S_ID_Val.getText());
        String sname = S_Name_Val.getText();
        String semail = S_Email_Val.getText();
        String scity = S_City_Val.getText();
        String sphn = S_Phone_Val.getText();
        
        if ((sname.isEmpty() || semail.isEmpty()) || (sphn.isEmpty() || scity.isEmpty())){
            JOptionPane.showMessageDialog(null, "Please enter all the required fields.", "Confirmation", JOptionPane.OK_OPTION);
        }
        else{
            Student st = new Student(sname,semail,sphn,scity);
            new crudops().updStudent(st,sid);
            JOptionPane.showMessageDialog(null, "Student Updated Successfully.", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_Upd_ButtonActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Upd_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit_Button;
    private javax.swing.JButton Get_Button;
    private javax.swing.JTextField Logo;
    private javax.swing.JTextField S_City_Label;
    private javax.swing.JTextField S_City_Val;
    private javax.swing.JTextField S_Email_Label;
    private javax.swing.JTextField S_Email_Val;
    private javax.swing.JTextField S_ID_Label;
    private javax.swing.JTextField S_ID_Val;
    private javax.swing.JTextField S_Name_Label;
    private javax.swing.JTextField S_Name_Val;
    private javax.swing.JTextField S_Phn_Label;
    private javax.swing.JTextField S_Phone_Val;
    private javax.swing.JButton Upd_Button;
    // End of variables declaration//GEN-END:variables
}
