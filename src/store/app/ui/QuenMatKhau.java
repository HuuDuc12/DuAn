package store.app.ui;

import store.app.utils.MsgBox;
import java.awt.Color;
import java.awt.Toolkit;
import java.net.PasswordAuthentication;
import java.util.Properties;
import java.util.Random;

import jakarta.mail.*;
import jakarta.mail.internet.*;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.apache.xmlbeans.impl.regex.REUtil;
import store.app.dao.NhanVienDao;
import store.app.entity.NhanVien;
import store.app.utils.XImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class QuenMatKhau extends javax.swing.JFrame {

    /**
     * Creates new form QuenMatKhau1
     */
    public QuenMatKhau() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("QUÊN MẬT KHẨU");
        txtPass.setToolTipText("Mật khẩu mới của bạn !");
        txtRecode.setToolTipText("Nhập mã xác nhận được gửi đến email của bạn !");
        icon2.setVisible(false);
        icon4.setVisible(false);
        randCode();
//        setIconImage(XImage.APP_ICON);
    }

    public void clearForm() {
        txtRecode.setText("");
        txtPass.setText("");
        txtRepass.setText("");
    }

    public void randCode() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 6;
        Random random = new Random();

        String randomCode = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        lblCode.setText(randomCode);
        System.out.println(lblCode.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        txtRepass = new javax.swing.JPasswordField();
        btnChangePass = new javax.swing.JButton();
        txtRecode = new javax.swing.JTextField();
        refreshCode = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        icon4 = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        btnSendCode = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCode = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Thay đổi mật khẩu");

        jLabel3.setText("Tên đăng nhập :");

        jLabel4.setText("Mã xác nhận");

        jLabel5.setText("Mật khẩu mới");

        jLabel6.setText("Xác nhận mật khẩu");

        login.setText("Click here to login");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });

        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
        });

        txtRepass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRepassFocusGained(evt);
            }
        });

        btnChangePass.setBackground(new java.awt.Color(204, 255, 204));
        btnChangePass.setForeground(new java.awt.Color(30, 55, 153));
        btnChangePass.setText("Thay đổi mật khẩu");
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });

        txtRecode.setToolTipText("");
        txtRecode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRecodeFocusGained(evt);
            }
        });

        refreshCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/refresh-option.png"))); // NOI18N
        refreshCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshCodeMouseClicked(evt);
            }
        });

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/show.png"))); // NOI18N
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon1MousePressed(evt);
            }
        });

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/hide.png"))); // NOI18N
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon2MousePressed(evt);
            }
        });

        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/hide.png"))); // NOI18N
        icon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon4MousePressed(evt);
            }
        });

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/show.png"))); // NOI18N
        icon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon3MousePressed(evt);
            }
        });

        btnSendCode.setBackground(new java.awt.Color(204, 255, 204));
        btnSendCode.setForeground(new java.awt.Color(30, 55, 153));
        btnSendCode.setText("Send CODE");
        btnSendCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendCodeActionPerformed(evt);
            }
        });

        jLabel7.setText("Email :");

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
        });

        lblCode.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel1)
                        .addGap(73, 73, 73)
                        .addComponent(lblCode, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSendCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtRecode)
                                    .addComponent(txtUsername))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refreshCode)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(login)
                                        .addGap(37, 37, 37)
                                        .addComponent(btnChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtRepass)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(icon3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtPass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(icon1)))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCode, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSendCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtRecode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshCode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtRepass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(btnChangePass))
                .addGap(74, 74, 74))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/th.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFocusGained

    private void btnSendCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendCodeActionPerformed
        if (txtEmail.getText().isEmpty() == false) {
            sendMail();
        } else {
            MsgBox.showMessageDialog(this, "Vui lòng nhập địa chỉ email của bạn để lấy lại mật khẩu !");
        }

    }//GEN-LAST:event_btnSendCodeActionPerformed

    private void icon3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon3MousePressed
        icon4.setVisible(true);
        icon3.setVisible(false);
        txtRepass.setEchoChar((char) 0);
    }//GEN-LAST:event_icon3MousePressed

    private void icon4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MousePressed
        icon3.setVisible(true);
        icon4.setVisible(false);
        txtRepass.setEchoChar('*');
    }//GEN-LAST:event_icon4MousePressed

    private void icon2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MousePressed
        icon1.setVisible(true);
        icon2.setVisible(false);
        txtPass.setEchoChar('*');
    }//GEN-LAST:event_icon2MousePressed

    //Ẩn hoặc hiện mật khẩu

    private void icon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MousePressed
        icon2.setVisible(true);
        icon1.setVisible(false);
        txtPass.setEchoChar((char) 0);
    }//GEN-LAST:event_icon1MousePressed

    private void refreshCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshCodeMouseClicked
        randCode();
    }//GEN-LAST:event_refreshCodeMouseClicked

    private void txtRecodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRecodeFocusGained
        txtRecode.setBackground(Color.white);
    }//GEN-LAST:event_txtRecodeFocusGained

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed

        if (validateForm()) {

            NhanVienDao dao = new NhanVienDao();

            try {
                //So sánh mật khẩu có trùng hay không ?

                String s1 = txtPass.getText();
                String s2 = txtRepass.getText();
                if (s1.equals(s2) == false) {
                    MsgBox.showMessageDialog(this, "Mật khẩu không khớp");
                    txtRepass.setBackground(Color.red);
                    return;
                }

                //So sánh mã xác nhận có trùng hay không ?
                String s3 = lblCode.getText();
                String s4 = txtRecode.getText();

                if (s3.equals(s4) == false) {
                    MsgBox.showMessageDialog(this, "Mã xác nhận không khớp");
                    txtRecode.setBackground(Color.red);
                    return;
                }

                NhanVien nv = dao.selectById(txtUsername.getText()); // Tìm kiếm mã người dùng
                if (nv == null) {
                    MsgBox.showErrorDialog(this, "Tên đăng nhập không hợp lệ", "LỖI !");
                    txtUsername.setBackground(Color.red);
                } else {
                    int i = JOptionPane.showConfirmDialog(this, "Bạn có muốn thay đổi mật khẩu không ?",
                            "THÔNG BÁO !", JOptionPane.YES_OPTION,
                             JOptionPane.QUESTION_MESSAGE);
                    if (i == 0) {

                        //câu lệnh để thay đổi mật khẩu
                        try {
                            NhanVien user = new NhanVien();
                            user.setMaNV(txtUsername.getText());
                            user.setMatKhau(txtPass.getText());

                            dao.qmk(user);

                            JOptionPane.showMessageDialog(this, "Mật khẩu đã được thay đổi !");
                            clearForm();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, "LỖI !!!\n" + e.getMessage());
                            //            e.printStackTrace();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                MsgBox.showErrorDialog(this, e.getMessage(), "LỖI");
            }
        } else {
            MsgBox.showMessageDialog(this, "Bạn chưa nhập đầy đủ thông tin");
            return;
        }
    }//GEN-LAST:event_btnChangePassActionPerformed

    private void txtRepassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepassFocusGained
        txtRepass.setBackground(Color.white);
    }//GEN-LAST:event_txtRepassFocusGained

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        txtUsername.setBackground(Color.white);
    }//GEN-LAST:event_txtUsernameFocusGained

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        new Login_Dialog(this, true).setVisible(true);
        this.hide();
    }//GEN-LAST:event_loginMouseClicked

    public boolean validateForm() {  // Kiểm tra dữ liệu nhập vào 
        if (txtUsername.getText().isEmpty() || txtRecode.getText().isEmpty()
                || txtPass.getText().isEmpty() || txtRepass.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new QuenMatKhau().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePass;
    private javax.swing.JButton btnSendCode;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel login;
    private javax.swing.JLabel refreshCode;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtRecode;
    private javax.swing.JPasswordField txtRepass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    public void sendMail() {
        final String username = "doucd369@gmail.som";
        final String password = "xnkt udzb drtn nnf";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        //Đăng nhập gmail
        // Create a mail session
       
        Session session = Session.getDefaultInstance(prop, 
                new jakarta.mail.Authenticator() {
            @Override
            protected jakarta.mail.PasswordAuthentication getPasswordAuthentication(){
                 jakarta.mail.PasswordAuthentication mail = new jakarta.mail.PasswordAuthentication(username, password);
                return  mail;
            }
        });

        try {
            // Create a MimeMessage object
            Message message = new MimeMessage(session);

            // Set the sender and recipient addresses
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(txtEmail.getText()));

            // Set the email subject and content
            message.setSubject("Thay doi mat khau !");
            message.setText("Ma xac nhan cua ban la : " + lblCode.getText());

            // Send the message
            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Email đã được gửi !");
            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }

//        Session session = Session.getInstance(prop,
//                new jakarta.mail.Authenticator() {
//                    @Override
//                    protected jakarta.mail.PasswordAuthentication getPasswordAuthentication() {
//                        return new jakarta.mail.PasswordAuthentication;
//                    }
//                });
//                new javax.mail.Authenticator() {
//                    @Override
//                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
//                        return new javax.mail.PasswordAuthentication(username, password);
//                    }
//                });
//        try {
//
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("doucd369@gmail.com"));
//            message.setRecipients(
//                    Message.RecipientType.TO,
//                    InternetAddress.parse(txtEmail.getText())
//            );
//            message.setSubject("Thay doi mat khau !");
//            message.setText("Ma xac nhan cua ban la : " + lblCode.getText());

//            Transport.send(message);

//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//    }
}
}
