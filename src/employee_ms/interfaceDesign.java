package employee_ms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class interfaceDesign extends javax.swing.JFrame implements ActionListener {

    Employee e = new Employee();

    public interfaceDesign() {

        initComponents();
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        positions = new javax.swing.JTextField();
        btnSalary = new javax.swing.JButton();
        showSalary = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        entryDate = new javax.swing.JTextField();
        contractDuration = new javax.swing.JTextField();
        noticePeriod = new javax.swing.JTextField();
        projectName = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        addProject = new javax.swing.JButton();
        removeProject = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 22, 149, 28));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 67, 155, 25));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Name ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 65, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee Age");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 104, -1, -1));
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 104, 155, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee Postions");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 154, 179, -1));
        jPanel1.add(positions, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 147, 155, -1));

        btnSalary.setBackground(new java.awt.Color(255, 255, 255));
        btnSalary.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalary.setForeground(new java.awt.Color(0, 102, 102));
        btnSalary.setText("Calculate Salary ");
        btnSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalaryActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 36));

        showSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSalaryActionPerformed(evt);
            }
        });
        jPanel1.add(showSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 340, 155, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Entery Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 160, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contract Duration");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 160, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Notice Period");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 160, -1));
        jPanel1.add(entryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 190, 155, -1));
        jPanel1.add(contractDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 230, 155, -1));
        jPanel1.add(noticePeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 270, 155, -1));
        jPanel1.add(projectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 180, -1));

        save.setBackground(new java.awt.Color(255, 255, 255));
        save.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        save.setForeground(new java.awt.Color(0, 102, 102));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 150, 40));

        addProject.setBackground(new java.awt.Color(255, 255, 255));
        addProject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addProject.setForeground(new java.awt.Color(0, 102, 102));
        addProject.setText("Add ");
        addProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProjectActionPerformed(evt);
            }
        });
        jPanel1.add(addProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 120, 40));

        removeProject.setBackground(new java.awt.Color(255, 255, 255));
        removeProject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        removeProject.setForeground(new java.awt.Color(0, 102, 102));
        removeProject.setText("Remove");
        removeProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeProjectActionPerformed(evt);
            }
        });
        jPanel1.add(removeProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 110, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Project Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 86, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 154, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalaryActionPerformed

       btnSalary.addActionListener(this);
       e.setPostions(positions.getText());
       e.calculateSalary();
       System.out.println(e.getSalary());
      showSalary.setText(String.valueOf(e.getSalary()));

    }//GEN-LAST:event_btnSalaryActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        save.addActionListener(this);
        e.setName(name.getText());
        e.setAge(Integer.parseInt(age.getText()));
        e.setPostions(positions.getText());
        e.enteryDate(entryDate.getText());
        e.contractDuration(Integer.parseInt(contractDuration.getText()));
        e.noticePeriod(Integer.parseInt(noticePeriod.getText()));
        name.setText(" ");
        age.setText(" ");
        positions.setText(" ");
        entryDate.setText(" ");
        contractDuration.setText(" ");
        noticePeriod.setText(" ");
        showSalary.setText(" ");
        projectName.setText(" ");
        
    }//GEN-LAST:event_saveActionPerformed

    private void removeProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProjectActionPerformed
        removeProject.addActionListener(this);
        Projects proj = new Projects(projectName.getText());
        e.removeproject(proj);
        projectName.setText(" ");
        JOptionPane.showMessageDialog(null, "Project " +proj.getProjName() + "  removed Scussfully");
    }//GEN-LAST:event_removeProjectActionPerformed

    private void addProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProjectActionPerformed
        addProject.addActionListener(this);
        Projects proj = new Projects(projectName.getText());
        e.addProject(proj);
        projectName.setText(" ");
        for(Projects n : e.getProjects())
             System.out.println(n.getProjName());
        
    JOptionPane.showMessageDialog(null, "Project " + proj.getProjName() + " Added Scussfully");

    }//GEN-LAST:event_addProjectActionPerformed

    private void showSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSalaryActionPerformed
          
        
                        
 
    }//GEN-LAST:event_showSalaryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaceDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaceDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaceDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaceDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaceDesign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProject;
    private javax.swing.JTextField age;
    private javax.swing.JButton btnSalary;
    private javax.swing.JTextField contractDuration;
    private javax.swing.JTextField entryDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField noticePeriod;
    private javax.swing.JTextField positions;
    private javax.swing.JTextField projectName;
    private javax.swing.JButton removeProject;
    private javax.swing.JButton save;
    private javax.swing.JTextField showSalary;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
