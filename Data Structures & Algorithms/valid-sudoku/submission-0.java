class Solution {
    public boolean isValidSudoku(char[][] board) {
               ArrayList<HashSet<Integer>> rows = new ArrayList<>();
        ArrayList<HashSet<Integer>> columns = new ArrayList<>();
        HashSet<Integer>[][] subGrids = new HashSet[3][3];
        for (int i = 0; i < 9 ; i++){
            rows.add(new HashSet<>());
            columns.add(new HashSet<>());
        }
        for (int i = 0;  i < 3; i++){
            for (int j = 0; j < 3; j++){
                subGrids[i][j] = new HashSet<>();
            }
        }
        for (int r = 0; r < 9; r++){
            for(int c = 0; c < 9 ; c++){
                char num =  board[r][c];
                if (num == '.'){continue;}
                if (rows.get(r).contains(((int) num))){return false;}
                if (columns.get(c).contains(((int) num))){return false;}
                if (subGrids[r / 3][c / 3].contains((int) num)){return false;}
                rows.get(r).add((int) num);
                columns.get(c).add((int) num);
                subGrids[r/3][c/3].add((int) num);
            }

        }

        return true;
    }
}
