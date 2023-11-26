/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;







/**
 *
 * @author ASUS
 */
public class HomeGUI extends javax.swing.JFrame {
    //inisialisasi pada tabel
    int Baris = 0;
    static Object kolom [] = {"Topik", "Hari", "Tanggal", "Mood", "Catatan"};
    DefaultTableModel catatan =new DefaultTableModel(kolom, Baris);
    
    //inisialisasi untuk menyimpan data ke txt
    String url;
    File file;
    BufferedReader br;
    BufferedWriter bw;
    
      
    public HomeGUI() throws IOException {
        initComponents();
        // panggil method loadData()
        loadData();   
    }

    // tambahkan method loadData
    public void loadData() throws IOException{
        url = "src/save/catatanharian.txt";
        file = new File(url);
        try{
            br = new BufferedReader (new FileReader(file));
            //mengambil baris paling atas pada notepad
            String kolom = br.readLine();
            
            //memisahkanteks pada baris pertama dengan tanda koma "," dan memasukkannya ke array
            String[] namaKolom = kolom.split(",");
            
            //ambil model dan atur nama kolom tabel
            catatan = (DefaultTableModel)tablecatatan.getModel();
            catatan.setColumnIdentifiers(namaKolom);
            
            //ambil baris selanjutnya secara keseluruhan dan masukkan ke array
            Object[] dataBaris = br.lines().toArray();
            
            //lakukan perulangansebanyak jumlah data Baris
            for(int i=0;i<dataBaris.length;i++){
                //ambil tiap baris dari databaris
                String baris = dataBaris[i].toString();
                //pisah baris dengan tanda / dan masukkan array
                String[] data = baris.split("/");
                //data masukan ke tabel 
                catatan.addRow(data);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HomeGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    public static void main(String args[], String String) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HomeGUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(HomeGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
             });

    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        tabtambah = new javax.swing.JTabbedPane();
        Panel2 = new javax.swing.JPanel();
        lbltuliscatatan = new javax.swing.JLabel();
        lbltopik = new javax.swing.JLabel();
        lbltanggal = new javax.swing.JLabel();
        tftopik = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        lblmood = new javax.swing.JLabel();
        cbhari = new javax.swing.JComboBox<>();
        cbmood = new javax.swing.JComboBox<>();
        lblhari = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taCatatan = new javax.swing.JTextArea();
        tftanggal = new javax.swing.JTextField();
        Panel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablecatatan = new javax.swing.JTable();
        btnupdate = new javax.swing.JButton();
        btnhapusdata = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBackground(new java.awt.Color(255, 204, 204));
        Panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APLIKASI CATATAN HARIAN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        tabtambah.setBackground(new java.awt.Color(255, 153, 153));
        tabtambah.setForeground(new java.awt.Color(255, 255, 255));
        tabtambah.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N

        Panel2.setBackground(new java.awt.Color(255, 204, 204));
        Panel2.setForeground(new java.awt.Color(255, 204, 204));

        lbltuliscatatan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbltuliscatatan.setText("Tulis Catatan");

        lbltopik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbltopik.setText("Topik");

        lbltanggal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbltanggal.setText("Tanggal");

        btnsimpan.setBackground(new java.awt.Color(153, 255, 153));
        btnsimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsimpan.setForeground(new java.awt.Color(0, 102, 0));
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(204, 255, 255));
        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnclear.setForeground(new java.awt.Color(0, 102, 204));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        lblmood.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblmood.setText("Mood");

        cbhari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu" }));
        cbhari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbhariActionPerformed(evt);
            }
        });

        cbmood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senang", "Sedih", "Marah", "Kecewa", "Takut", "Tenang", "Gelisah", "Bangga" }));

        lblhari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblhari.setText("Hari");

        taCatatan.setColumns(20);
        taCatatan.setRows(5);
        jScrollPane1.setViewportView(taCatatan);

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel2Layout.createSequentialGroup()
                                .addComponent(lblmood, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(cbmood, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel2Layout.createSequentialGroup()
                                .addComponent(lblhari, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(cbhari, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(lbltanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tftanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(lbltopik, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(tftopik))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(lbltuliscatatan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltopik)
                    .addComponent(tftopik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhari)
                    .addComponent(cbhari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltanggal)
                    .addComponent(tftanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbmood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmood))
                .addGap(31, 31, 31)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltuliscatatan))
                .addGap(18, 18, 18)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnclear)
                    .addComponent(btnsimpan))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        tabtambah.addTab("Tambah Catatan", Panel2);

        Panel3.setBackground(new java.awt.Color(255, 153, 153));
        Panel3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Panel3ComponentShown(evt);
            }
        });

        tablecatatan.setBackground(new java.awt.Color(204, 204, 204));
        tablecatatan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 1, true));
        tablecatatan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Topik", "Hari", "Tanggal", "Mood", "Catatan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablecatatan.setGridColor(new java.awt.Color(255, 153, 153));
        tablecatatan.setSelectionBackground(new java.awt.Color(153, 0, 0));
        tablecatatan.setShowGrid(true);
        jScrollPane4.setViewportView(tablecatatan);

        btnupdate.setBackground(new java.awt.Color(255, 255, 102));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(102, 102, 0));
        btnupdate.setText("Update Data");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnhapusdata.setBackground(new java.awt.Color(204, 0, 0));
        btnhapusdata.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnhapusdata.setForeground(new java.awt.Color(255, 255, 255));
        btnhapusdata.setText("Hapus Data");
        btnhapusdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusdataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addComponent(btnupdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnhapusdata)
                        .addGap(0, 349, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdate)
                    .addComponent(btnhapusdata))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tabtambah.addTab("Catatanku", Panel3);

        btnkeluar.setBackground(new java.awt.Color(0, 0, 0));
        btnkeluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnkeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tabtambah, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnkeluar)))
                .addGap(19, 19, 19))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabtambah, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnkeluar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        
    //memasukkan data dalam tabel
        catatan.addRow(new Object[]{
            tftopik.getText(),cbhari.getSelectedItem(), tftanggal.getText(),
            cbmood.getSelectedItem(), taCatatan.getText()
        });
        tablecatatan.setModel(catatan);
        tftopik.setText("");
        cbhari.setSelectedItem("Senin");
        tftanggal.setText("");
        cbmood.setSelectedItem("Senang");
        taCatatan.setText("");
    }//GEN-LAST:event_btnsimpanActionPerformed


    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // code untuk menghapus isi tambah catatan
        tftopik.setText("");
        cbhari.setSelectedItem("Senin");
        tftanggal.setText("");
        cbmood.setSelectedItem("Senang");
        taCatatan.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void Panel3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Panel3ComponentShown
        
        tablecatatan.setModel(catatan);
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel3ComponentShown

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        url = "src/save/catatanharian.txt";
        file = new File(url);
        try{
            bw = new BufferedWriter (new FileWriter(file));
            //lakukan perulangan untuk menulis nama kolom ke notepad
            for (int i=0;i<tablecatatan.getColumnCount();i++){
                
                //pisah antara kolom dengan tanda koma
                if (i>0)
                    bw.write(",");
                bw.write(tablecatatan.getColumnName(i));
            }
            bw.newLine();//tambahkan baris baru
            //lakukan perulangan untuk menulis data ke notepad
            for(int i=0;i<tablecatatan.getRowCount();i++){
                for (int j=0;j<tablecatatan.getColumnCount();j++){
                    //pisah antara data dengan tanda "/"
                    if (j>0)
                        bw.write("/");
                    bw.write(tablecatatan.getValueAt(i,j).toString());
                }
                bw.newLine();
            }
        
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan Dalam File");
        bw.close ();
        } catch (Exception e){
        System.err.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnhapusdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusdataActionPerformed
        // menghapus data pada tabel
        int row = tablecatatan.getSelectedRow();
        
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Tidak ada baris yang dipilih", 
                                    "Pilih Baris", 
                                    JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model =(DefaultTableModel) tablecatatan.getModel();
            model.removeRow(row);
        }
    }//GEN-LAST:event_btnhapusdataActionPerformed

    private void cbhariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbhariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbhariActionPerformed
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnhapusdata;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbhari;
    private javax.swing.JComboBox<String> cbmood;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblhari;
    private javax.swing.JLabel lblmood;
    private javax.swing.JLabel lbltanggal;
    private javax.swing.JLabel lbltopik;
    private javax.swing.JLabel lbltuliscatatan;
    private javax.swing.JTextArea taCatatan;
    private javax.swing.JTable tablecatatan;
    private javax.swing.JTabbedPane tabtambah;
    private javax.swing.JTextField tftanggal;
    private javax.swing.JTextField tftopik;
    // End of variables declaration//GEN-END:variables

  

}
