import java.util.*;
class Prob_328{
   class Node{
      int data;
      Node link;
      Node(int data){
         this.data = data;
         link = null;
      }
   }
   private Node start = null;
   private void createList(int data){
      Node node = new Node(data);
      if(start == null){
         start =node;
      }
      else{
         Node current = start;
         while(current.link != null){
            current=current.link;
         }
         current.link = node;
      }
   }
   private void show(){
      if(start != null){
         Node current = start;
         while(current != null){
            System.out.print(current.data+"  ");
            current = current.link;
         }
      }
   }
   private boolean isEven(int count){
      return count % 2 == 0 ? true : false;
   }
   private void cal(){
      if(start != null && start.link != null && start.link.link != null){
         Node current = start;
         Node last = null;
         Node end = null;
         while(current.link != null){
            current = current.link;
         }
         last = current;
         end = current;
         current = start;
         Node p = null;
         int count = 1;

         System.out.println("last.data "+last.data);
         System.out.print("end.data "+end.data);

         while(p != last){
            if(isEven(count)){
               p.link = current.link;
               end.link=current;
               end=current;
               p=current;
               current=current.link;
               count = count+1;
            }
            else{
               count = count+1;
               p=current;
               current = current.link;
            }
            System.out.println(end.data);
         }
         end.link = null;
      }
   }

   public static void main(String[] args) {
      Prob_328 obj = new Prob_328();
      Scanner sc = new Scanner(System.in);
      System.out.println("1. createList :"+
                        "\n2. show"+
                        "\n3. cal ");
      int option;
      while(true){
         System.out.print("\nEnter your option :");
         option = sc.nextInt();
         switch(option){
            case 1:
               System.out.print("enter data :");
               int data = sc.nextInt();
               obj.createList(data);
               break;
            case 2:
               System.out.print("showing the linklist :");
               obj.show();
               break;
            case 3:
               obj.cal();
               break;
            default:
               return;
         }
      }
   }
}
