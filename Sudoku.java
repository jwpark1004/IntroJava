public class Sudoku
{
   
   private int[][] puzzle;
   
   public Sudoku(String p)
   {
      puzzle = new int[9][9];
      for (int row = 0; row < 9; row++)
      {
         for (int col = 0; col < 9; col++)
         {
            char x = p.charAt (row * 9 + col);
            if (x == '.')
            {
               puzzle[row][col] = 0;
            }
            else
            {
               puzzle[row][col] = Integer.parseInt(x + "");
            }
         }
      }          
   }
   
   private void makeMove(int r, int c, int n)
   {
      if(validMove(puzzle, r, c, n))
         puzzle[r][c] = n;
   }
   
   private void resetPuzzle()
   {
      for (int row = 0; row < 9; row++)
      {
         for (int col = 0; col <9; col++)
         {
         puzzle[row][col] = 0;
         }
      }
   }
   
   private boolean isSolved(int[][] p)
   {
      //returns true if p is solved
      //returns false is p is not solved
      
      for (int row = 0; row < 9; row++)
      {
         int sum = 0;
         for (int col = 0; col < 9; col++)
         {
            sum += p[row][col];
         }
         if (sum != 45)
         {
            return false;
         }
         
      }
      for (int col = 0; col < 9; col++)
      {
         int sum = 0;
         for (int row = 0; row < 9; row++)
         {
            sum += p[row][col];                          
         }
         if (sum != 45)
         {
            return false;
         }
      }
      
      return true;
   }
   
   private boolean validMove(int[][] p, int r, int c, int n)
   {
      //return true if you can place n in index (r, c) in puzzle: p
      for (int row = 0; row <9; row++)
      {
         if (p[row][c] == n)
         {
            return false;
         }
      }
      for (int col = 0; col < 9; col++)
      {
         if (p[r][col] == n)
         {
            return false;
         }
      }
      return true;
   }
   
   private boolean isContinuable(int[][] p)
   {
      //can the player continue playing this puzzle?
      for (int row = 0; row < 9; row++)
      {
         for (int col = 0; col < 9; col++)
         {
            if (p[row][col] != 0)
            {
               for (int c = col; c < 9; c++)
               {
                  if (c != col && p[row][c] == p[row][col])
                  {
                     return false;
                  }
               }
            }
         }
      }
      for (int col = 0; col <9; col++)
      {
         for (int row = 0; row <9; row++)
         {
            if (p[row][col] != 0)
            {
               for (int r = row; r <9; r++)
               {
                  if (r != row && p[r][col] == p[row][col])
                  {
                     return false;
                  }
               }
            }
         }
      }
      
      return true;
   }
   
}