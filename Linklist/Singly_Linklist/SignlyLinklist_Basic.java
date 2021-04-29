/* ******** Basic Operation On Singly Linklist ********** //
----------- 4-18-2021  || Sounak Das ----------
/----------------------------------------------*/

import java.util.*;

class SignlyLinklist_Basic{
  Scanner sc = new Scanner(System.in);
  class Node{
    int data;
    Node link;
    Node(int data){
      this.data = data;
      this.link = null;
    }
  }
  private Node head = null;
  private Node tail = null;

  private int getNodeData(){
    System.out.print("Enter Node Data :");
    return(sc.nextInt());
  }
  private void addNodeAtBegin(){
    Node newNode = new Node(getNodeData());
    if(head != null){
      newNode.link = head;
      head =newNode;
    }else{
      head = newNode;
      tail = newNode;
    }
  }
  private void addNodeAtEnd(){
    Node newNode = new Node(getNodeData());
    if(head == null){
      head = newNode;
      tail = newNode;
    }else{
      tail.link = newNode;
      tail = newNode;
    }
  }
  private void deleteNodeAtBegin(){
    if(head != null){
      head = head.link;
    }else{
      System.out.print("No node found for deletion !");
    }
  }
  private void deleteNodeAtEnd(){
    if(head != null || head.link == null){
      Node current = head;
      while(current.link != tail){
        current = current.link;
      }
      current.link = null;
      current = tail;
    }else{
      head = null;
      System.out.print("No node found for deletion !");
    }
  }
  private void display(){
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
  public static void main(String[] args){
    SignlyLinklist_Basic sl = new SignlyLinklist_Basic();
    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("\n------------------");
        System.out.println("Choose your option ->:"
                        +"\n1. Insert At The End"
                        +"\n2. Delete From End"
                        +"\n3. Insert At The Begin"
                        +"\n4. Delete From Begin"
                        +"\n5. Show The Linklist"
                        +"\n0. Exit");
        System.out.println("------------------");
        System.out.print("Your Option -> ");
        int option = sc.nextInt();
        switch(option){
          case 1: sl.addNodeAtEnd();
            break;
          case 2: sl.deleteNodeAtEnd();
            break;
          case 3: sl.addNodeAtBegin();
            break;
          case 4: sl.deleteNodeAtBegin();
            break;
          case 5: sl.display();
            break;
          case 0:
            return;
          default:
            System.out.println("Wrong Choice");  ;
        }
    }
  }
}
