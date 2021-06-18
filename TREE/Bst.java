import java.util.*;
class Bst{
   static class Node{
      int data;
      Node left,right;
      Node(int data){
         this.data = data;
         this.left = null;
         this.right = null;
      }
   }
   public Node insert(Node root){
      Scanner sc1 = new Scanner(System.in);
      System.out.print("enter data :");
      int newData = sc1.nextInt();
      Node newNode = new Node(newData);
      if(root == null){
         root = newNode;
      }
      else{
         Node current = root;
         Node previous = null;
         while(current != null){
            if(newData < current.data){
               previous = current;
               current = current.left;
            }
            else if(newData > current.data){
               previous = current;
               current = current.right;
            }
            else{
               System.out.println("Insertion not possible...");
               break;
            }
         }
         if(newData < previous.data){
            previous.left = newNode;
         }else {
            previous.right = newNode;
         }
      }
      return root;
   }
   public void inOrder(Node root){
      if(root != null){
         inOrder(root.left);
         System.out.print(root.data+"  ");
         inOrder(root.right);
      }
   }
   public void preOrder(Node root){
      if(root != null){
         System.out.print(root.data+"  ");
         preOrder(root.left);
         preOrder(root.right);
      }
   }
   public void postOrder(Node root){
      if(root != null){
         postOrder(root.left);
         postOrder(root.right);
         System.out.print(root.data+"  ");
      }
   }
   public static void main(String[] args) {
      Bst obj = new Bst();
      Scanner sc = new Scanner(System.in);
      int option;
      Node root = null;
      System.out.print("1. Insert Data"
                      +"\n2. InOrder Traversal "
                      +"\n3. PreOrder Traversal "
                      +"\n4. PostOrder Traversal ");
      while(true){
         System.out.print("\nChoose your option ->:");
         option = sc.nextInt();
         switch(option){
            case 1:
               root = obj.insert(root);
               break;
            case 2:
               System.out.println("InOrder Traversal ----");
               obj.inOrder(root);
               break;
            case 3:
               System.out.println("PreOrder Traversal ----");
               obj.preOrder(root);
               break;
            case 4:
               System.out.println("PostOrder Traversal ----");
               obj.postOrder(root);
               break;
            default:
               return;
         }
      }
   }
}
