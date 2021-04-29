/* ******** Rotate a matrix by 90 degree in Clockwise ********** //
----------- 4-27-2021  || Sounak Das ----------
/----------------------------------------------*/

class RotateMat{
  private int[][] mat = {{1,3,9,8},{5,6,1,4},{9,1,3,5},{8,6,2,7}};

  private void transpose(){
    for(int i=0;i<mat.length;i++){
      for(int j=i;j<mat[0].length;j++){
         int temp = mat[i][j];
         mat[i][j] = mat[j][i];
         mat[j][i] = temp;
      }
    }
  }
  private void rotate(){
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
  }
  private void display(){
    for(int i=0;i<mat.length;i++){
      for(int j=0;j<mat[0].length;j++){
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    RotateMat rt = new RotateMat();
    System.out.println("---------------------");
    System.out.println("-- Original Matrix --");
    System.out.println("---------------------");
    rt.display();
    rt.transpose();
    System.out.println("---------------------------------");
    System.out.println("90 degree Clockwise Rotate Matrix");
    System.out.println("---------------------------------");
    rt.rotate();
    rt.display();
  }
}
