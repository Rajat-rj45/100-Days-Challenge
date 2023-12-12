import java.util.Scanner;
public class linkedlist{
    // globle declaration 
    int size=0;
    Scanner sc=new Scanner(System.in);
   static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     

    Node head=null;
    // insertion operation
        public  void insert() {
            int data;
            int n,choice;
             
           do{
            size++;
            System.out.println("enter the new data");
            data=sc.nextInt();
            Node new_node=new Node(data);
            if(head==null){
                head=new_node;
            }
            else{
                System.out.println("where you want to add new node \nbiging to 1,\nlast to 2, \nparticular location to 3");
                choice=sc.nextInt();
                switch(choice){
                    case 1: {
                        new_node.next=head;
                        head=new_node;
                        break;
                    }
                    case 2: {
                        Node temp=head;
                        while(temp.next!=null){
                            temp=temp.next;
                        }
                        temp.next=new_node;
                        break;
                    }
                    case 3:{
                        System.out.println("enter your position ");
                        int position=sc.nextInt();
                        Node temp=head;
                        for(int i=1;i<position-1;i++){
                           temp=temp.next;
                        }
                        new_node.next=temp.next;
                        temp.next=new_node;
                        break;
                    }

                }
            }
            System.out.println("do you want to add more node press 1");
             n=sc.nextInt();
           }while(n==1);
    
        }

//deletion operation
          public void deletion(){
            size--;
            if(head==null){
                System.out.println("linkedlist is empty please insert the data ");
            }
            else if(head.next==null){
                head=null;
            }
            else {
                System.out.println("enter 1 to delete from begnning\nenter 2 to delete last \nenter 3 to particular location \nenter 4 to delete giving element");
                int choice=sc.nextInt();
                switch(choice){
                    case 1: {
                       Node temp=head;
                       temp=temp.next;
                       head=temp;
                        break;
                    }
                    case 2: {
                        Node temp=head;
                        Node prev=temp.next;
                        while(temp.next!=null){
                            prev=temp;
                            temp=temp.next;
                        }
                        prev.next=null;
                        break;
                    }
                    case 3:{
                        System.out.println("enter your position ");
                        int position=sc.nextInt();
                        Node temp=head;
                        Node ptr=temp.next;   
                        for(int i=1;i<position-1;i++){
                            ptr=temp;
                           temp=temp.next;
                        }
                       temp.next=ptr.next;
                       break;
                    }
                    case 4:{
                        System.out.println("enter deleting element ");
                        int element=sc.nextInt();
                       
                       
                     for(int i=0;i<size;i++){
                        Node temp=head;
                        Node ptr=temp.next;
                        if(head.data==element){
                            temp=temp.next;
                            head=temp;
                            System.out.println(" element deleted");
                            
                           }
                          else {
                              while(ptr!=null){
                               if(element==ptr.data){
                              temp.next=ptr.next;
                              System.out.println(" element deleted");
                              
                               }
                               ptr=ptr.next;
                               temp=temp.next;
                           }
                           }
                     }
                    
                        break;
                    }
                    default:{
                        System.out.println("wrong choise");
                    }

                }
            }
            
            
          }

// display operation
        public void display() {
             Node temp=head;
             if(head==null){
                System.out.println("linkedlist is empty please insert the data");
             }
             else{
                System.out.println("your linkedlist ");
                while( temp!=null){
                    System.out.println(temp.data);
                    temp=temp.next;

                }
             }
        }

// search operation
public int search(){
    Node temp=head;
    int count=0;
    System.out.println("enter the key to search ");
    int key=sc.nextInt();
    if(head==null){
        System.out.println("linkedlist is empty please insert the data ");
        return 0;
    }
    else{
        
        while(temp!=null){
            count++;
            if(temp.data==key){
                System.out.println("found "+"position="+count);
                return 0;
            }
            temp=temp.next;
        }
        System.out.println("not found");
        return 0;
    }
}

//sort operation
public void sort(){
    Node temp=head;
    if(head==null){
        System.out.println("linkedlist is empty please insert the data ");
    }
    else{
        while(temp!=null){
            Node ptr=temp.next;
            while(ptr!=null){
                if(ptr.data<temp.data){
                int tt=temp.data;
                temp.data=ptr.data;
                ptr.data=tt;
                }
              ptr=ptr.next;
            }
            temp=temp.next;
        }
        System.out.println("linkedlist sorted");
    }
    
}

    public static void main(String[] args) {
       linkedlist ll=new linkedlist();
       Scanner rr=new Scanner(System.in);
      int n=1;
      do{
        System.out.println("press 1 to insert data\npress 2 to display data\npress 3 to delete data\npress 4 to search \npress 5 to sorting\npress 6 for exit ");
        int choice=rr.nextInt();
        switch(choice){
         case 1:{
             ll.insert();
             break;
         }
         case 2:{
             ll.display();
             break;
         }
        
         case 3:{
            ll.deletion();
            break;
        }
        case 4:{
            ll.search();
            break;
        }
        case 5:{
            ll.sort();
            break;
        }
        case 6:{
            System.exit(0);
            break;
        }
         default :
         {
             System.out.println("please enter the right choise:");
         }
        }
      }while(n==1);
    }
}
