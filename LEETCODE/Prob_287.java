class Prob_287{
   int cal(int arr[], int len){
      int normalTotal = ((len-1)*(len))/2;
      System.out.println("Normal Total :"+normalTotal);

      int givenArrayTotal = 0;
      for(int i=0;i<len;i++) {
         givenArrayTotal += arr[i];
      }
      return givenArrayTotal - normalTotal;
   }
   public static void main(String[] args) {
      int arr[] = {1,3,4,2,2};
      Prob_287 obj = new Prob_287();
      System.out.print(obj.cal(arr, arr.length));
   }
}
