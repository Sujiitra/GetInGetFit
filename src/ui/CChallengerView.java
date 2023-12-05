package ui;

import java.awt.CardLayout;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.UserPanel;

public class CChallengerView extends javax.swing.JPanel {

    private JPanel rightPanel;
    private ArrayList<UserPanel> c;

    public CChallengerView(JPanel inPane, UserPanel u) {
        initComponents();
        this.rightPanel = inPane;
        lId = u.getPid();
        display();
    }
    private static int lId;

    public void display() {
        this.c = DBConnector.viewUpdPDF();
        DefaultTableModel t = (DefaultTableModel) dietPlanTable.getModel();
        t.setRowCount(0);
        for (UserPanel p : c) {
            Object[] row = new Object[11];
            row[0] = p.getDesc();
            t.addRow(row);
        }
        clearValues();
    }

    public void clearValues() {
        dietPlanTable.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dietPlanTable = new javax.swing.JTable();
        foodLogButton = new javax.swing.JButton();
        activityLogButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        downloadButton = new javax.swing.JButton();
        selectInvalid = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Welcome Challenger!");

        logOutButton.setText("Logout");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Diet Plan");

        dietPlanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Week"
            }
        ));
        jScrollPane1.setViewportView(dietPlanTable);

        foodLogButton.setText("Update Food Log");
        foodLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodLogButtonActionPerformed(evt);
            }
        });

        activityLogButton.setText("Update Activity Log");
        activityLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityLogButtonActionPerformed(evt);
            }
        });

        viewButton.setText("View Plan");
        viewButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                viewButtonFocusGained(evt);
            }
        });
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        downloadButton.setText("Download Plan");
        downloadButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                downloadButtonFocusGained(evt);
            }
        });
        downloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutButton)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(foodLogButton)
                        .addGap(182, 182, 182)
                        .addComponent(activityLogButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(downloadButton)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(viewButton)
                                .addGap(70, 70, 70)
                                .addComponent(selectInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(logOutButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewButton)
                            .addComponent(selectInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(downloadButton)))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodLogButton)
                    .addComponent(activityLogButton))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        Home newHomePanel = new Home(rightPanel);
        rightPanel.add(newHomePanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void foodLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodLogButtonActionPerformed
        CFoodLog newHomePanel = new CFoodLog(rightPanel, lId);
        rightPanel.add(newHomePanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_foodLogButtonActionPerformed

    private void activityLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityLogButtonActionPerformed
        CcActivityLog newHomePanel = new CcActivityLog(rightPanel, lId);
        rightPanel.add(newHomePanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_activityLogButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        if (Desktop.isDesktopSupported()) {
            try {
                String b64 = "";
                String sPath = "";
                int index = dietPlanTable.getSelectedRow();
                UserPanel op = new UserPanel();
                op.setDesc((String) dietPlanTable.getValueAt(index, 0));
                b64 = DBConnector.getDocvalue(op.getDesc());
                sPath = "./DownloadedPlan/" + op.getDesc() + ".pdf";
                File file = new File(sPath);
                try (FileOutputStream fos = new FileOutputStream(file);) {
                    byte[] decoder = Base64.getDecoder().decode(b64);
                    fos.write(decoder);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                File myFile = new File(sPath);
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void downloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadButtonActionPerformed
        String b64 = "";
        int index = dietPlanTable.getSelectedRow();
        UserPanel op = new UserPanel();
        op.setDesc((String) dietPlanTable.getValueAt(index, 0));
        b64 = DBConnector.getDocvalue(op.getDesc());
        File file = new File("./DownloadedPlan/" + op.getDesc() + ".pdf");
        try (FileOutputStream fos = new FileOutputStream(file);) {
            byte[] decoder = Base64.getDecoder().decode(b64);
            fos.write(decoder);
            JOptionPane.showMessageDialog(null, "PDF File Saved");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_downloadButtonActionPerformed

    private void viewButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_viewButtonFocusGained
        if (dietPlanTable.getSelectedRow() == -1) {
            selectInvalid.setText("Please select the week");
            selectInvalid.setVisible(true);
        } else {
            selectInvalid.setVisible(false);
        }
    }//GEN-LAST:event_viewButtonFocusGained

    private void downloadButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_downloadButtonFocusGained
    }//GEN-LAST:event_downloadButtonFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activityLogButton;
    private javax.swing.JTable dietPlanTable;
    private javax.swing.JButton downloadButton;
    private javax.swing.JButton foodLogButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel selectInvalid;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
