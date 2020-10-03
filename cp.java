package manju;
import java.util.*;
//import java.math.*;
public class cp 
{ 
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println(orangesRotting(a));
    }
    public static int orangesRotting(int[][] grid) {
       if(grid == null || grid.length == 0){
           return 0;
       }
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1){
                    freshCount++;
                }
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        if(freshCount == 0){
            return 0;
        }
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        int count = 0;
        while(!queue.isEmpty()){
            count++;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int[] points = queue.poll();
                for(int[] dir : dirs){
                    int x = points[0] + dir[0];
                    int y = points[1] + dir[1];
                    if(x < 0 || y < 0 || x >= row || y >= col || grid[x][y] == 0 || grid[x][y] == 2){
                        continue;
                    }
                    grid[x][y] = 2;
                    queue.offer(new int[]{x,y});
                    freshCount--;
                }
            }
        }
        return freshCount == 0 ? count - 1 : -1;   
    }
}