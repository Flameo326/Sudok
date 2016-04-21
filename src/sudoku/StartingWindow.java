
package sudoku;

import java.awt.Toolkit;

public class StartingWindow extends javax.swing.JFrame {
    String[] difficulty = new String[5];
    int i = 0; // class variable for difficulty button
    
    public StartingWindow() {
        difficulty[0] = "Easy";
        difficulty[1] = "Medium"; //Array to toggle between for difficulty
        difficulty[2] = "Hard";
        difficulty[3] = "Extreme";
        difficulty[4] = "Impossible";
        
        initComponents();
        this.
        DifficultyButton.setText(difficulty[i]);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DifficultyButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        HelpButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PlayButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width/2 - 80), (Toolkit.getDefaultToolkit().getScreenSize().height/2 - 50));
        setResizable(false);
        setSize(new java.awt.Dimension(180, 110));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DifficultyButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DifficultyButton.setOpaque(false);
        DifficultyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DifficultyButtonMouseClicked(evt);
            }
        });
        getContentPane().add(DifficultyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sudoku");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 40));

        HelpButton.setText("Help");
        HelpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpButtonMouseClicked(evt);
            }
        });
        getContentPane().add(HelpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Difficulty");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, 30));

        PlayButton.setText("Play");
        PlayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayButtonMouseClicked(evt);
            }
        });
        getContentPane().add(PlayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DifficultyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DifficultyButtonMouseClicked
        i++;
        if(i > 4) //Toggle
            i = 0;
        DifficultyButton.setText(difficulty[i]);
    }//GEN-LAST:event_DifficultyButtonMouseClicked

    private void HelpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpButtonMouseClicked
        HelpWindow hlpWin = new HelpWindow();
        hlpWin.setVisible(true);  //Call Help menu and dispose this window
        dispose();
    }//GEN-LAST:event_HelpButtonMouseClicked

    private void PlayButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayButtonMouseClicked
         //Call ComputingSudoku to create Sudoku Puzzle
        ComputingSudoku cmpSudoku = new ComputingSudoku(i);        
        dispose();
    }//GEN-LAST:event_PlayButtonMouseClicked

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
            java.util.logging.Logger.getLogger(StartingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartingWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DifficultyButton;
    private javax.swing.JButton HelpButton;
    private javax.swing.JButton PlayButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
