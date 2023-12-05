package ui;

import javax.swing.JPanel;

public class Home extends javax.swing.JPanel {

    private JPanel rightPanel;

    public Home(JPanel inPane) {
        initComponents();
        this.rightPanel = inPane;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Home");

        jTextArea1.setBackground(new java.awt.Color(255, 204, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to Get Fit!\n\nAt Get Fit, we understand that embarking on a journey towards a healthier and happier you is a personal and \ntransformative experience.\nOur platform is designed to support and inspire individuals on their weight loss journey, fostering a \ncommunity where shared goals and achievements become the pillars of success.\n\nOur Mission\n\nAt the heart of our mission is a commitment to empower individuals to achieve their weight loss goals in a \nsustainable and enjoyable way. We believe that a supportive community, expert guidance, and personalized \napproaches are the keys to unlocking lasting health and wellness.\n\nWho We Are\n\nWe are a team of passionate health and fitness enthusiasts, dedicated to creating a positive and motivating \nspace for anyone looking to make positive changes in their lives. Our experts, including  nutritionists, fitness \ntrainers, and wellness coaches, bring a wealth of knowledge to guide you through your weight loss journey.\n\nWhat Sets Us Apart\n\nCommunity-Centric Approach:\n\nWe believe in the power of community support. Connect with like-minded individuals, share your challenges \nand victories, and be inspired by the success stories of others on similar journeys.\n\nExpert Guidance: \n\nOur team of experienced professionals is here to provide expert advice, personalized plans, and motivation \ntailored to your unique needs.\n\nScience-Based Solutions:\n\nWe leverage the latest scientific research to offer evidence-based strategies for weight loss. Our approach \nfocuses on sustainable habits that contribute to long-term success.\n\nFun Challenges and Competitions:\n\nEngage in exciting challenges and friendly competitions that make the journey enjoyable and foster a sense of \naccomplishment.\n\nJoin Us on Your Journey\n\nEmbark on a transformative journey with Get Fit. Together, let's celebrate health, wellness, and the incredible \nstrength that  comes from embracing positive change.\nJoin our community today and discover the support you need to make lasting improvements in your life.\n\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
