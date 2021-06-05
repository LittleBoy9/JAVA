class Prob_1109{
   int n;
   int bookings[][];
   int output[];
   Prob_1109(int n, int bookings[][]){
      this.n = n;
      this.bookings = bookings;
      output = new int[n];
      for(int i=0;i<n;i++){
         output[i]=0;
      }
      show(output);
   }
   void show(int arr[]){
      for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
      }
      System.out.println();
   }
   int[] cal(){
      for (int i=0;i<bookings.length;i++) {
         int first = bookings[i][0];
         System.out.println(first);
         output[first-1] = output[first-1]+bookings[i][2];
         for (int j=first+1;j<=bookings[i][1];j++) {
            output[j-1] = output[j-1]+bookings[i][2];
         }
         System.out.println("output array");
         show(output);
         System.out.print("-------------");
      }
      return output;
   }
   public static void main(String[] args) {
      int n=5;
      int bookings[][] = {{1,2,10},{2,3,20},{2,5,25}};
      Prob_ obj = new Prob_1109(n, bookings);
      int output[] = obj.cal();
      for(int i=0;i<output.length;i++){
         System.out.print(output[i]+" ");
      }
   }
}
