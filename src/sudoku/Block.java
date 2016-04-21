
package sudoku;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class Block{
    JLabel label;
    int answer;
    boolean shown;
    
    public Block(int answer, boolean shown){
        label = new JLabel();
        this.answer = answer;
        this.shown = shown;
        if(!shown){
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                labelMouseClicked(me);
            }

            @Override
            public void mousePressed(MouseEvent me) {               
            }

            @Override
            public void mouseReleased(MouseEvent me) {                
            }

            @Override
            public void mouseEntered(MouseEvent me) {               
            }

            @Override
            public void mouseExited(MouseEvent me) {              
            }            

            
        });
        } else
            label.setText(Integer.toString(answer));
        
        label.setEnabled(true);
        label.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        label.setPreferredSize(new java.awt.Dimension(50, 50));      
        label.setVisible(true);              
    }
    
    public void addToPane(int x, int y, Container pane) {
        pane.add(label,new AbsoluteConstraints(x, y, 30, 30));
    }
    
    public boolean checkAnswer(int value){
        return value == answer;
    }
    
    public JLabel getLabel(){
        return label;
    }
    
    public void labelMouseClicked(MouseEvent evt) {
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
 