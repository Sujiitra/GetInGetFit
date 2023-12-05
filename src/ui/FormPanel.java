package ui;

import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfContentByte;
import javax.imageio.*;
import javax.swing.*;
import java.util.*;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Date;
import java.util.Enumeration;
import model.UserPanel;
import java.sql.*;
import java.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import javax.imageio.stream.ImageOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import com.itextpdf.awt.PdfGraphics2D;
import com.itextpdf.text.Document;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class FormPanel extends javax.swing.JPanel {

    private JPanel rightPanel;

    public FormPanel(JPanel inPane) {
        initComponents();
        this.rightPanel = inPane;
        submitButton.setEnabled(false);

    }
    private static String sfn;
    private static String sln;
    private static String sage;
    private static String sgen;
    private static String seml;
    private static String sptype;
    private static String smsg;
    private static Icon proImg;
    private static String pwd;
    private static String cpwd;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bgLabel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        fNameLabel = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        fNameTextField = new javax.swing.JTextField();
        fNameInvalid = new javax.swing.JLabel();
        lNameTextField = new javax.swing.JTextField();
        lNameInvalid = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        ageInvalid = new javax.swing.JLabel();
        femaleRadio = new javax.swing.JRadioButton();
        maleRadio = new javax.swing.JRadioButton();
        notSayRadio = new javax.swing.JRadioButton();
        emailTextField = new javax.swing.JTextField();
        emailInvalid = new javax.swing.JLabel();
        countryComboBox = new javax.swing.JComboBox<>();
        patientInvalid = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        genderInvalid = new javax.swing.JLabel();
        phoneInvalid = new javax.swing.JLabel();
        picLabel = new javax.swing.JLabel();
        imgButton = new javax.swing.JButton();
        dobLabel = new javax.swing.JLabel();
        dobInvalid = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        pwdLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        cpwdLabel = new javax.swing.JLabel();
        pwdInvalid = new javax.swing.JLabel();
        pwdTextField = new javax.swing.JPasswordField();
        cpwdTextField = new javax.swing.JPasswordField();

        bgLabel.setBackground(new java.awt.Color(204, 204, 255));

        titleLabel.setBackground(new java.awt.Color(204, 204, 255));
        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        titleLabel.setText("Challenger Registration Form");

        fNameLabel.setText("First Name:");

        lNameLabel.setText("Last Name:");

        ageLabel.setText("Age:");

        genderLabel.setText("Gender:");

        emailLabel.setText("E-mail:");

        countryLabel.setText("Country:");

        messageLabel.setText("Phone Number:");

        fNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fNameTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fNameTextFieldKeyTyped(evt);
            }
        });

        fNameInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        fNameInvalid.setForeground(new java.awt.Color(255, 0, 51));

        lNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lNameTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lNameTextFieldKeyTyped(evt);
            }
        });

        lNameInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        lNameInvalid.setForeground(new java.awt.Color(255, 0, 51));

        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyReleased(evt);
            }
        });

        ageInvalid.setBackground(new java.awt.Color(204, 204, 255));
        ageInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        ageInvalid.setForeground(new java.awt.Color(255, 0, 51));

        buttonGroup1.add(femaleRadio);
        femaleRadio.setText("Female");

        buttonGroup1.add(maleRadio);
        maleRadio.setText("Male");

        buttonGroup1.add(notSayRadio);
        notSayRadio.setText("Prefer not to say");

        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusGained(evt);
            }
        });
        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyTyped(evt);
            }
        });

        emailInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        emailInvalid.setForeground(new java.awt.Color(255, 0, 51));

        countryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Canada", "China", "India", "UK", "USA" }));
        countryComboBox.setSelectedIndex(-1);
        countryComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                countryComboBoxFocusLost(evt);
            }
        });
        countryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboBoxActionPerformed(evt);
            }
        });
        countryComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                countryComboBoxKeyReleased(evt);
            }
        });

        patientInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        patientInvalid.setForeground(new java.awt.Color(255, 0, 51));

        photoLabel.setText("Please upload Photo");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        genderInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        genderInvalid.setForeground(new java.awt.Color(255, 0, 51));

        phoneInvalid.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        phoneInvalid.setForeground(new java.awt.Color(255, 0, 51));

        picLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        imgButton.setText("Choose Image");
        imgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgButtonActionPerformed(evt);
            }
        });

        dobLabel.setText("Date Of Birth:");

        dobInvalid.setForeground(new java.awt.Color(255, 0, 51));

        pwdLabel.setText("Set Password:");

        phoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextFieldActionPerformed(evt);
            }
        });

        cpwdLabel.setText("Confirm Password");

        pwdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLabelLayout = new javax.swing.GroupLayout(bgLabel);
        bgLabel.setLayout(bgLabelLayout);
        bgLabelLayout.setHorizontalGroup(
            bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLabelLayout.createSequentialGroup()
                .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLabelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fNameLabel)
                            .addComponent(lNameLabel)
                            .addComponent(ageLabel)
                            .addComponent(genderLabel)
                            .addComponent(emailLabel)
                            .addComponent(countryLabel)
                            .addComponent(messageLabel)
                            .addComponent(photoLabel)
                            .addComponent(dobLabel)
                            .addComponent(pwdLabel)
                            .addComponent(cpwdLabel))
                        .addGap(115, 115, 115)
                        .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLabelLayout.createSequentialGroup()
                                .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dateField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLabelLayout.createSequentialGroup()
                                        .addComponent(femaleRadio)
                                        .addGap(18, 18, 18)
                                        .addComponent(maleRadio)))
                                .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLabelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(notSayRadio)
                                        .addGap(38, 38, 38)
                                        .addComponent(genderInvalid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLabelLayout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(dobInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(bgLabelLayout.createSequentialGroup()
                                .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(bgLabelLayout.createSequentialGroup()
                                        .addComponent(picLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(imgButton))
                                    .addComponent(phoneTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLabelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(emailInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(bgLabelLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(pwdInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(phoneInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(bgLabelLayout.createSequentialGroup()
                                .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpwdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bgLabelLayout.createSequentialGroup()
                                        .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(patientInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(bgLabelLayout.createSequentialGroup()
                                        .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lNameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                            .addComponent(fNameTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fNameInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lNameInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(bgLabelLayout.createSequentialGroup()
                                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ageInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pwdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(bgLabelLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(titleLabel)))
                .addGap(44, 44, 44))
            .addGroup(bgLabelLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(submitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLabelLayout.setVerticalGroup(
            bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLabelLayout.createSequentialGroup()
                .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLabelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(titleLabel)
                        .addGap(44, 44, 44)
                        .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNameInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lNameLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ageLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dobLabel)
                            .addComponent(dobInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLabelLayout.createSequentialGroup()
                                .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(genderLabel)
                                    .addComponent(femaleRadio)
                                    .addComponent(maleRadio)
                                    .addComponent(notSayRadio))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLabelLayout.createSequentialGroup()
                                .addComponent(genderInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailLabel)))
                        .addGap(6, 6, Short.MAX_VALUE)
                        .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countryLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(28, 28, 28)
                        .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLabelLayout.createSequentialGroup()
                                .addComponent(messageLabel)
                                .addGap(32, 32, 32)
                                .addComponent(photoLabel))
                            .addGroup(bgLabelLayout.createSequentialGroup()
                                .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phoneTextField)
                                    .addComponent(phoneInvalid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(picLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imgButton))))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLabelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pwdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdLabel))))
                .addGap(17, 17, 17)
                .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cpwdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cpwdLabel))
                    .addComponent(pwdInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(submitButton)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameTextFieldKeyReleased
        sfn = fNameTextField.getText();
        boolean bflag = sfn.matches("^[A-Z ]*");
        if (bflag) {
            fNameInvalid.setVisible(false);
        } else {
            fNameInvalid.setText("Please enter only alphabets");
            fNameInvalid.setVisible(true);
        }
        checkinputs();
    }//GEN-LAST:event_fNameTextFieldKeyReleased

    private void fNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameTextFieldKeyTyped
        char keych = evt.getKeyChar();
        if (Character.isLowerCase(keych)) {
            evt.setKeyChar(Character.toUpperCase(keych));
        }
    }//GEN-LAST:event_fNameTextFieldKeyTyped

    private void lNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lNameTextFieldKeyReleased
        sln = lNameTextField.getText();
        boolean bflag = sln.matches("^[A-Z ]*");
        if (bflag) {
            lNameInvalid.setVisible(false);
        } else {
            lNameInvalid.setText("Please enter only alphabets");
            lNameInvalid.setVisible(true);
        }
        checkinputs();
    }//GEN-LAST:event_lNameTextFieldKeyReleased

    private void lNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lNameTextFieldKeyTyped
        char keych = evt.getKeyChar();
        if (Character.isLowerCase(keych)) {
            evt.setKeyChar(Character.toUpperCase(keych));
        }
    }//GEN-LAST:event_lNameTextFieldKeyTyped

    private void ageTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextFieldKeyReleased
        sage = ageTextField.getText();
        boolean bageflag = sage.matches("^[0-9]*");
        if (bageflag) {
            ageInvalid.setVisible(false);
        } else {
            ageInvalid.setText("Please enter only digits");
            ageInvalid.setVisible(true);
        }
        checkinputs();
    }//GEN-LAST:event_ageTextFieldKeyReleased

    private void emailTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusGained
        boolean bgenderflag = femaleRadio.isSelected() || maleRadio.isSelected() || notSayRadio.isSelected();
        if (bgenderflag) {
            genderInvalid.setVisible(false);

        } else {
            genderInvalid.setText("Please choose one");
            genderInvalid.setVisible(true);
        }
        Date dob = dateField.getDate();
        Date currentDate = new Date();
        // LocalDateTime currentDate = LocalDateTime.now();
        if (currentDate.before(dob)) {
            dobInvalid.setText("Please enter a date before current date");
            dobInvalid.setVisible(true);
        } else {
            dobInvalid.setVisible(false);
        }

    }//GEN-LAST:event_emailTextFieldFocusGained

    private void emailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyReleased
        seml = emailTextField.getText();
        boolean bemlflag = seml.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$");
        if (bemlflag) {
            emailInvalid.setVisible(false);
        } else {
            emailInvalid.setText("Please enter a valid email address");
            emailInvalid.setVisible(true);
        }
        checkinputs();
    }//GEN-LAST:event_emailTextFieldKeyReleased

    private void emailTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyTyped
        char keych = evt.getKeyChar();
        if (Character.isUpperCase(keych)) {
            evt.setKeyChar(Character.toLowerCase(keych));
        }
    }//GEN-LAST:event_emailTextFieldKeyTyped

    private void countryComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countryComboBoxFocusLost
        int scntryflg = countryComboBox.getSelectedIndex();
        if (scntryflg != -1) {
            patientInvalid.setVisible(false);
        } else {
            patientInvalid.setText("Please choose one");
            patientInvalid.setVisible(true);
        }
        checkinputs();
    }//GEN-LAST:event_countryComboBoxFocusLost

    private void countryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryComboBoxActionPerformed
        checkinputs();
    }//GEN-LAST:event_countryComboBoxActionPerformed

    private void countryComboBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_countryComboBoxKeyReleased
        sptype = (String) countryComboBox.getSelectedItem();
        checkinputs();
    }//GEN-LAST:event_countryComboBoxKeyReleased


    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        checkinputs();

        UserPanel newUserPanel = new UserPanel();
        newUserPanel.setFirstName(fNameTextField.getText());
        newUserPanel.setLastName(lNameTextField.getText());
        newUserPanel.setAge(ageTextField.getText());
        newUserPanel.setDOB(dateField.getDate());
        newUserPanel.setGender(getSelectedButtonText(buttonGroup1));
        newUserPanel.setEmail(emailTextField.getText());
        newUserPanel.setCountry((String) countryComboBox.getSelectedItem());
        newUserPanel.setPh(phoneTextField.getText());
        newUserPanel.setPic(picLabel.getIcon());
        newUserPanel.setPwd(pwdTextField.getPassword().toString());

        String ImgIconStr = convertIconToString(picLabel.getIcon());

        String query = "INSERT INTO CHALLENGERS(FIRST,LAST,AGE,DOB,GENDER,EMAILID,COUNTRY,PHONE,PHOTO,PASSWORD) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@0.0.0.0:1521:xe", "admin", "admin")) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, fNameTextField.getText());
            stmt.setString(2, lNameTextField.getText());
            stmt.setString(3, ageTextField.getText());
            stmt.setString(4, dateField.getDate().toString());
            stmt.setString(5, getSelectedButtonText(buttonGroup1));
            stmt.setString(6, emailTextField.getText());
            stmt.setString(7, (String) countryComboBox.getSelectedItem());
            stmt.setString(8, phoneTextField.getText());
            stmt.setString(9, ImgIconStr);
            stmt.setString(10, cpwdTextField.getPassword().toString());
            int rows = stmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.setUserPanel(newUserPanel);

        ViewPanel newViewPanel = new ViewPanel(newUserPanel);
        rightPanel.add(newViewPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
        int decision = JOptionPane.showConfirmDialog(null, "Would you like to download a copy?",
                "Submitted Successfully!", JOptionPane.YES_NO_OPTION);
        if (decision == JOptionPane.YES_OPTION) {

            Document document = new Document();
            String sPath = "./RegisteredForm/";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddhhmmss");
            String dateAsString = simpleDateFormat.format(new Date());
            try {
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(sPath + "Challenger_" + dateAsString + ".pdf"));
                document.open();
                PdfContentByte contentByte = writer.getDirectContent();
                Graphics2D g2 = new PdfGraphics2D(contentByte, newViewPanel.getWidth(), newViewPanel.getHeight());

                newViewPanel.print(g2);
                g2.dispose();

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (document.isOpen()) {
                    document.close();
                }
            }
            int decision1 = JOptionPane.showConfirmDialog(null, "File downloaded Successfully, Would you like to receive a copy in email?",
                    "File downloaded Successfully!", JOptionPane.YES_NO_OPTION);
            if (decision == JOptionPane.YES_OPTION) {
                String sFpath = sPath + "Challenger_" + dateAsString + ".pdf";
                String sContent = "Dear " + newUserPanel.getFirstName() + " " + newUserPanel.getLastName() + ", " + System.lineSeparator() + " You have been successfully registered for the upcoming Health Challenger program," + System.lineSeparator() + " Please find the attached file for the submitted details," + System.lineSeparator() + " Warm Regrads," + System.lineSeparator() + " GIGF Team";
                sendEmail(newUserPanel.getEmail(), sContent, "Registration Confirmation", sFpath);
            }
        } else if (decision == JOptionPane.NO_OPTION) {
            Home newHomePanel = new Home(rightPanel);
            rightPanel.add(newHomePanel);
            CardLayout l = (CardLayout) rightPanel.getLayout();
            l.next(rightPanel);
        } else if (decision == JOptionPane.CLOSED_OPTION) {
            fNameTextField.setText(null);
            lNameTextField.setText(null);
            ageTextField.setText(null);
            dateField.setDate(null);
            emailTextField.setText(null);
            buttonGroup1.clearSelection();
            countryComboBox.setSelectedIndex(-1);
            phoneTextField.setText(null);
            cpwdTextField.setText(null);
            pwdTextField.setText(null);
            picLabel.setIcon(null);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void sendEmail(String sToaddr, String sContent, String sSubject, String sFpath) {
        Properties properties = System.getProperties();
        String host = "smtp.googlemail.com";
        final String username = "noreplyhealthy0101@gmail.com";
        final String password = "xhrhtwrxvdhdxfup";

        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.port", "587");
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.ssl.trust", "*");
        properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getDefaultInstance(properties,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(
                        username, password);
            }
        });
        try {

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username.trim()));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(sToaddr.trim()));
            message.setSubject(sSubject.trim());
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(sContent);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(sFpath);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(sFpath.substring(sFpath.lastIndexOf("\\") + 1, sFpath.length()));
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Email sent successfully.");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error sending email: " + mex.getMessage());
        }
    }

    private void imgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        try {
            ImageIcon imageicon = new ImageIcon(scaleImage(120, 120, ImageIO.read(new File(filename))));
            picLabel.setIcon(imageicon);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        checkinputs();
    }//GEN-LAST:event_imgButtonActionPerformed

    private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextFieldActionPerformed

    private void pwdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdTextFieldActionPerformed
    }//GEN-LAST:event_pwdTextFieldActionPerformed

    public static BufferedImage scaleImage(int w, int h, BufferedImage img) throws Exception {
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(img, 0, 0, w, h, null);
        g2d.dispose();
        return bi;
    }

    public String convertIconToString(Icon imgIcon) {
        String encodedString = "";
        byte[] picbytes;
        BufferedImage buffimg = new BufferedImage(imgIcon.getIconWidth(), imgIcon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics grndr = buffimg.createGraphics();
        imgIcon.paintIcon(null, grndr, 0, 0);
        grndr.dispose();
        try (ByteArrayOutputStream bytestream = new ByteArrayOutputStream()) {
            ImageOutputStream ios = ImageIO.createImageOutputStream(bytestream);
            try {
                ImageIO.write(buffimg, "jpeg", ios);
            } finally {
                ios.close();
            }
            picbytes = bytestream.toByteArray();
            encodedString = Base64.getEncoder().encodeToString(picbytes);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return encodedString;
    }

    public void checkinputs() {
        boolean bemlflag = emailTextField.getText().matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$");
        boolean bageflag = ageTextField.getText().matches("^[0-9]*");
        boolean blnflag = lNameTextField.getText().matches("^[A-Z ]*");
        boolean bflag = fNameTextField.getText().matches("^[A-Z ]*");
        boolean bgenderflag = femaleRadio.isSelected() || maleRadio.isSelected() || notSayRadio.isSelected();
        int countryflg = countryComboBox.getSelectedIndex();
        String phone = phoneTextField.getText();
        Date bdobflag = dateField.getDate();
        Icon proImg = picLabel.getIcon();
        char[] p = pwdTextField.getPassword();
        String pwd = new String(p);
        char[] cp = cpwdTextField.getPassword();
        String cpwd = new String(cp);
        if (bemlflag && bageflag && blnflag && bflag && bgenderflag && (phone != null) && !(countryflg == -1)
                && (proImg != null) && (bdobflag != null) && (pwd.matches(cpwd))) {

            submitButton.setEnabled(true);
        } else {
            submitButton.setEnabled(false);
        }
    }

    private String getSelectedButtonText(ButtonGroup buttonGroup1) {
        for (Enumeration buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = (AbstractButton) buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageInvalid;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JPanel bgLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> countryComboBox;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JLabel cpwdLabel;
    private javax.swing.JPasswordField cpwdTextField;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel dobInvalid;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel emailInvalid;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel fNameInvalid;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameTextField;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JLabel genderInvalid;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton imgButton;
    private javax.swing.JLabel lNameInvalid;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lNameTextField;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JRadioButton notSayRadio;
    private javax.swing.JLabel patientInvalid;
    private javax.swing.JLabel phoneInvalid;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel picLabel;
    private javax.swing.JLabel pwdInvalid;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JPasswordField pwdTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
