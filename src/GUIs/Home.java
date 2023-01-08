package GUIs;

public class Home extends javax.swing.JFrame {
    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Register_Button = new javax.swing.JButton();
        Update_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        Exit_Button1 = new javax.swing.JButton();
        View_Button = new javax.swing.JButton();
        Logo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));
        setResizable(false);

        Register_Button.setBackground(new java.awt.Color(0, 0, 0));
        Register_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Register_Button.setForeground(new java.awt.Color(255, 102, 0));
        Register_Button.setText("Register Student");
        Register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_ButtonActionPerformed(evt);
            }
        });

        Update_Button.setBackground(new java.awt.Color(0, 0, 0));
        Update_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Update_Button.setForeground(new java.awt.Color(255, 102, 0));
        Update_Button.setText("Update Student");
        Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_ButtonActionPerformed(evt);
            }
        });

        Delete_Button.setBackground(new java.awt.Color(0, 0, 0));
        Delete_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Delete_Button.setForeground(new java.awt.Color(255, 102, 0));
        Delete_Button.setText("Delete Student");
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
            }
        });

        Exit_Button1.setBackground(new java.awt.Color(0, 0, 0));
        Exit_Button1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Exit_Button1.setForeground(new java.awt.Color(255, 102, 0));
        Exit_Button1.setText("Exit");
        Exit_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_Button1ActionPerformed(evt);
            }
        });

        View_Button.setBackground(new java.awt.Color(0, 0, 0));
        View_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        View_Button.setForeground(new java.awt.Color(255, 102, 0));
        View_Button.setText("View Student");
        View_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_ButtonActionPerformed(evt);
            }
        });

        Logo.setBackground(new java.awt.Color(0, 0, 0));
        Logo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 102, 0));
        Logo.setText("             Student Management System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Register_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(View_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(70, 70, 70)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(Exit_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Register_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(View_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(Exit_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_ButtonActionPerformed
       new Add_Screen().setVisible(true);
    }//GEN-LAST:event_Register_ButtonActionPerformed

    private void Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ButtonActionPerformed
        // TODO add your handling code here:
        new Upd_Screen().setVisible(true);
    }//GEN-LAST:event_Update_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
        // TODO add your handling code here:
        new Del_Screen().setVisible(true);
        
    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void Exit_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_Button1ActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_Exit_Button1ActionPerformed

    private void View_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_ButtonActionPerformed
        // TODO add your handling code here:
        new View_Screen().setVisible(true);
    }//GEN-LAST:event_View_ButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete_Button;
    private javax.swing.JButton Exit_Button1;
    private javax.swing.JTextField Logo;
    private javax.swing.JButton Register_Button;
    private javax.swing.JButton Update_Button;
    private javax.swing.JButton View_Button;
    // End of variables declaration//GEN-END:variables
}
