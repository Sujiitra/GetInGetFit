
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

public class CDieticianView extends javax.swing.JPanel {

    private JPanel rightPanel;
    private ArrayList<UserPanel> c;

    public CDieticianView(JPanel inPane) {
        initComponents();
        this.rightPanel = inPane;
        selectLabel.setVisible(false);
        commentField.setVisible(true);
        submitButton.setVisible(true);
        display();
    }

    private static String weekNo;
    private static String comment;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();
        uploadLabel = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        dietWeek = new javax.swing.JTextField();
        commentField = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodLogTable = new javax.swing.JTable();
        selectLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setForeground(new java.awt.Color(153, 204, 0));

        welcomeLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        welcomeLabel.setText("Welcome Dietician!");

        logOutButton.setText("LogOut");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        uploadLabel.setText("Upload This Week's Schedule");

        uploadButton.setText("Upload");
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

        foodLogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CID", "DATE", "BRKFST", "BQTY", "LUNCH", "LQTY", "DINNER", "DQTY", "NOONSNACK", "EVNGSNACK", "COMMENT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(foodLogTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(uploadLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(addButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(submitButton)))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dietWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(uploadButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(commentField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(selectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uploadLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dietWeek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(uploadButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(commentField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitButton)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(selectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        weekNo = dietWeek.getText();
        String query = "INSERT INTO UPLOADEDPDF(ROLE,UPDATEDDATE,DOCUMENT,DESCRIPTION) VALUES(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@0.0.0.0:1521:xe", "admin", "admin")) {
            PreparedStatement stmt = conn.prepareStatement(query);
            LocalDate d = LocalDate.now();
            stmt.setString(1, "Dietician");
            stmt.setString(2, d.toString());
            stmt.setString(3, filebyte);
            stmt.setString(4, weekNo);
            int rows = stmt.executeUpdate();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "File uploaded Successfully");
        dietWeek.setText("");

    }

    public String convertFileToByte(String fPath) {
        String byteString = "";
        try {

            byte[] inFileBytes = Files.readAllBytes(Paths.get(fPath));
            byteString = java.util.Base64.getEncoder().encodeToString(inFileBytes);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteString;
    }//GEN-LAST:event_uploadButtonActionPerformed

    public void display() {
        this.c = DBConnector.viewFoodLog();
        DefaultTableModel t = (DefaultTableModel) foodLogTable.getModel();
        t.setRowCount(0);
        for (UserPanel p : c) {
            Object[] row = new Object[11];
            row[0] = p.getPid();
            row[1] = p.getFLD();
            row[2] = p.getBrk();
            row[3] = p.getBq();
            row[4] = p.getLun();
            row[5] = p.getLq();
            row[6] = p.getDin();
            row[7] = p.getDq();
            row[8] = p.getNs();
            row[9] = p.getEs();
            row[10] = p.getFC();
            t.addRow(row);
        }
        clearValues();

    }

    public void clearValues() {

        dietWeek.setText("");
        commentField.setText("");
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (foodLogTable.getSelectedRow() == -1) {
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
        int i = foodLogTable.getSelectedRow();
        p.setFC(comment);
        p.setPid((int) foodLogTable.getValueAt(i, 0));
        p.setFLD((String) foodLogTable.getValueAt(i, 1));

        try {
            String query = "UPDATE FOODLOG SET COMMENTS=? WHERE CHALLENGERID=? AND INTAKEDATE=? ";
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
    private javax.swing.JButton addButton;
    private javax.swing.JTextArea commentField;
    private javax.swing.JTextField dietWeek;
    private javax.swing.JTable foodLogTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel selectLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton uploadButton;
    private javax.swing.JLabel uploadLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
