/* ******** Addition of two Matrices ********** //
----------- 4-25-2021  || Sounak Das ----------
/----------------------------------------------*/

import java.util.*;
class AddMatrix{
    private int row=0,col=0;
    AddMatrix(int row,int col){
      this.row = row;
      this.col = col;
    }
    int[][] getData(int[][] mat, String name){
      Scanner scn = new Scanner(System.in);
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          System.out.print("Enter Element for "+name+" Matrix at "+i+" x "+j+" Position :");
          mat[i][j] = scn.nextInt();
        }
      }
      return mat;
    }
    void display(int[][] mat,String name){
      System.out.println("Displaying "+name+" Matrix --");
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          System.out.print(mat[i][j]+" ");
        }
        System.out.println();
      }
    }
    int[][] addMatrices(int[][] mat1, int[][] mat2){
      int[][] finalMat = new int[row][col];
      for(int i=0;i<row;i++){
         for(int j=0;j<row;j++){
           finalMat[i][j] = mat1[i][j] + mat2[i][j];
         }
      }
      return finalMat;
    }
    // Driver Code
    public static void main(String[] args){
      try{
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of Rows Of Matrices:");
        int row = scn.nextInt();
        System.out.print("Enter number of Columns Of Matrices:");
        int col = scn.nextInt();


        if(row > 0 && col > 0){
          AddMatrix mx = new AddMatrix(row,col);
          int[][] mat1 = new int[row][col];
          int[][] mat2 = new int[row][col];
          mat1 = mx.getData(mat1, "First");
          mx.display(mat1, "First");
          mat2 = mx.getData(mat2, "Second");
          mx.display(mat2, "Second");
          mx.display(mx.addMatrices(mat1, mat2)," Final Added Matrix");
        }else{
          System.out.println("Please Enter Valid Row And Columns !");
        }
      }catch(Exception exp){
        System.out.println(exp.toString());
      }
    }
}
