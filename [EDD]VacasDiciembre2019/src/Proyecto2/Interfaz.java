/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.apache.commons.codec.binary.Hex;
//import org.json.simple.parser.ParseException;

/**
 *
 * @author argue
 */
public class Interfaz extends javax.swing.JFrame {
    String ruta = "D:\\Trabajos\\U\\USAC\\Cursos\\Escuela de vacaciones\\2018\\Junio\\LFP\\Practica 1\\LFP_Vacas2018\\src\\Practica1\\fondo.jpg";
    /**
     * Creates new form Login
     */
    public Interfaz() {
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

        jPanel1 = new javax.swing.JPanel();
        txt_pass = new javax.swing.JTextField();
        txt_carnet = new javax.swing.JTextField();
        btt_login = new javax.swing.JButton();
        lbl_carnet = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        lbl_info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        setLocation(new java.awt.Point(600, 150));

        jPanel1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        txt_pass.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_carnet.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        btt_login.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btt_login.setText("Iniciar sesión");
        btt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_loginActionPerformed(evt);
            }
        });

        lbl_carnet.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_carnet.setText("Carnet");

        lbl_pass.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_pass.setText("Contraseña");

        lbl_info.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_info.setText("Ingrese los siguientes datos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_info)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(lbl_carnet))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lbl_pass))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbl_info)
                .addGap(18, 18, 18)
                .addComponent(lbl_carnet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_pass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btt_login)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btt_login.getAccessibleContext().setAccessibleName("btt_login");
        lbl_carnet.getAccessibleContext().setAccessibleName("lbl_carnet");
        lbl_pass.getAccessibleContext().setAccessibleName("lbl_pass");
        lbl_info.getAccessibleContext().setAccessibleName("lbl_info");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_loginActionPerformed
        //InterfazAdmin();
       
        CargarJson cj = new CargarJson();
        //cj.cargaGrafo();
    }//GEN-LAST:event_btt_loginActionPerformed
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        System.out.println("boton 1");
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_login;
    private static javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_carnet;
    private javax.swing.JLabel lbl_info;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JTextField txt_carnet;
    private javax.swing.JTextField txt_pass;
    // End of variables declaration//GEN-END:variables

    
    public void iniciarUsuarios(){
        Usuario arg = new Usuario("Jorge", "Argueta", 201404334, "arg", 0);
        Usuario emm = new Usuario("Elba", "Alvarez", 201408549, "emma", 1);
        Usuario adm = new Usuario("admin", "istrador", 201400000, "admin", 0);        
    }
    public String convertirSHA256(String password) {	     
        MessageDigest md;
        try {
            md=MessageDigest.getInstance("SHA-256");
            byte[] mb = md.digest(password.getBytes());
            System.out.println("pass encriptada: " + Hex.encodeHexString(mb));
            return Hex.encodeHexString(mb);
        } catch (NoSuchAlgorithmException e) {            
        }
        return null;
    }
    
    public void InterfazAdmin(){
        JFrame a = new JFrame();
        a.setFont(new java.awt.Font("Century Gothic", 0, 10)); 
        a.setSize(1000, 100);
        a.setVisible(true);
        Panel ad = new Panel();
        a.add(ad);
        Button b = new Button("cargarusuarios");
        b.setName("b1");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        b.setFont(new java.awt.Font("Century Gothic", 0, 14));
        ad.add(b);
    
    }
    
    /*
    public ImageIcon redimensionarImagen(int x, String url) {
        ImageIcon a = new ImageIcon(url);
        ImageIcon b = new ImageIcon(a.getImage().getScaledInstance(x, -1, Image.SCALE_DEFAULT));
        return b;
    }
    @Override
    public void paint(Graphics g) {
        Dimension height = getSize();
        ImageIcon Img = new ImageIcon(getClass().getResource(ruta)); 
        g.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

        jPanel1.setOpaque(false);
        super.paintComponents(g);
        jPanel1.repaint();
        Imagen1();
    }
    public class Imagen extends javax.swing.JPanel {
    Interfaz r = new Interfaz();
        public Imagen() {
            this.setSize(300, 300);
        }
        @Override
        public void paint(Graphics g) {
            ImageIcon Img = new ImageIcon(getClass().getResource(r.ruta));
            g.drawImage(Img.getImage(), 0, 0, WIDTH, WIDTH, null);
            setOpaque(false);
            super.paintComponent(g);
        }
    }
    public void Imagen1(){
        Imagen image = new Imagen();
        jPanel1.add(image);
        jPanel1.repaint();
    }
*/
}
