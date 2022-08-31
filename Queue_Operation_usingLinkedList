public class QueueImplementationusingLinekedList{
    
    // first we'll create Node for Queue 
    static class Node{
        int data;
        Node next;
        
        Node (int data){
            this.data=data;
            next=null;   // here we assign null value to next variable which is created in Node class
        }
    }
    
    static class Queue{
        static Node head = null;
        static Node tail = null; 
    
    
         // this is   isEmpty() method check whether queue is empty or not
    
    public static boolean isEmpty(){
        return head==null & tail==null;
        
    }
    
    // NOTE :- we don't need to create a isFull() method because Linked list is variable datatype , variable datatype size is equal to memory of program
    // public static boolean isFull(){
    //     // NO NEED TO CREATE isFull() METHOD 
    // }
    
    
    // enqueue method , this will add elements in queue
    
    public static void add(int data){
        Node newNode=new Node(data);   // with the help of Node class we have created a object newNode 
        
        // when tail is null then both head and tail will be assign to newNode
        if(tail==null){
            head=tail=newNode;
            return;
        }
        
        tail.next=newNode;    // here we created newNode just after the tail node 
        tail=newNode;         // now here we make newNode our new tail
    }
    
    
    
    // dequeue method , this will remove the elements from the queue
     
     public static int remove(){
         if(isEmpty()){
             System.out.println("Queue is Empty");
             return -1;
         }
         
         int front =head.data;  // here we remove the head data from the front 
      // NOTE:- if node will become empty then tail will be null
      
      if(head==tail){
          tail=null;
      }
      
         head=head.next;
         return front;
         
     }
    
    
    // peek() method , this will just peek the front/ head elements
    
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return head.data;
      }
   
    }
    // this is our main class 
    
    public static void main(String[]args){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
    }
