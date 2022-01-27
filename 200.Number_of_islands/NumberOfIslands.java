public class NumberOfIslands {

    public static int countIslandsDFS(char[][] grid, int i, int j) {

        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') return 0;

        grid[i][j] = '0';

        countIslandsDFS(grid, i + 1, j);
        countIslandsDFS(grid, i - 1, j);
        countIslandsDFS(grid, i, j + 1);
        countIslandsDFS(grid, i, j - 1);
        return 1;
    }

    public static int numIslands(char[][] grid) {
        int nIslands = 0;

        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == '1') {
                    nIslands += countIslandsDFS(grid, i, j);
                }
            }
        }

        return nIslands;
    }

    public static void main (String [] args) {
        System.out.println(numIslands(new char[][] { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '0', '0', '0' } }));
    }
}