/* ******** Transpose of a Matrix  ********** //
----------- 4-27-2021  || Sounak Das ----------
/----------------------------------------------*/

class TransposeMatrix{

  /*---------------------------------------------------
  // in this method Original matrix will not be changed
  ---------------------------------------------------*/
  /*private int[][] transpose(){
    int[][] transposeMat = new int[mat.length][mat[0].length];
    for(int i=0;i<mat.length;i++){
      for(int j=0;j<mat[0].length;j++){
        transposeMat[i][j] = mat[j][i];
      }
    }
    return transposeMat;
  }*/

  /*---------------------------------------------------
  // in this method Original matrix will be changed
  ---------------------------------------------------*/
  private int[][] transpose(int[][] mat){
    for(int i=0;i<mat.length;i++){
      for(int j=i;j<mat[0].length;j++){
         int temp = mat[i][j];
         mat[i][j] = mat[j][i];
         mat[j][i] = temp;
      }
    }
    return mat;
  }
  private void display(int[][] mat){
    for(int i=0;i<mat.length;i++){
      for(int j=0;j<mat[0].length;j++){
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    int[][] mat = {{1,3,9,8},{5,6,1,4},{9,1,3,5},{8,6,2,7}};
    TransposeMatrix mx = new TransposeMatrix();
    mx.display(mx.transpose(mat));
  }
}
