class Prob_206{
   class Node{
     int data;
     Node link;
     Node(int data){
       this.data = data;
       this.link = null;
     }
   }
   private Node addNode(Node head,int data){
     Node newNode = new Node(data);
     if(head == null){
       head = newNode;
     }else{
       Node current = head;
       while(current.link != null){
          current = current.link;
       }
       current.link = newNode;
     }
     return head;
   }
   private Node reverse(Node head){
      Node p = null;
      Node c = head;
      Node n = null;
      while(c != null){
         n = c.link;
         c.link = p;
         p = c;
         c = n;
      }
      return p;
   }
   private void disp(Node head){
      Node current = head;
      try{
          if(head == null){
              System.out.print("Linklist is empty");
              return;
          }
          System.out.println("\ndisplaying The Linklist :");
          while(current != null){
              System.out.print(current.data+"  ");
              current = current.link;
          }
          System.out.println();
      }catch(Exception exp){
          System.out.println("Failed To Show, Some Problem Occured !!");
      }
   }
   public static void main(String[] args) {
      Prob_206 obj = new Prob_206();
      Node head = null;
      head = obj.addNode(head,1);
      head = obj.addNode(head,2);
      head = obj.addNode(head,3);
      head = obj.addNode(head,4);
      head = obj.addNode(head,5);
      obj.disp(head);
      head = obj.reverse(head);
      obj.disp(head);
   }
}
