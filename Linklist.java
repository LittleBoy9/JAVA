import java.util.*;
interface methods{
    void addNode(int data);
    void delete();
    void show();
}
public class Linklist implements methods{
    class Node{
        int data;
        Node link;
        Node(int data){
            this.data = data;
            this.link = null;
        }
    }
        
    public Node head = null;
    
    public void addNode(int data){
        Node newNode = new Node(data); 
        try{
            if(head != null){
                Node current = head;
                while(current.link != null){
                    current = current.link;
                }
                current.link = newNode;
            }else{
                head = newNode;
            }
        }catch(Exception exp){
            System.out.println("Failed To Insert, Some Problem Occured !!");
        }    
    }
    public void delete(){
        try{
            if(head.link == null){
                head = null;
            }else{
                Node current = head;
                Node preCurrent = null;
                while(current.link != null){
                    preCurrent = current;
                    current = current.link;
                }
                preCurrent.link = null;
            }   
        }catch(Exception exp){
            System.out.println("Failed To Delete, Some Problem Occured !!");
        }     
    }
    public void show(){
        Node current = head;
        try{
            if(head == null){
                System.out.print("empty");
                return;
            }
            while(current != null){
                System.out.print(current.data+"  ");
                current = current.link;
            }
            System.out.println();   
        }catch(Exception exp){
            System.out.println("Failrd To Show, Some Problem Occured !!");
        }
        
    
    }
    public static void main(String[] args){
        Linklist list = new Linklist();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n------------------");
            System.out.println("Choose your option ->:"
                            +"\n1. Insert At The End"
                            +"\n2. Delete From End"
                            +"\n3. Show The Linklist"
                            +"\n0. Exit");
            System.out.println("------------------");
            System.out.print("Your Option -> ");
            int option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.print("Enter Val :");
                    int val = sc.nextInt();
                    list.addNode(val);
                    break;
                case 2:
                    list.delete();
                    break;
                case 3:
                    list.show();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong Choice");                 
            }
        }
    }
}
