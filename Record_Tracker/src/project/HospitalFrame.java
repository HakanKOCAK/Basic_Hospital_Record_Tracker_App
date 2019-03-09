/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author hakankocak
 */
public class HospitalFrame extends javax.swing.JFrame {

    DoctorFrame df = new DoctorFrame(this);
    PatientFrame pf = new PatientFrame(this);
    /**
     * Creates new form HospitalFrame
     */
    public HospitalFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doctorsButton = new javax.swing.JButton();
        patientsButton = new javax.swing.JButton();
        hospitalLabel = new javax.swing.JLabel();
        departmentPanel = new javax.swing.JPanel();
        departmentsLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital Frame");

        doctorsButton.setText("Doctors");
        doctorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorsButtonActionPerformed(evt);
            }
        });

        patientsButton.setText("Patients");
        patientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsButtonActionPerformed(evt);
            }
        });

        hospitalLabel.setBackground(new java.awt.Color(255, 204, 255));
        hospitalLabel.setText("HOSPITAL");
        hospitalLabel.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        departmentPanel.setBackground(new java.awt.Color(153, 153, 153));
        departmentPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        departmentPanel.setForeground(new java.awt.Color(0, 153, 153));

        departmentsLabel.setForeground(new java.awt.Color(255, 255, 153));
        departmentsLabel.setText("Departments");

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("-Neurology");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("-Cosmetic Surgery");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("-General Surgery");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("-Gynaecology");

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("-Oncology");

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("-Physiotherapy");

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("-Urology");

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("-Cardiology");

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("-Ophthalmology");

        javax.swing.GroupLayout departmentPanelLayout = new javax.swing.GroupLayout(departmentPanel);
        departmentPanel.setLayout(departmentPanelLayout);
        departmentPanelLayout.setHorizontalGroup(
            departmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(departmentPanelLayout.createSequentialGroup()
                .addGroup(departmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(departmentPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(departmentsLabel))
                    .addGroup(departmentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(departmentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(departmentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(departmentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(departmentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(departmentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(departmentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(departmentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(departmentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        departmentPanelLayout.setVerticalGroup(
            departmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(departmentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(departmentsLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(departmentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientsButton)
                    .addComponent(doctorsButton))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(hospitalLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hospitalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(departmentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doctorsButton)
                .addGap(82, 82, 82)
                .addComponent(patientsButton)
                .addGap(87, 87, 87))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorsButtonActionPerformed
        // TODO add your handling code here:
        df.setTextArea();
        df.setVisible(true);
    }//GEN-LAST:event_doctorsButtonActionPerformed

    private void patientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientsButtonActionPerformed
        // TODO add your handling code here:
         pf.setTextArea();
         pf.setVisible(true);
    }//GEN-LAST:event_patientsButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel departmentPanel;
    private javax.swing.JLabel departmentsLabel;
    private javax.swing.JButton doctorsButton;
    private javax.swing.JLabel hospitalLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton patientsButton;
    // End of variables declaration//GEN-END:variables
}