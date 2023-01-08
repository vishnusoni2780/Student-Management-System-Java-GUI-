package GUIs;

import com.student.manage.Student;
import com.student.manage.crudops;
import javax.swing.JOptionPane;

public class Add_Screen extends javax.swing.JFrame {

    public Add_Screen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        S_Name_Val = new javax.swing.JTextField();
        S_Email_Val = new javax.swing.JTextField();
        S_Phone_Val = new javax.swing.JTextField();
        Logo = new javax.swing.JTextField();
        S_Phn_Label = new javax.swing.JTextField();
        S_Email_Label = new javax.swing.JTextField();
        S_Name_Label = new javax.swing.JTextField();
        Add_Button = new javax.swing.JButton();
        Exit_Button = new javax.swing.JButton();
        S_Phn_Label1 = new javax.swing.JTextField();
        S_City_Val = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));

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

        Logo.setBackground(new java.awt.Color(0, 0, 0));
        Logo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 102, 0));
        Logo.setText("             Student Management System");
        Logo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoActionPerformed(evt);
            }
        });

        S_Phn_Label.setBackground(new java.awt.Color(0, 0, 0));
        S_Phn_Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        S_Phn_Label.setForeground(new java.awt.Color(255, 102, 0));
        S_Phn_Label.setText("Student City");
        S_Phn_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_Phn_LabelActionPerformed(evt);
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

        S_Name_Label.setBackground(new java.awt.Color(0, 0, 0));
        S_Name_Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        S_Name_Label.setForeground(new java.awt.Color(255, 102, 0));
        S_Name_Label.setText("Student Name");
        S_Name_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_Name_LabelActionPerformed(evt);
            }
        });

        Add_Button.setBackground(new java.awt.Color(0, 0, 0));
        Add_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Add_Button.setForeground(new java.awt.Color(255, 102, 0));
        Add_Button.setText("Add");
        Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ButtonActionPerformed(evt);
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

        S_Phn_Label1.setBackground(new java.awt.Color(0, 0, 0));
        S_Phn_Label1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        S_Phn_Label1.setForeground(new java.awt.Color(255, 102, 0));
        S_Phn_Label1.setText("Student Phone");
        S_Phn_Label1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_Phn_Label1ActionPerformed(evt);
            }
        });

        S_City_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_City_ValActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(S_Phn_Label1)
                        .addComponent(S_Phn_Label))
                    .addComponent(S_Email_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_Name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(S_Email_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S_Name_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S_Phone_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(S_City_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(238, 238, 238))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S_Name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_Name_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S_Email_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_Email_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S_Phn_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_Phone_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(S_City_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_Phn_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(187, 187, 187))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void S_Email_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_Email_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_Email_ValActionPerformed

    private void S_Phone_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_Phone_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_Phone_ValActionPerformed

    private void S_Phn_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_Phn_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_Phn_LabelActionPerformed

    private void S_Email_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_Email_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_Email_LabelActionPerformed

    private void S_Name_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_Name_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_Name_LabelActionPerformed

    private void LogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoActionPerformed

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
        // TODO add your handling code here:
        String sname = S_Name_Val.getText();
        String semail = S_Email_Val.getText();
        String scity = S_City_Val.getText();
        String sphn = S_Phone_Val.getText();
        
        if ((sname.isEmpty() || semail.isEmpty()) || (sphn.isEmpty() || scity.isEmpty())){
            JOptionPane.showMessageDialog(null, "Please enter all the required fields.", "Confirmation", JOptionPane.OK_OPTION);
        }
        else{
            Student st = new Student(sname,semail,sphn,scity);
            new crudops().addStudent(st);
            JOptionPane.showMessageDialog(null, "Student Added Successfully.", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    private void S_Name_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_Name_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_Name_ValActionPerformed

    private void S_Phn_Label1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_Phn_Label1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_Phn_Label1ActionPerformed

    private void S_City_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_City_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_City_ValActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JTextField Logo;
    private javax.swing.JTextField S_City_Val;
    private javax.swing.JTextField S_Email_Label;
    private javax.swing.JTextField S_Email_Val;
    private javax.swing.JTextField S_Name_Label;
    private javax.swing.JTextField S_Name_Val;
    private javax.swing.JTextField S_Phn_Label;
    private javax.swing.JTextField S_Phn_Label1;
    private javax.swing.JTextField S_Phone_Val;
    // End of variables declaration//GEN-END:variables
}
