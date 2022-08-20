/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculty.project;
import DB.Student;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mohamed
 */
public class SignUpStudents extends javax.swing.JFrame {

    /**
     * Creates new form SignUpStudents
     */
    public SignUpStudents() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSignInStu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIdstu = new javax.swing.JTextField();
        txtPassStu = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLNameStu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFNameStu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        genderStu = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCityStu = new javax.swing.JTextField();
        txtmailStu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSignUpStu = new javax.swing.JButton();
        txtDepIdstu = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtStreetStu = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        txtId4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtId4.setForeground(new java.awt.Color(153, 153, 153));
        txtId4.setText("Enter ID....");
        txtId4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtId4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtId4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtId4FocusLost(evt);
            }
        });
        txtId4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel11.setFont(new java.awt.Font("Sitka Heading", 1, 40)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Welcome Back!");

        jLabel12.setFont(new java.awt.Font("Sitka Subheading", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("To Keep connected with us Please");

        jLabel13.setFont(new java.awt.Font("Sitka Subheading", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("login with your personal info");

        btnSignInStu.setBackground(new java.awt.Color(255, 255, 255));
        btnSignInStu.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        btnSignInStu.setForeground(new java.awt.Color(204, 0, 0));
        btnSignInStu.setText("SIGN IN");
        btnSignInStu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInStuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel11))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnSignInStu, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel11)
                .addGap(40, 40, 40)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(40, 40, 40)
                .addComponent(btnSignInStu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("   Create Account");

        txtIdstu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIdstu.setForeground(new java.awt.Color(153, 153, 153));
        txtIdstu.setText("Enter ID....");
        txtIdstu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtIdstu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdstuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdstuFocusLost(evt);
            }
        });

        txtPassStu.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtPassStu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPassStu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassStuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassStuFocusLost(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Enter Password....");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user2.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lock.png"))); // NOI18N

        txtLNameStu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLNameStu.setForeground(new java.awt.Color(153, 153, 153));
        txtLNameStu.setText("Enter Last Name....");
        txtLNameStu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtLNameStu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLNameStuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLNameStuFocusLost(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/id.png"))); // NOI18N

        txtFNameStu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFNameStu.setForeground(new java.awt.Color(153, 153, 153));
        txtFNameStu.setText("Enter First Name....");
        txtFNameStu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFNameStu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFNameStuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFNameStuFocusLost(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user2.png"))); // NOI18N

        genderStu.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        genderStu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " ", " " }));
        genderStu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Gender.....");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/city.png"))); // NOI18N

        txtCityStu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCityStu.setForeground(new java.awt.Color(153, 153, 153));
        txtCityStu.setText("Enter City Name....");
        txtCityStu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtCityStu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCityStuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCityStuFocusLost(evt);
            }
        });

        txtmailStu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtmailStu.setForeground(new java.awt.Color(153, 153, 153));
        txtmailStu.setText("Enter Mail....");
        txtmailStu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtmailStu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtmailStuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmailStuFocusLost(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gender.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N

        btnSignUpStu.setBackground(new java.awt.Color(204, 0, 0));
        btnSignUpStu.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnSignUpStu.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUpStu.setText("SignUP");
        btnSignUpStu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpStuActionPerformed(evt);
            }
        });

        txtDepIdstu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDepIdstu.setForeground(new java.awt.Color(153, 153, 153));
        txtDepIdstu.setText("Enter Departement ID....");
        txtDepIdstu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtDepIdstu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDepIdstuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDepIdstuFocusLost(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/id.png"))); // NOI18N

        txtStreetStu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtStreetStu.setForeground(new java.awt.Color(153, 153, 153));
        txtStreetStu.setText("Enter Street Name....");
        txtStreetStu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtStreetStu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStreetStuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStreetStuFocusLost(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mail.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtStreetStu, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtIdstu, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2)))
                                        .addComponent(txtPassStu, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtFNameStu, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDepIdstu, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(genderStu, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCityStu, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLNameStu, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(212, 212, 212)
                            .addComponent(btnSignUpStu, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel15)
                            .addGap(18, 18, 18)
                            .addComponent(txtmailStu, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdstu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14))
                        .addGap(20, 20, 20)
                        .addComponent(txtDepIdstu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPassStu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFNameStu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLNameStu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(genderStu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCityStu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtStreetStu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(36, 36, 36)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtmailStu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnSignUpStu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdstuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdstuFocusGained
        // TODO add your handling code here:
        if(txtIdstu.getText().equals("Enter ID...."))
        {
            txtIdstu.setText("");
        }
       
    }//GEN-LAST:event_txtIdstuFocusGained

    private void txtIdstuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdstuFocusLost
        // TODO add your handling code here:
        if(txtIdstu.getText().equals(""))
        {
            txtIdstu.setText("Enter ID....");
        }
    }//GEN-LAST:event_txtIdstuFocusLost

    private void txtLNameStuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLNameStuFocusGained
        // TODO add your handling code here:
        if(txtLNameStu.getText().equals("Enter Last Name...."))
        {
            txtLNameStu.setText("");
        }
    }//GEN-LAST:event_txtLNameStuFocusGained

    private void txtLNameStuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLNameStuFocusLost
        // TODO add your handling code here:
        if(txtLNameStu.getText().equals(""))
        {
            txtLNameStu.setText("Enter Last Name....");
        }
    }//GEN-LAST:event_txtLNameStuFocusLost

    private void txtFNameStuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFNameStuFocusGained
        // TODO add your handling code here:
        if(txtFNameStu.getText().equals("Enter First Name...."))
        {
            txtFNameStu.setText("");
        }
        
    }//GEN-LAST:event_txtFNameStuFocusGained

    private void txtFNameStuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFNameStuFocusLost
        // TODO add your handling code here:
        if(txtFNameStu.getText().equals(""))
        {
            txtFNameStu.setText("Enter First Name....");
        }
    }//GEN-LAST:event_txtFNameStuFocusLost

    private void txtCityStuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityStuFocusGained
        // TODO add your handling code here:
        if(txtCityStu.getText().equals("Enter City Name...."))
        {
            txtCityStu.setText("");
        }
    }//GEN-LAST:event_txtCityStuFocusGained

    private void txtCityStuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityStuFocusLost
        // TODO add your handling code here:
         if(txtCityStu.getText().equals(""))
        {
            txtCityStu.setText("Enter City Name....");
        }
    }//GEN-LAST:event_txtCityStuFocusLost

    private void txtId4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtId4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId4FocusGained

    private void txtId4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtId4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId4FocusLost

    private void txtId4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId4ActionPerformed

    private void txtmailStuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmailStuFocusGained
        // TODO add your handling code here:
        if(txtmailStu.getText().equals("Enter Mail...."))
        {
            txtmailStu.setText("");
        }
    }//GEN-LAST:event_txtmailStuFocusGained

    private void txtmailStuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmailStuFocusLost
        // TODO add your handling code here:
         if(txtmailStu.getText().equals(""))
        {
            txtmailStu.setText("Enter Mail....");
        }
    }//GEN-LAST:event_txtmailStuFocusLost

    private void txtPassStuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassStuFocusGained
        // TODO add your handling code here:
      jLabel1.setVisible(false);
        
    }//GEN-LAST:event_txtPassStuFocusGained

    private void txtPassStuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassStuFocusLost
        // TODO add your handling code here:
                 if(txtPassStu.getText().equals(""))
                 {                                                        
                     jLabel1.setVisible(true);
                 }
    }//GEN-LAST:event_txtPassStuFocusLost

    private void btnSignInStuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInStuActionPerformed
        // TODO add your handling code here:
        
             new LoginFrame().setVisible(true);
              this.dispose();   
    }//GEN-LAST:event_btnSignInStuActionPerformed

    private void btnSignUpStuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpStuActionPerformed
        // TODO add your handling code here:
        
        
        String id=txtIdstu.getText().toString();
        String depId=txtDepIdstu.getText().toString();
        String fName=txtFNameStu.getText().toString();
        String lName=txtLNameStu.getText().toString();
        String gender=String.valueOf(genderStu.getSelectedItem());
        String mail=txtmailStu.getText().toString();
        String pass=txtPassStu.getText().toString();
        String city=txtCityStu.getText().toString();
        String street=txtStreetStu.getText().toString();
        if((id.equals("")||id.equals("EnterID..."))&&(depId.equals("")||depId.equals("Enter Departement ID....")) )
            JOptionPane.showMessageDialog(null,"Fill Missing Parts");
        else {
            try{
           Student.insertStudent(id, depId, fName, lName, gender, mail, pass, city, street);
            
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        }
        
        
        
        clearControls();
        
    }//GEN-LAST:event_btnSignUpStuActionPerformed

    private void txtDepIdstuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDepIdstuFocusGained
        // TODO add your handling code here:
        if(txtDepIdstu.getText().equals("Enter Departement ID...."))
        {
            txtDepIdstu.setText("");
        }
    }//GEN-LAST:event_txtDepIdstuFocusGained

    private void txtDepIdstuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDepIdstuFocusLost
        // TODO add your handling code here:
         if(txtDepIdstu.getText().equals(""))
        {
            txtDepIdstu.setText("Enter Departement ID....");
        }
    }//GEN-LAST:event_txtDepIdstuFocusLost

    private void txtStreetStuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStreetStuFocusGained
        // TODO add your handling code here:
         if(txtStreetStu.getText().equals("Enter Street Name...."))
        {
            txtStreetStu.setText("");
        }
    }//GEN-LAST:event_txtStreetStuFocusGained

    private void txtStreetStuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStreetStuFocusLost
        // TODO add your handling code here:
         if(txtStreetStu.getText().equals(""))
        {
            txtStreetStu.setText("Enter Street Name....");
        }
    }//GEN-LAST:event_txtStreetStuFocusLost
    void clearControls()
   {
       txtIdstu.setText("");
       txtFNameStu.setText("");
       txtIdstu.setText("");
       txtCityStu.setText("");
       txtmailStu.setText("");
       txtPassStu.setText("");
       txtStreetStu.setText("");

   }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUpStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpStudents().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignInStu;
    private javax.swing.JButton btnSignUpStu;
    private javax.swing.JComboBox<String> genderStu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCityStu;
    private javax.swing.JTextField txtDepIdstu;
    private javax.swing.JTextField txtFNameStu;
    private javax.swing.JTextField txtId4;
    private javax.swing.JTextField txtIdstu;
    private javax.swing.JTextField txtLNameStu;
    private javax.swing.JPasswordField txtPassStu;
    private javax.swing.JTextField txtStreetStu;
    private javax.swing.JTextField txtmailStu;
    // End of variables declaration//GEN-END:variables
}