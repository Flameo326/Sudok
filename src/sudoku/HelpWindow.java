
package sudoku;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class HelpWindow extends javax.swing.JFrame {

    public HelpWindow() {
        initComponents();
        ImageIcon UnsizedImg = new ImageIcon(getClass().getResource("/sudoku/ImagePAth/SudokuPic.png"));
        //Resize image and add it to Window
        ImageIcon SudokuPic = new ImageIcon(ReSize(UnsizedImg, 200, 220));
        PicLabel.setIcon(SudokuPic);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ExampleButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PicLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(340, 220));
        setMinimumSize(new java.awt.Dimension(560, 270));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Sudoku!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        ExampleButton.setText("Example");
        ExampleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExampleButtonMouseClicked(evt);
            }
        });
        getContentPane().add(ExampleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        jLabel2.setText("Sudoku is a math based game comprising of the numbers 1-9");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel3.setText("It is played on a 9 by 9 table with boxes, rows and columns");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, -1, -1));
        getContentPane().add(PicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 220, 200));

        jLabel4.setText("Each row, column and box is made of 9 squares which can ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, -1, -1));

        jLabel5.setText("contain a number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel6.setText("The game is won when each row, colum, and box has each ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel7.setText("minituare box filled with nonrepeating numbers");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel8.setText("In this version, you can change the values by clicking on the ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel9.setText("box.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        StartingWindow stWin = new StartingWindow();
        stWin.setVisible(true);  //Go back to StartingWindow     
        dispose();
    }//GEN-LAST:event_BackButtonMouseClicked

    private void ExampleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExampleButtonMouseClicked
        int[][] example = new int[9][9]; boolean[][] values = new boolean[9][9];
        example[0][0] = 1; values[0][0] = true;
        example[0][1] = 2; values[0][1] = true;
        example[0][2] = 3; values[0][2] = true;
        example[1][0] = 4; values[1][0] = true; //Call a manual practice version of GameWindow
        example[2][0] = 5; values[2][0] = true; 
        
        
        GameWindow gmWin = new GameWindow(example, values );
        gmWin.setVisible(true);
        gmWin.Example();    //Call function to trigger Explanation in Sudoku
    }//GEN-LAST:event_ExampleButtonMouseClicked
   
    private BufferedImage ReSize(ImageIcon imgIcon, int height, int width){        
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = (Graphics2D) bi.createGraphics();
        g.drawImage(imgIcon.getImage(), 0, 0, width, height, this);       
        g.dispose();  //Convert image and resize
        
        return bi;
    }
    
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
            java.util.logging.Logger.getLogger(HelpWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ExampleButton;
    private javax.swing.JLabel PicLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
