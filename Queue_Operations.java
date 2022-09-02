public class QueueImplementation{
    
    static class Queue{
        static int[]arr;
        static int size;
        static int rear=-1;
      
 // note : for accessing above variable any where in program we have used static keyword       
        
    Queue(int n){
        arr = new int[n]; // here we have assign the size of an array 
        this.size = n;    // for making new variable which'll contain size of arr we have used this.size  method 
    }
        
        
    // first we'll check whether our queue is empty or not for that we have to make one method 
  
    
    public static boolean isEmpty(){
        return rear==-1;
    }
    
    
    
    
    // for inserting element in queue we'll make another method 
    
    public static void add(int data){
        if(rear==size-1){            // before inserting first we have to check whether our queue is full or not 
            System.out.println("Queue is Full");
            return ;
            
        }
            rear++;
            arr[rear]=data;
        }
    
    
    //for removing the element from queue we have to make another method
    
    public static int remove(){
        
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        
        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        
        rear--;
        return front;
    }
    
    
    
    
    //for peek function also we have to make one method 
    
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[0];
      }
      
    }
    
    
    
    
    public static void main(String[]args){
     
     Queue q=new Queue(4);
     q.add(2);
     q.add(3);
     q.add(5);
     while(!q.isEmpty()){
         System.out.println(q.peek());
         q.remove();
      }  
   
    }
    
}
