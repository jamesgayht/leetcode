package LeetcodePrac.LeetCode;

import java.util.HashSet;

public class Leetcode36 {
    public static boolean isValidSudoku(char[][] board) {
        // if required to check for unique values, use hashset
        HashSet<String> hashSet = new HashSet<>(); 
        final int GRID_SIZE = 9;
        char current;

        // iterate over every item in the board using nested for loops
        for(int row = 0; row<GRID_SIZE; row++) {
            for(int col=0; col<GRID_SIZE; col++) {
                current = board[row][col];
                // we only want to check values that has numbers and ignore '.'
                if(current != '.') {
                    /* 
                    use the HashSet.add method, which returns a boolean, to check for any existing values 
                        if exists will return false
                        else return true
                    */ 

                    if(!hashSet.add("row" + row + current) || 
                        !hashSet.add("col" + col + current) ||
                        !hashSet.add("grid" + row/3 + col/3 + current)) {
                            return false; 
                    }
                }
            }
        }

        return true; 
    }

    // add to main method for testing 
    /*
        char[][] board = 
        {{'5','3','.','.','7','.','.','.','.'}
        ,{'6','.','.','1','9','5','.','.','.'}
        ,{'.','9','8','.','.','.','.','6','.'}
        ,{'8','.','.','.','6','.','.','.','3'}
        ,{'4','.','.','8','.','3','.','.','1'}
        ,{'7','.','.','.','2','.','.','.','6'}
        ,{'.','6','.','.','.','.','2','8','.'}
        ,{'.','.','.','4','1','9','.','.','5'}
        ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(Leetcode36.isValidSudoku(board));

        for(int row = 0; row<9; row++) {
            for(int col = 0; col<9; col++) {
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }

     */
}
