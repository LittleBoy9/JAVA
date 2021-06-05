import java.util.*;
class Prob_1823{
   int n,k;
   Prob_1823(int n,int k){
      this.n = n;
      this.k = k;
   }
   int cal(){
      Queue<Integer> queue =  new LinkedList<>();
      for(int i=1;i<=n;i++){
         queue.offer(i);
      }
      while(queue.size() != 1){
         for(int j=1;j<=k-1;j++){
            queue.offer(queue.poll());
         }
         queue.poll();
      }
      return queue.poll();
   }

   public static void main(String[] args) {
      int n=5;
      int k=2;
      Prob_1823 obj = new Prob_1823(n,k);
      System.out.println(obj.cal());
   }
}
