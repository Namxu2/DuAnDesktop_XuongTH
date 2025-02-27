/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dangNhap;

import ConnectionProvider.connectionProvider;
import NhanVien.nhanVien;

import javax.swing.JOptionPane;
import java.sql.*;

import bangiay.view_backGroud;

public class view_doiMatKhau extends javax.swing.JFrame {

    /**
     * Creates new form view_doiMatKhau
     */
    private String datacontructor;
    private dangNhapservice_IMPL service = new dangNhapservice_IMPL();

    public view_doiMatKhau(String datacontructor) {
        initComponents();
        txt_tenNhanVien.setText(datacontructor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        doimatKhau = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_tenTaiKhoan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_passold = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_passNew = new javax.swing.JTextField();
        txt_nhapLai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_doiMatKhau = new javax.swing.JButton();
        btn_huy = new javax.swing.JButton();
        txt_tenNhanVien = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        doimatKhau.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("ĐỔI MẬT KHẨU");

        jLabel3.setText("Tên Tài khoản:");

        jLabel4.setText("Mật khẩu cũ:");

        jLabel5.setText("Mật khẩu mới:");

        jLabel6.setText("Nhập lại mật khẩu:");

        btn_doiMatKhau.setText("Đổi mật khẩu");
        btn_doiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doiMatKhauActionPerformed(evt);
            }
        });

        btn_huy.setText("Hủy");
        btn_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout doimatKhauLayout = new javax.swing.GroupLayout(doimatKhau);
        doimatKhau.setLayout(doimatKhauLayout);
        doimatKhauLayout.setHorizontalGroup(
                doimatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(doimatKhauLayout.createSequentialGroup()
                                .addGroup(doimatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(doimatKhauLayout.createSequentialGroup()
                                                .addGap(82, 82, 82)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(doimatKhauLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(doimatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txt_tenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt_passold, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt_passNew, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt_nhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(doimatKhauLayout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(btn_doiMatKhau)
                                                .addGap(36, 36, 36)
                                                .addComponent(btn_huy))
                                        .addComponent(txt_tenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        doimatKhauLayout.setVerticalGroup(
                doimatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(doimatKhauLayout.createSequentialGroup()
                                .addComponent(txt_tenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_tenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)
                                .addComponent(txt_passold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addGap(1, 1, 1)
                                .addComponent(txt_passNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(doimatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_doiMatKhau)
                                        .addComponent(btn_huy))
                                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(doimatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(doimatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_doiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doiMatKhauActionPerformed

        String tenDangNhap = txt_tenTaiKhoan.getText();
        int matKhauCu = Integer.parseInt(txt_passold.getText());
        int matKhauNew = Integer.parseInt(txt_passNew.getText());
        int nhapLai = Integer.parseInt(txt_nhapLai.getText());
        for (dangNhap x : service.getMatKhau()) {
            System.out.println(x.getTenDangNhap());
            if (txt_tenTaiKhoan.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "tên đăng nhập không được để trống");
            } else if (tenDangNhap.equals(x.getTenDangNhap())) {
                if (txt_passold.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(null, "không được để trống mật khẩu cũ");
                    break;
                } else if (matKhauCu != x.getMatKhau()) {
                    JOptionPane.showMessageDialog(null, "mật khẩu cũ sai!");
                    break;
                } else {
                    if (txt_passNew.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "mật khẩu mới không được để trống");
                        break;
                    } else {
                        if (txt_nhapLai.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "vui lòng nhập lại mật khẩu");
                            break;
                        } else if (nhapLai != matKhauNew) {
                            JOptionPane.showMessageDialog(null, "mật khẩu mới không trùng khớp");
                            break;
                        } else {
                            dangNhap dn = new dangNhap();
                            dn.setMatKhauMoi(matKhauNew);
                            dn.setTenDangNhap(tenDangNhap);
                            service.doiMatKhau(dn);
                            break;
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "sai tên đăng nhập");
                break;
            }

        }
    }//GEN-LAST:event_btn_doiMatKhauActionPerformed

    private void btn_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyActionPerformed
        view_backGroud viewBg = new view_backGroud(txt_tenNhanVien.getText());
        viewBg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_huyActionPerformed

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
            java.util.logging.Logger.getLogger(view_doiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_doiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_doiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_doiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new view_doiMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_doiMatKhau;
    private javax.swing.JButton btn_huy;
    private javax.swing.JPanel doimatKhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_nhapLai;
    private javax.swing.JTextField txt_passNew;
    private javax.swing.JTextField txt_passold;
    private javax.swing.JLabel txt_tenNhanVien;
    private javax.swing.JTextField txt_tenTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
