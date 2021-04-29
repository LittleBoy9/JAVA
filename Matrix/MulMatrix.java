/********* Multiplication of two Matrices ********** //
----------- 4-26-2021  || Sounak Das ----------
/----------------------------------------------*/

import java.util.*;

class MulMatrix{
  private int row1,col1,row2,col2;
  MulMatrix(int row1,int col1,int row2, int col2){
    this.row1 = row1;
    this.col1 = col1;
    this.row2 = row2;
    this.col2 = col2;
  }
  int[][] getData(int[][] mat,int row, int col, String name){
    Scanner scn = new Scanner(System.in);
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        System.out.print("Enter Element for "+name+" Matrix at "+i+" x "+j+" Position :");
        mat[i][j] = scn.nextInt();
      }
    }
    return mat;
  }
  void display(int[][] mat, int row, int col, String name){
    System.out.println("Displaying "+name+" Matrix --");
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
  }
  int[][] mulMatrices(int[][] mat1, int[][] mat2){
    int[][] finalMat = new int[row1][col2];
    for(int i=0;i<row1;i++){
       for(int j=0;j<col2;j++){
         for(int k=0;k<row2;k++){
           finalMat[i][j] += mat1[i][k] * mat2[k][j];
         }
       }
    }
    return finalMat;
  }

  // Driver Code
  public static void main(String[] args){
    try{
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter number of Rows Of First Matrix:");
      int row1 = scn.nextInt();
      System.out.print("Enter number of Columns Of First Matrix:");
      int col1 = scn.nextInt();
      System.out.print("Enter number of Rows Of Second Matrix:");
      int row2 = scn.nextInt();
      System.out.print("Enter number of Columns Of Second Matrix:");
      int col2 = scn.nextInt();

      if(row1 > 0 && col1 > 0 && row2 > 0 && col2 > 0){
        if(col1 == row2 && col2 == row1){
          MulMatrix mx = new MulMatrix(row1,col1,row2,col2);
          int[][] mat1 = new int[row1][col1];
          int[][] mat2 = new int[row2][col2];
          mat1 = mx.getData(mat1, row1, col1, "First");
          mx.display(mat1, row1, col1, "First");
          mat2 = mx.getData(mat2, row2, col2, "Second");
          mx.display(mat2, row2, col2, "Second");
          mx.display(mx.mulMatrices(mat1, mat2),row1,col2," Final Multiplied Matrix ");
        }else{
          System.out.println("Wrong Inputs !! ");
        }
      }else{
        System.out.println("Please Enter Valid Row And Columns !");
      }
    }catch(Exception exp){
      System.out.println(exp.toString());
    }
  }
}
