package ui;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.UserPanel;

public class CFoodLog extends javax.swing.JPanel {

    private JPanel rightPanel;

    public CFoodLog(JPanel inPane, Integer i) {
        initComponents();
        this.rightPanel = inPane;
        lId = i;
    }
    private static int lId;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        lun = new javax.swing.JTextField();
        lq = new javax.swing.JTextField();
        din = new javax.swing.JTextField();
        dq = new javax.swing.JTextField();
        ns = new javax.swing.JTextField();
        es = new javax.swing.JTextField();
        bLabel = new javax.swing.JLabel();
        brkQtyL = new javax.swing.JLabel();
        intakeDate = new com.toedter.calendar.JDateChooser();
        LunchL = new javax.swing.JLabel();
        brk = new javax.swing.JTextField();
        lQtyLabel = new javax.swing.JLabel();
        bq = new javax.swing.JTextField();
        dLabel = new javax.swing.JLabel();
        dQtyLabel = new javax.swing.JLabel();
        nSLabel = new javax.swing.JLabel();
        eSLabel = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Enter the daily food log");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        dateLabel.setText("Date:");

        din.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinActionPerformed(evt);
            }
        });

        dq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dqActionPerformed(evt);
            }
        });

        bLabel.setText("Breakfast:");

        brkQtyL.setText("Breakfast Qty:");

        LunchL.setText("Lunch:");

        lQtyLabel.setText("Lunch Qty:");

        bq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bqActionPerformed(evt);
            }
        });

        dLabel.setText("Dinner:");

        dQtyLabel.setText("Dinner Qty:");

        nSLabel.setText("Noon Snack:");

        eSLabel.setText("Evening Snack:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LunchL)
                            .addComponent(lQtyLabel)
                            .addComponent(dLabel)
                            .addComponent(dQtyLabel)
                            .addComponent(nSLabel)
                            .addComponent(eSLabel)
                            .addComponent(brkQtyL)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateButton)
                            .addComponent(intakeDate, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brk)
                            .addComponent(bq)
                            .addComponent(lun)
                            .addComponent(lq)
                            .addComponent(din)
                            .addComponent(dq)
                            .addComponent(ns)
                            .addComponent(es, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel)
                    .addComponent(intakeDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLabel)
                    .addComponent(brk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brkQtyL)
                    .addComponent(bq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LunchL)
                    .addComponent(lun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lQtyLabel)
                    .addComponent(lq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dLabel)
                    .addComponent(din, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dQtyLabel)
                    .addComponent(dq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nSLabel)
                    .addComponent(ns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eSLabel)
                    .addComponent(es, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(updateButton)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinActionPerformed
    }//GEN-LAST:event_dinActionPerformed

    private void dqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dqActionPerformed
    }//GEN-LAST:event_dqActionPerformed

    private void bqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bqActionPerformed
    }//GEN-LAST:event_bqActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String query = "INSERT INTO FOODLOG(CHALLENGERID,INTAKEDATE,BRKFST,BQTY,LUNCH,LQTY,DINNER,DQTY,NOONSNACK,EVNGSNACK) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@0.0.0.0:1521:xe", "admin", "admin")) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, lId);
            stmt.setString(2, intakeDate.getDate().toString());
            stmt.setString(3, brk.getText());
            stmt.setString(4, bq.getText());
            stmt.setString(5, lun.getText());
            stmt.setString(6, lq.getText());
            stmt.setString(7, din.getText());
            stmt.setString(8, dq.getText());
            stmt.setString(9, ns.getText());
            stmt.setString(10, es.getText());
            int rows = stmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Food Log Updated Successfully");
        clear();
        UserPanel u = new UserPanel();
        u.setPid(lId);
        CChallengerView newHomePanel = new CChallengerView(rightPanel, u);
        rightPanel.add(newHomePanel);
        CardLayout l = (CardLayout) rightPanel.getLayout();
        l.next(rightPanel);

    }//GEN-LAST:event_updateButtonActionPerformed

    public void clear() {
        intakeDate.setDate(null);
        brk.setText("");
        bq.setText("");
        lun.setText("");
        lq.setText("");
        din.setText("");
        dq.setText("");
        ns.setText("");
        es.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LunchL;
    private javax.swing.JLabel bLabel;
    private javax.swing.JTextField bq;
    private javax.swing.JTextField brk;
    private javax.swing.JLabel brkQtyL;
    private javax.swing.JLabel dLabel;
    private javax.swing.JLabel dQtyLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField din;
    private javax.swing.JTextField dq;
    private javax.swing.JLabel eSLabel;
    private javax.swing.JTextField es;
    private com.toedter.calendar.JDateChooser intakeDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lQtyLabel;
    private javax.swing.JTextField lq;
    private javax.swing.JTextField lun;
    private javax.swing.JLabel nSLabel;
    private javax.swing.JTextField ns;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
