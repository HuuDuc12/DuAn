/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.app.ui;

import java.awt.Color;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.FileChooserUI;
import javax.swing.table.DefaultTableModel;
import static org.apache.poi.hssf.usermodel.HeaderFooter.time;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import store.app.dao.ThongKeDao;
import store.app.utils.MsgBox;
import store.app.utils.XDate;
import store.app.utils.XImage;

/**
 *
 * @author asus
 */
public class ThongKe_Dialog extends javax.swing.JDialog {

    /**
     * Creates new form ThongKe_Dialog
     */
    public ThongKe_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        init();
//        lblHomNay.setText(date_format.format(XDate.now()));
        lblNgayHomNay.setToolTipText(date_format.format(XDate.now()));
    }

    void init(){
        setIconImage(XImage.APP_ICON);
        viewTable();
    }
    
    SimpleDateFormat date_format = new SimpleDateFormat("yyyy/MM/dd");
    
    
    public boolean checkSo(String thang){
            try {
                int check =Integer.parseInt(thang);
                if (check <= 0 || check > 12) {
                MsgBox.showErrorDialog(this, "Tháng phải phải từ 1-12", "THÔNG BÁO");
                return false;
            }
            } catch (Exception e) {
                MsgBox.showErrorDialog(this, "Tháng phải phải là số", "THÔNG BÁO");
                return false;
            }
            return true;
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlTimKiem = new javax.swing.JPanel();
        btnTimSpKhBanDuoc = new javax.swing.JButton();
        txtThang = new javax.swing.JTextField();
        lblThangSP = new javax.swing.JLabel();
        lblNgaySP = new javax.swing.JLabel();
        btnNhapLai = new javax.swing.JButton();
        lblNgayHomNay = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        btnHuySpKhBanDuoc = new javax.swing.JButton();
        btnXuatSpKbanDuoc = new javax.swing.JButton();
        pnlDoanhThu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbDoanhThu = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("THỐNG KÊ BÁO CÁO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(30, 55, 153));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("THỐNG KÊ BÁO CÁO");

        pnlTimKiem.setBackground(new java.awt.Color(255, 255, 255));
        pnlTimKiem.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnTimSpKhBanDuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/magnifying-glass.png"))); // NOI18N
        btnTimSpKhBanDuoc.setText("Tìm kiếm");
        btnTimSpKhBanDuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimSpKhBanDuocActionPerformed(evt);
            }
        });

        txtThang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtThangKeyReleased(evt);
            }
        });

        lblThangSP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblThangSP.setText("Tìm kiếm  theo tháng :");
        lblThangSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThangSPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThangSPMouseExited(evt);
            }
        });

        lblNgaySP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNgaySP.setText("Tìm kiếm theo ngày :");
        lblNgaySP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNgaySPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNgaySPMouseExited(evt);
            }
        });

        btnNhapLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/reload.png"))); // NOI18N
        btnNhapLai.setText("Nhập lại");
        btnNhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapLaiActionPerformed(evt);
            }
        });

        lblNgayHomNay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNgayHomNay.setText("Ngày hôm nay ");
        lblNgayHomNay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNgayHomNayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNgayHomNayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNgayHomNayMouseExited(evt);
            }
        });

        dateChooser.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout pnlTimKiemLayout = new javax.swing.GroupLayout(pnlTimKiem);
        pnlTimKiem.setLayout(pnlTimKiemLayout);
        pnlTimKiemLayout.setHorizontalGroup(
            pnlTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgaySP, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThangSP, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNgayHomNay))
                .addGap(18, 18, 18)
                .addGroup(pnlTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtThang)
                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(pnlTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimSpKhBanDuoc))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        pnlTimKiemLayout.setVerticalGroup(
            pnlTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNhapLai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTimKiemLayout.createSequentialGroup()
                        .addComponent(lblThangSP)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtThang))
                .addGap(18, 18, 18)
                .addGroup(pnlTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTimKiemLayout.createSequentialGroup()
                        .addComponent(lblNgaySP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(lblNgayHomNay)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTimKiemLayout.createSequentialGroup()
                        .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45))
                    .addGroup(pnlTimKiemLayout.createSequentialGroup()
                        .addComponent(btnTimSpKhBanDuoc)
                        .addContainerGap())))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btnHuySpKhBanDuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/Address book.png"))); // NOI18N
        btnHuySpKhBanDuoc.setText("HỦY");
        btnHuySpKhBanDuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuySpKhBanDuocActionPerformed(evt);
            }
        });

        btnXuatSpKbanDuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/Alarm.png"))); // NOI18N
        btnXuatSpKbanDuoc.setText("XUẤT BÁO CÁO");
        btnXuatSpKbanDuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatSpKbanDuocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXuatSpKbanDuoc)
                .addGap(27, 27, 27)
                .addComponent(btnHuySpKhBanDuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXuatSpKbanDuoc)
                    .addComponent(btnHuySpKhBanDuoc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDoanhThu.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DOANH THU", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 0))); // NOI18N

        tbDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "SỐ HĐ ĐÃ BÁN", "SỐ SẢN PHẨM", "DOANH THU", "HĐ THẤP NHẤT", "HĐ CAO NHẤT", "TRUNG BÌNH"
            }
        ));
        jScrollPane3.setViewportView(tbDoanhThu);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SẢN PHẨM ĐÃ BÁN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 0))); // NOI18N

        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MÃ HÓA ĐƠN", "MÃ SP", "TÊN SP", "SỐ LƯỢNG", "DANH MỤC", "THÀNH TIỀN"
            }
        ));
        jScrollPane5.setViewportView(tbSanPham);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout pnlDoanhThuLayout = new javax.swing.GroupLayout(pnlDoanhThu);
        pnlDoanhThu.setLayout(pnlDoanhThuLayout);
        pnlDoanhThuLayout.setHorizontalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlDoanhThuLayout.setVerticalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(pnlTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitle)
                .addGap(13, 13, 13)
                .addComponent(pnlTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(421, 421, 421)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnTimSpKhBanDuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimSpKhBanDuocActionPerformed

        this.fillTableDoanhThuTheoNgay();
        this.fillTableSanPhamTheoNgay();

    }//GEN-LAST:event_btnTimSpKhBanDuocActionPerformed

    private void txtThangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtThangKeyReleased
        if (txtThang.getText().isEmpty()) {
            return;
        }
        if (checkSo(txtThang.getText())) {

            this.fillTableDoanhThuTheoThang();
            this.fillTableSanPhamTheoThang();

        }
    }//GEN-LAST:event_txtThangKeyReleased

    private void lblThangSPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThangSPMouseEntered
        lblThangSP.setForeground(Color.red);
    }//GEN-LAST:event_lblThangSPMouseEntered

    private void lblThangSPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThangSPMouseExited
        lblThangSP.setForeground(Color.black);
    }//GEN-LAST:event_lblThangSPMouseExited

    private void lblNgaySPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNgaySPMouseEntered
        lblNgaySP.setForeground(Color.red);
    }//GEN-LAST:event_lblNgaySPMouseEntered

    private void lblNgaySPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNgaySPMouseExited
        lblNgaySP.setForeground(Color.black);
    }//GEN-LAST:event_lblNgaySPMouseExited

    private void btnNhapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapLaiActionPerformed
        txtThang.setText("");
        this.clearTABLE();
    }//GEN-LAST:event_btnNhapLaiActionPerformed

    private void lblNgayHomNayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNgayHomNayMouseClicked

        this.fillTableDoanhThuHomNay();
        this.fillTableSanPhamHomNay();


    }//GEN-LAST:event_lblNgayHomNayMouseClicked

    private void lblNgayHomNayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNgayHomNayMouseEntered
        lblNgayHomNay.setForeground(Color.red);
    }//GEN-LAST:event_lblNgayHomNayMouseEntered

    private void lblNgayHomNayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNgayHomNayMouseExited
        lblNgayHomNay.setForeground(Color.black);
    }//GEN-LAST:event_lblNgayHomNayMouseExited

    private void btnHuySpKhBanDuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuySpKhBanDuocActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHuySpKhBanDuocActionPerformed

    private void btnXuatSpKbanDuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatSpKbanDuocActionPerformed
        FileOutputStream fos = null;
        BufferedOutputStream buf = null;
        XSSFWorkbook workbook = null;
            
        JFileChooser fileChooser = new JFileChooser("D:\\Du an 1\\store-app\\BaoCao");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES","xls","xlsx");
        fileChooser.setDialogTitle("EXPORT FILE EXCEL ");
        
        fileChooser.setFileFilter(fnef);
        int chooser = fileChooser.showSaveDialog(null);
        if (chooser ==JFileChooser.APPROVE_OPTION) {
            
            try {
                workbook = new XSSFWorkbook();
                
                //Xuất bảng doanh thu ra file EXCEL
                XSSFSheet sheet = workbook.createSheet("1.Doanh Thu");
                XSSFRow row = null;
                Cell cell = null;
                sheet.setColumnWidth(0, 5000);
                sheet.setColumnWidth(1, 6000);
                sheet.setColumnWidth(2, 4000);
                sheet.setColumnWidth(3, 5000);
                sheet.setColumnWidth(4, 5000);
                sheet.setColumnWidth(5, 5000);
                sheet.addMergedRegion(new CellRangeAddress(/*rơw*/0,1, /*column*/0,5));
                
                Cell cellTiltle = sheet.createRow(0).createCell(0);
                cellTiltle.getRow().setHeightInPoints(30);
                CellStyle style = workbook.createCellStyle();
                style.setFillForegroundColor(IndexedColors.WHITE1.getIndex());
                style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                style.setAlignment(HorizontalAlignment.CENTER);
                style.setVerticalAlignment(VerticalAlignment.CENTER);
                
                cellTiltle.setCellStyle(style);
                Font font = workbook.createFont();
                font.setColor(IndexedColors.BLACK.getIndex());
                font.setBold(true);
                font.setUnderline(Font.U_SINGLE);
                font.setFontName("Helvetia");
                cellTiltle.setCellValue("DOANH THU");
                style.setFont(font);
                
            row = sheet.createRow(3);
            
            cell = row.createCell(0,CellType.STRING);
            cell.setCellValue("SỐ HÓA ĐƠN ĐÃ BÁN");
            
            cell = row.createCell(1,CellType.STRING);
            cell.setCellValue("SỐ SẢN PHẨM BÁN ĐƯỢC");
            
            cell = row.createCell(2,CellType.STRING);
            cell.setCellValue("DOANH THU");
            
            cell = row.createCell(3,CellType.STRING);
            cell.setCellValue("HÓA ĐƠN THẤP NHẤT");
            
            cell = row.createCell(4,CellType.STRING);
            cell.setCellValue("HÓA ĐƠN CAO NHẤT");
            
            cell = row.createCell(5,CellType.STRING);
            cell.setCellValue("TRUNG BÌNH");
            
                for (int i = 0; i < tbDoanhThu.getRowCount(); i++) {
                    row = sheet.createRow(i+4);
                    for (int j = 0; j < tbDoanhThu.getColumnCount(); j++) {
                    cell = row.createCell(j);
                        
                        cell.setCellValue(tbDoanhThu.getValueAt(i, j).toString());
                    }
                }
                
            //Xuất bảng sản phẩm đã bán ra file EXCEL    
            XSSFSheet sheet1 = workbook.createSheet("2.Sản phẩm đã bán");
                XSSFRow row1 = null;
                Cell cell1 = null;            
                row1 = sheet1.createRow(3);
            sheet1.setColumnWidth(0, 4000);
                sheet1.setColumnWidth(1, 4000);
                sheet1.setColumnWidth(2, 8000);
                sheet1.setColumnWidth(3, 3000);
                sheet1.setColumnWidth(4, 5000);
                sheet1.setColumnWidth(5, 5000);
                sheet1.addMergedRegion(new CellRangeAddress(/*rơw*/0,1, /*column*/0,5));
                
                Cell cellTiltle1 = sheet1.createRow(0).createCell(0);
                cellTiltle1.getRow().setHeightInPoints(30);
                
                style.setAlignment(HorizontalAlignment.CENTER);
                style.setVerticalAlignment(VerticalAlignment.CENTER);
                
                cellTiltle1.setCellStyle(style);
                font.setColor(IndexedColors.BLACK.getIndex());
                font.setBold(true);
                font.setFontName("Helvetia");
                cellTiltle1.setCellValue("SẢN PHẨM ĐÃ BÁN");
                style.setFont(font);
            
            
            cell1 = row1.createCell(0,CellType.STRING);
            cell1.setCellValue("MÃ HÓA ĐƠN");
            
            cell1 = row1.createCell(1,CellType.STRING);
            cell1.setCellValue("MÃ SẢN PHẨM");
            
            cell1 = row1.createCell(2,CellType.STRING);
            cell1.setCellValue("TÊN SẢN PHẨM");
            
            cell1 = row1.createCell(3,CellType.STRING);
            cell1.setCellValue("SỐ LƯỢNG");
            
            cell1 = row1.createCell(4,CellType.STRING);
            cell1.setCellValue("LOẠI SẢN PHẨM");
            
            cell1 = row1.createCell(5,CellType.STRING);
            cell1.setCellValue("THÀNH TIỀN");
            
                for (int i = 0; i < tbSanPham.getRowCount(); i++) {
                    row1 = sheet1.createRow(i+4);
                    for (int j = 0; j < tbSanPham.getColumnCount(); j++) {
                    cell1 = row1.createCell(j);
                        
                        cell1.setCellValue(tbSanPham.getValueAt(i, j).toString());
                    }
                }
                
            //Xuất bảng sản phẩm bán chạy ra file EXCEL    
         
                
                fos = new FileOutputStream(fileChooser.getSelectedFile() + ".xlsx");
                buf = new BufferedOutputStream(fos);
                workbook.write(buf);
                MsgBox.showMessageDialog(this, "XUẤT BÁO CÁO THÀNH CÔNG");
            } catch (FileNotFoundException ex) {
                MsgBox.showMessageDialog(this, "LỖI");
                ex.printStackTrace();
            } catch (IOException ex) {
                MsgBox.showMessageDialog(this, "LỖI");
                ex.printStackTrace();
            } finally {
                try {
                    if (buf != null) {
                        buf.close();
                    }
                    if (fos != null) {
                        fos.close();
                    } 
                    if (workbook != null) {
                        workbook.close();
                    }
                } catch (IOException ex) {
                    MsgBox.showMessageDialog(this, "LỖI");
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btnXuatSpKbanDuocActionPerformed

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
//            java.util.logging.Logger.getLogger(ThongKe_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ThongKe_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ThongKe_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ThongKe_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ThongKe_Dialog dialog = new ThongKe_Dialog(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuySpKhBanDuoc;
    private javax.swing.JButton btnNhapLai;
    private javax.swing.JButton btnTimSpKhBanDuoc;
    private javax.swing.JButton btnXuatSpKbanDuoc;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblNgayHomNay;
    private javax.swing.JLabel lblNgaySP;
    private javax.swing.JLabel lblThangSP;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlDoanhThu;
    private javax.swing.JPanel pnlTimKiem;
    private javax.swing.JTable tbDoanhThu;
    private javax.swing.JTable tbSanPham;
    private javax.swing.JTextField txtThang;
    // End of variables declaration//GEN-END:variables

    ThongKeDao tkdao = new ThongKeDao();
    void fillTableDoanhThuTheoThang() {//Điền dữ liệu vào bảng doanh thu theo tháng tương ứng
        DefaultTableModel model = (DefaultTableModel) tbDoanhThu.getModel();
        model.setRowCount(0);
        int thang = (Integer.valueOf(txtThang.getText()));
        List<Object[]> list = tkdao.getDoanhThuTheoThang(thang);
            for (Object[] row : list) {//cho vòng lặp duyệt qua mảng líst
               model.addRow(row);
        } 
    }
    
    void fillTableDoanhThuTheoNgay() {//Điền dữ liệu vào bảng doanh thu theo ngày tương ứng
        DefaultTableModel model = (DefaultTableModel) tbDoanhThu.getModel();
        model.setRowCount(0);
        String ngay = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        List<Object[]> list = tkdao.getDoanhThuTheoNgay(ngay);
            for (Object[] row : list) {//cho vòng lặp duyệt qua mảng líst
               model.addRow(row);
        }
    }
    
    void fillTableDoanhThuHomNay() {//Điền dữ liệu vào bảng doanh thu theo ngày hôm nay tương ứng
        DefaultTableModel model = (DefaultTableModel) tbDoanhThu.getModel();
        model.setRowCount(0);
        String ngay = lblNgayHomNay.getToolTipText();
        List<Object[]> list = tkdao.getDoanhThuTheoNgay(ngay);
            for (Object[] row : list) {//cho vòng lặp duyệt qua mảng líst
               model.addRow(row);
        }   
    }
    
    
    void fillTableSanPhamHomNay() {//điền dữ liệu vào bảng Sản phẩm bán được ngày hôm nay
        DefaultTableModel model = (DefaultTableModel) tbSanPham.getModel();
        model.setRowCount(0);
        String ngay = lblNgayHomNay.getToolTipText();
        List<Object[]> list = tkdao.getSanPhamTheoNgay(ngay);
            for (Object[] row : list) {//cho vòng lặp duyệt qua mảng líst
               model.addRow(row);
        }   
    }
    
    void fillTableSanPhamTheoThang() {//điền dữ liệu vào bảng Sản phẩm bán được theo tháng
        DefaultTableModel model = (DefaultTableModel) tbSanPham.getModel();
        model.setRowCount(0);
        int thang = (Integer.valueOf(txtThang.getText()));
        List<Object[]> list = tkdao.getSanPhamTheoThang(thang);
            for (Object[] row : list) {//cho vòng lặp duyệt qua mảng líst
               model.addRow(row);
        }    
    }
    
    void fillTableSanPhamTheoNgay() {//điền dữ liệu vào bảng Sản phẩm bán được ngày theo ngày
        DefaultTableModel model = (DefaultTableModel) tbSanPham.getModel();
        model.setRowCount(0);
        String ngay = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        List<Object[]> list = tkdao.getSanPhamTheoNgay(ngay);
            for (Object[] row : list) {//cho vòng lặp duyệt qua mảng líst
               model.addRow(row);
        }   
    }
    
   
    
  
    
   
    
  
    
   
    
   
    
   
    
   
    
  
    
  
    
  
    
   
    void viewTable(){
        tbSanPham.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbSanPham.getColumnModel().getColumn(1).setPreferredWidth(80);
        tbSanPham.getColumnModel().getColumn(2).setPreferredWidth(250);
        tbSanPham.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbSanPham.getColumnModel().getColumn(4).setPreferredWidth(90);
        tbSanPham.getColumnModel().getColumn(5).setPreferredWidth(110);
        tbSanPham.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    }
    
    void clearTABLE(){
        DefaultTableModel tbModel = (DefaultTableModel) tbDoanhThu.getModel ();
        tbModel.setRowCount (0);
        tbDoanhThu.revalidate();
        
        DefaultTableModel tbModel1 = (DefaultTableModel) tbSanPham.getModel ();
        tbModel1.setRowCount (0);
        tbSanPham.revalidate();
        
     
    }
}
