
package sudoku;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class ComputingSudoku { // Will create Sudoku puzzle randomly
    Random rand;
    
    int[][] SudokuBoxes;
    boolean[][] BoxesWithValue;
    ArrayList values;
    Map<Integer, ArrayList> map;
    
    public ComputingSudoku(int difficulty){
        values = new ArrayList();
        SudokuBoxes = new int[9][9];
        BoxesWithValue = new boolean[9][9];
        map = new LinkedHashMap<>();
        rand = new Random();
                      
        ResetList();
        ConfigureShownBoxes(difficulty);
        MakeAnswerKey();
    }
    
    Block[][] blocks;
    ArrayList saves;
    
    public ComputingSudoku(Block[][] blocks){
        this.blocks = blocks;
        values = new ArrayList();
        map = new LinkedHashMap();
        SudokuBoxes = new int[9][9];
        rand = new Random();
        saves = new ArrayList();
        
        ResetList();                
        
        for(int i = 0; i < 81; i++){
            map.put(i, (ArrayList)values.clone());             
        }
        
        for (int i = 0; i < 9; i++) {
            for (int y = 0; y < 9; y++) {
                if(!(blocks[i][y].getLabel().getText().equals("")))
                    removeFromLists(i, y, blocks[i][y].getAnswer());                
            }
        }
        
        GameWindow.singleton.explanation.addElement("First thing the computer"); GameWindow.singleton.explanation.addElement("does is go through the");
        GameWindow.singleton.explanation.addElement("entire puzzle identifying the"); GameWindow.singleton.explanation.addElement("possible values each box");
        GameWindow.singleton.explanation.addElement("can be. This process will be"); GameWindow.singleton.explanation.addElement("slower for humans but will"); 
        GameWindow.singleton.explanation.addElement("be very inciteful in knowing"); GameWindow.singleton.explanation.addElement("which values go where."); GameWindow.singleton.explanation.addElement("");
        
        GameWindow.singleton.StepButton.addMouseListener(new java.awt.event.MouseAdapter() { // Allow person to click through steps
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    NextStep();
                }
            });
    }
    
    public void NextStep(){
        changeColor();
        checkBlocks();
        
        int i = rand.nextInt(4);
        int y = i;
        boolean temp = true;
        do{
            
            switch(i){
                case 0: 
                    temp = SingleSize();
                    break;
                case 1: 
                    temp= SingleRow(); //Find the specific text size for explanation
                    break;
                case 2: 
                    temp = SingleColumn();
                    break;
                case 3: 
                    temp = SingleBox();
                    break;
            } 
            i++;
            if(i > 3)
                i = 0;
            if(y == i)
                guess();
        } while(temp);
        
        for(int e = 0; e < 9; e++){
            for(int p = 0; p < 9; p++){
                System.out.println(e*9 + p + " " + map.get(e*9 + p));
            }
        }
        System.out.println();
    }
    
    public void checkBlocks(){
        for(int i = 0; i < 9; i++){
            for(int y = 0; y < 9; y++){
                if(!blocks[i][y].getLabel().getText().equals("")){
                    return;
                }               
            }
        }
        GameWindow.singleton.StepButton.setVisible(false); 
    }
    
    public void changeColor(){
        Color color = new Color(0 ,0 ,0);
        
        for(int i = 0; i < 9; i++){
            for(int y = 0; y < 9; y++){
                blocks[i][y].getLabel().setForeground(color);
            }
        }
    }
    
    public boolean SingleSize(){
        for(int i = 0; i<81; i++){
            if(((ArrayList)map.get(i)).size() == 1){
                blocks[i/9][i%9].getLabel().setForeground(new Color(0, 255, 0));
                blocks[i/9][i%9].getLabel().setText(Integer.toString((int)(map.get(i)).get(0)));
                GameWindow.singleton.explanation.addElement(""); GameWindow.singleton.explanation.addElement(""); 
                GameWindow.singleton.explanation.addElement("This is the value the"); GameWindow.singleton.explanation.addElement("computer found. Look at");
                GameWindow.singleton.explanation.addElement("the surrounding rows,"); GameWindow.singleton.explanation.addElement("columns and box to");
                GameWindow.singleton.explanation.addElement("understand why. This");  GameWindow.singleton.explanation.addElement("method determined that"); 
                GameWindow.singleton.explanation.addElement("this was the only"); GameWindow.singleton.explanation.addElement("possible value for this");  GameWindow.singleton.explanation.addElement("square.");
                removeFromLists(i/9, i%9, (int)(map.get(i)).get(0));
                return false;
            }
        }
        return true;
    }
      
    public boolean SingleRow(){
        ArrayList compare = new ArrayList();
        ArrayList SqPos = new ArrayList();
        
        for(int i = 0; i<9; i++){          // i = row, y = column
            for(int y = 0; y<9; y++){
                if(blocks[i][y].getLabel().getText().equals("")){
                    if(map.get((i*9) + y).isEmpty()){
                        redo();
                        return false;
                    }else{                       
                    compare.add(map.get((i*9) + y));                    
                    SqPos.add(y); 
                    }
                }
            }
            for(int e = 1; e <= 9; e++){
                int f = 0;
                boolean[] valueHeld = new boolean[9];
                for(int y = 0; y < compare.size(); y++){                
                    for(int x = 0; x < ((ArrayList)compare.get(y)).size(); x++){
                        if((int)((ArrayList)compare.get(y)).get(x) == e){
                            f++;
                            valueHeld[y] = true;
                            break;
                        }
                        if((int)((ArrayList)compare.get(y)).get(x) > e)
                        break;
                    }
                }
                if(f == 1){
                    for(int y = 0; y < compare.size(); y++){
                        if(valueHeld[y]){
                            blocks[i][(int)SqPos.get(y)].getLabel().setForeground(new Color(0, 255, 0));
                            blocks[i][(int)SqPos.get(y)].getLabel().setText(Integer.toString(e));
                            GameWindow.singleton.explanation.addElement(""); GameWindow.singleton.explanation.addElement(""); 
                            GameWindow.singleton.explanation.addElement("This is the value the"); GameWindow.singleton.explanation.addElement("computer found. Look at");
                            GameWindow.singleton.explanation.addElement("the surrounding rows,"); GameWindow.singleton.explanation.addElement("columns and box to");
                            GameWindow.singleton.explanation.addElement("understand why. This");  GameWindow.singleton.explanation.addElement("method determined that"); 
                            GameWindow.singleton.explanation.addElement("this was the only square"); GameWindow.singleton.explanation.addElement("for this row that could"); GameWindow.singleton.explanation.addElement("contain this value.");
                            removeFromLists(i, (int)SqPos.get(y), e);
                            return false;
                        }
                    }               
                }
            }
            compare.clear();
            SqPos.clear();
       }
        return true;
    }
    
    public boolean SingleColumn(){
        ArrayList compare = new ArrayList();
        ArrayList SqPos = new ArrayList();
        
        for(int i = 0; i<9; i++){          // i = row, y = column
            for(int y = 0; y<9; y++){
                if(blocks[y][i].getLabel().getText().equals("")){
                    if(map.get((y*9) + i).isEmpty()){
                        redo();
                        return false;
                    }else{ 
                        compare.add(map.get((y*9) + i));
                        SqPos.add(y);
                    }
                }
            }
            for(int e = 1; e <= 9; e++){
                int f = 0;
                boolean[] valueHeld = new boolean[9];
                for(int y = 0; y < compare.size(); y++){                
                    for(int x = 0; x < ((ArrayList)compare.get(y)).size(); x++){
                        if((int)((ArrayList)compare.get(y)).get(x) == e){
                            f++;
                            valueHeld[y] = true;
                            break;
                        }
                        if((int)((ArrayList)compare.get(y)).get(x) > e)
                        break;
                    }
                }
                if(f == 1){
                    for(int y = 0; y < compare.size(); y++){
                        if(valueHeld[y]){
                            blocks[(int)SqPos.get(y)][i].getLabel().setForeground(new Color(0, 255, 0));
                            blocks[(int)SqPos.get(y)][i].getLabel().setText(Integer.toString(e));
                            GameWindow.singleton.explanation.addElement(""); GameWindow.singleton.explanation.addElement(""); 
                            GameWindow.singleton.explanation.addElement("This is the value the"); GameWindow.singleton.explanation.addElement("computer found. Look at");
                            GameWindow.singleton.explanation.addElement("the surrounding rows,"); GameWindow.singleton.explanation.addElement("columns and box to");
                            GameWindow.singleton.explanation.addElement("understand why. This");  GameWindow.singleton.explanation.addElement("method determined that"); 
                           GameWindow.singleton.explanation.addElement("this was the only square"); GameWindow.singleton.explanation.addElement("for this column that could"); GameWindow.singleton.explanation.addElement("contain this value.");
                            removeFromLists((int)SqPos.get(y), i, e);
                            return false;
                        }
                    }               
                }
            }
            compare.clear();
            SqPos.clear();
       } 
        return true;
    }
    
    public boolean SingleBox(){
        ArrayList compare = new ArrayList();
        ArrayList SqPos = new ArrayList();
        
        for(int a = 0; a < 9; a+=3){
            for(int b= 0; b < 9; b+=3){
                for(int i = a; i<a+3; i++){          // i = row, y = column
                    for(int y = b; y<b+3; y++){
                        if(blocks[i][y].getLabel().getText().equals("")){
                            if(map.get((i*9) + y).isEmpty()){
                                redo();
                                return false;
                            }else{ 
                                compare.add(map.get((i*9) + y));
                                SqPos.add((i*9) + y);  
                            }
                        }
                    }
                }
                    for(int e = 1; e <= 9; e++){
                        int f = 0;
                        boolean[] valueHeld = new boolean[9];
                        for(int y = 0; y < compare.size(); y++){                
                            for(int x = 0; x < ((ArrayList)compare.get(y)).size(); x++){
                                if((int)((ArrayList)compare.get(y)).get(x) == e){
                                    f++;
                                    valueHeld[y] = true;
                                    break;
                                }
                                if((int)((ArrayList)compare.get(y)).get(x) > e)
                                break;
                            }
                        }
                        if(f == 1){
                            for(int y = 0; y < compare.size(); y++){
                                if(valueHeld[y]){
                                    blocks[(int)SqPos.get(y)/9][(int)SqPos.get(y)%9].getLabel().setForeground(new Color(0, 255, 0));
                                    blocks[(int)SqPos.get(y)/9][(int)SqPos.get(y)%9].getLabel().setText(Integer.toString(e));
                                    GameWindow.singleton.explanation.addElement(""); GameWindow.singleton.explanation.addElement(""); 
                                    GameWindow.singleton.explanation.addElement("This is the value the"); GameWindow.singleton.explanation.addElement("computer found. Look at");
                                    GameWindow.singleton.explanation.addElement("the surrounding rows,"); GameWindow.singleton.explanation.addElement("columns and box to");
                                    GameWindow.singleton.explanation.addElement("understand why. This");  GameWindow.singleton.explanation.addElement("method determined that"); 
                                    GameWindow.singleton.explanation.addElement("this was the only square"); GameWindow.singleton.explanation.addElement("for this box that could"); GameWindow.singleton.explanation.addElement("contain this value.");
                                    removeFromLists((int)SqPos.get(y)/9, (int)SqPos.get(y)%9, e);
                                    return false;
                                }
                            }               
                        }
                    }
                    compare.clear();
                    SqPos.clear();
                    
            }
        }
        return true;
    }
    
    public void guess(){       
        for(int i = 0; i < 9; i++){
            for(int y = 0; y < 9; y++){
                if(!(blocks[i][y].getLabel().getText().equals("")))
                    SudokuBoxes[i][y] = Integer.valueOf(blocks[i][y].getLabel().getText());
                else
                    SudokuBoxes[i][y] = 0;
            }
        }    
        
        int x = rand.nextInt(81);
        do{       
        if(!map.get(x/9 + x%9).isEmpty()){
            saves.add(0); saves.add(x); saves.add(SudokuBoxes);
            blocks[x/9][x%9].getLabel().setForeground(new Color(0, 255, 0));
            blocks[x/9][x%9].getLabel().setText((String)(map.get(x/9 + x%9).get(0)));
            blocks[x/9][x%9].shown = true;
            // Explanation
            removeFromLists(x/9, x%9, Integer.valueOf(blocks[x/9][x%9].getLabel().getText()));
            break;
        } else
            x++;
        } while(true);       
    }
    
    public void redo(){
        int temp = (int)saves.get(saves.size()-3); temp++;
        if(temp < ((ArrayList)saves.get(saves.size()-3)).size()){
            saves.remove(saves.size()-3); saves.add(saves.size()-2, temp);
        } else{
            for(int i = 0; i < 3; i++){
                saves.remove(saves.size()-1);
                redo();
                return;
            }
        }
        
        SudokuBoxes = (int[][])saves.get(saves.size()-1);
        for(int i = 0; i < 9; i++){
            for(int y = 0; y < 9; y++){
                if(!(SudokuBoxes[i][y] == 0))
                    blocks[i][y].getLabel().setText(Integer.toString(SudokuBoxes[i][y]));
                else
                    blocks[i][y].getLabel().setText("");
            }
        }                 
        
        for(int i = 0; i < 81; i++){
            map.put(i, (ArrayList)values.clone());             
        }        
        
        for (int i = 0; i < 9; i++) {
            for (int y = 0; y < 9; y++) {
                if(!(blocks[i][y].getLabel().getText().equals("")))
                    removeFromLists(i, y, blocks[i][y].getAnswer());                
            }
        }
        blocks[(int)(saves.get(saves.size()-2)) / 9][(int)(saves.get(saves.size()-2)) % 9].getLabel().setForeground(new Color(0, 0, 0));
        blocks[(int)(saves.get(saves.size()-2)) / 9][(int)(saves.get(saves.size()-2)) % 9].getLabel().setText((String)(map.get((int)(saves.get(saves.size()-2)) / 9 + (int)(saves.get(saves.size()-2)) % 9).get((int)saves.get(temp))));
        // Explanation
        removeFromLists((int)(saves.get(saves.size()-2))/9, (int)(saves.get(saves.size()-2))%9, Integer.valueOf(blocks[(int)(saves.get(saves.size()-2))/9][(int)(saves.get(saves.size()-2))%9].getLabel().getText()));
    }
    
    // All i need to do now is test out guessing function and fint tune it. See if it works
    // Always possibility to make better design and selecting boxes, assisting the player.
    // Do the explanations
    // See if it works at school
    // Find a way to present this earlier? Make it a teaching oppurtunity? Who knows????
    
    public void ConfigureShownBoxes(int difficulty){
        int TotalBoxes = rand.nextInt(5) + (32-(4*difficulty));

        for(int i = 0; i < TotalBoxes; i++){
            int row, column;
            while(true){
                row = rand.nextInt(9);
                column = rand.nextInt(9);             
                
                if(!BoxesWithValue[row][column]){                 
                    BoxesWithValue[row][column] = true;
                    break;
                }   
            }
            
        }
    }
    
    public void ResetList(){        
        values.add(1); values.add(2); values.add(3);
        values.add(4); values.add(5); values.add(6);
        values.add(7); values.add(8); values.add(9);
    }
    
    public boolean checkAnswerKey(){
        for(int i = 0; i < 9; i++){
            for(int y = 0; y < 9; y++){
                if(SudokuBoxes[i][y] == 0)
                    return true;
            }
        }
        return false;
    }
    
    public void MakeAnswerKey() {        
        for(int i = 0; i < 9; i++){
            for(int y = 0; y < 9; y++){
                SudokuBoxes[i][y] = 0;
            }
        }
        for(int i = 0; i < 81; i++)
            map.put(i, (ArrayList)values.clone());    
       
        do{
           SetSquare();                                
       } while(checkAnswerKey() && GameWindow.singleton == null);
        
        if(GameWindow.singleton == null) {
            GameWindow.singleton = new GameWindow(SudokuBoxes, BoxesWithValue);
            GameWindow.singleton.setVisible(true);
        }
          
    }
    
    public void SetSquare(){
        int row = rand.nextInt(9), column = rand.nextInt(9);       
               
        do{
           if(SudokuBoxes[row][column] != 0){
               column++;
               if(column == 9){
                   column = 0;
                   row++;
                   if(row == 9)
                       row = 0;
               }
           } else
               break;           
        }while(true);
        ArrayList temp = map.get((row*9) + column);        
        
        int value = 0;
        if(!(GameWindow.singleton == null))
            return;
        if(!(temp.isEmpty()))
            value = (int)temp.get(rand.nextInt(temp.size()));
        else 
            MakeAnswerKey();        
        
        SudokuBoxes[row][column] = value;        
        
        removeFromLists(row, column, value);  
        
        CheckValues(row, column);
    }
    
    public void CheckValues( int row, int column){        
        checkRow(row);
        checkColumn(column);
        checkBox(row, column);                       
    } 
    
    public void checkRow(int row){
        ArrayList compare = new ArrayList();
        ArrayList columns = new ArrayList();
        
        for(int i = 0; i < 9; i++){
            if(SudokuBoxes[row][i] == 0){
                if(map.get((row*9) + i).size() == 1){
                    SudokuBoxes[row][i] = (int)map.get((row*9) + i).get(0);
                    removeFromLists(row, i, SudokuBoxes[row][i]);
                    CheckValues(row, i);
                }
                else{
                    compare.add(map.get((row*9) + i));
                    columns.add(i);
                }
            }
        }
              
        for(int i = 1; i <= 9; i++){
            int f = 0;
            boolean[] valueHeld = new boolean[9];
            for(int y = 0; y < compare.size(); y++){                
                for(int e = 0; e < ((ArrayList)compare.get(y)).size(); e++){
                    if((int)((ArrayList)compare.get(y)).get(e) == i){
                        f++;
                        valueHeld[y] = true;
                        break;
                    }
                    if((int)((ArrayList)compare.get(y)).get(e) > i)
                        break;
                }
            }
            if(f == 1){
              for(int y = 0; y < compare.size(); y++){
                  if(valueHeld[y]){
                      SudokuBoxes[row][(int)columns.get(y)] = i;
                      removeFromLists(row, (int)columns.get(y), i);
                      CheckValues(row, (int)columns.get(y));
                      break;
                  }
              }
              break;
            }
        }
    }
    
    public void checkColumn(int column){
        ArrayList compare = new ArrayList();
        ArrayList row = new ArrayList();
        
        for(int i = 0; i < 9; i++){
            if(SudokuBoxes[i][column] == 0){
                if(((ArrayList)(map.get((i*9) + column))).size() == 1){
                    SudokuBoxes[i][column] = (int)((ArrayList)(map.get((i*9) + column))).get(0);
                    removeFromLists(i, column, SudokuBoxes[i][column]);
                    CheckValues(i, column);
                }
                else{
                    compare.add(((ArrayList)(map.get((i*9) + column))));
                    row.add(i);
                }
            }
        }
              
        for(int i = 1; i <= 9; i++){
            int f = 0;
            boolean[] valueHeld = new boolean[9];
            for(int y = 0; y < compare.size(); y++){                
                for(int e = 0; e < ((ArrayList)compare.get(y)).size(); e++){
                    if((int)((ArrayList)compare.get(y)).get(e) == i){
                        f++;
                        valueHeld[y] = true;
                        break;
                    }
                    if((int)((ArrayList)compare.get(y)).get(e) > i)
                        break;
                }
            }
            if(f == 1){
              for(int y = 0; y < compare.size(); y++){
                  if(valueHeld[y]){
                      SudokuBoxes[(int)row.get(y)][column] = i;
                      removeFromLists( (int)row.get(y), column, i);
                      CheckValues((int)row.get(y) , column);
                      break;
                  }
              }
              break;
            }
        }
    }
    
    public void checkBox(int row, int column){
        ArrayList compare = new ArrayList();
        ArrayList sqNum = new ArrayList();
        
        int _row = row/3 *3, _column = column/3 *3;
        for(int i = _row; i < _row+3; i++){
            for(int y = _column; y < _column+3; y++){
                if(SudokuBoxes[i][y] == 0){
                    if(((ArrayList)(map.get((i*9) + y))).size() == 1){
                        SudokuBoxes[i][y] = (int)((ArrayList)(map.get((i*9) + y))).get(0);
                        removeFromLists(i, y, SudokuBoxes[i][y]);
                        CheckValues(i, y);
                    }
                    else{
                        compare.add(((ArrayList)(map.get((i*9) + y))));
                        sqNum.add((i*9) + column);
                    }
                }
            }          
        }
              
        for(int i = 1; i <= 9; i++){
            int f = 0;
            boolean[] valueHeld = new boolean[9];
            for(int y = 0; y < compare.size(); y++){                
                for(int e = 0; e < ((ArrayList)compare.get(y)).size(); e++){
                    if((int)((ArrayList)compare.get(y)).get(e) == i){
                        f++;
                        valueHeld[y] = true;
                        break;
                    }
                    if((int)((ArrayList)compare.get(y)).get(e) > i)
                        break;
                }
            }
            if(f == 1){
              for(int y = 0; y < compare.size(); y++){
                  if(valueHeld[y]){
                      SudokuBoxes[(int)sqNum.get(y)/9][(int)sqNum.get(y)%9] = i;
                      removeFromLists( (int)sqNum.get(y)/9, (int)sqNum.get(y)%9, i);
                      CheckValues((int)sqNum.get(y)/9,(int)sqNum.get(y)%9);
                      break;
                  }
              }
              break;
            }
        }
    }
    
    public void removeFromLists(int row, int column, int value){
        map.get((row*9) + column).clear();
        
        for(int i = 0; i < 9; i++){
            if(SudokuBoxes[i][column] == 0)
                map.get((i*9) + column).remove((Object) value);
            if(SudokuBoxes[row][i] == 0)
                map.get((row*9) + i).remove((Object) value);
        }
        
        int _row = (row/3) *3, _column = (column/3) *3;                 
        
        for(int i = _row; i < _row+3; i++ ){
            for(int y = _column; y < _column + 3; y++){ 
                if(SudokuBoxes[i][y] == 0)
                    map.get((i*9) + y).remove((Object) value);
            }
        }  
    }   
}

