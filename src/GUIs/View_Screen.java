package GUIs;

import com.student.manage.crudops;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class View_Screen extends javax.swing.JFrame {
    public View_Screen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JTextField();
        Logo1 = new javax.swing.JTextField();
        Exit_Button = new javax.swing.JButton();
        View_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();

        Logo.setBackground(new java.awt.Color(0, 0, 0));
        Logo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 102, 0));
        Logo.setText("             Student Management System");
        Logo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));

        Logo1.setBackground(new java.awt.Color(0, 0, 0));
        Logo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Logo1.setForeground(new java.awt.Color(255, 102, 0));
        Logo1.setText("             Student Management System");
        Logo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logo1ActionPerformed(evt);
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

        View_Button.setBackground(new java.awt.Color(0, 0, 0));
        View_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        View_Button.setForeground(new java.awt.Color(255, 102, 0));
        View_Button.setText("Show");
        View_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_ButtonActionPerformed(evt);
            }
        });

        tb.setBackground(new java.awt.Color(204, 204, 204));
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Student Name", "Student Email", "Student Phone", "Student City"
            }
        ));
        jScrollPane1.setViewportView(tb);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(View_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(View_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoActionPerformed

    private void Logo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logo1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Logo1ActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    private void View_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_ButtonActionPerformed
        // TODO add your handling code here:
        try
        {
            ResultSet set = new crudops().displayStudent();
            while(set.next())
            {
                String id = String.valueOf(set.getInt("sid"));
                String Student_Name =set.getString("name");
                String Student_Email =set.getString("email");
                String Student_Phone =set.getString("phone");
                String Student_City =set.getString("city");

                String tbData[] = {id,Student_Name,Student_Email,Student_Phone,Student_City};
                DefaultTableModel tb1Mode1  = (DefaultTableModel)tb.getModel();
                tb1Mode1.addRow(tbData);
            } 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_View_ButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit_Button;
    private javax.swing.JTextField Logo;
    private javax.swing.JTextField Logo1;
    private javax.swing.JButton View_Button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables
}