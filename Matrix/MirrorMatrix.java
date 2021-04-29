/* ******** Mirror of a Matrix  ********** //
----------- 4-27-2021  || Sounak Das ----------
/----------------------------------------------*/

class MirrorMatrix{
  private int[][] makeMirror(int[][] mat){
    for(int i=0;i<mat.length;i++){
      int lcol=0;
      int rcol=mat[i].length - 1;
      while(lcol < rcol){
        int temp = mat[i][lcol];
        mat[i][lcol] = mat[i][rcol];
        mat[i][rcol] = temp;
        lcol++;
        rcol--;
      }
    }
    return  mat;
  }
  private void display(int[][] mat){
    for(int i=0;i<mat.length;i++){
      for(int j=0;j<mat[0].length;j++){
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]){
      int[][] mat = {{2,3,6,8},{5,6,1,4},{3,7,3,5},{4,6,3,7}};
      MirrorMatrix mx = new MirrorMatrix();
      mx.display(mx.makeMirror(mat));
  }
}
