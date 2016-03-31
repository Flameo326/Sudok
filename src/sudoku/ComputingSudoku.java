
package sudoku;

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
           for(int e = 0; e < 9; e++){
               for(int y = 0; y < 9; y++){
                   System.out.print(SudokuBoxes[e][y] + " ");
               }
               System.out.println();
           }
           System.out.println();
           System.out.println();
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
           System.out.println("p");
        }while(true);
        ArrayList temp = map.get((row*9) + column);        
        
        int value = 0;
        if(!(GameWindow.singleton == null))
            return;
        if(!(temp.isEmpty()))
            value = (int)temp.get(rand.nextInt(temp.size()));
        else 
            MakeAnswerKey();        
        
        System.out.println(row + " " + column + " " + value);
        SudokuBoxes[row][column] = value;        
        
        removeFromLists(row, column, value);  
        
        CheckValues(row, column);
    }
    
    public void CheckValues( int row, int column){        
        checkRow(row);
        checkColumn(column);
        checkBox(row, column);
        
        /*
        for(int i = 0; i < 9; i++){
            if(SudokuBoxes[row][i] == 0){
                if(i != column)
                    checkColumn(i);
                checkBox(row, (i/3) *3);
            } 
        }
        for(int i = 0; i < 9; i++){
            if(SudokuBoxes[i][column] == 0){
                if(i != row)
                    checkRow(i);
                checkBox((i/3) *3, column);
            }
        }
        
        int _row = row/3 *3, _column = column/3 *3;
        for(int i = _row; i < _row + 3; i++){
            for(int y = _column; y < _column + 3; y++){
                if(i != row)
                    checkRow(i);
                if(y != column)
                    checkColumn(y);
            }           
        } */                       
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

