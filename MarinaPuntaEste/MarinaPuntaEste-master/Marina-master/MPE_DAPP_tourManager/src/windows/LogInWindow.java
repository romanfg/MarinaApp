/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;
import javax.swing.*;
import Conecction.Conecction;
import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;
import java.util.Arrays;


/**
 *
 * @author Roman
 */
public class LogInWindow extends javax.swing.JFrame {
 private Conecction conn;
    /**
     * Creates new form LogInWindow
     */
    int x, y;
    public LogInWindow() {
        this.conn = new Conecction();
        initComponents();  
        AWTUtilities.setOpaque(this, false);
        this.setLocationRelativeTo(null);  
        ChangeSignIn.setVisible(false); 
        Pan_SignIn.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pan_LogIn = new javax.swing.JPanel();
        Drager = new javax.swing.JLabel();
        Btn_Close = new javax.swing.JButton();
        jlabel_line7 = new javax.swing.JLabel();
        jlabel_line4 = new javax.swing.JLabel();
        Input_ID = new javax.swing.JTextField();
        Input_Pass = new javax.swing.JPasswordField();
        Btn_LogIn = new javax.swing.JButton();
        jLabel_signIn = new javax.swing.JLabel();
        jlabel_personp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlabel_unlock1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        Pan_SignIn = new javax.swing.JPanel();
        jlabel_line8 = new javax.swing.JLabel();
        jlabel_line5 = new javax.swing.JLabel();
        Btn_SignIn = new javax.swing.JButton();
        Input_Pass1 = new javax.swing.JPasswordField();
        Input_ID1 = new javax.swing.JTextField();
        jLabel_signIn1 = new javax.swing.JLabel();
        Drager1 = new javax.swing.JLabel();
        Btn_Close1 = new javax.swing.JButton();
        jlabel_personp1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlabel_unlock2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlabel_line9 = new javax.swing.JLabel();
        jlabel_unlock3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jlabel_line10 = new javax.swing.JLabel();
        jlabel_unlock4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Input_Pass2 = new javax.swing.JPasswordField();
        Input_Pass3 = new javax.swing.JPasswordField();
        VendRad = new javax.swing.JRadioButton();
        AdmRad = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        ChangeSignIn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CSignIn = new javax.swing.JButton();
        ChangeLogIn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CLogIn = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pan_LogIn.setLayout(null);

        Drager.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Drager.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DragerMouseDragged(evt);
            }
        });
        Drager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DragerMousePressed(evt);
            }
        });
        Pan_LogIn.add(Drager);
        Drager.setBounds(0, 0, 510, 30);

        Btn_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Cerrar.png"))); // NOI18N
        Btn_Close.setBorderPainted(false);
        Btn_Close.setContentAreaFilled(false);
        Btn_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_CloseMouseExited(evt);
            }
        });
        Btn_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CloseActionPerformed(evt);
            }
        });
        Pan_LogIn.add(Btn_Close);
        Btn_Close.setBounds(520, 0, 20, 30);

        jlabel_line7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Line.png"))); // NOI18N
        Pan_LogIn.add(jlabel_line7);
        jlabel_line7.setBounds(50, 270, 360, 30);

        jlabel_line4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Line.png"))); // NOI18N
        Pan_LogIn.add(jlabel_line4);
        jlabel_line4.setBounds(50, 210, 360, 30);

        Input_ID.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Input_ID.setForeground(new java.awt.Color(153, 153, 153));
        Input_ID.setBorder(null);
        Input_ID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Input_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_IDActionPerformed(evt);
            }
        });
        Pan_LogIn.add(Input_ID);
        Input_ID.setBounds(50, 190, 360, 40);

        Input_Pass.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Input_Pass.setForeground(new java.awt.Color(153, 153, 153));
        Input_Pass.setBorder(null);
        Pan_LogIn.add(Input_Pass);
        Input_Pass.setBounds(50, 250, 360, 40);

        Btn_LogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Btn_LogIn_Normal_1.png"))); // NOI18N
        Btn_LogIn.setBorderPainted(false);
        Btn_LogIn.setContentAreaFilled(false);
        Btn_LogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_LogInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_LogInMouseExited(evt);
            }
        });
        Btn_LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LogInActionPerformed(evt);
            }
        });
        Pan_LogIn.add(Btn_LogIn);
        Btn_LogIn.setBounds(280, 350, 180, 50);

        jLabel_signIn.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel_signIn.setForeground(new java.awt.Color(0, 123, 164));
        jLabel_signIn.setText("Log In");
        Pan_LogIn.add(jLabel_signIn);
        jLabel_signIn.setBounds(60, 100, 110, 40);

        jlabel_personp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_PersonPlus.png"))); // NOI18N
        Pan_LogIn.add(jlabel_personp);
        jlabel_personp.setBounds(460, 180, 20, 30);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User ID");
        Pan_LogIn.add(jLabel2);
        jLabel2.setBounds(430, 210, 70, 20);

        jlabel_unlock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Lock.png"))); // NOI18N
        Pan_LogIn.add(jlabel_unlock1);
        jlabel_unlock1.setBounds(460, 240, 17, 30);

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");
        Pan_LogIn.add(jLabel3);
        jLabel3.setBounds(430, 270, 80, 20);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Box.jpg"))); // NOI18N
        Fondo.setText("jLabel3");
        Pan_LogIn.add(Fondo);
        Fondo.setBounds(0, 0, 540, 500);

        getContentPane().add(Pan_LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 35, 540, 495));

        Pan_SignIn.setLayout(null);

        jlabel_line8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Line.png"))); // NOI18N
        Pan_SignIn.add(jlabel_line8);
        jlabel_line8.setBounds(50, 230, 360, 30);

        jlabel_line5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Line.png"))); // NOI18N
        Pan_SignIn.add(jlabel_line5);
        jlabel_line5.setBounds(50, 160, 360, 30);

        Btn_SignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Btn_Sign_Normal.png"))); // NOI18N
        Btn_SignIn.setBorderPainted(false);
        Btn_SignIn.setContentAreaFilled(false);
        Btn_SignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_SignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_SignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_SignInMouseExited(evt);
            }
        });
        Btn_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SignInActionPerformed(evt);
            }
        });
        Pan_SignIn.add(Btn_SignIn);
        Btn_SignIn.setBounds(280, 420, 180, 50);

        Input_Pass1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Input_Pass1.setForeground(new java.awt.Color(153, 153, 153));
        Input_Pass1.setBorder(null);
        Pan_SignIn.add(Input_Pass1);
        Input_Pass1.setBounds(50, 220, 360, 30);

        Input_ID1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Input_ID1.setForeground(new java.awt.Color(153, 153, 153));
        Input_ID1.setBorder(null);
        Input_ID1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Input_ID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_ID1ActionPerformed(evt);
            }
        });
        Pan_SignIn.add(Input_ID1);
        Input_ID1.setBounds(50, 150, 360, 30);

        jLabel_signIn1.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel_signIn1.setForeground(new java.awt.Color(0, 123, 164));
        jLabel_signIn1.setText("Sign In");
        Pan_SignIn.add(jLabel_signIn1);
        jLabel_signIn1.setBounds(60, 40, 110, 40);

        Drager1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Drager1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Drager1MouseDragged(evt);
            }
        });
        Drager1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Drager1MousePressed(evt);
            }
        });
        Pan_SignIn.add(Drager1);
        Drager1.setBounds(0, 0, 510, 30);

        Btn_Close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Cerrar.png"))); // NOI18N
        Btn_Close1.setBorderPainted(false);
        Btn_Close1.setContentAreaFilled(false);
        Btn_Close1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_Close1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_Close1MouseExited(evt);
            }
        });
        Btn_Close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Close1ActionPerformed(evt);
            }
        });
        Pan_SignIn.add(Btn_Close1);
        Btn_Close1.setBounds(520, 0, 20, 30);

        jlabel_personp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_PersonPlus.png"))); // NOI18N
        Pan_SignIn.add(jlabel_personp1);
        jlabel_personp1.setBounds(430, 150, 20, 30);

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Choose your ID");
        Pan_SignIn.add(jLabel10);
        jLabel10.setBounds(50, 120, 360, 20);

        jlabel_unlock2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Lock.png"))); // NOI18N
        Pan_SignIn.add(jlabel_unlock2);
        jlabel_unlock2.setBounds(430, 220, 30, 30);

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Choose a Password");
        Pan_SignIn.add(jLabel11);
        jLabel11.setBounds(50, 190, 360, 20);

        jlabel_line9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Line.png"))); // NOI18N
        Pan_SignIn.add(jlabel_line9);
        jlabel_line9.setBounds(50, 300, 360, 30);

        jlabel_unlock3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Lock.png"))); // NOI18N
        Pan_SignIn.add(jlabel_unlock3);
        jlabel_unlock3.setBounds(430, 280, 17, 40);

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Verify your Password");
        Pan_SignIn.add(jLabel14);
        jLabel14.setBounds(50, 260, 360, 20);

        jlabel_line10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Line.png"))); // NOI18N
        Pan_SignIn.add(jlabel_line10);
        jlabel_line10.setBounds(50, 370, 360, 30);

        jlabel_unlock4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_Key.png"))); // NOI18N
        jlabel_unlock4.setAlignmentY(0.0F);
        Pan_SignIn.add(jlabel_unlock4);
        jlabel_unlock4.setBounds(430, 360, 30, 30);

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Select type of user");
        Pan_SignIn.add(jLabel13);
        jLabel13.setBounds(30, 420, 230, 20);

        Input_Pass2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Input_Pass2.setForeground(new java.awt.Color(153, 153, 153));
        Input_Pass2.setBorder(null);
        Pan_SignIn.add(Input_Pass2);
        Input_Pass2.setBounds(50, 360, 360, 30);

        Input_Pass3.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Input_Pass3.setForeground(new java.awt.Color(153, 153, 153));
        Input_Pass3.setBorder(null);
        Pan_SignIn.add(Input_Pass3);
        Input_Pass3.setBounds(50, 290, 360, 30);

        VendRad.setForeground(new java.awt.Color(153, 153, 153));
        VendRad.setText("Vendedor");
        VendRad.setContentAreaFilled(false);
        VendRad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        VendRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendRadActionPerformed(evt);
            }
        });
        Pan_SignIn.add(VendRad);
        VendRad.setBounds(170, 450, 110, 23);

        AdmRad.setForeground(new java.awt.Color(153, 153, 153));
        AdmRad.setText("Administrador");
        AdmRad.setContentAreaFilled(false);
        AdmRad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AdmRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmRadActionPerformed(evt);
            }
        });
        Pan_SignIn.add(AdmRad);
        AdmRad.setBounds(50, 450, 110, 23);

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Enter Admin Pass");
        Pan_SignIn.add(jLabel15);
        jLabel15.setBounds(50, 330, 360, 20);

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Box.jpg"))); // NOI18N
        Fondo1.setText("jLabel3");
        Pan_SignIn.add(Fondo1);
        Fondo1.setBounds(0, 0, 540, 500);

        getContentPane().add(Pan_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 35, 540, 495));

        ChangeSignIn.setBackground(new java.awt.Color(0, 169, 207));
        ChangeSignIn.setOpaque(false);
        ChangeSignIn.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(241, 242, 242));
        jLabel6.setText("experencias.");
        ChangeSignIn.add(jLabel6);
        jLabel6.setBounds(20, 100, 320, 40);

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(241, 242, 242));
        jLabel4.setText("En Marina Punta del Este Proveemos las mejores ");
        ChangeSignIn.add(jLabel4);
        jLabel4.setBounds(20, 80, 320, 40);

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(241, 242, 242));
        jLabel5.setText("¿Ya tienes una cuenta?");
        ChangeSignIn.add(jLabel5);
        jLabel5.setBounds(20, 50, 210, 40);

        CSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Bt_LogIn_02.png"))); // NOI18N
        CSignIn.setBorderPainted(false);
        CSignIn.setContentAreaFilled(false);
        CSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CSignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CSignInMouseExited(evt);
            }
        });
        CSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSignInActionPerformed(evt);
            }
        });
        ChangeSignIn.add(CSignIn);
        CSignIn.setBounds(70, 140, 190, 60);

        getContentPane().add(ChangeSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 350, 220));

        ChangeLogIn.setBackground(new java.awt.Color(0, 169, 207));
        ChangeLogIn.setOpaque(false);
        ChangeLogIn.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(241, 242, 242));
        jLabel7.setText("experencias.");
        ChangeLogIn.add(jLabel7);
        jLabel7.setBounds(20, 100, 320, 40);

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(241, 242, 242));
        jLabel8.setText("En Marina Punta del Este Proveemos las mejores ");
        ChangeLogIn.add(jLabel8);
        jLabel8.setBounds(20, 80, 320, 40);

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(241, 242, 242));
        jLabel9.setText("¿Necesitas una cuenta?");
        ChangeLogIn.add(jLabel9);
        jLabel9.setBounds(20, 50, 260, 40);

        CLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LI_Btn_SignIn_02.png"))); // NOI18N
        CLogIn.setBorderPainted(false);
        CLogIn.setContentAreaFilled(false);
        CLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CLogInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CLogInMouseExited(evt);
            }
        });
        CLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLogInActionPerformed(evt);
            }
        });
        ChangeLogIn.add(CLogIn);
        CLogIn.setBounds(70, 140, 190, 60);

        getContentPane().add(ChangeLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 350, 220));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SI_Background.png"))); // NOI18N

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1001, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(background)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(background)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1000, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DragerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragerMouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_DragerMouseDragged

    private void DragerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragerMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_DragerMousePressed

    private void Drager1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Drager1MouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_Drager1MouseDragged

    private void Drager1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Drager1MousePressed
        // TODO add your handling code here:
         x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_Drager1MousePressed

    private void Btn_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Btn_CloseActionPerformed

    private void Btn_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CloseMouseEntered
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon(getClass().getResource("/img/SI_Bt_Cerrar_Selec.png"));
        Btn_Close.setIcon(img);
    }//GEN-LAST:event_Btn_CloseMouseEntered

    private void Btn_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CloseMouseExited
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon(getClass().getResource("/img/SI_Bt_Cerrar.png"));
        Btn_Close.setIcon(img);
    }//GEN-LAST:event_Btn_CloseMouseExited

    private void Btn_Close1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Close1MouseEntered
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon(getClass().getResource("/img/SI_Bt_Cerrar_Selec.png"));
        Btn_Close1.setIcon(img);
    }//GEN-LAST:event_Btn_Close1MouseEntered

    private void Btn_Close1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Close1MouseExited
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon(getClass().getResource("/img/SI_Bt_Cerrar.png"));
        Btn_Close1.setIcon(img);
    }//GEN-LAST:event_Btn_Close1MouseExited

    private void Btn_Close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Close1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Btn_Close1ActionPerformed

    private void CLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLogInActionPerformed
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_SingIn02_Active.png")); 
        CLogIn.setIcon(img);
        ChangeLogIn.setVisible(false); 
        Pan_LogIn.setVisible(false);
        ChangeSignIn.setVisible(true); 
        Pan_SignIn.setVisible(true);
        
    }//GEN-LAST:event_CLogInActionPerformed

    private void CSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSignInActionPerformed
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_LogIn_Active_1.png")); 
        CSignIn.setIcon(img);
        ChangeSignIn.setVisible(false); 
        Pan_SignIn.setVisible(false);
        ChangeLogIn.setVisible(true); 
        Pan_LogIn.setVisible(true);
    }//GEN-LAST:event_CSignInActionPerformed

    private void CLogInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLogInMouseEntered
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_SingIn02_Hover.png")); 
        CLogIn.setIcon(img);
    }//GEN-LAST:event_CLogInMouseEntered

    private void CLogInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLogInMouseExited
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Li_Btn_SignIn_02.png")); 
        CLogIn.setIcon(img);
    }//GEN-LAST:event_CLogInMouseExited

    private void CSignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CSignInMouseEntered
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_LogIn02_Hover.png")); 
        CSignIn.setIcon(img);
    }//GEN-LAST:event_CSignInMouseEntered

    private void CSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CSignInMouseExited
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon(getClass().getResource("/img/SI_Bt_LogIn_02.png")); 
        CSignIn.setIcon(img);
    }//GEN-LAST:event_CSignInMouseExited

    private void Input_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_IDActionPerformed

    private void Btn_LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LogInActionPerformed
        // TODO add your handling code here:
        
        if(this.Input_ID.getText().length()>0&&this.Input_Pass.getText().length()>0){
        if (this.conn.logIn(this.Input_ID.getText(),this.Input_Pass.getText()))
        {
            JOptionPane.showMessageDialog(null, "LogIn exitoso", "SystemMessage: " + "Succesfull LogIn", JOptionPane.INFORMATION_MESSAGE);
            this.systemExit();
            setVisible(false);
            //Abre la siguiente ventana
            Windows Principal = new Windows(this.Input_ID.getText());
            Principal.setVisible(true);
            
        }
            
        else
        {
            this.Input_ID.setText(null);
            this.Input_Pass.setText(null);
            JOptionPane.showMessageDialog(null, "Detalles de inicio de sesion invalidos", "SystemMessage: " + "LogIn error", JOptionPane.ERROR_MESSAGE);
        }
        }
        else {
            JOptionPane.showMessageDialog(null, "Favor de llenar todos los campos", "SystemMessage: " + "Input error", JOptionPane.ERROR_MESSAGE);
        }
        //Se hace LOGIN COMUN A LA PLATAFORMA
        
    }//GEN-LAST:event_Btn_LogInActionPerformed

    private void Btn_LogInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_LogInMouseEntered
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_LogIn_Active_1.png")); 
        Btn_LogIn.setIcon(img);
    }//GEN-LAST:event_Btn_LogInMouseEntered

    private void Btn_LogInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_LogInMouseExited
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_LogIn_Normal_1.png")); 
        Btn_LogIn.setIcon(img);
    }//GEN-LAST:event_Btn_LogInMouseExited

    private void Input_ID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_ID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_ID1ActionPerformed

    private void Btn_SignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_SignInMouseEntered
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_Sign_Active.png")); 
        Btn_SignIn.setIcon(img);
    }//GEN-LAST:event_Btn_SignInMouseEntered

    private void Btn_SignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_SignInMouseExited
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon(getClass().getResource("/img/Btn_Sign_Normal.png")); 
        Btn_SignIn.setIcon(img);
    }//GEN-LAST:event_Btn_SignInMouseExited

    private void Btn_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SignInActionPerformed
        // TODO add your handling code here:
        int type=1;
        if (this.AdmRad.isSelected())
            type=0;
        if (this.VendRad.isSelected())
            type=1;
        //VERIFICIAR SI TODOS LOS CAMPOS ESTAN LLENOS
        if(this.Input_ID1.getText().length()>0&&this.Input_Pass1.getText().length()>0&&this.Input_Pass2.getText().length()>0&&this.Input_Pass3.getText().length()>0&&(this.VendRad.isSelected()||this.AdmRad.isSelected())){
        //VERIFICIAR SI ESTA DISPONIBLE EL NOMBRE DE USUARIO
        if (this.conn.IsUserAvailable(this.Input_ID1.getText())){
        //VERIFICIAR SI LAS PASS SON IGUALES
        if (Arrays.equals(Input_Pass1.getPassword(), Input_Pass3.getPassword())){
        //VERIFICAR SI EL PASS DEL ADMIN ES CORRECTO 
        if (this.conn.IsAdminPass(this.Input_Pass2.getText())){
        //SE CREA EL NUEVO USUARIO CON LOS DATOS 
        if (this.conn.SignIn(this.Input_ID1.getText(),this.Input_Pass1.getText(),type))
        {
            JOptionPane.showMessageDialog(null, "User Created", "SystemMessage: " + "Succesfull SignIn", JOptionPane.INFORMATION_MESSAGE);
            this.Input_ID1.setText(null);
            this.Input_Pass1.setText(null);
            this.Input_Pass2.setText(null);
            this.Input_Pass3.setText(null);            
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Detalles de registro invalidos", "SystemMessage: " + "SignIn error", JOptionPane.ERROR_MESSAGE);
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Key de Admin INCORRECTO", "SystemMessage: " + "SignIn error", JOptionPane.ERROR_MESSAGE);
        }
        }
        else {
            JOptionPane.showMessageDialog(null, "Ambos campos de contraseña deben ser iguales", "SystemMessage: " + "Input error", JOptionPane.ERROR_MESSAGE);
        }
        }
        else { 
            JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible", "SystemMessage: " + "Input error", JOptionPane.ERROR_MESSAGE);
        }
        }
        else {
            JOptionPane.showMessageDialog(null, "Favor de llenar todos los campos", "SystemMessage: " + "Input error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_Btn_SignInActionPerformed

    private void AdmRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmRadActionPerformed
        // TODO add your handling code here:
        if (this.VendRad.isSelected())
            this.VendRad.setSelected(false);
    }//GEN-LAST:event_AdmRadActionPerformed

    private void VendRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendRadActionPerformed
        // TODO add your handling code here:
        if (this.AdmRad.isSelected())
            this.AdmRad.setSelected(false);
    }//GEN-LAST:event_VendRadActionPerformed

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
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInWindow().setVisible(true);
            }
        });
    }
    
       private void systemExit(){
            WindowEvent winClosing = new WindowEvent (this,WindowEvent.WINDOW_CLOSING);
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdmRad;
    private javax.swing.JPanel Background;
    private javax.swing.JButton Btn_Close;
    private javax.swing.JButton Btn_Close1;
    private javax.swing.JButton Btn_LogIn;
    private javax.swing.JButton Btn_SignIn;
    private javax.swing.JButton CLogIn;
    private javax.swing.JButton CSignIn;
    private javax.swing.JPanel ChangeLogIn;
    private javax.swing.JPanel ChangeSignIn;
    private javax.swing.JLabel Drager;
    private javax.swing.JLabel Drager1;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JTextField Input_ID;
    private javax.swing.JTextField Input_ID1;
    private javax.swing.JPasswordField Input_Pass;
    private javax.swing.JPasswordField Input_Pass1;
    private javax.swing.JPasswordField Input_Pass2;
    private javax.swing.JPasswordField Input_Pass3;
    private javax.swing.JPanel Pan_LogIn;
    private javax.swing.JPanel Pan_SignIn;
    private javax.swing.JRadioButton VendRad;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel_signIn;
    private javax.swing.JLabel jLabel_signIn1;
    private javax.swing.JLabel jlabel_line10;
    private javax.swing.JLabel jlabel_line4;
    private javax.swing.JLabel jlabel_line5;
    private javax.swing.JLabel jlabel_line7;
    private javax.swing.JLabel jlabel_line8;
    private javax.swing.JLabel jlabel_line9;
    private javax.swing.JLabel jlabel_personp;
    private javax.swing.JLabel jlabel_personp1;
    private javax.swing.JLabel jlabel_unlock1;
    private javax.swing.JLabel jlabel_unlock2;
    private javax.swing.JLabel jlabel_unlock3;
    private javax.swing.JLabel jlabel_unlock4;
    // End of variables declaration//GEN-END:variables
}
