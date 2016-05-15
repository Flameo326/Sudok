package sudoku;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import static javax.swing.JList.VERTICAL;

public class GameWindow extends javax.swing.JFrame {
    public static GameWindow singleton = null;   // For a single instance
    final static String[] integers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"}; // List for toggling of boxes
    javax.swing.JButton StepButton;
    MouseListener mouseListener;
    
    int[][] playerChoice; //Answer Key and Players answers   
    Block[][] blocks = new Block[9][9];
    
    DefaultListModel explanation;     // Descripton of events going on    

    public GameWindow(int[][] SudokuBoxes, boolean[][] BoxesWithValue) {
        explanation = new DefaultListModel();        
        mouseListener = new java.awt.event.MouseAdapter() { // Allow person to click through steps
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    explanation.clear();
                    ComputerButton.setText("Step by Step");
                    StepButton.setVisible(false);
                    StepButton.removeMouseListener(this);
                    AnswerButton.setVisible(true);
                    AnswerButton.setText("Compare Solution");
                }
            };
        // May need to Adjust??????
        setContentPane(new Paint());     //Create a valid looking Sudoku Puzzle        
        
        initComponents();
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width/2 - 150), (Toolkit.getDefaultToolkit().getScreenSize().height/2 - 225));
        StepButton = new javax.swing.JButton();
        StepButton.setText("Next Step");
        getContentPane().add(StepButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));
        pack();
        
        int z = 10;
        for( int i = 0; i < 9; i++){ 
            int x = 10;
            for( int y = 0; y < 9; y++){
                blocks[i][y] = new Block(SudokuBoxes[i][y], BoxesWithValue[i][y]);                                           
                blocks[i][y].addToPane(x, z, getContentPane());
                x += 30;                
            }
            z += 40;
        }        
        jList1.setLayoutOrientation(VERTICAL);
        jList1.setModel(explanation);  //Set up side for Explanations
        jList1.setVisibleRowCount(21);  // For explanation of help menu

        StepButton.setVisible(false);               
        
        playerChoice = new int[9][9];       
    }      
    
    // Could i make a public blok class wiht answer key similar to map.
    //Have this class grab the label and set position of label. 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnswerButton = new javax.swing.JButton();
        ComputerButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sudoku");
        setMinimumSize(new java.awt.Dimension(300, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AnswerButton.setText("Compare Solution");
        AnswerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnswerButtonMouseClicked(evt);
            }
        });
        getContentPane().add(AnswerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        ComputerButton.setText("Step by Step");
        ComputerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComputerButtonMouseClicked(evt);
            }
        });
        getContentPane().add(ComputerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList1.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 160, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void AnswerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnswerButtonMouseClicked
        if (AnswerButton.getText().equals("Compare Solution")) {
            boolean match = true, correct = true;
            for (int i = 0; i < 9; i++) {
                for (int y = 0; y < 9; y++) {                    
                    if(!(blocks[i][y].getLabel().getText().equals(""))){                        
                        playerChoice[i][y] =  Integer.valueOf(blocks[i][y].getLabel().getText());
                        if(!(blocks[i][y].checkAnswer()))                        
                            match = false;                        
                        correct = compare(i, y, playerChoice[i][y], correct);
                    } else
                        correct = false;
                }               
            }
            resetButton();
            CheckAnswer(match, correct);
            AnswerButton.setText("Continue?");
            
        } else {
            explanation.clear();
            returnButton.setVisible(false);
            resetButton.setVisible(false);
            for (int i = 0; i < 9; i++) {
                for (int y = 0; y < 9; y++) {
                    blocks[i][y].getLabel().setForeground(new Color(0, 0, 0));
                }
            }
            AnswerButton.setText("Compare Solution");
        }
    }//GEN-LAST:event_AnswerButtonMouseClicked
    
    public void resetButton(){
        resetButton = new javax.swing.JButton();
        resetButton.setText("Reset");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                for(int i = 0; i < 9; i++){
                   for(int y = 0; y < 9; y++){
                       blocks[i][y].getLabel().setForeground(new Color(0, 0, 0));
                       if(!(blocks[i][y].shown))
                           blocks[i][y].getLabel().setText("");
                   }                  
                }
                explanation.clear();
                returnButton.setVisible(false);
                resetButton.setVisible(false);
                AnswerButton.setVisible(true);
                AnswerButton.setText("Compare Solution");
                ComputerButton.setVisible(true);
                ComputerButton.setText("Step by Step");
            }
        });
        resetButton.setVisible(true);
        this.getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 370, -1, -1));
        this.pack();    
    }   
    
    private void ComputerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComputerButtonMouseClicked
       if(ComputerButton.getText().equals("Step by Step")){
           if (!(AnswerButton.getText().equals("Compare Solution"))) {
               returnButton.setVisible(false);
               resetButton.setVisible(false);
           }
            explanation.addElement("This will erase all your data");
            explanation.addElement("and allow the computer to");
            explanation.addElement("solve this puzzle for you");
            explanation.addElement("in a step by step guide.");
            
            StepButton.setVisible(true);
            StepButton.setText("No");
            StepButton.addMouseListener(mouseListener);
            
            AnswerButton.setVisible(false);
            
            ComputerButton.setText("Continue");
        } else{           
            for (int i = 0; i < 9; i++) {
                for (int y = 0; y < 9; y++) {                   
                    if(!(blocks[i][y].shown)){
                        blocks[i][y].getLabel().removeMouseListener(blocks[i][y].mouseListener);
                        blocks[i][y].getLabel().setText("");
                    } 
                }
            }
            explanation.clear();
            ComputerButton.setVisible(false);
            StepButton.removeMouseListener(mouseListener);
            StepButton.setText("Next Step");
            ComputingSudoku comSudoku = new ComputingSudoku(blocks);
                       
        }
    }//GEN-LAST:event_ComputerButtonMouseClicked
 
    private boolean compare(int row, int column, int value, boolean correct) {        
        for (int i = 0; i < 9; i++) {
            if (i != column && playerChoice[row][i] == value) {
                correct = false;
                ChangeToWrong(row,i);
                ChangeToWrong(row,column);               
            }
        }
        for (int i = 0; i < 9; i++) {
            if (i != row && playerChoice[i][column] == value) {
                correct = false;
                ChangeToWrong(i,column);
                ChangeToWrong(row,column);
            }
        }

        int _row = (row / 3) * 3, _column = (column / 3) * 3;
        for (int i = _row; i < _row + 3; i++) {
            for (int y = _column; y < _column + 3; y++) {
                if (i != row && y != column && playerChoice[i][y] == value) {
                    correct = false;
                    ChangeToWrong(i,y);
                    ChangeToWrong(i,y);
                }
            }
        }
        return correct;
    }

    private void CheckAnswer(boolean match, boolean correct) {
        if (match) {
            explanation.addElement("That is the correct answer!");
            explanation.addElement("Good Job!");
            explanation.addElement("");            
            explanation.addElement("Do you want to start ");
            explanation.addElement("over again?");
            returnToMenu();
        } else if (correct) {
            explanation.addElement("This isn't the pattern the");
            explanation.addElement("machine came up with but");
            explanation.addElement("it works! Good Job!");
            explanation.addElement("");
            explanation.addElement("Do you want to start ");
            explanation.addElement("over again?");
            returnToMenu();
        } else {
            explanation.addElement("Aww, Too bad. That isn't");
            explanation.addElement("the correct answer. Try");
            explanation.addElement("again!");
            explanation.addElement("");
            explanation.addElement("Do you want to try");
            explanation.addElement("another puzzle?");
            returnToMenu();
        }
    }

    private void ChangeToWrong(int i, int y) {
        blocks[i][y].getLabel().setForeground(new Color(255, 0, 0));
    }
    
    public void returnToMenu(){ 
        jList1.ensureIndexIsVisible(explanation.getSize() - 1);
        returnButton = new javax.swing.JButton();
        returnButton.setText("Play Again?");
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartingWindow stWin = new StartingWindow();
                stWin.setVisible(true);                
                GameWindow.singleton.dispose();
                GameWindow.singleton = null;
            }
        });
        returnButton.setVisible(true);
        this.getContentPane().add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));
        this.pack();    
    }

    //Actions to preform when called from HelpMenu
    public void Example() {
        //List of the explanation
        final String[][] description = {new String[]{"Here we have a possible", "Sudoku Puzzle. It is 9 by 9",
            "with 9 boxes, rows and", "columns."}, new String[]{"In the first box we have", "values of 1, 2, 3, 4, and 5.",
            "This means that those", "values can not appear in", "the 1st box again."}, new String[]{"Additionally, "
            + "1, 2, and 3", "can not appear in the first", "row and 1, 4, and 5 can not", "appear in the"
            + " 1st column."}, new String[]{"Normally puzzles will have", "more values shown and", "they'll be spread "
            + "out more."}, new String[]{"Try to solve this small", "puzzle yourself. When", "you are ready,", "go back and select", "Play."}};

        ComputerButton.setVisible(false);
        AnswerButton.setVisible(false);    //Simplify view for newbie
        StepButton.setVisible(true);
        final int[] i = {0};
        StepButton.addMouseListener(new java.awt.event.MouseAdapter() { // Allow person to click through steps
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Explain(description, i);
            }
        });
    }

    private void Explain(String[][] description, int[] i) { // I passed an array because I couldnt think of Alternatives
        for (int y = 0; y < description[i[0]].length; y++) {
            explanation.addElement(description[i[0]][y]);
        }
        i[0]++;
        if (i[0] > 4) {
            StepButton.setVisible(false);
        }
    }
    
    public JList getjList(){
        return jList1;
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
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new GameWindow().setVisible(true);
            }
        });
    }
    private javax.swing.JButton resetButton;
    private javax.swing.JButton returnButton;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnswerButton;
    private javax.swing.JButton ComputerButton;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
