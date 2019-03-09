/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author hakankocak
 */
public class PatientFrame extends javax.swing.JFrame implements ActionListener {

    HospitalFrame hf=null;
    /**
     * Creates new form PatientFrame
     */
    public PatientFrame(HospitalFrame h) {
        initComponents();
        setLocationRelativeTo(null);
        setSize(780,550);
        TextPrompt name = new TextPrompt("Fullname", nameTF);
        TextPrompt search = new TextPrompt("Patient ssn", searchTF);
        TextPrompt age= new TextPrompt("Age", ageTF);
        TextPrompt discharge = new TextPrompt("Patient ssn", dischargeTF);
        TextPrompt service = new TextPrompt("Service Name, Price", specialSv);
        TextPrompt ill = new TextPrompt("Illness of the Patient", illness);
        TextPrompt sst = new TextPrompt("SS Type (Government&Special)", sstype);
        age.changeAlpha(0.5f);
        age.changeStyle(Font.BOLD + Font.ITALIC);
        name.changeAlpha(0.5f);
        name.changeStyle(Font.BOLD + Font.ITALIC);
        search.changeAlpha(0.5f);
        search.changeStyle(Font.BOLD + Font.ITALIC);
        discharge.changeAlpha(0.5f);
        discharge.changeStyle(Font.BOLD + Font.ITALIC);
        service.changeAlpha(0.5f);
        service.changeStyle(Font.BOLD + Font.ITALIC);
        fillComboBox();
        setTextArea();
        ill.changeAlpha(0.5f);
        ill.changeStyle(Font.BOLD + Font.ITALIC);
        sst.changeAlpha(0.5f);
        sst.changeStyle(Font.BOLD + Font.ITALIC);
        hf=h;
    }
    
    public void setTextArea()
    {
        textArea.setText("");
    }
    public void fillComboBox() {
        ArrayList<Doctor> temp = doctorSYS.getAllDoctors();
        selectDoctorCb.removeAllItems();
        
        for(int i=0; i<temp.size(); i++)
            selectDoctorCb.addItem(temp.get(i).firstName + " " + temp.get(i).lastName);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        addPanel = new javax.swing.JPanel();
        nameTF = new javax.swing.JTextField();
        ageTF = new javax.swing.JTextField();
        maleRB = new javax.swing.JRadioButton();
        femaleRB = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        selectDoctorCb = new javax.swing.JComboBox<>();
        firstSv = new javax.swing.JCheckBox();
        secondSv = new javax.swing.JCheckBox();
        thirdSv = new javax.swing.JCheckBox();
        fourthSv = new javax.swing.JCheckBox();
        specialSv = new javax.swing.JTextField();
        illness = new javax.swing.JTextField();
        sstype = new javax.swing.JTextField();
        searchPanel = new javax.swing.JPanel();
        searchTF = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        displayButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        dischargeTF = new javax.swing.JTextField();
        dischargeButton = new javax.swing.JButton();
        DSYPanel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Frame");

        addPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("1. Add a Patient"));

        nameTF.setToolTipText("");
        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });

        ageTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTFActionPerformed(evt);
            }
        });

        buttonGroup1.add(maleRB);
        maleRB.setSelected(true);
        maleRB.setText("M");

        buttonGroup1.add(femaleRB);
        femaleRB.setText("F");

        jLabel1.setText("Assign services:");

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        selectDoctorCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDoctorCbActionPerformed(evt);
            }
        });

        firstSv.setSelected(true);
        firstSv.setText("Inspection");
        firstSv.setEnabled(false);

        secondSv.setText("Urine Analysis");

        thirdSv.setText("Blood Analysis");

        fourthSv.setText("Electrocardiography");
        fourthSv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthSvActionPerformed(evt);
            }
        });

        specialSv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialSvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(ageTF)
                    .addComponent(illness)
                    .addComponent(sstype)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(maleRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(femaleRB))
                            .addComponent(selectDoctorCb, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondSv)
                            .addComponent(firstSv)
                            .addComponent(thirdSv)
                            .addComponent(fourthSv)
                            .addComponent(specialSv, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maleRB)
                            .addComponent(femaleRB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(illness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sstype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectDoctorCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstSv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secondSv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thirdSv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourthSv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(specialSv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        searchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Patiemt"));

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchButton)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        displayButton.setText("Display Patients");
        displayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Discharge Patient"));

        dischargeButton.setText("Discharge");
        dischargeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dischargeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dischargeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dischargeButton)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dischargeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dischargeButton))
                .addGap(22, 22, 22))
        );

        DSYPanel.setText("Patient Adding System");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(DSYPanel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(closeButton)
                                .addGap(89, 89, 89)
                                .addComponent(displayButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DSYPanel)
                        .addGap(18, 18, 18)
                        .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(displayButton)
                            .addComponent(closeButton))
                        .addGap(21, 21, 21))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        hf.setVisible(true);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void ageTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTFActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Patient pt;

        String name="", msg="";
        int age=0;
        String sex;
        double ssn=0;
        String illname="";
        String dname="";
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        Random rand = new Random();
        long gMin = 100000000;
        long gMax = 399999999;
        long sMin=500000000;
        long sMax=499999999;
            
        try{
            if (nameTF.getText()!=null)
                name = nameTF.getText();
            else {
                msg += "Please check the fullname.";
                textArea.setText(msg);
            }
                
            if (ageTF.getText()!=null)
                age = Integer.parseInt(ageTF.getText());
            else {
                msg += "Please check the age.";
                textArea.setText(msg);
            }
            
            if(maleRB.isSelected())
                sex="Male";
            else
                sex="Female";
            
            if (illness.getText()!=null)
                illname = illness.getText();
            else {
                msg += "Please check the age.";
                textArea.setText(msg);
            }
            
            try {
            if(sstype.getText().equalsIgnoreCase("Government"))
                ssn= Math.floor(Math.random()*gMax+gMin);
            else if(sstype.getText().equalsIgnoreCase("Special"))
                ssn= Math.floor(Math.random()*(sMax)+sMin);
            } catch(Exception ex) {
                msg += "Please check the social security type.";
                textArea.setText(msg);
            }
            
            
            if(selectDoctorCb.getSelectedItem()!=null)
                dname = (String) selectDoctorCb.getSelectedItem();
            else {
                msg += "Please select a doctor.";
                textArea.setText(msg);
            }
            
            pt = new Patient(name, age, sex, (long)ssn, illname, dname, dateFormat.format(date), null);
            patientSYS.addPatient(pt);
            
            if(firstSv.isSelected())
                pt.addServices(new Services("Inspection", 100));
            if(secondSv.isSelected())
                pt.addServices(new Services("Urine Analysis", 50));
            if(thirdSv.isSelected())
                pt.addServices(new Services("Blood Analysis", 75));
            if(fourthSv.isSelected())
                pt.addServices(new Services("Electrocardiography", 90));
            if(specialSv.getText() != null) {
                try {
                    String[] serviceData = specialSv.getText().split(",");
                    if(serviceData[1].contains(" "))
                        serviceData[1].trim();
                    pt.addServices(new Services(serviceData[0], Double.parseDouble(serviceData[1])));
                } catch(Exception ex) {
                    textArea.setText("Special service syntax is not correct. Please use: service name,price format");
                }
            }
           
            textArea.setText("Patient is added.");
            patientSYS.updateFile();
        }
        catch(NumberFormatException ex){
            ex.printStackTrace();
            textArea.setText("Please check the inputs.");
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        int ssn = Integer.parseInt(searchTF.getText());
        Patient p=patientSYS.getPatient(ssn);
        if(p==null)
        textArea.setText("Patient Couldnt Found");
        else
        textArea.setText("Informations: \n"+p.toString());
    }//GEN-LAST:event_searchButtonActionPerformed

    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtonActionPerformed
        // TODO add your handling code here:
        textArea.setText(patientSYS.displayPatients());
    }//GEN-LAST:event_displayButtonActionPerformed

    private void dischargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dischargeButtonActionPerformed
        // TODO add your handling code here:

        int ssn = Integer.parseInt(dischargeTF.getText());
        if(patientSYS.dischargePatient(ssn))
            textArea.setText("The doctor who has the\nid of "+ssn+" has been discharged.");
        else
        textArea.setText("Patient couldnt found.");

        patientSYS.updateFile();

    }//GEN-LAST:event_dischargeButtonActionPerformed

    private void specialSvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialSvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specialSvActionPerformed

    private void fourthSvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthSvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fourthSvActionPerformed

    private void selectDoctorCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDoctorCbActionPerformed
        // TODO add your handling code here:
        textArea.setText("The doctor of this\npatient will be: "+selectDoctorCb.getSelectedItem());
        
    }//GEN-LAST:event_selectDoctorCbActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DSYPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addPanel;
    private javax.swing.JTextField ageTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton dischargeButton;
    private javax.swing.JTextField dischargeTF;
    private javax.swing.JButton displayButton;
    private javax.swing.JRadioButton femaleRB;
    private javax.swing.JCheckBox firstSv;
    private javax.swing.JCheckBox fourthSv;
    private javax.swing.JTextField illness;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maleRB;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextField searchTF;
    private javax.swing.JCheckBox secondSv;
    private javax.swing.JComboBox<String> selectDoctorCb;
    private javax.swing.JTextField specialSv;
    private javax.swing.JTextField sstype;
    private javax.swing.JTextArea textArea;
    private javax.swing.JCheckBox thirdSv;
    // End of variables declaration//GEN-END:variables
}