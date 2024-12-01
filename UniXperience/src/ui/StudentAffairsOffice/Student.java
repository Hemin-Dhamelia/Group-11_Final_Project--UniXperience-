/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.StudentAffairsOffice;

/**
 *
 * @author HP
 */
public class Student extends javax.swing.JPanel {

    /**
     * Creates new form Student
     */
    public Student() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnScheduleAppointments = new javax.swing.JButton();
        btnViewClubs = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(850, 600));

        btnScheduleAppointments.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnScheduleAppointments.setText("Schedule Appointments");
        btnScheduleAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleAppointmentsActionPerformed(evt);
            }
        });

        btnViewClubs.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnViewClubs.setText("View Clubs");
        btnViewClubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewClubsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewClubs, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnScheduleAppointments))
                .addContainerGap(336, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnScheduleAppointments, btnViewClubs});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(btnScheduleAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnViewClubs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnScheduleAppointments, btnViewClubs});

    }// </editor-fold>//GEN-END:initComponents

    private void btnScheduleAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleAppointmentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnScheduleAppointmentsActionPerformed

    private void btnViewClubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewClubsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewClubsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnScheduleAppointments;
    private javax.swing.JButton btnViewClubs;
    // End of variables declaration//GEN-END:variables
}
