// Given an incomplete Sudoku in the form of matrix mat[][] of order 9*9, the task is to solve the Sudoku.
//  It is guaranteed that the input Sudoku will have exactly one solution.

// A sudoku solution must satisfy all of the following rules:

// Each of the digits 1-9 must occur exactly once in each row.
// Each of the digits 1-9 must occur exactly once in each column.
// Each of the digits 1-9 must occur exactly once in each of the 9, 3x3 sub-boxes of the grid.
// Note: Zeros represent blanks to be filled with numbers 1-9, 
//         while non-zero cells are fixed and cannot be changed.

    public void solveSudoku(int[][] mat) {
        int N=mat.length;
        isSolve(mat,N);
    }
    public static boolean isSolve(int[][] mat,int N)
    {
        int i=-1;
        int j=-1;
        boolean found=false;
        for( i=0;i<N;i++)
        {
            for( j=0;j<N;j++)
            {
                if(mat[i][j]==0)
                {
                    found=true;
                    break;
                }
            }
            if(found)
            {
                break;
            }
        }
        if(!found)
        {
            return true;
        }
        for(int k=1;k<=N;k++)
        {
            if(isSafe(mat,i,j,k,N))
            {
                mat[i][j]=k;
                if(isSolve(mat,N))
                {
                    return true;
                }
                mat[i][j]=0;
            }
        }
        return false;
    }
    static boolean isSafe(int mat[][],int i,int j,int k,int N)
    {
        for(int x=0;x<N;x++)
        {
            if(mat[i][x]==k || mat[x][j]==k)
            {
                return false;
            }
        }
        int s=(int)Math.sqrt(N);
        int rs=i-i%s;
        int cs=j-j%s;
        for(int a=0;a<s;a++)
        {
            for(int b=0;b<s;b++)
            {
                if(mat[a+rs][b+cs]==k)
                {
                    return false;
                }
            }
        }
        return true;
    }

// Time Complexity :O(N^(N*N));
// Space Complexity:(O(N))