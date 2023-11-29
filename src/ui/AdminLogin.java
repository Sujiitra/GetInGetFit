
package ui;

import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sujiitramurukeshan
 */
public class AdminLogin extends javax.swing.JPanel {
 
    private JPanel rightPanel;
    public AdminLogin(JPanel inPane) {
        initComponents();
        this.rightPanel=inPane;
        cCredentialsInvalid.setVisible(false);
        paintComponent(rightPanel.getGraphics());
        
    // Image background = Toolkit.getDefaultToolkit().createImage("./Images/exercise-nutrition.jpeg");
    //rightPanel.drawImage(background, 0, 0, null);
    }
    
    @Override
  protected void paintComponent(Graphics g) {

    super.paintComponent(g);
         Image background = Toolkit.getDefaultToolkit().createImage("./Images/exercise-nutrition.jpeg");

        g.drawImage(background, 758, 688, null);
        
     }

    private static String uid;
    private static String pwd ;
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        challengeTab = new javax.swing.JPanel();
        cRoleLabel = new javax.swing.JLabel();
        cLoginLabel = new javax.swing.JLabel();
        cPwdLabel = new javax.swing.JLabel();
        cRoleCombo = new javax.swing.JComboBox<>();
        cLoginText = new javax.swing.JTextField();
        cPwdText = new javax.swing.JTextField();
        cSubmitButton = new javax.swing.JButton();
        cCredentialsInvalid = new javax.swing.JLabel();
        cRoleInvalid = new javax.swing.JLabel();
        fitnessTab = new javax.swing.JPanel();
        fRoleLabel = new javax.swing.JLabel();
        fLoginLabel = new javax.swing.JLabel();
        fPwdLabel = new javax.swing.JLabel();
        fSignInButton = new javax.swing.JButton();
        fSignInInvalid = new javax.swing.JLabel();
        fRoleCombo = new javax.swing.JComboBox<>();
        fRoleInvalid = new javax.swing.JLabel();
        fLoginText = new javax.swing.JTextField();
        fPwdText = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(758, 688));

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseEntered(evt);
            }
        });

        challengeTab.setBackground(new java.awt.Color(255, 204, 204));
        challengeTab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                challengeTabKeyPressed(evt);
            }
        });

        cRoleLabel.setText("Role");

        cLoginLabel.setText("Login Id");

        cPwdLabel.setText("Password");

        cRoleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Challenger", "Motivator", "Dietician" }));
        cRoleCombo.setSelectedIndex(-1);

        cLoginText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cLoginTextFocusGained(evt);
            }
        });
        cLoginText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cLoginTextActionPerformed(evt);
            }
        });
        cLoginText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cLoginTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cLoginTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cLoginTextKeyTyped(evt);
            }
        });

        cPwdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPwdTextActionPerformed(evt);
            }
        });

        cSubmitButton.setText("Sign In");
        cSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout challengeTabLayout = new javax.swing.GroupLayout(challengeTab);
        challengeTab.setLayout(challengeTabLayout);
        challengeTabLayout.setHorizontalGroup(
            challengeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(challengeTabLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(challengeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cLoginLabel)
                    .addComponent(cRoleLabel)
                    .addComponent(cPwdLabel))
                .addGap(37, 37, 37)
                .addGroup(challengeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(challengeTabLayout.createSequentialGroup()
                        .addComponent(cSubmitButton)
                        .addGap(60, 60, 60)
                        .addComponent(cCredentialsInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(challengeTabLayout.createSequentialGroup()
                        .addGroup(challengeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cRoleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(cPwdText))
                        .addGap(30, 30, 30)
                        .addComponent(cRoleInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        challengeTabLayout.setVerticalGroup(
            challengeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(challengeTabLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(challengeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cRoleLabel)
                    .addComponent(cRoleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cRoleInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(challengeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cLoginLabel)
                    .addComponent(cLoginText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(challengeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPwdLabel)
                    .addComponent(cPwdText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(challengeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cSubmitButton)
                    .addComponent(cCredentialsInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(393, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Challenge", challengeTab);

        fitnessTab.setBackground(new java.awt.Color(255, 204, 204));

        fRoleLabel.setText("Role");

        fLoginLabel.setText("Login Id");

        fPwdLabel.setText("Password");

        fSignInButton.setText("Sign In");
        fSignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSignInButtonActionPerformed(evt);
            }
        });

        fRoleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Challenger", "Motivator", "Trainer" }));
        fRoleCombo.setSelectedIndex(-1);

        fLoginText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fLoginTextActionPerformed(evt);
            }
        });
        fLoginText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fLoginTextKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout fitnessTabLayout = new javax.swing.GroupLayout(fitnessTab);
        fitnessTab.setLayout(fitnessTabLayout);
        fitnessTabLayout.setHorizontalGroup(
            fitnessTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fitnessTabLayout.createSequentialGroup()
                .addGroup(fitnessTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fitnessTabLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(fitnessTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fRoleLabel)
                            .addComponent(fLoginLabel)
                            .addComponent(fPwdLabel))
                        .addGap(81, 81, 81)
                        .addGroup(fitnessTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fRoleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fLoginText, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fPwdText, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(fRoleInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fitnessTabLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(fSignInButton)
                        .addGap(43, 43, 43)
                        .addComponent(fSignInInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        fitnessTabLayout.setVerticalGroup(
            fitnessTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fitnessTabLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(fitnessTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fRoleLabel)
                    .addComponent(fRoleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fRoleInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(fitnessTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fLoginLabel)
                    .addComponent(fLoginText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(fitnessTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fPwdLabel)
                    .addComponent(fPwdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(fitnessTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fSignInButton)
                    .addComponent(fSignInInvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(379, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Fitness", fitnessTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cLoginTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cLoginTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cLoginTextActionPerformed

    private void fSignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSignInButtonActionPerformed
        // TODO add your handling code here:
        fCheckinputs();
    }//GEN-LAST:event_fSignInButtonActionPerformed

    private void jTabbedPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseEntered

    private void challengeTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_challengeTabKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_challengeTabKeyPressed

    private void cLoginTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cLoginTextFocusGained
        // TODO add your handling code here:
        int roleCombo = cRoleCombo.getSelectedIndex();
        if(roleCombo==-1)
        {  
        cRoleInvalid.setText("Please select your role");
        cRoleInvalid.setVisible(true);
        }
        else{
                cRoleInvalid.setVisible(false);
            }
    
        
    }//GEN-LAST:event_cLoginTextFocusGained

    private void cLoginTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cLoginTextKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cLoginTextKeyTyped

    private void cLoginTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cLoginTextKeyReleased
        // TODO add your handling code here:
     
        
      
       
    }//GEN-LAST:event_cLoginTextKeyReleased

    private void cSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSubmitButtonActionPerformed
        // TODO add your handling code here:
        cCheckinputs();
    }//GEN-LAST:event_cSubmitButtonActionPerformed

    private void cPwdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPwdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPwdTextActionPerformed

    private void fLoginTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fLoginTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fLoginTextActionPerformed

    private void cLoginTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cLoginTextKeyPressed
        // TODO add your handling code here:
        if (cRoleCombo.getSelectedIndex()==-1)
        {
            cRoleInvalid.setText("Please select your role");
            cRoleInvalid.setVisible(true);
        }
        else
            cRoleInvalid.setVisible(false);
        
    }//GEN-LAST:event_cLoginTextKeyPressed

    private void fLoginTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fLoginTextKeyPressed
        // TODO add your handling code here:
        if (fRoleCombo.getSelectedIndex()==-1)
        {
            fRoleInvalid.setText("Please select your role");
            fRoleInvalid.setVisible(true);
        }
        else
            fRoleInvalid.setVisible(false);
    }//GEN-LAST:event_fLoginTextKeyPressed

    public void cCheckinputs(){
        switch(cRoleCombo.getSelectedIndex()){
        case 0:
        {
        String query = "Select PASSWORD FROM CHALLENGERS WHERE EMAILID=?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, cLoginText.getText());
        ResultSet myRs= stmt.executeQuery(); 

    if(myRs.next()){   
        boolean valid = myRs.getString(1).equals(cPwdText.getText());
        if(!valid){
                cCredentialsInvalid.setText("Incorrect password.");
                cCredentialsInvalid.setVisible(true);
    }
    else{
            
        CChallengerView newFormPanel= new CChallengerView(rightPanel);
        rightPanel.add(newFormPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
        }
    }
    else
    {
        cCredentialsInvalid.setText("Please check your login id and password.");
        cCredentialsInvalid.setVisible(true);
    }
     conn.close();
    } catch (SQLException e) {
    e.printStackTrace();
    }
    }
        break;
        case 1:
            {
        String query = "Select PASSWORD FROM MOTIVATOR WHERE LOGINNAME=?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, cLoginText.getText());
        ResultSet myRs= stmt.executeQuery(); 

    if(myRs.next()){   
        boolean valid = myRs.getString(1).equals(cPwdText.getText());
        if(!valid){
                cCredentialsInvalid.setText("Incorrect password.");
                cCredentialsInvalid.setVisible(true);
    }
    else{
            
        CMotivatorView newFormPanel= new CMotivatorView(rightPanel);
        rightPanel.add(newFormPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
        }
    }
    else
    {
        cCredentialsInvalid.setText("Please check your login id and password.");
        cCredentialsInvalid.setVisible(true);
    }
     conn.close();
    } catch (SQLException e) {
    e.printStackTrace();
    }
    }
        break;
        case 2:
            {
        String query = "Select PASSWORD FROM DIETICIAN WHERE LOGINNAME=?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, cLoginText.getText());
        ResultSet myRs= stmt.executeQuery(); 

    if(myRs.next()){   
        boolean valid = myRs.getString(1).equals(cPwdText.getText());
        if(!valid){
                cCredentialsInvalid.setText("Incorrect password.");
                cCredentialsInvalid.setVisible(true);
    }
    else{
            
        CDieticianView newFormPanel= new CDieticianView(rightPanel);
        rightPanel.add(newFormPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
        }
    }
    else
    {
       cCredentialsInvalid.setText("Please check your login id and password.");
        cCredentialsInvalid.setVisible(true);
    }
     conn.close();
    } catch (SQLException e) {
    e.printStackTrace();
    }
    }
        default:{
           cCredentialsInvalid.setText("Please check your login id and password.");
        cCredentialsInvalid.setVisible(true);
        }
        }
       
}
    public void fCheckinputs(){
        switch(fRoleCombo.getSelectedIndex()){
        case 0:
        {
        String query = "Select PASSWORD FROM CHALLENGERS WHERE EMAILID=?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, fLoginText.getText());
        ResultSet myRs= stmt.executeQuery(); 

    if(myRs.next()){   
        boolean valid = myRs.getString(1).equals(fPwdText.getText());
        if(!valid){
                fSignInInvalid.setText("Incorrect password.");
                fSignInInvalid.setVisible(true);
    }
    else{
            
        FChallengerView newFormPanel= new FChallengerView(rightPanel);
        rightPanel.add(newFormPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
        }
    }
    else
    {
        fSignInInvalid.setText("Please check your login id and password.");
        fSignInInvalid.setVisible(true);
    }
     conn.close();
    } catch (SQLException e) {
    e.printStackTrace();
    }
    }
        break;
        case 1:
            {
        String query = "Select PASSWORD FROM MOTIVATOR WHERE LOGINNAME=?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, fLoginText.getText());
        ResultSet myRs= stmt.executeQuery(); 

    if(myRs.next()){   
        boolean valid = myRs.getString(1).equals(fPwdText.getText());
        if(!valid){
                fSignInInvalid.setText("Incorrect password.");
                fSignInInvalid.setVisible(true);
    }
    else{
            
        FMotivatorView newFormPanel= new FMotivatorView(rightPanel);
        rightPanel.add(newFormPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
        }
    }
    else
    {
        fSignInInvalid.setText("Please check your login id and password.");
        fSignInInvalid.setVisible(true);
    }
     conn.close();
    } catch (SQLException e) {
    e.printStackTrace();
    }
    }
        break;
        case 2:
            {
        String query = "Select PASSWORD FROM TRAINER WHERE LOGINNAME=?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, fLoginText.getText());
        ResultSet myRs= stmt.executeQuery(); 

    if(myRs.next()){   
        boolean valid = myRs.getString(1).equals(fPwdText.getText());
        if(!valid){
                fSignInInvalid.setText("Incorrect password.");
                fSignInInvalid.setVisible(true);
    }
    else{
            
        FTrainerView newFormPanel= new FTrainerView(rightPanel);
        rightPanel.add(newFormPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
        }
    }
    else
    {
       fSignInInvalid.setText("Please check your login id and password.");
        fSignInInvalid.setVisible(true);
    }
     conn.close();
    } catch (SQLException e) {
    e.printStackTrace();
    }
    }
        default:{
           fSignInInvalid.setText("Please check your login id and password.");
        fSignInInvalid.setVisible(true);
        }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cCredentialsInvalid;
    private javax.swing.JLabel cLoginLabel;
    private javax.swing.JTextField cLoginText;
    private javax.swing.JLabel cPwdLabel;
    private javax.swing.JTextField cPwdText;
    private javax.swing.JComboBox<String> cRoleCombo;
    private javax.swing.JLabel cRoleInvalid;
    private javax.swing.JLabel cRoleLabel;
    private javax.swing.JButton cSubmitButton;
    private javax.swing.JPanel challengeTab;
    private javax.swing.JLabel fLoginLabel;
    private javax.swing.JTextField fLoginText;
    private javax.swing.JLabel fPwdLabel;
    private javax.swing.JTextField fPwdText;
    private javax.swing.JComboBox<String> fRoleCombo;
    private javax.swing.JLabel fRoleInvalid;
    private javax.swing.JLabel fRoleLabel;
    private javax.swing.JButton fSignInButton;
    private javax.swing.JLabel fSignInInvalid;
    private javax.swing.JPanel fitnessTab;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
