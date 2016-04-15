
package sudoku;

import javax.swing.JLabel;

public class Block {
    JLabel label;
    int answer;
    boolean shown;
    
    public Block(JLabel label, int answer, boolean shown){
        this.label = label;
        this.answer = answer;
        this.shown = shown;
        
        label.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        label.setPreferredSize(new java.awt.Dimension(50, 50));
        if(!shown){
            label.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    labelMouseClicked(evt);
                }
            });
        } else
            label.setText(Integer.toString(answer));
        
    }
    
    public boolean checkAnswer(int value){
        return value == answer;
    }
    
    public JLabel getLabel(){
        return label;
    }
    
    private void labelMouseClicked(java.awt.event.MouseEvent evt) {                                                 
        int x;
        if ("".equals(label.getText())) {
            x = 0;
        } else {
            x = Integer.valueOf(label.getText());
        }

        if (x >= 1 && x < 9) {
            label.setText(GameWindow.integers[x]);
        } else {
            x = 0;
            label.setText(GameWindow.integers[x]);
        }
    }
     
    
}
