import java.util.*;
class Prob_155{
   Stack<Integer> s = new Stack<>();
   Stack<Integer> minStack = new Stack<>();
   public Prob_155(){

   }
   public void push(int val){
      if(s.isEmpty()){
         minStack.push(val);
      }
      else{
         if(val < minStack.peek()){
            minStack.push(val);
         }
         else{
            minStack.push(minStack.peek());
         }
      }
      s.push(val);
   }
   public void pop(){
      s.pop();
      minStack.pop();
   }
   public int top(){
      return s.peek();
   }
   public int getMin(){
      return minStack.peek();
   }
   public static void main(String[] args) {
      Prob_155 obj = new Prob_155();
      obj.push(3);
      obj.push(2);
      obj.push(3);
      obj.push(4);
      obj.pop();
      System.out.print(obj.getMin());
   }
}
