package GUIs;

import com.student.manage.crudops;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class Del_Screen extends javax.swing.JFrame {

    public Del_Screen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JTextField();
        S_ID_Label = new javax.swing.JTextField();
        S_ID_Val = new javax.swing.JTextField();
        Delete_Button = new javax.swing.JButton();
        Exit_Button = new javax.swing.JButton();

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

        Delete_Button.setBackground(new java.awt.Color(0, 0, 0));
        Delete_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Delete_Button.setForeground(new java.awt.Color(255, 102, 0));
        Delete_Button.setText("Delete");
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(S_ID_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(S_ID_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S_ID_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_ID_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(435, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoActionPerformed

    private void S_ID_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_ID_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_ID_LabelActionPerformed

    private void S_ID_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_ID_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_ID_ValActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
        // TODO add your handling code here:
        int sid = Integer.parseInt(S_ID_Val.getText());
        String ssid = String.valueOf(sid);
        boolean flag=false;
        
        try
        {
            ResultSet set = new crudops().displayStudent();
            while(set.next())
            {
                String id = String.valueOf(set.getInt("sid"));
                if (id.equals(ssid)){
                    new crudops().delStudent(sid);
                    flag=true;
                }
                else{
                    flag=false;
                }
            }
            
            if(flag){
                JOptionPane.showMessageDialog(null, "Student Deleted Successfully.", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "Student Dosn't Exist.", "Confirmation", JOptionPane.OK_OPTION);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Del_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete_Button;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JTextField Logo;
    private javax.swing.JTextField S_ID_Label;
    private javax.swing.JTextField S_ID_Val;
    // End of variables declaration//GEN-END:variables
}
