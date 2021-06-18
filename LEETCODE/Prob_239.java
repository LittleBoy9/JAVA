import java.util.*;
class Prob_239{
   /*void cal(int arr[], int k){
      int len = arr.length;
      int loop = len - k;
      if(len > k){
         ArrayList<Integer> result = new ArrayList<>();
         for(int i=0;i<=loop;i++){
            int max = arr[i];
            for(int p = i;p<(i+k);p++){
               if(arr[p] > max){
                  max = arr[p];
               }
            }
            //System.out.println(max);
            result.add(max);
         }
         for(int m=0;m<result.size();m++){
            System.out.print(result.get(m)+"    ");
         }
      }
   }*/

   public int[] maxSlidingWindow(int[] arr, int k) {
      int len = arr.length;
      int loop = len - k;
      int newArr[] = new int[loop+1];
      int max;
      if(len > k){
         for(int i=0;i<=loop;i++){
            max = arr[i];
            for(int p = i;p<(i+k);p++){
               if(arr[p] > max){
                 max = arr[p];
               }
            }
            newArr[i] = max;
         }
      }
      else{
         max = arr[0];
         for(int i=1;i<len;i++){
            if(arr[i]>max){
               max = arr[i];
            }
         }
         newArr[0] = max;
      }
      return newArr;
   }

   public static void main(String[] args) {
      int arr[] = {1};
      Prob_239 obj = new Prob_239();
      int k =1;
   //   obj.cal(arr,k);
      int ans[] = obj.maxSlidingWindow(arr,k);
      for(int i = 0;i<ans.length;i++){
         System.out.print(ans[i]+"  ");
      }
   }
}
