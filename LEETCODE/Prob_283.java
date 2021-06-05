class Prob_283{
   int arr[], temp;
   public Prob_283(int arr[]){
      this.arr = arr;
   }
   void sol(){
      for(int i=0;i<arr.length;i++){
         if(arr[i] == 0){
            temp = arr[i];
            int j;
            for(j=i;j<arr.length-1;j++){
               arr[j] = arr[j+1];
            }
            arr[j] = temp;
         }
      }
   }
   void show(){
      for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+"  ");
      }
   }

   public static void main(String[] args) {
      //int arr[] = {1, 2, 0, 4, 0, 1, 3, 0};
      int arr[] = {0,0,1};
      Prob_283 obj = new Prob_283(arr);
      obj.sol();
      obj.show();
   }
}
