/* { 1, 0, 2, 2, 1, 0, 1, 1, 1, 2, 0}
   --------------- to ---------------
   { 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2}
*/
class Dutch_National_Flag_Algo{
   int arr[];
   Dutch_National_Flag_Algo(int arr[]){
      this.arr = arr;
   }
   void swap(int pos1, int pos2){
      int temp = arr[pos1];
      arr[pos1] = arr[pos2];
      arr[pos2] = temp;
   }
   void solution(){
      int lower = 0;
      int mid = 0;
      int upper = arr.length - 1;
      while(mid <= upper){
         if(arr[mid] == 0){
            this.swap(lower, mid);
            /*int temp = arr[lower];
            arr[lower] = arr[mid];
            arr[mid] = temp;*/
            lower++;
            mid++;
         }
         else if(arr[mid] == 1){
            mid++;
         }
         else if(arr[mid] == 2){
            this.swap(mid, upper);
            /*int temp = arr[mid];
            arr[mid] = arr[upper];
            arr[upper] = temp;*/
            upper--;
         }
      }
      System.out.println("after");
      for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+"  ");
      }
   }
   public static void main(String[] args) {
      int arr[] = {1,0,2,2,1,0,1,1,1,2,0};
      Dutch_National_Flag_Algo obj = new Dutch_National_Flag_Algo(arr);
      obj.solution();
   }
}
