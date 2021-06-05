/*****************************************************
--------------- kadane's Algo ------------------------
--------- "Largest Sum Continuous Subarray" ----------
------------ Sounak Das || 12/5/2021 -----------------
*****************************************************/
class Kadane_Algo{
   int kadaneAlgo(int arr[]){
      int maxSum = 0;
      int cSum = 0;
      for(int i=0; i<arr.length; i++){
         cSum += arr[i];
         if(cSum > maxSum){
            maxSum = cSum;
         }
         if(cSum < 0){
            cSum = 0;
         }
      }
      return maxSum;
   }
   public static void main(String[] args){
      Kadane_Algo kn = new Kadane_Algo();
      int arr[] = {4, -3, 6, 3, -2, 5};
      System.out.print("Max Sum SubArray -> "+kn.kadaneAlgo(arr));
   }
}
