
package sudoku;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Paint extends JPanel {
    
    public void paint(){
        setPreferredSize(new Dimension(600, 450));
    }
    
    @Override
    public void paintComponent(Graphics g){  // Draws Line and thickness to create Sudoku Board
        super.paintComponent(g);
        Graphics2D gfx = (Graphics2D) g;
        for(int i = 0; i< 10; i++){
            if(i % 3 == 0){
                gfx.setStroke(new BasicStroke(8));
            }else{
                gfx.setStroke(new BasicStroke(1));
            }
            gfx.drawLine(10+(i*30), 7, 10+(i*30), 367);
            gfx.drawLine(10, 7+(i*40), 280, 7+(i*40));
        }
    }
}
    
    

