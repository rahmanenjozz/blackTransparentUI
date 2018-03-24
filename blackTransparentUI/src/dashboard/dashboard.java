/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import java.awt.Color;


/**
 *
 * @author Rahmans
 */
public class dashboard extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    public dashboard() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        tfSearch.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenu = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        sprSearch = new javax.swing.JSeparator();
        btnSearch = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JButton();
        lblDashboard = new javax.swing.JLabel();
        btnNews = new javax.swing.JButton();
        lblNews = new javax.swing.JLabel();
        btnTrending = new javax.swing.JButton();
        lblTrending = new javax.swing.JLabel();
        btnQnA = new javax.swing.JButton();
        lblQnA = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setBackground(new java.awt.Color(123, 123, 123));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-menu-64.png"))); // NOI18N
        btnMenu.setContentAreaFilled(false);
        btnMenu.setFocusable(false);
        btnMenu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-menu-64 (2).png"))); // NOI18N
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        tfSearch.setBackground(new java.awt.Color(102, 102, 102));
        tfSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfSearch.setForeground(new java.awt.Color(204, 204, 204));
        tfSearch.setText("Search");
        tfSearch.setBorder(null);
        tfSearch.setSelectionColor(new java.awt.Color(102, 102, 102));
        getContentPane().add(tfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 210, 30));
        getContentPane().add(sprSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 240, 20));

        btnSearch.setBackground(new java.awt.Color(123, 123, 123));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-search-32.png"))); // NOI18N
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setFocusable(false);
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("CONAN DOYLE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 10, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("You are login as Admin,");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, -1, -1));

        lblLogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(51, 102, 255));
        lblLogout.setText("Logout ?");
        lblLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, -1, -1));

        pnlMenu.setBackground(new java.awt.Color(102, 102, 102));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDashboard.setBackground(new java.awt.Color(123, 123, 123));
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-home-32.png"))); // NOI18N
        btnDashboard.setContentAreaFilled(false);
        btnDashboard.setFocusable(false);
        pnlMenu.add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 30, 40));

        lblDashboard.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(204, 204, 204));
        lblDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDashboard.setText("Dashboard");
        pnlMenu.add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 110, 40));

        btnNews.setBackground(new java.awt.Color(123, 123, 123));
        btnNews.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-news-32 (2).png"))); // NOI18N
        btnNews.setContentAreaFilled(false);
        btnNews.setFocusable(false);
        pnlMenu.add(btnNews, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 40));

        lblNews.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblNews.setForeground(new java.awt.Color(204, 204, 204));
        lblNews.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNews.setText("News");
        pnlMenu.add(lblNews, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 60, 40));

        btnTrending.setBackground(new java.awt.Color(123, 123, 123));
        btnTrending.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-ratings-32.png"))); // NOI18N
        btnTrending.setContentAreaFilled(false);
        btnTrending.setFocusable(false);
        pnlMenu.add(btnTrending, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 30, 40));

        lblTrending.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblTrending.setForeground(new java.awt.Color(204, 204, 204));
        lblTrending.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTrending.setText("Trending");
        pnlMenu.add(lblTrending, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 90, 40));

        btnQnA.setBackground(new java.awt.Color(123, 123, 123));
        btnQnA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-ask-question-32.png"))); // NOI18N
        btnQnA.setContentAreaFilled(false);
        btnQnA.setFocusable(false);
        pnlMenu.add(btnQnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 30, 40));

        lblQnA.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblQnA.setForeground(new java.awt.Color(204, 204, 204));
        lblQnA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQnA.setText("QnA");
        pnlMenu.add(lblQnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 60, 40));

        getContentPane().add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1000, 40));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Background2.png"))); // NOI18N
        lblBackground.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblBackgroundMouseDragged(evt);
            }
        });
        lblBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBackgroundMousePressed(evt);
            }
        });
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackgroundMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_lblBackgroundMousePressed

    private void lblBackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackgroundMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_lblBackgroundMouseDragged

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNews;
    private javax.swing.JButton btnQnA;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnTrending;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblNews;
    private javax.swing.JLabel lblQnA;
    private javax.swing.JLabel lblTrending;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JSeparator sprSearch;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
