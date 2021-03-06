
package sudoku;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class Block{
    private JLabel label;
    private int answer;
    boolean shown;
    MouseListener mouseListener;
    
    public Block(int answer, boolean shown){
        label = new JLabel();
        mouseListener = new MouseListener() {
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
        };
        this.answer = answer;
        this.shown = shown;
        label.setForeground(new Color(0, 0, 0));
        if(!shown){
            label.setFont(new Font("Tahoma", 0, 36));            
            label.addMouseListener(mouseListener);
        } else{
            label.setText(Integer.toString(answer));
            label.setFont(new Font("Tahoma", Font.BOLD, 36));
        } 
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setPreferredSize(new java.awt.Dimension(50, 50));                   
    }
    
    public void addToPane(int x, int y, Container pane) {
        pane.add(label,new AbsoluteConstraints(x, y, 30, 30));
    }
    
    public boolean checkAnswer(){
        return label.getText().equals(answer);
    }
    
    public JLabel getLabel(){
        return label;
    }
    
    public int getAnswer(){
        return answer;
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
 