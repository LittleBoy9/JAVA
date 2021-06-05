// BRUTE FORCE APPROACH //
class Prob_84{
   int cal(int arr[],int n){
      int ans = 0;
      Integer inf = Integer.MAX_VALUE;
      for(int i=0;i<n;i++){
         int min = inf;
         for(int j=i;j<n;j++){
            min = Math.min(arr[j],min);
            int len = j-i+1;
            ans = Math.max(ans,len*min);
         }
      }
      return ans;
   }
   public static void main(String[] args) {
      int arr[] = {2,1,5,6,2,3};
      int n = arr.length;
      Prob_84 obj = new Prob_84();
      System.out.print(obj.cal(arr,n));
   }
}
