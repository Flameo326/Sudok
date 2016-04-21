
package sudoku;

public class SolvingSudoku {
    
    
    public SolvingSudoku(Block[][] blocks){
        
        
        
        
        
        
        GameWindow.singleton.StepButton.addMouseListener(new java.awt.event.MouseAdapter() { // Allow person to click through steps
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    NextStep();
                }
            });
    }
    
    public void NextStep(){
        System.out.println("pie");
    }
    
}
