class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        for (int i = 0; i < 9; i++) {
                rows[i] =  new HashSet<>();
                columns[i] =  new HashSet<>();
                boxes[i] =  new HashSet<>();
        }
        for (int r = 0; r < 9; r++) {
                        for (int c = 0; c < 9; c++) {
                            char val = board[r][c];
                            if (val == '.') continue;
                            if (rows[r].contains(val) || columns[c].contains(val) || boxes[(r/3)*3+(c/3)].contains(val)) {
                                return false;
                    }
                        columns[c].add(val);
                        rows[r].add(val);
                        boxes[(r/3)*3+(c/3)].add(val);
                    }
    }
    return true;
    }
}