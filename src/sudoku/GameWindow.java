
package sudoku;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;

public class GameWindow extends javax.swing.JFrame{
    public static GameWindow singleton = null;
    boolean[][] BoxesWithValue = new boolean[9][9]; //These tell which values are to be shown
    int[][] SudokuBoxes; 
    String[] integers ={ "1", "2", "3", "4", "5", "6", "7", "8", "9"}; // Toggle for Sudoku boxes
    DefaultListModel explanation;
    
    public GameWindow(int[][] SudokuBoxes, boolean[][] BoxesWithValue) {
        explanation = new DefaultListModel();
        
        setContentPane(new Paint());
        initComponents();
        jList1.setModel(explanation);  //Set up side for Explanations
        jList1.setVisibleRowCount(21);
        
        StepButton.setVisible(false);
        this.SudokuBoxes = SudokuBoxes; //AnswerSheet
        this.BoxesWithValue = BoxesWithValue;
        Map(); //Create connections to numbers to Jlabels
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnswerButton = new javax.swing.JButton();
        ComputerButton = new javax.swing.JButton();
        OneTwoLabel = new javax.swing.JLabel();
        OneOneLabel = new javax.swing.JLabel();
        TwoOneLabel = new javax.swing.JLabel();
        ThreeOneLabel = new javax.swing.JLabel();
        FourOneLabel = new javax.swing.JLabel();
        FiveOneLabel = new javax.swing.JLabel();
        SixOneLabel = new javax.swing.JLabel();
        SevenOneLabel = new javax.swing.JLabel();
        EightOneLabel = new javax.swing.JLabel();
        NineOneLabel = new javax.swing.JLabel();
        NineTwoLabel = new javax.swing.JLabel();
        NineThreeLabel = new javax.swing.JLabel();
        NineFourLabel = new javax.swing.JLabel();
        NineFiveLabel = new javax.swing.JLabel();
        NineSixLabel = new javax.swing.JLabel();
        NineSevenLabel = new javax.swing.JLabel();
        NineEightLabel = new javax.swing.JLabel();
        NineNineLabel = new javax.swing.JLabel();
        EightNineLabel = new javax.swing.JLabel();
        SevenNineLabel = new javax.swing.JLabel();
        SixNineLabel = new javax.swing.JLabel();
        FiveNineLabel = new javax.swing.JLabel();
        FourNineLabel = new javax.swing.JLabel();
        ThreeNineLabel = new javax.swing.JLabel();
        TwoNineLabel = new javax.swing.JLabel();
        OneNineLabel = new javax.swing.JLabel();
        TwoTwoLabel = new javax.swing.JLabel();
        OneSevenLabel = new javax.swing.JLabel();
        OneSixLabel = new javax.swing.JLabel();
        OneFiveLabel = new javax.swing.JLabel();
        OneFourLabel = new javax.swing.JLabel();
        OneThreeLabel = new javax.swing.JLabel();
        OneEightLabel = new javax.swing.JLabel();
        TwoEightLabel = new javax.swing.JLabel();
        ThreeEightLabel = new javax.swing.JLabel();
        FourEightLabel = new javax.swing.JLabel();
        FiveEightLabel = new javax.swing.JLabel();
        SixEightLabel = new javax.swing.JLabel();
        SevenEightLabel = new javax.swing.JLabel();
        EightEightLabel = new javax.swing.JLabel();
        EightSevenLabel = new javax.swing.JLabel();
        EightSixLabel = new javax.swing.JLabel();
        EightFiveLabel = new javax.swing.JLabel();
        EightFourLabel = new javax.swing.JLabel();
        EightThreeLabel = new javax.swing.JLabel();
        EightTwoLabel = new javax.swing.JLabel();
        SevenTwoLabel = new javax.swing.JLabel();
        SevenThreeLabel = new javax.swing.JLabel();
        SevenFourLabel = new javax.swing.JLabel();
        SevenFiveLabel = new javax.swing.JLabel();
        SevenSixLabel = new javax.swing.JLabel();
        SevenSevenLabel = new javax.swing.JLabel();
        SixSevenLabel = new javax.swing.JLabel();
        SixSixLabel = new javax.swing.JLabel();
        SixFiveLabel = new javax.swing.JLabel();
        SixFourLabel = new javax.swing.JLabel();
        SixThreeLabel = new javax.swing.JLabel();
        SixTwoLabel = new javax.swing.JLabel();
        FiveTwoLabel = new javax.swing.JLabel();
        FiveThreeLabel = new javax.swing.JLabel();
        FiveFourLabel = new javax.swing.JLabel();
        FiveFiveLabel = new javax.swing.JLabel();
        FiveSixLabel = new javax.swing.JLabel();
        FiveSevenLabel = new javax.swing.JLabel();
        FourSevenLabel = new javax.swing.JLabel();
        FourSixLabel = new javax.swing.JLabel();
        FourFiveLabel = new javax.swing.JLabel();
        FourFourLabel = new javax.swing.JLabel();
        FourThreeLabel = new javax.swing.JLabel();
        FourTwoLabel = new javax.swing.JLabel();
        ThreeTwoLabel = new javax.swing.JLabel();
        ThreeThreeLabel = new javax.swing.JLabel();
        ThreeFourLabel = new javax.swing.JLabel();
        ThreeFiveLabel = new javax.swing.JLabel();
        ThreeSixLabel = new javax.swing.JLabel();
        ThreeSevenLabel = new javax.swing.JLabel();
        TwoSevenLabel = new javax.swing.JLabel();
        TwoSixLabel = new javax.swing.JLabel();
        TwoFiveLabel = new javax.swing.JLabel();
        TwoFourLabel = new javax.swing.JLabel();
        TwoThreeLabel = new javax.swing.JLabel();
        StepButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(340, 235));
        setMinimumSize(new java.awt.Dimension(300, 450));
        setPreferredSize(new java.awt.Dimension(465, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AnswerButton.setText("Compare Solution");
        getContentPane().add(AnswerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        ComputerButton.setText("Step by Step");
        getContentPane().add(ComputerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        OneTwoLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        OneTwoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OneTwoLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        OneTwoLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        OneTwoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OneTwoLabelMouseClicked(evt);
            }
        });
        getContentPane().add(OneTwoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 30, 30));

        OneOneLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        OneOneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OneOneLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        OneOneLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        OneOneLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OneOneLabelMouseClicked(evt);
            }
        });
        getContentPane().add(OneOneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        TwoOneLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TwoOneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TwoOneLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TwoOneLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        TwoOneLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TwoOneLabelMouseClicked(evt);
            }
        });
        getContentPane().add(TwoOneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 30, 30));

        ThreeOneLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ThreeOneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThreeOneLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ThreeOneLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        ThreeOneLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThreeOneLabelMouseClicked(evt);
            }
        });
        getContentPane().add(ThreeOneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 30, 30));

        FourOneLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FourOneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FourOneLabel.setText("0");
        FourOneLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FourOneLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FourOneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 30, 30));

        FiveOneLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FiveOneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FiveOneLabel.setText("0");
        FiveOneLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FiveOneLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FiveOneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 30, 30));

        SixOneLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SixOneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SixOneLabel.setText("0");
        SixOneLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SixOneLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SixOneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 30, 30));

        SevenOneLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SevenOneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SevenOneLabel.setText("0");
        SevenOneLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SevenOneLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SevenOneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 30, 30));

        EightOneLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        EightOneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EightOneLabel.setText("0");
        EightOneLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EightOneLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(EightOneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 30, 30));

        NineOneLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        NineOneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NineOneLabel.setText("0");
        NineOneLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        NineOneLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(NineOneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 30, 30));

        NineTwoLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        NineTwoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NineTwoLabel.setText("0");
        NineTwoLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        NineTwoLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(NineTwoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 30, 30));

        NineThreeLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        NineThreeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NineThreeLabel.setText("0");
        NineThreeLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        NineThreeLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(NineThreeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 30, 30));

        NineFourLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        NineFourLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NineFourLabel.setText("0");
        NineFourLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        NineFourLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(NineFourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 30, 30));

        NineFiveLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        NineFiveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NineFiveLabel.setText("0");
        NineFiveLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        NineFiveLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(NineFiveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 30, 30));

        NineSixLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        NineSixLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NineSixLabel.setText("0");
        NineSixLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        NineSixLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(NineSixLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 30, 30));

        NineSevenLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        NineSevenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NineSevenLabel.setText("0");
        NineSevenLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        NineSevenLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(NineSevenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 30, 30));

        NineEightLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        NineEightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NineEightLabel.setText("0");
        NineEightLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        NineEightLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(NineEightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 30, 30));

        NineNineLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        NineNineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NineNineLabel.setText("0");
        NineNineLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        NineNineLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(NineNineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 30, 30));

        EightNineLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        EightNineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EightNineLabel.setText("0");
        EightNineLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EightNineLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(EightNineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 30, 30));

        SevenNineLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SevenNineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SevenNineLabel.setText("0");
        SevenNineLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SevenNineLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SevenNineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 30, 30));

        SixNineLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SixNineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SixNineLabel.setText("0");
        SixNineLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SixNineLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SixNineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 30, 30));

        FiveNineLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FiveNineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FiveNineLabel.setText("0");
        FiveNineLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FiveNineLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FiveNineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 30, 30));

        FourNineLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FourNineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FourNineLabel.setText("0");
        FourNineLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FourNineLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FourNineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 30, 30));

        ThreeNineLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ThreeNineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThreeNineLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ThreeNineLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        ThreeNineLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThreeNineLabelMouseClicked(evt);
            }
        });
        getContentPane().add(ThreeNineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 30, 30));

        TwoNineLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TwoNineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TwoNineLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TwoNineLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        TwoNineLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TwoNineLabelMouseClicked(evt);
            }
        });
        getContentPane().add(TwoNineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 30, 30));

        OneNineLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        OneNineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OneNineLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        OneNineLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        OneNineLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OneNineLabelMouseClicked(evt);
            }
        });
        getContentPane().add(OneNineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 30, 30));

        TwoTwoLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TwoTwoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TwoTwoLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        TwoTwoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TwoTwoLabelMouseClicked(evt);
            }
        });
        getContentPane().add(TwoTwoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 30, 30));

        OneSevenLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        OneSevenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OneSevenLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        OneSevenLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        OneSevenLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OneSevenLabelMouseClicked(evt);
            }
        });
        getContentPane().add(OneSevenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 30, 30));

        OneSixLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        OneSixLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OneSixLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        OneSixLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        OneSixLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OneSixLabelMouseClicked(evt);
            }
        });
        getContentPane().add(OneSixLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 30, 30));

        OneFiveLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        OneFiveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OneFiveLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        OneFiveLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        OneFiveLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OneFiveLabelMouseClicked(evt);
            }
        });
        getContentPane().add(OneFiveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 30, 30));

        OneFourLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        OneFourLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OneFourLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        OneFourLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        OneFourLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OneFourLabelMouseClicked(evt);
            }
        });
        getContentPane().add(OneFourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 30, 30));

        OneThreeLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        OneThreeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OneThreeLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        OneThreeLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        OneThreeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OneThreeLabelMouseClicked(evt);
            }
        });
        getContentPane().add(OneThreeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 30, 30));

        OneEightLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        OneEightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OneEightLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        OneEightLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        OneEightLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OneEightLabelMouseClicked(evt);
            }
        });
        getContentPane().add(OneEightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 30, 30));

        TwoEightLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TwoEightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TwoEightLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TwoEightLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        TwoEightLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TwoEightLabelMouseClicked(evt);
            }
        });
        getContentPane().add(TwoEightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 30, 30));

        ThreeEightLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ThreeEightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThreeEightLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ThreeEightLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        ThreeEightLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThreeEightLabelMouseClicked(evt);
            }
        });
        getContentPane().add(ThreeEightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 30, 30));

        FourEightLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FourEightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FourEightLabel.setText("0");
        FourEightLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FourEightLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FourEightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 30, 30));

        FiveEightLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FiveEightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FiveEightLabel.setText("0");
        FiveEightLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FiveEightLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FiveEightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 30, 30));

        SixEightLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SixEightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SixEightLabel.setText("0");
        SixEightLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SixEightLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SixEightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 30, 30));

        SevenEightLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SevenEightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SevenEightLabel.setText("0");
        SevenEightLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SevenEightLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SevenEightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 30, 30));

        EightEightLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        EightEightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EightEightLabel.setText("0");
        EightEightLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EightEightLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(EightEightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 30, 30));

        EightSevenLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        EightSevenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EightSevenLabel.setText("0");
        EightSevenLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EightSevenLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(EightSevenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 30, 30));

        EightSixLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        EightSixLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EightSixLabel.setText("0");
        EightSixLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EightSixLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(EightSixLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 30, 30));

        EightFiveLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        EightFiveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EightFiveLabel.setText("0");
        EightFiveLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EightFiveLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(EightFiveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 30, 30));

        EightFourLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        EightFourLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EightFourLabel.setText("0");
        EightFourLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EightFourLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(EightFourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 30, 30));

        EightThreeLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        EightThreeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EightThreeLabel.setText("0");
        EightThreeLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EightThreeLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(EightThreeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 30, 30));

        EightTwoLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        EightTwoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EightTwoLabel.setText("0");
        EightTwoLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EightTwoLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(EightTwoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 30, 30));

        SevenTwoLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SevenTwoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SevenTwoLabel.setText("0");
        SevenTwoLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SevenTwoLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SevenTwoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 30, 30));

        SevenThreeLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SevenThreeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SevenThreeLabel.setText("0");
        SevenThreeLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SevenThreeLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SevenThreeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 30, 30));

        SevenFourLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SevenFourLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SevenFourLabel.setText("0");
        SevenFourLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SevenFourLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SevenFourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 30, 30));

        SevenFiveLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SevenFiveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SevenFiveLabel.setText("0");
        SevenFiveLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SevenFiveLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SevenFiveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 30, 30));

        SevenSixLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SevenSixLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SevenSixLabel.setText("0");
        SevenSixLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SevenSixLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SevenSixLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 30, 30));

        SevenSevenLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SevenSevenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SevenSevenLabel.setText("0");
        SevenSevenLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SevenSevenLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SevenSevenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 30, 30));

        SixSevenLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SixSevenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SixSevenLabel.setText("0");
        SixSevenLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SixSevenLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SixSevenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 30, 30));

        SixSixLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SixSixLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SixSixLabel.setText("0");
        SixSixLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SixSixLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SixSixLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 30, 30));

        SixFiveLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SixFiveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SixFiveLabel.setText("0");
        SixFiveLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SixFiveLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SixFiveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 30, 30));

        SixFourLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SixFourLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SixFourLabel.setText("0");
        SixFourLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SixFourLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SixFourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 30, 30));

        SixThreeLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SixThreeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SixThreeLabel.setText("0");
        SixThreeLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SixThreeLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SixThreeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 30, 30));

        SixTwoLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SixTwoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SixTwoLabel.setText("0");
        SixTwoLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SixTwoLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(SixTwoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 30, 30));

        FiveTwoLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FiveTwoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FiveTwoLabel.setText("0");
        FiveTwoLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FiveTwoLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FiveTwoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 30, 30));

        FiveThreeLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FiveThreeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FiveThreeLabel.setText("0");
        FiveThreeLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FiveThreeLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FiveThreeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 30, 30));

        FiveFourLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FiveFourLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FiveFourLabel.setText("0");
        FiveFourLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FiveFourLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FiveFourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 30, 30));

        FiveFiveLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FiveFiveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FiveFiveLabel.setText("0");
        FiveFiveLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FiveFiveLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FiveFiveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 30, 30));

        FiveSixLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FiveSixLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FiveSixLabel.setText("0");
        FiveSixLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FiveSixLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FiveSixLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 30, 30));

        FiveSevenLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FiveSevenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FiveSevenLabel.setText("0");
        FiveSevenLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FiveSevenLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FiveSevenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 30, 30));

        FourSevenLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FourSevenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FourSevenLabel.setText("0");
        FourSevenLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FourSevenLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FourSevenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 30, 30));

        FourSixLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FourSixLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FourSixLabel.setText("0");
        FourSixLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FourSixLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FourSixLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 30, 30));

        FourFiveLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FourFiveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FourFiveLabel.setText("0");
        FourFiveLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FourFiveLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FourFiveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 30, 30));

        FourFourLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FourFourLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FourFourLabel.setText("0");
        FourFourLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FourFourLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FourFourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 30, 30));

        FourThreeLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FourThreeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FourThreeLabel.setText("0");
        FourThreeLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FourThreeLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FourThreeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 30, 30));

        FourTwoLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FourTwoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FourTwoLabel.setText("0");
        FourTwoLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FourTwoLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(FourTwoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 30, 30));

        ThreeTwoLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ThreeTwoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThreeTwoLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ThreeTwoLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        ThreeTwoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThreeTwoLabelMouseClicked(evt);
            }
        });
        getContentPane().add(ThreeTwoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 30, 30));

        ThreeThreeLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ThreeThreeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThreeThreeLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ThreeThreeLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        ThreeThreeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThreeThreeLabelMouseClicked(evt);
            }
        });
        getContentPane().add(ThreeThreeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 30, 30));

        ThreeFourLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ThreeFourLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThreeFourLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ThreeFourLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        ThreeFourLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThreeFourLabelMouseClicked(evt);
            }
        });
        getContentPane().add(ThreeFourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 30, 30));

        ThreeFiveLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ThreeFiveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThreeFiveLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ThreeFiveLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        ThreeFiveLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThreeFiveLabelMouseClicked(evt);
            }
        });
        getContentPane().add(ThreeFiveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 30, 30));

        ThreeSixLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ThreeSixLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThreeSixLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ThreeSixLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        ThreeSixLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThreeSixLabelMouseClicked(evt);
            }
        });
        getContentPane().add(ThreeSixLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 30, 30));

        ThreeSevenLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ThreeSevenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThreeSevenLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ThreeSevenLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        ThreeSevenLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThreeSevenLabelMouseClicked(evt);
            }
        });
        getContentPane().add(ThreeSevenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 30, 30));

        TwoSevenLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TwoSevenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TwoSevenLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TwoSevenLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        TwoSevenLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TwoSevenLabelMouseClicked(evt);
            }
        });
        getContentPane().add(TwoSevenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 30, 30));

        TwoSixLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TwoSixLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TwoSixLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TwoSixLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        TwoSixLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TwoSixLabelMouseClicked(evt);
            }
        });
        getContentPane().add(TwoSixLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 30, 30));

        TwoFiveLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TwoFiveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TwoFiveLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TwoFiveLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        TwoFiveLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TwoFiveLabelMouseClicked(evt);
            }
        });
        getContentPane().add(TwoFiveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 30, 30));

        TwoFourLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TwoFourLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TwoFourLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TwoFourLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        TwoFourLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TwoFourLabelMouseClicked(evt);
            }
        });
        getContentPane().add(TwoFourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 30, 30));

        TwoThreeLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TwoThreeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TwoThreeLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TwoThreeLabel.setPreferredSize(new java.awt.Dimension(50, 50));
        TwoThreeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TwoThreeLabelMouseClicked(evt);
            }
        });
        getContentPane().add(TwoThreeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 30, 30));

        StepButton.setText("Next Step");
        getContentPane().add(StepButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList1.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 160, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OneOneLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OneOneLabelMouseClicked
        if(!BoxesWithValue[0][0]){
            int x;
            if("".equals(OneOneLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(OneOneLabel.getText());
            }
            // This will allow the Label to toggle between numbers if It hasnt been assigned a number
            if(x>=1 && x<9)
                OneOneLabel.setText(integers[x]);
            else{
                x = 0;
                OneOneLabel.setText(integers[x]);
            }
        }
        
    }//GEN-LAST:event_OneOneLabelMouseClicked

    private void OneTwoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OneTwoLabelMouseClicked
       if(!BoxesWithValue[0][1]){
            int x;
            if("".equals(OneTwoLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(OneTwoLabel.getText());
            }
            
            if(x>=1 && x<9)
                OneTwoLabel.setText(integers[x]);
            else{
                x = 0;
                OneTwoLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_OneTwoLabelMouseClicked

    private void OneThreeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OneThreeLabelMouseClicked
        if(!BoxesWithValue[0][2]){
            int x;
            if("".equals(OneThreeLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(OneThreeLabel.getText());
            }
            
            if(x>=1 && x<9)
                OneThreeLabel.setText(integers[x]);
            else{
                x = 0;
                OneThreeLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_OneThreeLabelMouseClicked

    private void OneFourLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OneFourLabelMouseClicked
        if(!BoxesWithValue[0][3]){
            int x;
            if("".equals(OneFourLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(OneFourLabel.getText());
            }
            
            if(x>=1 && x<9)
                OneFourLabel.setText(integers[x]);
            else{
                x = 0;
                OneFourLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_OneFourLabelMouseClicked

    private void OneFiveLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OneFiveLabelMouseClicked
        if(!BoxesWithValue[0][4]){
            int x;
            if("".equals(OneFiveLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(OneFiveLabel.getText());
            }
            
            if(x>=1 && x<9)
                OneFiveLabel.setText(integers[x]);
            else{
                x = 0;
                OneFiveLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_OneFiveLabelMouseClicked

    private void OneSixLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OneSixLabelMouseClicked
        if(!BoxesWithValue[0][5]){
            int x;
            if("".equals(OneSixLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(OneSixLabel.getText());
            }
            
            if(x>=1 && x<9)
                OneSixLabel.setText(integers[x]);
            else{
                x = 0;
                OneSixLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_OneSixLabelMouseClicked

    private void OneSevenLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OneSevenLabelMouseClicked
        if(!BoxesWithValue[0][6]){
            int x;
            if("".equals(OneSevenLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(OneSevenLabel.getText());
            }
            
            if(x>=1 && x<9)
                OneSevenLabel.setText(integers[x]);
            else{
                x = 0;
                OneSevenLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_OneSevenLabelMouseClicked

    private void OneEightLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OneEightLabelMouseClicked
        if(!BoxesWithValue[0][7]){
            int x;
            if("".equals(OneEightLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(OneEightLabel.getText());
            }
            
            if(x>=1 && x<9)
                OneEightLabel.setText(integers[x]);
            else{
                x = 0;
                OneEightLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_OneEightLabelMouseClicked

    private void OneNineLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OneNineLabelMouseClicked
        if(!BoxesWithValue[0][8]){
            int x;
            if("".equals(OneNineLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(OneNineLabel.getText());
            }
            
            if(x>=1 && x<9)
                OneNineLabel.setText(integers[x]);
            else{
                x = 0;
                OneNineLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_OneNineLabelMouseClicked

    private void TwoOneLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwoOneLabelMouseClicked
        if(!BoxesWithValue[1][0]){
            int x;
            if("".equals(TwoOneLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(TwoOneLabel.getText());
            }
            
            if(x>=1 && x<9)
                TwoOneLabel.setText(integers[x]);
            else{
                x = 0;
                TwoOneLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_TwoOneLabelMouseClicked

    private void TwoTwoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwoTwoLabelMouseClicked
        if(!BoxesWithValue[1][1]){
            int x;
            if("".equals(TwoTwoLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(TwoTwoLabel.getText());
            }
            
            if(x>=1 && x<9)
                TwoTwoLabel.setText(integers[x]);
            else{
                x = 0;
                TwoTwoLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_TwoTwoLabelMouseClicked

    private void ThreeOneLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThreeOneLabelMouseClicked
        if(!BoxesWithValue[2][0]){
            int x;
            if("".equals(ThreeOneLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(ThreeOneLabel.getText());
            }
            
            if(x>=1 && x<9)
                ThreeOneLabel.setText(integers[x]);
            else{
                x = 0;
                ThreeOneLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_ThreeOneLabelMouseClicked

    private void TwoThreeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwoThreeLabelMouseClicked
        if(!BoxesWithValue[1][2]){
            int x;
            if("".equals(TwoThreeLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(TwoThreeLabel.getText());
            }
            
            if(x>=1 && x<9)
                TwoThreeLabel.setText(integers[x]);
            else{
                x = 0;
                TwoThreeLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_TwoThreeLabelMouseClicked

    private void TwoFourLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwoFourLabelMouseClicked
        if(!BoxesWithValue[1][3]){
            int x;
            if("".equals(TwoFourLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(TwoFourLabel.getText());
            }
            
            if(x>=1 && x<9)
                TwoFourLabel.setText(integers[x]);
            else{
                x = 0;
                TwoFourLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_TwoFourLabelMouseClicked

    private void TwoFiveLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwoFiveLabelMouseClicked
        if(!BoxesWithValue[1][4]){
            int x;
            if("".equals(TwoFiveLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(TwoFiveLabel.getText());
            }
            
            if(x>=1 && x<9)
                TwoFiveLabel.setText(integers[x]);
            else{
                x = 0;
                TwoFiveLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_TwoFiveLabelMouseClicked

    private void TwoSixLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwoSixLabelMouseClicked
        if(!BoxesWithValue[1][5]){
            int x;
            if("".equals(TwoSixLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(TwoSixLabel.getText());
            }
            
            if(x>=1 && x<9)
                TwoSixLabel.setText(integers[x]);
            else{
                x = 0;
                TwoSixLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_TwoSixLabelMouseClicked

    private void TwoSevenLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwoSevenLabelMouseClicked
        if(!BoxesWithValue[1][6]){
            int x;
            if("".equals(TwoSevenLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(TwoSevenLabel.getText());
            }
            
            if(x>=1 && x<9)
                TwoSevenLabel.setText(integers[x]);
            else{
                x = 0;
                TwoSevenLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_TwoSevenLabelMouseClicked

    private void TwoEightLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwoEightLabelMouseClicked
        if(!BoxesWithValue[1][7]){
            int x;
            if("".equals(TwoEightLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(TwoEightLabel.getText());
            }
            
            if(x>=1 && x<9)
                TwoEightLabel.setText(integers[x]);
            else{
                x = 0;
                TwoEightLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_TwoEightLabelMouseClicked

    private void TwoNineLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwoNineLabelMouseClicked
        if(!BoxesWithValue[1][8]){
            int x;
            if("".equals(TwoNineLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(TwoNineLabel.getText());
            }
            
            if(x>=1 && x<9)
                TwoNineLabel.setText(integers[x]);
            else{
                x = 0;
                TwoNineLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_TwoNineLabelMouseClicked

    private void ThreeTwoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThreeTwoLabelMouseClicked
        if(!BoxesWithValue[2][1]){
            int x;
            if("".equals(ThreeTwoLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(ThreeTwoLabel.getText());
            }
            
            if(x>=1 && x<9)
                ThreeTwoLabel.setText(integers[x]);
            else{
                x = 0;
                ThreeTwoLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_ThreeTwoLabelMouseClicked

    private void ThreeThreeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThreeThreeLabelMouseClicked
        if(!BoxesWithValue[2][2]){
            int x;
            if("".equals(ThreeThreeLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(ThreeThreeLabel.getText());
            }
            
            if(x>=1 && x<9)
                ThreeThreeLabel.setText(integers[x]);
            else{
                x = 0;
                ThreeThreeLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_ThreeThreeLabelMouseClicked

    private void ThreeFourLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThreeFourLabelMouseClicked
        if(!BoxesWithValue[2][3]){
            int x;
            if("".equals(ThreeFourLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(ThreeFourLabel.getText());
            }
            
            if(x>=1 && x<9)
                ThreeFourLabel.setText(integers[x]);
            else{
                x = 0;
                ThreeFourLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_ThreeFourLabelMouseClicked

    private void ThreeFiveLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThreeFiveLabelMouseClicked
        if(!BoxesWithValue[2][4]){
            int x;
            if("".equals(ThreeFiveLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(ThreeFiveLabel.getText());
            }
            
            if(x>=1 && x<9)
                ThreeFiveLabel.setText(integers[x]);
            else{
                x = 0;
                ThreeFiveLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_ThreeFiveLabelMouseClicked

    private void ThreeSixLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThreeSixLabelMouseClicked
        if(!BoxesWithValue[2][5]){
            int x;
            if("".equals(ThreeSixLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(ThreeSixLabel.getText());
            }
            
            if(x>=1 && x<9)
                ThreeSixLabel.setText(integers[x]);
            else{
                x = 0;
                ThreeSixLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_ThreeSixLabelMouseClicked

    private void ThreeSevenLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThreeSevenLabelMouseClicked
        if(!BoxesWithValue[2][6]){
            int x;
            if("".equals(ThreeSevenLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(ThreeSevenLabel.getText());
            }
            
            if(x>=1 && x<9)
                ThreeSevenLabel.setText(integers[x]);
            else{
                x = 0;
                ThreeSevenLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_ThreeSevenLabelMouseClicked

    private void ThreeEightLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThreeEightLabelMouseClicked
        if(!BoxesWithValue[2][7]){
            int x;
            if("".equals(ThreeEightLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(ThreeEightLabel.getText());
            }
            
            if(x>=1 && x<9)
                ThreeEightLabel.setText(integers[x]);
            else{
                x = 0;
                ThreeEightLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_ThreeEightLabelMouseClicked

    private void ThreeNineLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThreeNineLabelMouseClicked
        if(!BoxesWithValue[2][8]){
            int x;
            if("".equals(ThreeNineLabel.getText())) {
                x = 0;
            } else {
                x = Integer.valueOf(ThreeNineLabel.getText());
            }
            
            if(x>=1 && x<9)
                ThreeNineLabel.setText(integers[x]);
            else{
                x = 0;
                ThreeNineLabel.setText(integers[x]);
            }
        }
    }//GEN-LAST:event_ThreeNineLabelMouseClicked

    private void Map() { //Mapping
        Map<String, JLabel> ArrayToLabel = new HashMap<>();
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
        
        for(int i = 0; i < 9; i++){
            for(int y = 0; y < 9; y++){
                if(BoxesWithValue[i][y]){ // Assign Decided values their respective numbers
                    try{
                        Font Bolden = new Font("Tahoma", Font.BOLD, 36);
                        ArrayToLabel.get(String.valueOf((i*9) + (y+1))).setFont(Bolden);
                        ArrayToLabel.get(String.valueOf((i*9) + (y+1))).setText(String.valueOf(SudokuBoxes[i][y]));                         
                    } catch(NullPointerException n){
                        System.out.println("NO");
                    }
                   
                }
            }
        }
    }
    //Actions to preform when called from HelpMenu
    public void Example(){
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
    private void Explain(String[][] description, int[] i){ // I passed an array because I couldnt think of Alternatives
        for(int y = 0; y < description[i[0]].length; y++){
            explanation.addElement(description[i[0]][y]); 
        }      
        i[0]++;         
        if(i[0] > 4){
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
    private javax.swing.JLabel EightEightLabel;
    private javax.swing.JLabel EightFiveLabel;
    private javax.swing.JLabel EightFourLabel;
    private javax.swing.JLabel EightNineLabel;
    private javax.swing.JLabel EightOneLabel;
    private javax.swing.JLabel EightSevenLabel;
    private javax.swing.JLabel EightSixLabel;
    private javax.swing.JLabel EightThreeLabel;
    private javax.swing.JLabel EightTwoLabel;
    private javax.swing.JLabel FiveEightLabel;
    private javax.swing.JLabel FiveFiveLabel;
    private javax.swing.JLabel FiveFourLabel;
    private javax.swing.JLabel FiveNineLabel;
    private javax.swing.JLabel FiveOneLabel;
    private javax.swing.JLabel FiveSevenLabel;
    private javax.swing.JLabel FiveSixLabel;
    private javax.swing.JLabel FiveThreeLabel;
    private javax.swing.JLabel FiveTwoLabel;
    private javax.swing.JLabel FourEightLabel;
    private javax.swing.JLabel FourFiveLabel;
    private javax.swing.JLabel FourFourLabel;
    private javax.swing.JLabel FourNineLabel;
    private javax.swing.JLabel FourOneLabel;
    private javax.swing.JLabel FourSevenLabel;
    private javax.swing.JLabel FourSixLabel;
    private javax.swing.JLabel FourThreeLabel;
    private javax.swing.JLabel FourTwoLabel;
    private javax.swing.JLabel NineEightLabel;
    private javax.swing.JLabel NineFiveLabel;
    private javax.swing.JLabel NineFourLabel;
    private javax.swing.JLabel NineNineLabel;
    private javax.swing.JLabel NineOneLabel;
    private javax.swing.JLabel NineSevenLabel;
    private javax.swing.JLabel NineSixLabel;
    private javax.swing.JLabel NineThreeLabel;
    private javax.swing.JLabel NineTwoLabel;
    private javax.swing.JLabel OneEightLabel;
    private javax.swing.JLabel OneFiveLabel;
    private javax.swing.JLabel OneFourLabel;
    private javax.swing.JLabel OneNineLabel;
    private javax.swing.JLabel OneOneLabel;
    private javax.swing.JLabel OneSevenLabel;
    private javax.swing.JLabel OneSixLabel;
    private javax.swing.JLabel OneThreeLabel;
    private javax.swing.JLabel OneTwoLabel;
    private javax.swing.JLabel SevenEightLabel;
    private javax.swing.JLabel SevenFiveLabel;
    private javax.swing.JLabel SevenFourLabel;
    private javax.swing.JLabel SevenNineLabel;
    private javax.swing.JLabel SevenOneLabel;
    private javax.swing.JLabel SevenSevenLabel;
    private javax.swing.JLabel SevenSixLabel;
    private javax.swing.JLabel SevenThreeLabel;
    private javax.swing.JLabel SevenTwoLabel;
    private javax.swing.JLabel SixEightLabel;
    private javax.swing.JLabel SixFiveLabel;
    private javax.swing.JLabel SixFourLabel;
    private javax.swing.JLabel SixNineLabel;
    private javax.swing.JLabel SixOneLabel;
    private javax.swing.JLabel SixSevenLabel;
    private javax.swing.JLabel SixSixLabel;
    private javax.swing.JLabel SixThreeLabel;
    private javax.swing.JLabel SixTwoLabel;
    private javax.swing.JButton StepButton;
    private javax.swing.JLabel ThreeEightLabel;
    private javax.swing.JLabel ThreeFiveLabel;
    private javax.swing.JLabel ThreeFourLabel;
    private javax.swing.JLabel ThreeNineLabel;
    private javax.swing.JLabel ThreeOneLabel;
    private javax.swing.JLabel ThreeSevenLabel;
    private javax.swing.JLabel ThreeSixLabel;
    private javax.swing.JLabel ThreeThreeLabel;
    private javax.swing.JLabel ThreeTwoLabel;
    private javax.swing.JLabel TwoEightLabel;
    private javax.swing.JLabel TwoFiveLabel;
    private javax.swing.JLabel TwoFourLabel;
    private javax.swing.JLabel TwoNineLabel;
    private javax.swing.JLabel TwoOneLabel;
    private javax.swing.JLabel TwoSevenLabel;
    private javax.swing.JLabel TwoSixLabel;
    private javax.swing.JLabel TwoThreeLabel;
    private javax.swing.JLabel TwoTwoLabel;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

