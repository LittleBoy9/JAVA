/* ******** Print the matrix in Spiral Form ********** //
----------- 4-28-2021  || Sounak Das ----------
/----------------------------------------------*/

import java.util.*;
class SpiralMatrix{
  private int row, col, mat[][];
  SpiralMatrix(int row,int col){
    this.row = row;
    this.col = col;
    mat = new int[this.row][this.col];
  }
  void getData(){
    System.out.println("Enter the elements of the matrix :");
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        System.out.print("Enter the element at "+i+" x "+j+" position :");
        mat[i][j] = sc.nextInt();
      }
    }
  }
  void display(){
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        System.out.print(mat[i][j]+"  ");
      }
      System.out.println();
    }
  }
  void spiralMatrix(){
    System.out.println("Spiral form of the matrix :");
    int rowStart = 0, rowLength = mat.length - 1, colStart = 0 , colLength = mat[0].length - 1;
    while(rowStart <= rowLength && colStart <= colLength){
      for(int i=rowStart; i<=colLength; i++){
        System.out.print(mat[rowStart][i]+" ");
      }
      for(int j=rowStart+1;j<=rowLength;j++){
        System.out.print(mat[j][colLength]+" ");
      }
      for(int k=colLength-1;k>= colStart;k--){
        System.out.print(mat[rowLength][k]+" ");
      }
      for(int m=rowLength-1; m>rowStart;m--){
        System.out.print(mat[m][colStart]+" ");
      }
      rowStart++;
      rowLength--;
      colStart++;
      colLength--;
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of Row of the Matrix :");
    int row = sc.nextInt();
    System.out.print("Enter number of Col of the Matrix :");
    int col = sc.nextInt();
    if(row > 0 && col > 0 ){
      SpiralMatrix mx = new SpiralMatrix(row,col);
      mx.getData();
      System.out.println("Original Matrix :");
      mx.display();
      mx.spiralMatrix();
    }
  }
}
