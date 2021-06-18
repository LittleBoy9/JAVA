import java.util.*;
class JAVA_Stack{
   Stack<Integer> stack = new Stack<>();
   void pushIntoStack(int n){
      stack.push(n);
   }
   void popFromStack(){
      stack.pop();
   }
   void peekOfStack(){
      System.out.println(stack.peek());
   }
   void searchInStack(int element){
      int pos = stack.search(element);
      if(pos != -1){
         System.out.println("element "+element+" found at pos "+pos);
      }else{
         System.out.println("element not found"); // -1
      }
   }
   void printStack(){
      System.out.println(stack);
   }
   public static void main(String[] args) {
      JAVA_Stack obj = new JAVA_Stack();
      obj.pushIntoStack(1);
      obj.pushIntoStack(2);
      obj.pushIntoStack(3);
      obj.pushIntoStack(4);
      obj.printStack();
      //obj.popFromStack();
      //obj.popFromStack();
      //obj.printStack();
      obj.peekOfStack();
      obj.printStack();
      obj.searchInStack(2);

   }
}
