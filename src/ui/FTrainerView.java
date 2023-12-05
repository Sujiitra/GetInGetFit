package ui;

import java.awt.CardLayout;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.UserPanel;

public class FTrainerView extends javax.swing.JPanel {

    private JPanel rightPanel;
    private ArrayList<UserPanel> c;

    public FTrainerView(JPanel inPane) {
        initComponents();
        this.rightPanel = inPane;
        selectLabel.setVisible(false);
        commentField.setVisible(true);
        submitButton.setVisible(true);
        display();
    }

    private static String weekNo;
    private static String comment;
    private static String path;
    private static String desc;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();
        uploadLabel = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        workoutWeek = new javax.swing.JTextField();
        commentField = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        activityLogTable = new javax.swing.JTable();
        selectLabel = new javax.swing.JLabel();
        pathText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        uploadVideoButton = new javax.swing.JButton();
        videoDesc = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(153, 204, 0));

        welcomeLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        welcomeLabel.setText("Welcome Trainer!");

        logOutButton.setText("LogOut");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        uploadLabel.setText("Upload This Week's Schedule");

        uploadButton.setText("Upload Schedule");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add Comment");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        commentField.setColumns(20);
        commentField.setRows(5);

        activityLogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CID", "DATE", "STEPS", "ACTIVITY", "ACTIVITYDURATION", "SESSIONATTENDED", "SESSIONDURATION", "CALORIES", "FEELINGS", "COMMENTS"
            }
        ));
        jScrollPane1.setViewportView(activityLogTable);

        pathText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathTextActionPerformed(evt);
            }
        });

        jLabel1.setText("Upload Workout Video Path");

        uploadVideoButton.setText("Upload Video Path");
        uploadVideoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadVideoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logOutButton)))
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(653, 653, 653)
                        .addComponent(selectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uploadLabel)
                                .addGap(60, 60, 60)
                                .addComponent(workoutWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(addButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(submitButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(commentField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pathText, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(videoDesc))))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uploadVideoButton)
                            .addComponent(uploadButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logOutButton)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uploadLabel)
                            .addComponent(workoutWeek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadButton))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(pathText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadVideoButton))
                        .addGap(18, 18, 18)
                        .addComponent(videoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addGap(31, 31, 31)
                                .addComponent(submitButton))
                            .addComponent(commentField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(selectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        Home newHomePanel = new Home(rightPanel);
        rightPanel.add(newHomePanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filebyte = convertFileToByte(f.getPath());
        weekNo = workoutWeek.getText();
        String query = "INSERT INTO UPLOADEDPDF(ROLE,UPDATEDDATE,DOCUMENT,DESCRIPTION) VALUES(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@0.0.0.0:1521:xe", "admin", "admin")) {

            PreparedStatement stmt = conn.prepareStatement(query);
            LocalDate d = LocalDate.now();
            stmt.setString(1, "Trainer");
            stmt.setString(2, d.toString());
            stmt.setString(3, filebyte);
            stmt.setString(4, weekNo);
            stmt.executeUpdate();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "File uploaded Successfully");
        workoutWeek.setText("");

    }//GEN-LAST:event_uploadButtonActionPerformed

    public String convertFileToByte(String fPath) {
        String byteString = "";
        try {
            byte[] inFileBytes = Files.readAllBytes(Paths.get(fPath));
            byteString = java.util.Base64.getEncoder().encodeToString(inFileBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteString;
    }

    public void display() {
        this.c = DBConnector.viewActivityLog();
        DefaultTableModel t = (DefaultTableModel) activityLogTable.getModel();
        t.setRowCount(0);
        for (UserPanel p : c) {
            Object[] row = new Object[11];
            row[0] = p.getPid();
            row[1] = p.getALD();
            row[2] = p.getStep();
            row[3] = p.getA();
            row[4] = p.getAT();
            row[5] = p.getS();
            row[6] = p.getST();
            row[7] = p.getCal();
            row[8] = p.getFeel();
            row[9] = p.getAC();
            t.addRow(row);
        }
        clearValues();

    }

    public void clearValues() {
        workoutWeek.setText("");
        commentField.setText("");
        pathText.setText("");
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (activityLogTable.getSelectedRow() == -1) {
            selectLabel.setText("Please select a row");
            selectLabel.setVisible(true);
        } else {
            commentField.setVisible(true);
            submitButton.setVisible(true);
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        comment = commentField.getText();
        UserPanel p = new UserPanel();
        int i = activityLogTable.getSelectedRow();
        p.setFC(comment);
        p.setPid((int) activityLogTable.getValueAt(i, 0));
        p.setFLD((String) activityLogTable.getValueAt(i, 1));

        try {
            String query = "UPDATE ACTIVITYLOG SET COMMENTS=? WHERE CID=? AND ACTIVITYDATE=? ";
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@0.0.0.0:1521:xe", "admin", "admin");
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, p.getAC());
            stmt.setInt(2, p.getPid());
            stmt.setString(3, p.getALD());
            stmt.executeUpdate();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Comment added successfully");
        display();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void pathTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathTextActionPerformed
    }//GEN-LAST:event_pathTextActionPerformed

    private void uploadVideoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadVideoButtonActionPerformed
        path = pathText.getText();
        desc = videoDesc.getText();
        String query = "INSERT INTO UPLOADEDVideo(UPLOADEDDATE,VIDEOPATH,DESCRIPTION) VALUES(?,?,?)";
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@0.0.0.0:1521:xe", "admin", "admin")) {
            PreparedStatement stmt = conn.prepareStatement(query);
            LocalDate d = LocalDate.now();
            stmt.setString(1, d.toString());
            stmt.setString(2, path);
            stmt.setString(3, desc);
            stmt.executeUpdate();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Video path uploaded Successfully");
        pathText.setText("");
        videoDesc.setText("");
    }//GEN-LAST:event_uploadVideoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable activityLogTable;
    private javax.swing.JButton addButton;
    private javax.swing.JTextArea commentField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JTextField pathText;
    private javax.swing.JLabel selectLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton uploadButton;
    private javax.swing.JLabel uploadLabel;
    private javax.swing.JButton uploadVideoButton;
    private javax.swing.JTextField videoDesc;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JTextField workoutWeek;
    // End of variables declaration//GEN-END:variables
}
