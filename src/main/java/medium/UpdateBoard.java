package medium;

/**
 * @author takaibun
 */
public class UpdateBoard {
    public char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0];
        int y = click[1];
        if (board[x][y] == 'M') {
            board[x][y] = 'X';
        }
        if (board[x][y] == 'E') {
            uncover(board, x, y);
        }
        return board;
    }

    private void uncover(char[][] board, int x, int y) {
        if (board[x][y] != 'E') {
            return;
        }
        int mines_count = withMines(board, x, y);
        if (mines_count > 0) {
            board[x][y] = (char) (mines_count + '0');
            return;
        }
        board[x][y] = 'B';
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (x + i < 0 || x + i >= board.length || y + j < 0 || y + j >= board[0].length) {
                    continue;
                }
                uncover(board, x + i, y + j);
            }
        }
    }

    private int withMines(char[][] board, int x, int y) {
        int count = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (x + i < 0 || x + i >= board.length || y + j < 0 || y + j >= board[0].length) {
                    continue;
                }
                if (board[x + i][y + j] == 'M') {
                    count++;
                }
            }
        }
        return count;
    }
}
