import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Home extends javax.swing.JFrame {

    int c =0;
    public MainList PatientList = new MainList();
    public PatientMedicinesList PMedicines = new PatientMedicinesList();
    
    
    public Home() {
        initComponents();
        jPanelDashboard.setVisible(true);
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(false);
        generateId();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableDelete = new javax.swing.JTable();
        btnBack1 = new javax.swing.JButton();
        btnDeletePatient = new javax.swing.JButton();
        btnFillmedicines = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePatients = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ItemNumberLabel1 = new javax.swing.JLabel();
        txtMname = new javax.swing.JTextField();
        txtMid = new javax.swing.JTextField();
        ItemNumberLabel2 = new javax.swing.JLabel();
        txtMhealthCondition = new javax.swing.JTextField();
        txtMmedicine = new javax.swing.JTextField();
        ItemNumberLabel4 = new javax.swing.JLabel();
        ItemNumberLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAddPharmacy = new javax.swing.JButton();
        err_med = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanelDashboard = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnRiseption = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        btnPatient = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnPharmacy1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jPanelPrintPatData = new javax.swing.JPanel();
        PatientRecipt = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        PatientPosition = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PatientCondition = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PatientName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PatientId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        PrintBtnPatient = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablePharmacy = new javax.swing.JTable();
        btnBackTo = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        ReseptionDash = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnDirectPatientRegForm = new javax.swing.JButton();
        btnDirectPatientDelForm = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        AgeField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        ItemNumberLabel = new javax.swing.JLabel();
        IdField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        MedicalField = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(980, 610));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(980, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableDelete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Patient Id", "Condition", "Index"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableDeleteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableDelete);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 22, 860, 470));

        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 130, 40));

        btnDeletePatient.setText("Delete");
        btnDeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatientActionPerformed(evt);
            }
        });
        jPanel4.add(btnDeletePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 120, 40));

        btnFillmedicines.setText("Select");
        btnFillmedicines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFillmedicinesActionPerformed(evt);
            }
        });
        jPanel4.add(btnFillmedicines, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, 120, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/msg1766772994-3143.jpg"))); // NOI18N
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/msg1766772994-3143.jpg"))); // NOI18N
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/msg1766772994-3143.jpg"))); // NOI18N
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/msg1766772994-3143.jpg"))); // NOI18N
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/msg1766772994-3143.jpg"))); // NOI18N
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 610));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablePatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Patient Id", "Condition", "Index"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablePatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePatientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablePatients);
        if (TablePatients.getColumnModel().getColumnCount() > 0) {
            TablePatients.getColumnModel().getColumn(1).setResizable(false);
            TablePatients.getColumnModel().getColumn(3).setHeaderValue("Index");
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 20, 860, 460));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/back_25px.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 120, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/msg1766772994-3143.jpg"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 610));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 990, 610));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("                 Patient  Medicines Form");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 530, 70));

        ItemNumberLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ItemNumberLabel1.setForeground(new java.awt.Color(0, 0, 0));
        ItemNumberLabel1.setText("Id :");
        jPanel5.add(ItemNumberLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 50, 50));

        txtMname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMnameFocusLost(evt);
            }
        });
        txtMname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMnameActionPerformed(evt);
            }
        });
        txtMname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMnameKeyTyped(evt);
            }
        });
        jPanel5.add(txtMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 270, 34));

        txtMid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMidFocusLost(evt);
            }
        });
        txtMid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMidActionPerformed(evt);
            }
        });
        txtMid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMidKeyTyped(evt);
            }
        });
        jPanel5.add(txtMid, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 270, 34));

        ItemNumberLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ItemNumberLabel2.setForeground(new java.awt.Color(0, 0, 0));
        ItemNumberLabel2.setText("Name :");
        jPanel5.add(ItemNumberLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 90, 50));

        txtMhealthCondition.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMhealthConditionFocusLost(evt);
            }
        });
        txtMhealthCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMhealthConditionActionPerformed(evt);
            }
        });
        txtMhealthCondition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMhealthConditionKeyTyped(evt);
            }
        });
        jPanel5.add(txtMhealthCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 200, 34));

        txtMmedicine.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMmedicineFocusLost(evt);
            }
        });
        txtMmedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMmedicineActionPerformed(evt);
            }
        });
        txtMmedicine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMmedicineKeyTyped(evt);
            }
        });
        jPanel5.add(txtMmedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 200, 34));

        ItemNumberLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ItemNumberLabel4.setForeground(new java.awt.Color(0, 0, 0));
        ItemNumberLabel4.setText("Health Condition :");
        jPanel5.add(ItemNumberLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 210, 50));

        ItemNumberLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ItemNumberLabel5.setForeground(new java.awt.Color(0, 0, 0));
        ItemNumberLabel5.setText("Medicines :");
        jPanel5.add(ItemNumberLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 130, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/back_25px.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 110, 40));

        btnAddPharmacy.setText("Send to Pharmacy");
        btnAddPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPharmacyActionPerformed(evt);
            }
        });
        jPanel5.add(btnAddPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, 167, 40));

        err_med.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/msg1766772994-3143.jpg"))); // NOI18N
        jPanel5.add(err_med, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel13.setText("jLabel13");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 200, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 611));

        jPanelDashboard.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/close_window_20px.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanelDashboard.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, -1, 30));

        btnRiseption.setBackground(new java.awt.Color(0, 121, 137));
        btnRiseption.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRiseption.setForeground(new java.awt.Color(255, 255, 255));
        btnRiseption.setText("Reception");
        btnRiseption.setActionCommand("Riception");
        btnRiseption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiseptionActionPerformed(evt);
            }
        });
        jPanelDashboard.add(btnRiseption, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 220, 90));

        btnDoctor.setBackground(new java.awt.Color(0, 121, 137));
        btnDoctor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnDoctor.setText("Doctor");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });
        jPanelDashboard.add(btnDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 220, 90));

        btnPatient.setBackground(new java.awt.Color(0, 121, 137));
        btnPatient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnPatient.setText("Patient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });
        jPanelDashboard.add(btnPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 220, 90));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("DISPENSARY MANAGMENT SYSTEM");
        jPanelDashboard.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 340, 40));

        btnPharmacy1.setBackground(new java.awt.Color(0, 121, 137));
        btnPharmacy1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPharmacy1.setForeground(new java.awt.Color(255, 255, 255));
        btnPharmacy1.setText("Pharmacy");
        btnPharmacy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPharmacy1ActionPerformed(evt);
            }
        });
        jPanelDashboard.add(btnPharmacy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 220, 80));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/msg1766772994-3143.jpg"))); // NOI18N
        jPanelDashboard.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, -1, -1));

        getContentPane().add(jPanelDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 990, 600));

        jPanelPrintPatData.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPrintPatData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PatientRecipt.setBackground(new java.awt.Color(255, 255, 255));
        PatientRecipt.setForeground(new java.awt.Color(255, 255, 255));
        PatientRecipt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Patient Position :");
        PatientRecipt.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 285, 153, 35));

        PatientPosition.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PatientPosition.setForeground(new java.awt.Color(51, 51, 51));
        PatientPosition.setText("Patient Id :");
        PatientRecipt.add(PatientPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 285, 99, 35));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Patient Condition :");
        PatientRecipt.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 232, 164, 35));

        PatientCondition.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PatientCondition.setForeground(new java.awt.Color(51, 51, 51));
        PatientCondition.setText("Patient Id :");
        PatientRecipt.add(PatientCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 232, 99, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Patient Name :");
        PatientRecipt.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 179, 131, 35));

        PatientName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PatientName.setForeground(new java.awt.Color(51, 51, 51));
        PatientName.setText("Patient Id :");
        PatientRecipt.add(PatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 179, 99, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Patient Id :");
        PatientRecipt.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 126, 102, 35));

        PatientId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PatientId.setForeground(new java.awt.Color(51, 51, 51));
        PatientId.setText("Patient Id :");
        PatientRecipt.add(PatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 126, 144, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 255));
        jLabel4.setText("Patient Receipt");
        PatientRecipt.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 14, 162, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/msg1766772994-3143.jpg"))); // NOI18N
        PatientRecipt.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanelPrintPatData.add(PatientRecipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 580, 360));

        PrintBtnPatient.setText("Print");
        PrintBtnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnPatientActionPerformed(evt);
            }
        });
        jPanelPrintPatData.add(PrintBtnPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 120, 50));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelPrintPatData.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 120, 50));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/msg1766772994-3143.jpg"))); // NOI18N
        jPanelPrintPatData.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        getContentPane().add(jPanelPrintPatData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 990, 600));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setFocusable(false);
        jPanel6.setMinimumSize(new java.awt.Dimension(560, 430));

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("      Patient  Medicines");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        TablePharmacy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Id", "Name", "Health Condition", "Medicines"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablePharmacy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePharmacyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TablePharmacyMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablePharmacyMousePressed(evt);
            }
        });
        TablePharmacy.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TablePharmacyPropertyChange(evt);
            }
        });
        TablePharmacy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TablePharmacyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TablePharmacyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TablePharmacyKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(TablePharmacy);
        if (TablePharmacy.getColumnModel().getColumnCount() > 0) {
            TablePharmacy.getColumnModel().getColumn(0).setResizable(false);
        }

        btnBackTo.setText("Back");
        btnBackTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToActionPerformed(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/msg1766772994-3143.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnBackTo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel25)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(btnBackTo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel25))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 610));

        ReseptionDash.setBackground(new java.awt.Color(255, 255, 255));
        ReseptionDash.setPreferredSize(new java.awt.Dimension(860, 610));
        ReseptionDash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("RECEPTION");
        ReseptionDash.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 40, 230, 40));

        btnDirectPatientRegForm.setBackground(new java.awt.Color(0, 153, 255));
        btnDirectPatientRegForm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDirectPatientRegForm.setForeground(new java.awt.Color(255, 255, 255));
        btnDirectPatientRegForm.setText("Register Patients");
        btnDirectPatientRegForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirectPatientRegFormActionPerformed(evt);
            }
        });
        ReseptionDash.add(btnDirectPatientRegForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 260, 80));

        btnDirectPatientDelForm.setBackground(new java.awt.Color(0, 153, 255));
        btnDirectPatientDelForm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDirectPatientDelForm.setForeground(new java.awt.Color(255, 255, 255));
        btnDirectPatientDelForm.setText("Delete Patients");
        btnDirectPatientDelForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirectPatientDelFormActionPerformed(evt);
            }
        });
        ReseptionDash.add(btnDirectPatientDelForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 260, 80));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/emergency_exit_25px.png"))); // NOI18N
        jButton3.setText("Exit ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        ReseptionDash.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 120, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/back_25px.png"))); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        ReseptionDash.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 130, 40));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/msg1766772994-3143.jpg"))); // NOI18N
        ReseptionDash.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        getContentPane().add(ReseptionDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 990, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 433));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel3.setMinimumSize(new java.awt.Dimension(560, 430));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeFieldActionPerformed(evt);
            }
        });
        AgeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AgeFieldKeyTyped(evt);
            }
        });
        jPanel3.add(AgeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 310, 30));

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameFieldKeyTyped(evt);
            }
        });
        jPanel3.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 310, 30));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setText("Name:");
        jPanel3.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 60, 25));

        AgeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AgeLabel.setForeground(new java.awt.Color(0, 0, 0));
        AgeLabel.setText("Age :");
        jPanel3.add(AgeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 46, 25));

        ItemNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ItemNumberLabel.setForeground(new java.awt.Color(0, 0, 0));
        ItemNumberLabel.setText("Id :");
        jPanel3.add(ItemNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 60, 25));

        IdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IdFieldFocusLost(evt);
            }
        });
        IdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdFieldActionPerformed(evt);
            }
        });
        IdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdFieldKeyTyped(evt);
            }
        });
        jPanel3.add(IdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 310, 30));

        priceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(0, 0, 0));
        priceLabel.setText("Health Condition :");
        jPanel3.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 31));

        MedicalField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Condition ", "Critical", "Serious", "Stable" }));
        jPanel3.add(MedicalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 220, 34));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("      Patient Details _");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/msg1766772994-3143.jpg"))); // NOI18N
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 430, 300));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/emergency_exit_25px.png"))); // NOI18N
        jButton6.setText("Exit");
        jButton6.setMaximumSize(new java.awt.Dimension(72, 23));
        jButton6.setMinimumSize(new java.awt.Dimension(72, 23));
        jButton6.setPreferredSize(new java.awt.Dimension(72, 23));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 130, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/back_25px.png"))); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 490, 140, 40));

        btnAdd.setBackground(new java.awt.Color(0, 153, 255));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Register Patient");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 150, 40));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/msg1766772994-3143.jpg"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed

    }//GEN-LAST:event_nameFieldActionPerformed

    private void nameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_nameFieldKeyTyped

    private void IdFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_IdFieldFocusLost

    private void IdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdFieldActionPerformed

    }//GEN-LAST:event_IdFieldActionPerformed

    private void IdFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdFieldKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_IdFieldKeyTyped

    public void reset() {
        nameField.setText("");
        AgeField.setText("");
        IdField.setText("");
        MedicalField.setSelectedIndex(0);
        nameField.requestFocus();
    }
    
    private void AgeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeFieldActionPerformed

    private void AgeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeFieldKeyTyped
        char c=evt.getKeyChar();
        
        if(!Character.isDigit(c))
        evt.consume();
      
    }//GEN-LAST:event_AgeFieldKeyTyped

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if(nameField.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Enter Your Name");
        }
        else if(AgeField.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Enter Your Age");
        }
        else if(IdField.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Patient Id");
        
       
        } 
         if(MedicalField.getSelectedIndex() == 0){
         JOptionPane.showMessageDialog(this, "Select Health Condition");
         }
        else{
        String name;
        int age;
        int patientid;
        String position;
        name = nameField.getText();
        age = Integer.parseInt(AgeField.getText());
        patientid = Integer.parseInt(IdField.getText());
        position = MedicalField.getSelectedItem().toString();
        
        PatientList.InsertPatient(name, age, patientid, position);
        JOptionPane.showMessageDialog(null, "Sucessful");
        reset();
        generateId();
       }
        
      
       
    }//GEN-LAST:event_btnAddActionPerformed

    public int generateId(){
    int randomId = 0;
    Random rand = new Random();   
    randomId = rand.nextInt(90) + 10; 
    IdField.setText(String.valueOf(randomId));
    IdField.setEditable(false);
    return randomId;
} 
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(true);
        jPanelPrintPatData.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    int value1;
    String value2;
    String value4;
    int value3;
    
    private void TablePatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePatientsMouseClicked
        int index = TablePatients.getSelectedRow();
        TableModel model = TablePatients.getModel();
        value1 = Integer.parseInt(model.getValueAt(index, 1).toString());
        value2 = model.getValueAt(index, 0).toString();
        value4 = model.getValueAt(index, 2).toString();
        value3 = Integer.parseInt(model.getValueAt(index, 3).toString());
        
       
       int a= JOptionPane.showConfirmDialog(null, "Patient Id : "+value1+"\n\nPatient Name : "+value2+"\n\nYour Position : "+ value3+"\n\nPLEASE WAIT FOR YOUR TURN.\n\n\n\nDo You Want Print This ?");
         if (a == JOptionPane.YES_OPTION) {
                jPanel4.setVisible(false);
                jPanel2.setVisible(false);
                jPanel5.setVisible(false);
                jPanel6.setVisible(false);
                jPanel1.setVisible(false);
                jPanelDashboard.setVisible(false);
                jPanelPrintPatData.setVisible(false);
                jPanelPrintPatData.setVisible(true);
                
        PatientId.setText(String.valueOf(value1));
        PatientName.setText(String.valueOf(value2));
        PatientPosition.setText(String.valueOf(value3));
        PatientCondition.setText(String.valueOf(value4));


        } else if (a == JOptionPane.CANCEL_OPTION) {
          return;
        }
       
       
    }//GEN-LAST:event_TablePatientsMouseClicked

    int pId;
    String pName,pHealth;
    
    private void TableDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDeleteMouseClicked
        int index = TableDelete.getSelectedRow();
        TableModel model1 = TableDelete.getModel();
        
        pId= Integer.parseInt(model1.getValueAt(index, 1).toString());
        pName = model1.getValueAt(index, 0).toString();
        pHealth  = model1.getValueAt(index, 2).toString();
        DeletePatientTable();
            
    }//GEN-LAST:event_TableDeleteMouseClicked

    public void DeletePatientTable(){
         if(PatientList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Item List is empty.!");
        }
         if(PatientList!=null)
         {
        MainList.Node current = PatientList.head;  
            DefaultTableModel model = (DefaultTableModel) TableDelete.getModel();
            model.setRowCount(0);
            while (current != null) {
                model.addRow(new Object[]{current.name, current.patientid, current.position,PatientList.GetNth(current.name)});
                current = current.next;
            } 
         }
    }
    
    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        ReseptionDash.setVisible(false);
        jPanelDashboard.setVisible(true);
        jPanelPrintPatData.setVisible(false);

    }//GEN-LAST:event_btnBack1ActionPerformed

    private void txtMnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMnameFocusLost

    private void txtMnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMnameActionPerformed

    private void txtMnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMnameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMnameKeyTyped

    private void txtMidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMidFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMidFocusLost

    private void txtMidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMidActionPerformed
    
    private void txtMidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMidKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMidKeyTyped

    private void btnDeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatientActionPerformed
        int a= JOptionPane.showConfirmDialog(null, "Are you sure ?");
        if (a == JOptionPane.YES_OPTION) {
                PatientList.deleteBeg(); 
                DeletePatientTable();
                
        }
        
        else if (a == JOptionPane.CANCEL_OPTION) {
                return;
        }
    }//GEN-LAST:event_btnDeletePatientActionPerformed

    private void btnFillmedicinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFillmedicinesActionPerformed
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        jPanel5.setVisible(true);
        
        txtMid.setText(String.valueOf(pId));
        txtMid.setEditable(false);

       txtMname.setText(String.valueOf(pName));
       txtMname.setEditable(false);
       
       txtMhealthCondition.setText(String.valueOf(pHealth));
       txtMhealthCondition.setEditable(false);

    }//GEN-LAST:event_btnFillmedicinesActionPerformed

    private void txtMhealthConditionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMhealthConditionFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMhealthConditionFocusLost

    private void txtMhealthConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMhealthConditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMhealthConditionActionPerformed

    private void txtMhealthConditionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMhealthConditionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMhealthConditionKeyTyped

    private void txtMmedicineFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMmedicineFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMmedicineFocusLost

    private void txtMmedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMmedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMmedicineActionPerformed

    private void txtMmedicineKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMmedicineKeyTyped
        
        
    }//GEN-LAST:event_txtMmedicineKeyTyped

    private void TablePharmacyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePharmacyMouseClicked
       boolean a=TablePharmacy.isEditing();
       if(a==false)
       {
          
       }
    }//GEN-LAST:event_TablePharmacyMouseClicked

    private void btnAddPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPharmacyActionPerformed
        String name;
        int pid;
        String healthPos;
        String medicines;
        name = txtMname.getText();
        pid = Integer.parseInt(txtMid.getText());
        healthPos= txtMhealthCondition.getText();
        medicines= txtMmedicine.getText();
        
        if(txtMmedicine.getText().isEmpty()){
            
        JOptionPane.showMessageDialog(null, "Please precribe medicine");
        
        }
        else
        {
        PMedicines.insertPatient(pid, name, healthPos, medicines);
        JOptionPane.showMessageDialog(null, "Sucessful");
        txtMid.setText("");
        txtMname.setText("");
        txtMhealthCondition.setText("");
        txtMmedicine.setText("");
        }
       
    }//GEN-LAST:event_btnAddPharmacyActionPerformed

    private void btnBackToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToActionPerformed
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel2.setVisible(false);
        jPanelDashboard.setVisible(true);
        jPanelPrintPatData.setVisible(false);
        jPanel1.setVisible(false);

    }//GEN-LAST:event_btnBackToActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        ReseptionDash.setVisible(false);
        jPanelDashboard.setVisible(true);
        jPanelPrintPatData.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PrintBtnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnPatientActionPerformed
       Toolkit tkp = jPanel1.getToolkit();
       PrintJob pjp = tkp.getPrintJob(this, null, null);
       Graphics g = pjp.getGraphics();
       PatientRecipt.print(g);
       g.dispose();
       pjp.end();
    }//GEN-LAST:event_PrintBtnPatientActionPerformed

    private void btnRiseptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiseptionActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(true);
    }//GEN-LAST:event_btnRiseptionActionPerformed

    private void btnDirectPatientRegFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirectPatientRegFormActionPerformed
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(false);
    }//GEN-LAST:event_btnDirectPatientRegFormActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    boolean res = false;
    
    private void btnDirectPatientDelFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirectPatientDelFormActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        
        res = true;
        
        btnFillmedicines.setEnabled(false);
                btnDeletePatient.setEnabled(true);

        
        jPanel4.setVisible(true);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(false);

        DeletePatientTable();
    }//GEN-LAST:event_btnDirectPatientDelFormActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(false);

        if(PatientList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "List is empty!");
        }
        else
        {
            MainList.Node current = PatientList.head;  
            DefaultTableModel model = (DefaultTableModel) TablePatients.getModel();
            model.setRowCount(0);
            while (current != null) {
                model.addRow(new Object[]{current.name, current.patientid, current.position,PatientList.GetNth(current.name)});
                current = current.next;
            }
        }
    }//GEN-LAST:event_btnPatientActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
                
        btnFillmedicines.setEnabled(true);
        btnDeletePatient.setEnabled(false);
        
        jPanel4.setVisible(true);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(false);

        DeletePatientTable();
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnPharmacy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPharmacy1ActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(false);
        jPanel6.setVisible(true);

        if(PMedicines.isEmpty()) {
            JOptionPane.showMessageDialog(this, "List is empty.!");
        }
        else{        
            PatientMedicinesList.Node current = PMedicines.head;  
            DefaultTableModel model = (DefaultTableModel) TablePharmacy.getModel();
            model.setRowCount(0);
            while (current != null) {
                model.addRow(new Object[]{current.patientid ,current.name, current.health, current.medicines});
                current = current.next;
            }
         }        
    }//GEN-LAST:event_btnPharmacy1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel4.setVisible(true);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
      System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(true);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(false);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void TablePharmacyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablePharmacyKeyTyped
       boolean a=TablePharmacy.isEditing();
       if(a==false)
       {
          
       }
    }//GEN-LAST:event_TablePharmacyKeyTyped

    private void TablePharmacyPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TablePharmacyPropertyChange
       boolean a=TablePharmacy.isEditing();
       if(a==false)
       {
          
       }
    }//GEN-LAST:event_TablePharmacyPropertyChange

    private void TablePharmacyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablePharmacyKeyPressed
       boolean a=TablePharmacy.isEditing();
       if(a==false)
       {
          
       }
    }//GEN-LAST:event_TablePharmacyKeyPressed

    private void TablePharmacyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablePharmacyKeyReleased
       boolean a=TablePharmacy.isEditing();
       if(a==false)
       {
          
       }
    }//GEN-LAST:event_TablePharmacyKeyReleased

    private void TablePharmacyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePharmacyMouseEntered
        boolean a=TablePharmacy.isEditing();
       if(a==false)
       {
          
       }
    }//GEN-LAST:event_TablePharmacyMouseEntered

    private void TablePharmacyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePharmacyMousePressed
       boolean a=TablePharmacy.isEditing();
       if(a==false)
       {
          
       }
    }//GEN-LAST:event_TablePharmacyMousePressed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField AgeField;
    private javax.swing.JLabel AgeLabel;
    public javax.swing.JTextField IdField;
    private javax.swing.JLabel ItemNumberLabel;
    private javax.swing.JLabel ItemNumberLabel1;
    private javax.swing.JLabel ItemNumberLabel2;
    private javax.swing.JLabel ItemNumberLabel4;
    private javax.swing.JLabel ItemNumberLabel5;
    private javax.swing.JComboBox<String> MedicalField;
    private javax.swing.JLabel PatientCondition;
    private javax.swing.JLabel PatientId;
    private javax.swing.JLabel PatientName;
    private javax.swing.JLabel PatientPosition;
    private javax.swing.JPanel PatientRecipt;
    private javax.swing.JButton PrintBtnPatient;
    private javax.swing.JPanel ReseptionDash;
    private javax.swing.JTable TableDelete;
    private javax.swing.JTable TablePatients;
    private javax.swing.JTable TablePharmacy;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddPharmacy;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnBackTo;
    private javax.swing.JButton btnDeletePatient;
    private javax.swing.JButton btnDirectPatientDelForm;
    private javax.swing.JButton btnDirectPatientRegForm;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnFillmedicines;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnPharmacy1;
    private javax.swing.JButton btnRiseption;
    private javax.swing.JLabel err_med;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelDashboard;
    private javax.swing.JPanel jPanelPrintPatData;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel priceLabel;
    public javax.swing.JTextField txtMhealthCondition;
    public javax.swing.JTextField txtMid;
    public javax.swing.JTextField txtMmedicine;
    public javax.swing.JTextField txtMname;
    // End of variables declaration//GEN-END:variables
}
