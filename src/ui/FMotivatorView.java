/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.UserPanel;

public class FMotivatorView extends javax.swing.JPanel {

    private JPanel rightPanel;
    private ArrayList<UserPanel> c;

    public FMotivatorView(JPanel inPane) {
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

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        commentField = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        activityLogTable = new javax.swing.JTable();
        selectLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 255, 204));
        setForeground(new java.awt.Color(153, 204, 0));

        welcomeLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        welcomeLabel.setText("Welcome Motivator!");

        logOutButton.setText("LogOut");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
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
                        .addGap(606, 606, 606)
                        .addComponent(selectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(addButton)
                        .addGap(115, 115, 115)
                        .addComponent(commentField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(submitButton)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(commentField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(submitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(selectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        Home newHomePanel = new Home(rightPanel);
        rightPanel.add(newHomePanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_logOutButtonActionPerformed

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
        commentField.setText("");
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
            stmt.setString(1, p.getFC());
            stmt.setInt(2, p.getPid());
            stmt.setString(3, p.getFLD());
            stmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Comment added successfully");
        display();
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable activityLogTable;
    private javax.swing.JButton addButton;
    private javax.swing.JTextArea commentField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel selectLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
