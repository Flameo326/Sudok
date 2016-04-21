package sudoku;

import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultListModel;


public class GameWindow extends javax.swing.JFrame {
    public static GameWindow singleton = null;   // For a single instance
    final static String[] integers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"}; // List for toggling of boxes
    
    int[][] playerChoice; //Answer Key and Players answers
    boolean correct = true;
    Block[][] blocks = new Block[9][9];
    
    DefaultListModel explanation;     // Descripton of events going on    

    public GameWindow(int[][] SudokuBoxes, boolean[][] BoxesWithValue) {
        explanation = new DefaultListModel();        

        // May need to Adjust??????
        setContentPane(new Paint());     //Create a valid looking Sudoku Puzzle
        initComponents();
        
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
        StepButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AnswerButton.setText("Compare Solution");
        AnswerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnswerButtonMouseClicked(evt);
            }
        });
        getContentPane().add(AnswerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        ComputerButton.setText("Step by Step");
        getContentPane().add(ComputerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        StepButton.setText("Next Step");
        getContentPane().add(StepButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList1.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 160, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void AnswerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnswerButtonMouseClicked
        for (int e = 0; e < 9; e++) {
            for (int y = 0; y < 9; y++) {
                //System.out.print(SudokuBoxes[e][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        

        if (AnswerButton.getText().equals("Compare Solution")) {
            for (int i = 0; i < 9; i++) {
                for (int y = 0; y < 9; y++) {
                //if(!(ArrayToLabel.get(Integer.toString(i*9 + (y+1))).getText().equals(""))){
                    //playerChoice[i][y] =  Integer.valueOf(ArrayToLabel.get(Integer.toString(i*9 + (y+1))).getText());
                    //if(SudokuBoxes[i][y] != playerChoice[i][y])
                    //SudokuBoxesmodel = false;
                    //compare(i, y, playerChoice[i][y]);
                    //} else
                    //correct = false;
                    //ArrayToLabel.get(Integer.toString(i * 9 + (y + 1))).setText(Integer.toString(SudokuBoxes[i][y]));
                    //System.out.print(SudokuBoxes[i][y] + " ");
                }
                System.out.println();
            }
            CheckAnswer();
            AnswerButton.setText("Continue?");
        } else {
            explanation.clear();
            for (int i = 0; i < 9; i++) {
                for (int y = 0; y < 9; y++) {
                    //ArrayToLabel.get(Integer.toString(i * 9 + y + 1)).setForeground(new Color(0, 0, 0));
                }
            }
            AnswerButton.setText("Compare Solution");
        }
    }//GEN-LAST:event_AnswerButtonMouseClicked

    private void compare(int row, int column, int value) {
        for (int i = 0; i < 9; i++) {
            if (i != column && playerChoice[row][i] == value) {
                correct = false;
                ChangeToWrong(row * 9 + column + 1);
                ChangeToWrong(row * 9 + i + 1);
            }
        }
        for (int i = 0; i < 9; i++) {
            if (i != row && playerChoice[i][column] == value) {
                correct = false;
                ChangeToWrong(row * 9 + column + 1);
                ChangeToWrong(i * 9 + column + 1);
            }
        }

        int _row = (row / 3) * 3, _column = (column / 3) * 3;
        for (int i = _row; i < _row + 3; i++) {
            for (int y = _column; y < _column + 3; y++) {
                if (i != row && y != column && playerChoice[i][y] == value) {
                    correct = false;
                    ChangeToWrong(row * 9 + column + 1);
                    ChangeToWrong(i * 9 + y + 1);
                }
            }
        }
    }

    private void CheckAnswer() {
        //if (SudokuBoxesmodel) {
            explanation.addElement("That is the correct answer! Good Job!");
        //} else if (correct) {
            explanation.addElement("This isn't the pattern the");
            explanation.addElement("machine came up with but");
            explanation.addElement("it works! Good Job!");
        //} else {
            explanation.addElement("Aww, Too bad. That isn't");
            explanation.addElement("the correct answer. Try");
            explanation.addElement("again!");
        //}
    }

    private void ChangeToWrong(int key) {
        //ArrayToLabel.get(Integer.toString(key)).setForeground(new Color(255, 0, 0));
    }

    private void Map() { //Mapping
        for (int e = 0; e < 9; e++) {
            for (int y = 0; y < 9; y++) {
                //System.out.print(SudokuBoxes[e][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
/*
        ArrayToLabel.put("1", OneOneLabel);
        ArrayToLabel.put("2", OneTwoLabel);
        ArrayToLabel.put("3", OneThreeLabel);
        ArrayToLabel.put("4", OneFourLabel);
        ArrayToLabel.put("5", OneFiveLabel);
        ArrayToLabel.put("6", OneSixLabel);
        ArrayToLabel.put("7", OneSevenLabel);
        ArrayToLabel.put("8", OneEightLabel);
        ArrayToLabel.put("9", OneNineLabel);
        ArrayToLabel.put("10", TwoOneLabel);
        ArrayToLabel.put("11", TwoTwoLabel);
        ArrayToLabel.put("12", TwoThreeLabel);
        ArrayToLabel.put("13", TwoFourLabel);
        ArrayToLabel.put("14", TwoFiveLabel);
        ArrayToLabel.put("15", TwoSixLabel);
        ArrayToLabel.put("16", TwoSevenLabel);
        ArrayToLabel.put("17", TwoEightLabel);
        ArrayToLabel.put("18", TwoNineLabel);
        ArrayToLabel.put("19", ThreeOneLabel);
        ArrayToLabel.put("20", ThreeTwoLabel);
        ArrayToLabel.put("21", ThreeThreeLabel);
        ArrayToLabel.put("22", ThreeFourLabel);
        ArrayToLabel.put("23", ThreeFiveLabel);
        ArrayToLabel.put("24", ThreeSixLabel);
        ArrayToLabel.put("25", ThreeSevenLabel);
        ArrayToLabel.put("26", ThreeEightLabel);
        ArrayToLabel.put("27", ThreeNineLabel);
        ArrayToLabel.put("28", FourOneLabel);
        ArrayToLabel.put("29", FourTwoLabel);
        ArrayToLabel.put("30", FourThreeLabel);
        ArrayToLabel.put("31", FourFourLabel);
        ArrayToLabel.put("32", FourFiveLabel);
        ArrayToLabel.put("33", FourSixLabel);
        ArrayToLabel.put("34", FourSevenLabel);
        ArrayToLabel.put("35", FourEightLabel);
        ArrayToLabel.put("36", FourNineLabel);
        ArrayToLabel.put("37", FiveOneLabel);
        ArrayToLabel.put("38", FiveTwoLabel);
        ArrayToLabel.put("39", FiveThreeLabel);
        ArrayToLabel.put("40", FiveFourLabel);
        ArrayToLabel.put("41", FiveFiveLabel);
        ArrayToLabel.put("42", FiveSixLabel);
        ArrayToLabel.put("43", FiveSevenLabel);
        ArrayToLabel.put("44", FiveEightLabel);
        ArrayToLabel.put("45", FiveNineLabel);
        ArrayToLabel.put("46", SixOneLabel);
        ArrayToLabel.put("47", SixTwoLabel);
        ArrayToLabel.put("48", SixThreeLabel);
        ArrayToLabel.put("49", SixFourLabel);
        ArrayToLabel.put("50", SixFiveLabel);
        ArrayToLabel.put("51", SixSixLabel);
        ArrayToLabel.put("52", SixSevenLabel);
        ArrayToLabel.put("53", SixEightLabel);
        ArrayToLabel.put("54", SixNineLabel);
        ArrayToLabel.put("55", SevenOneLabel);
        ArrayToLabel.put("56", SevenTwoLabel);
        ArrayToLabel.put("57", SevenThreeLabel);
        ArrayToLabel.put("58", SevenFourLabel);
        ArrayToLabel.put("59", SevenFiveLabel);
        ArrayToLabel.put("60", SevenSixLabel);
        ArrayToLabel.put("61", SevenSevenLabel);
        ArrayToLabel.put("62", SevenEightLabel);
        ArrayToLabel.put("63", SevenNineLabel);
        ArrayToLabel.put("64", EightOneLabel);
        ArrayToLabel.put("65", EightTwoLabel);
        ArrayToLabel.put("66", EightThreeLabel);
        ArrayToLabel.put("67", EightFourLabel);
        ArrayToLabel.put("68", EightFiveLabel);
        ArrayToLabel.put("69", EightSixLabel);
        ArrayToLabel.put("70", EightSevenLabel);
        ArrayToLabel.put("71", EightEightLabel);
        ArrayToLabel.put("72", EightNineLabel);
        ArrayToLabel.put("73", NineOneLabel);
        ArrayToLabel.put("74", NineTwoLabel);
        ArrayToLabel.put("75", NineThreeLabel);
        ArrayToLabel.put("76", NineFourLabel);
        ArrayToLabel.put("77", NineFiveLabel);
        ArrayToLabel.put("78", NineSixLabel);
        ArrayToLabel.put("79", NineSevenLabel);
        ArrayToLabel.put("80", NineEightLabel);
        ArrayToLabel.put("81", NineNineLabel);
*/
        for (int i = 0; i < 9; i++) {
            for (int y = 0; y < 9; y++) {
                //if (BoxesWithValue[i][y]) { // Assign Decided values their respective numbers
                    //try {
                       // Font Bolden = new Font("Tahoma", Font.BOLD, 36);
                       // ArrayToLabel.get(Integer.toString((i * 9) + (y + 1))).setFont(Bolden);
                        //ArrayToLabel.get(Integer.toString((i * 9) + (y + 1))).setText(Integer.toString(SudokuBoxes[i][y]));
                    //} catch (NullPointerException n) {
                        //System.out.println("NO");
                    //}
                //}
            }
        }
        for (int e = 0; e < 9; e++) {
            for (int y = 0; y < 9; y++) {
                //System.out.print(SudokuBoxes[e][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnswerButton;
    private javax.swing.JButton ComputerButton;
    private javax.swing.JButton StepButton;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
