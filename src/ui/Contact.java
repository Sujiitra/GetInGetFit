
package ui;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

public class Contact extends javax.swing.JPanel {

    private JPanel viewPanel;

    public Contact(JPanel bottomPanel) {
        initComponents();
        this.viewPanel = bottomPanel;
        ImageIcon imgThisImg = new ImageIcon("./Images/contact-us.png");
        contactusImgLabel.setIcon(imgThisImg);
        ImageIcon emailImg = new ImageIcon("./Images/email.png");
        emailIcon.setIcon(emailImg);
        ImageIcon contactImg = new ImageIcon("./Images/phone.png");
        contactIcon.setIcon(contactImg);
        ImageIcon addressImg = new ImageIcon("./Images/gps.png");
        addressIcon.setIcon(addressImg);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        contactusImgLabel = new javax.swing.JLabel();
        emailIcon = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        addressIcon = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        contactIcon = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        sendEmailBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        emailMsgTxt = new javax.swing.JTextArea();
        recepientTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Contact Us");

        emailLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        emailLabel.setText("noreplyhealthy0101@gmail.com");

        contactLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        contactLabel.setText("+14376659978");

        addressLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        addressLabel.setText("No56, Spadina avenue, Black creek");

        sendEmailBtn.setText("Send Email");
        sendEmailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendEmailBtnActionPerformed(evt);
            }
        });

        emailMsgTxt.setColumns(20);
        emailMsgTxt.setRows(5);
        jScrollPane1.setViewportView(emailMsgTxt);

        recepientTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recepientTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Type your query here!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(emailIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(emailLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(addressIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(contactIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(contactLabel)
                                            .addComponent(addressLabel)
                                            .addComponent(sendEmailBtn))))))
                        .addGap(0, 255, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(recepientTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(contactusImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(emailIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(emailLabel)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contactLabel)
                    .addComponent(contactIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(addressLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(recepientTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contactusImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(sendEmailBtn)
                        .addGap(35, 35, 35))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendEmailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendEmailBtnActionPerformed
        
        String sToAddr="noreplyhealthy0101@gmail.com";
        String sContent = "Query From "+recepientTxt.getText()+ System.lineSeparator() +emailMsgTxt.getText();
        sendEmail(sToAddr,sContent,"Query From "+recepientTxt.getText(),null);
    }//GEN-LAST:event_sendEmailBtnActionPerformed

    private void recepientTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recepientTxtActionPerformed
    }//GEN-LAST:event_recepientTxtActionPerformed
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
            if(sFpath != null)
            {
                messageBodyPart = new MimeBodyPart();
                DataSource source = new FileDataSource(sFpath);
                messageBodyPart.setDataHandler(new DataHandler(source));
                messageBodyPart.setFileName(sFpath.substring(sFpath.lastIndexOf("\\")+1, sFpath.length()));
                multipart.addBodyPart(messageBodyPart);
            }
            message.setContent(multipart);
            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Email sent successfully.");
            emailMsgTxt.setText("");
            recepientTxt.setText("");

        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error sending email: " + mex.getMessage());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="redundant Code">  
//    private void sendEmail() {
//        // Get the system properties
//        Properties properties = System.getProperties();
//
//        // Setup mail server
//        properties.setProperty("mail.smtp.host", "smtp.googlemail.com"); // Replace with your SMTP server
//        properties.setProperty("mail.smtp.port", "587");
//        properties.setProperty("mail.smtp.auth", "true");
//        properties.setProperty("mail.smtp.starttls.enable", "true");
//        properties.setProperty("mail.smtp.ssl.trust", "*");
//        properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
//
//        // Get the default Session object.
//        Session session = Session.getDefaultInstance(properties,
//                new javax.mail.Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(
//                        "kthamashi@gmail.com", "tuccsquweaergdej");// Specify the Username and the PassWord
//            }
//        });
//
//        try {
//            // Create a default MimeMessage object.
//            MimeMessage message = new MimeMessage(session);
//            // Set From: header field of the header.
//            message.setFrom(new InternetAddress("kthamashi@gmail.com")); // Replace with your email address
//            // Set To: header field of the header.
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recepientTxt.getText().trim()));
//            // Set Subject: header field
////            message.setSubject(subjectField.getText().trim());
//            // Now set the actual message
//            message.setText(emailMsgTxt.getText().trim());
//            // Send message
//            Transport.send(message);
//
//            JOptionPane.showMessageDialog(this, "Email sent successfully.");
//
//        } catch (MessagingException mex) {
//            mex.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Error sending email: " + mex.getMessage());
//        }
//    }
     // </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressIcon;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel contactIcon;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel contactusImgLabel;
    private javax.swing.JLabel emailIcon;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextArea emailMsgTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField recepientTxt;
    private javax.swing.JButton sendEmailBtn;
    // End of variables declaration//GEN-END:variables
}
