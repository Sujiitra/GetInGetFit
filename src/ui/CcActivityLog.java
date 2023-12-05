
package ui;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.UserPanel;

public class CcActivityLog extends javax.swing.JPanel {

    private JPanel rightPanel;

    public CcActivityLog(JPanel inPane, Integer i) {
        initComponents();
        this.rightPanel = inPane;
        lId = i;
    }
    private static int lId;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        activityL = new javax.swing.JLabel();
        stepL = new javax.swing.JLabel();
        calL = new javax.swing.JLabel();
        wL = new javax.swing.JLabel();
        dateL = new javax.swing.JLabel();
        wt = new javax.swing.JLabel();
        sessionL = new javax.swing.JLabel();
        sTL = new javax.swing.JLabel();
        feelL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        feelText = new javax.swing.JTextArea();
        dateText = new com.toedter.calendar.JDateChooser();
        stepText = new javax.swing.JTextField();
        wrkoutText = new javax.swing.JTextField();
        wTimeText = new javax.swing.JTextField();
        sessionText = new javax.swing.JTextField();
        sessionTimeText = new javax.swing.JTextField();
        calText = new javax.swing.JTextField();
        activityUpdateButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        activityL.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        activityL.setText("Enter Daily Activity Log");

        stepL.setText("Step Count");

        calL.setText("Calories Burnt:");

        wL.setText("Type of Workout:");

        dateL.setText("Date");

        wt.setText("Time Duration:");

        sessionL.setText("Attended the Online Session:");

        sTL.setText("Time Duration:");

        feelL.setText("How did you feel today?");

        feelText.setColumns(20);
        feelText.setRows(5);
        jScrollPane1.setViewportView(feelText);

        stepText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepTextActionPerformed(evt);
            }
        });

        wTimeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wTimeTextActionPerformed(evt);
            }
        });

        activityUpdateButton.setText("Update");
        activityUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityUpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(activityL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(feelL)
                            .addComponent(dateL)
                            .addComponent(stepL)
                            .addComponent(wL)
                            .addComponent(wt)
                            .addComponent(sessionL)
                            .addComponent(sTL)
                            .addComponent(calL))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(calText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sessionTimeText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sessionText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(wTimeText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(wrkoutText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(stepText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(activityUpdateButton)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(activityL)
                        .addGap(39, 39, 39)
                        .addComponent(dateL))
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stepL)
                    .addComponent(stepText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wL)
                    .addComponent(wrkoutText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wt)
                    .addComponent(wTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sessionL)
                    .addComponent(sessionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sTL)
                    .addComponent(sessionTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calL)
                    .addComponent(calText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feelL)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(activityUpdateButton)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void stepTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepTextActionPerformed
    }//GEN-LAST:event_stepTextActionPerformed

    private void wTimeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wTimeTextActionPerformed
    }//GEN-LAST:event_wTimeTextActionPerformed

    private void activityUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityUpdateButtonActionPerformed
        String query = "INSERT INTO ACTIVITYLOG(CID,ACTIVITYDATE,STEPS,ACTIVITY,ATIME,ATTENDEDSESSION,STIME,CALORIES,FEELING) VALUES(?,?,?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@0.0.0.0:1521:xe", "admin", "admin")) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, lId);
            stmt.setString(2, dateText.getDate().toString());
            stmt.setString(3, stepText.getText());
            stmt.setString(4, wrkoutText.getText());
            stmt.setString(5, wTimeText.getText());
            stmt.setString(6, sessionText.getText());
            stmt.setString(7, sessionTimeText.getText());
            stmt.setString(8, calText.getText());
            stmt.setString(9, feelText.getText());
            int rows = stmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Activity Updated Successfully");
        clear();
        UserPanel u = new UserPanel();
        u.setPid(lId);
        CChallengerView newHomePanel = new CChallengerView(rightPanel, u);
        rightPanel.add(newHomePanel);
        CardLayout l = (CardLayout) rightPanel.getLayout();
        l.next(rightPanel);

    }//GEN-LAST:event_activityUpdateButtonActionPerformed

    public void clear() {
        dateText.setDate(null);
        stepText.setText("");
        wrkoutText.setText("");
        wTimeText.setText("");
        sessionText.setText("");
        sessionTimeText.setText("");
        calText.setText("");
        feelText.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activityL;
    private javax.swing.JButton activityUpdateButton;
    private javax.swing.JLabel calL;
    private javax.swing.JTextField calText;
    private javax.swing.JLabel dateL;
    private com.toedter.calendar.JDateChooser dateText;
    private javax.swing.JLabel feelL;
    private javax.swing.JTextArea feelText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel sTL;
    private javax.swing.JLabel sessionL;
    private javax.swing.JTextField sessionText;
    private javax.swing.JTextField sessionTimeText;
    private javax.swing.JLabel stepL;
    private javax.swing.JTextField stepText;
    private javax.swing.JLabel wL;
    private javax.swing.JTextField wTimeText;
    private javax.swing.JTextField wrkoutText;
    private javax.swing.JLabel wt;
    // End of variables declaration//GEN-END:variables
}
