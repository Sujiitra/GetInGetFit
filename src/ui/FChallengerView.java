package ui;

import java.awt.CardLayout;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Base64;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.UserPanel;

public class FChallengerView extends javax.swing.JPanel {

    private JPanel rightPanel;

    private ArrayList<UserPanel> c;

    public FChallengerView(JPanel inPane, UserPanel u) {
        initComponents();
        this.rightPanel = inPane;
        lId = u.getPid();
        display();
        displayV();
    }
    private static int lId;

    public void display() {
        this.c = DBConnector.viewwrkoutPDf();
        DefaultTableModel t = (DefaultTableModel) workoutPlanTable.getModel();
        t.setRowCount(0);
        for (UserPanel p : c) {
            Object[] row = new Object[11];
            row[0] = p.getDesc();
            t.addRow(row);
        }
    }

    public void displayV() {
        this.c = DBConnector.viewUpdVideo();
        DefaultTableModel t = (DefaultTableModel) videoTable.getModel();
        t.setRowCount(0);
        for (UserPanel p : c) {
            Object[] row = new Object[11];
            row[0] = p.getDesc();
            t.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workoutPlanTable = new javax.swing.JTable();
        activityLogButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        downloadButton = new javax.swing.JButton();
        selectInvalid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        videoTable = new javax.swing.JTable();
        playVideoButton = new javax.swing.JButton();

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
        jLabel2.setText("Workout Plan");

        workoutPlanTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(workoutPlanTable);

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

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("WorkOut Videos");

        videoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Video Description"
            }
        ));
        jScrollPane2.setViewportView(videoTable);

        playVideoButton.setText("Play Video");
        playVideoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playVideoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(viewButton)
                                .addGap(37, 37, 37)
                                .addComponent(downloadButton)
                                .addGap(140, 140, 140)
                                .addComponent(playVideoButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(178, 178, 178)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(169, 169, 169)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(selectInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(activityLogButton)))
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutButton)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(logOutButton)))
                .addGap(20, 20, 20)
                .addComponent(selectInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewButton)
                            .addComponent(downloadButton)
                            .addComponent(playVideoButton))))
                .addGap(36, 36, 36)
                .addComponent(activityLogButton)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                int index = workoutPlanTable.getSelectedRow();
                UserPanel op = new UserPanel();
                op.setDesc((String) workoutPlanTable.getValueAt(index, 0));
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
        int index = workoutPlanTable.getSelectedRow();
        UserPanel op = new UserPanel();
        op.setDesc((String) workoutPlanTable.getValueAt(index, 0));
        b64 = DBConnector.getDocvalue(op.getDesc());
        File file = new File("./DownloadedWorkoutPlan/" + op.getDesc() + ".pdf");
        try (FileOutputStream fos = new FileOutputStream(file);) {
            byte[] decoder = Base64.getDecoder().decode(b64);
            fos.write(decoder);
            JOptionPane.showMessageDialog(null, "PDF File Saved");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_downloadButtonActionPerformed

    private void viewButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_viewButtonFocusGained
        if (workoutPlanTable.getSelectedRow() == -1) {
            selectInvalid.setText("Please select the week");
            selectInvalid.setVisible(true);
        } else {
            selectInvalid.setVisible(false);
        }

    }//GEN-LAST:event_viewButtonFocusGained

    private void downloadButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_downloadButtonFocusGained
    }//GEN-LAST:event_downloadButtonFocusGained

    private void playVideoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playVideoButtonActionPerformed
        String sVidURL = "";
        if (videoTable.getSelectedRow() == -1) {
            selectInvalid.setText("Please select a video to play");
            selectInvalid.setVisible(true);
        } else {
            selectInvalid.setVisible(false);
            sVidURL = DBConnector.getVidURL((String) videoTable.getValueAt(videoTable.getSelectedRow(), 0));
            openSelectedVideo(sVidURL);
        }
    }//GEN-LAST:event_playVideoButtonActionPerformed

    private static void openSelectedVideo(String videoUrl) {
        try {
            Desktop desktop = Desktop.getDesktop();
            URI uri = new URI(videoUrl);
            desktop.browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activityLogButton;
    private javax.swing.JButton downloadButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton playVideoButton;
    private javax.swing.JLabel selectInvalid;
    private javax.swing.JTable videoTable;
    private javax.swing.JButton viewButton;
    private javax.swing.JTable workoutPlanTable;
    // End of variables declaration//GEN-END:variables
}
