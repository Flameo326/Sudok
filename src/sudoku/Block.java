
package sudoku;

import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class Block {
    JLabel label;
    int answer;
    boolean shown;
    
    public Block(int answer, boolean shown){
        label = new JLabel();
        this.answer = answer;
        this.shown = shown;   
    }
    
    public boolean checkAnswer(int value){
        return value == answer;
    }
    
    public JLabel getLabel(){
        return label;
    }
    
    
    
    public void labelMouseClicked(MouseEvent evt) {
        System.out.println("pie");
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
 