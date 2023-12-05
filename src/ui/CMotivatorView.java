package ui;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.UserPanel;

public class CMotivatorView extends javax.swing.JPanel {

    private JPanel rightPanel;
    private ArrayList<UserPanel> c;

    public CMotivatorView(JPanel inPane) {
        initComponents();
        this.rightPanel = inPane;
        ImageIcon logOutIcon = new ImageIcon("./Images/logoutIcon.jpg");
        logOut.setIcon(logOutIcon);
        submitButton.setVisible(false);
        fNameText.setVisible(false);
        lNameText.setVisible(false);
        emailText.setVisible(false);
        countryTypeCombo.setVisible(false);
        fNameLabel.setVisible(false);
        lNameLabel.setVisible(false);
        emailLabel.setVisible(false);
        countryLabel.setVisible(false);
        chooseRecordInvalid.setVisible(false);
        display();
    }

    private static String sfn;
    private static String sln;
    private static String seml;
    private static String sptype;
    private static int addOrEdit;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        chooseRecordInvalid = new javax.swing.JLabel();
        fNameLabel = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        fNameText = new javax.swing.JTextField();
        lNameText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        countryTypeCombo = new javax.swing.JComboBox<>();
        fnameInvalid = new javax.swing.JLabel();
        lnameInvalid = new javax.swing.JLabel();
        emailInvalid = new javax.swing.JLabel();
        countrytypeInvalid = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        logOut = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(758, 688));

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CID", "FIRST", "LAST", "EMAIL", "COUNTRY"
            }
        ));
        jScrollPane1.setViewportView(patientTable);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Challenger List");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        chooseRecordInvalid.setText("Please choose one field");

        fNameLabel.setText("First Name");

        lNameLabel.setText("Last Name");

        emailLabel.setText("Email Id");

        countryLabel.setText("Country");

        fNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fNameTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fNameTextKeyTyped(evt);
            }
        });

        lNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lNameTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lNameTextKeyTyped(evt);
            }
        });

        emailText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailTextKeyTyped(evt);
            }
        });

        countryTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Canada", "China", "India", "USA" }));
        countryTypeCombo.setSelectedIndex(-1);
        countryTypeCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                countryTypeComboFocusLost(evt);
            }
        });

        fnameInvalid.setForeground(new java.awt.Color(255, 0, 0));

        lnameInvalid.setForeground(new java.awt.Color(255, 0, 0));

        emailInvalid.setForeground(new java.awt.Color(255, 0, 0));

        countrytypeInvalid.setForeground(new java.awt.Color(255, 0, 0));

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        logOutButton.setText("Logout");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lNameLabel)
                                .addComponent(fNameLabel)
                                .addComponent(emailLabel)
                                .addComponent(countryLabel)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(editButton)
                                .addGap(51, 51, 51)
                                .addComponent(deleteButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fNameText)
                                            .addComponent(lNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fnameInvalid)
                                            .addComponent(lnameInvalid)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(countryTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(countrytypeInvalid)
                                            .addComponent(emailInvalid)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(chooseRecordInvalid))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(submitButton)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(logOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logOutButton)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(logOut)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logOutButton)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton))
                .addGap(27, 27, 27)
                .addComponent(chooseRecordInvalid)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLabel)
                    .addComponent(fNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnameInvalid))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNameLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lnameInvalid)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel)
                    .addComponent(emailInvalid)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countryLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(countryTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(countrytypeInvalid)))
                .addGap(26, 26, 26)
                .addComponent(submitButton)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        submitButton.setVisible(true);
        fNameText.setVisible(true);
        lNameText.setVisible(true);
        emailText.setVisible(true);
        countryTypeCombo.setVisible(true);
        fNameLabel.setVisible(true);
        lNameLabel.setVisible(true);
        emailLabel.setVisible(true);
        countryLabel.setVisible(true);
        chooseRecordInvalid.setVisible(false);
        addOrEdit = 1;

    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed

        if (patientTable.getSelectedRow() == -1) {
            chooseRecordInvalid.setVisible(true);
        } else {
            int index = patientTable.getSelectedRow();
            fNameText.setText((String) patientTable.getValueAt(index, 1));
            fNameText.setVisible(true);
            lNameText.setText((String) patientTable.getValueAt(index, 2));
            lNameText.setVisible(true);
            emailText.setText((String) patientTable.getValueAt(index, 3));
            emailText.setVisible(true);
            countryTypeCombo.setSelectedItem((String) patientTable.getValueAt(index, 4));
            countryTypeCombo.setVisible(true);
            fNameLabel.setVisible(true);
            lNameLabel.setVisible(true);
            emailLabel.setVisible(true);
            countryLabel.setVisible(true);
            submitButton.setVisible(true);
            chooseRecordInvalid.setVisible(false);
            addOrEdit = 2;

        }

    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        if (patientTable.getSelectedRow() == -1) {
            chooseRecordInvalid.setVisible(true);
        } else {
            chooseRecordInvalid.setVisible(false);
            int index = patientTable.getSelectedRow();
            UserPanel op = new UserPanel();
            op.setPid((int) patientTable.getValueAt(index, 0));
            op.getPid();
            DBConnector.deleteChallenger(op);
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
            display();
        }

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        UserPanel np = new UserPanel();
        np.setFirstName(fNameText.getText());
        np.getFirstName();
        np.setLastName(lNameText.getText());
        np.getLastName();
        np.setEmail(emailText.getText());
        np.getEmail();
        np.setCountry((String) countryTypeCombo.getSelectedItem());
        np.getCountry();

        if (addOrEdit == 1) {
            DBConnector.addChallenger(np);
        } else if (addOrEdit == 2) {
            int i = patientTable.getSelectedRow();
            np.setPid((int) patientTable.getValueAt(i, 0));
            np.getPid();
            DBConnector.editChallenger(np);

        }
        JOptionPane.showMessageDialog(null, "Submitted Successfully");
        display();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void fNameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameTextKeyTyped
        char keych = evt.getKeyChar();
        if (Character.isLowerCase(keych)) {
            evt.setKeyChar(Character.toUpperCase(keych));
        }
    }//GEN-LAST:event_fNameTextKeyTyped

    private void lNameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lNameTextKeyTyped
        char keych = evt.getKeyChar();
        if (Character.isLowerCase(keych)) {
            evt.setKeyChar(Character.toUpperCase(keych));
        }
    }//GEN-LAST:event_lNameTextKeyTyped

    private void emailTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextKeyReleased

        seml = emailText.getText();
        boolean bemlflag = seml.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$");
        if (bemlflag) {
            emailInvalid.setVisible(false);
        } else {
            emailInvalid.setText("Please enter a valid email address");
            emailInvalid.setVisible(true);
        }
    }//GEN-LAST:event_emailTextKeyReleased

    private void emailTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextKeyTyped
        char keych = evt.getKeyChar();
        if (Character.isUpperCase(keych)) {
            evt.setKeyChar(Character.toLowerCase(keych));
        }
    }//GEN-LAST:event_emailTextKeyTyped

    private void countryTypeComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countryTypeComboFocusLost
        int scntryflg = countryTypeCombo.getSelectedIndex();
        if (scntryflg != -1) {
            countrytypeInvalid.setVisible(false);
        } else {
            countrytypeInvalid.setText("Please choose one");
            countrytypeInvalid.setVisible(true);
        }

    }//GEN-LAST:event_countryTypeComboFocusLost

    private void fNameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameTextKeyReleased
        sln = fNameText.getText();
        boolean bflag = sln.matches("^[A-Z ]*");
        if (bflag) {
            fnameInvalid.setVisible(false);
        } else {
            fnameInvalid.setText("Please enter only alphabets");
            fnameInvalid.setVisible(true);
        }

    }//GEN-LAST:event_fNameTextKeyReleased

    private void lNameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lNameTextKeyReleased
        sln = lNameText.getText();
        boolean bflag = sln.matches("^[A-Z ]*");
        if (bflag) {
            lnameInvalid.setVisible(false);
        } else {
            lnameInvalid.setText("Please enter only alphabets");
            lnameInvalid.setVisible(true);
        }

    }//GEN-LAST:event_lNameTextKeyReleased

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        Home newHomePanel = new Home(rightPanel);
        rightPanel.add(newHomePanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_logOutButtonActionPerformed

    public void display() {
        this.c = DBConnector.getAllChallengers();
        DefaultTableModel t = (DefaultTableModel) patientTable.getModel();
        t.setRowCount(0);
        for (UserPanel p : c) {
            Object[] row = new Object[5];
            row[0] = p.getPid();
            row[1] = p.getFirstName();
            row[2] = p.getLastName();
            row[3] = p.getEmail();
            row[4] = p.getCountry();
            t.addRow(row);
        }
        clearValues();

    }

    private void clearValues() {
        fNameText.setText("");
        lNameText.setText("");
        emailText.setText("");
        countryTypeCombo.setSelectedIndex(-1);
        fNameText.setVisible(false);
        lNameText.setVisible(false);
        emailText.setVisible(false);
        countryTypeCombo.setVisible(false);
        fNameLabel.setVisible(false);
        lNameLabel.setVisible(false);
        emailLabel.setVisible(false);
        countryLabel.setVisible(false);
        chooseRecordInvalid.setVisible(false);
        fnameInvalid.setVisible(false);
        lnameInvalid.setVisible(false);
        emailInvalid.setVisible(false);
        countrytypeInvalid.setVisible(false);
        submitButton.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel chooseRecordInvalid;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JComboBox<String> countryTypeCombo;
    private javax.swing.JLabel countrytypeInvalid;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel emailInvalid;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameText;
    private javax.swing.JLabel fnameInvalid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lNameText;
    private javax.swing.JLabel lnameInvalid;
    private javax.swing.JLabel logOut;
    private javax.swing.JButton logOutButton;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
