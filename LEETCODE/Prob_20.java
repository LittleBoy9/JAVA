/*
   ( ) = 0;
   { } = 1;
   [ ] = 2;
*/
import java.util.*;
class Prob_20{
   private boolean hasEvenLength(int l){
      if(l % 2 == 0){
         return true;  // String has even length
      }
      return false;
   }
   private boolean isOpen(char c){
      if(c == '(' || c == '{' || c == '['){
         return true;  // it is an open bracket
      }
      return false;
   }
   private int getBracketNum(char c){
      if(c == '(' || c == ')'){
         return 0;
      }
      else if(c == '{' || c == '}'){
         return 1;
      }
      else if(c == '[' || c == ']'){
         return 2;
      }
      return -1;
   }
   private boolean cal(String str){
      if(str.length() > 0 && hasEvenLength(str.length())){
         if(isOpen(str.charAt(0))){

            Stack<Integer> s = new Stack<>();
            s.push(getBracketNum(str.charAt(0)));

            for(int i=1;i<str.length();i++){
               char c = str.charAt(i);

               if(!isOpen(c) && !s.isEmpty()){
                  if(s.peek() != getBracketNum(str.charAt(i))){
                     return false;
                  }
                  else{
                     s.pop();
                  }
               }
               else if(!isOpen(c) && s.isEmpty()){
                  return false;
               }
               else{
                  s.push(getBracketNum(str.charAt(i)));
               }
            }
            if(s.isEmpty()){
               return true;
            }
            else{
               return false;
            }
         }
         else{
            return false;
         }
      }
      else{
         return false;
      }
   }
   public static void main(String[] args) {
      Prob_20 obj = new Prob_20();
      String str = "()))";
      boolean dicision = obj.cal(str);
      System.out.println(dicision);
   }
}
