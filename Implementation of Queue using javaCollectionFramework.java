import java.util.*;
public class QueueUsingJavaCollectionFramework{
    
    public static void main (String[]args){
        
        // NOTE:- QUEUE IS A INTERFACE NOT OBJECT , WE CAN ONLY MAKE OBJECTS FROM CLASSES NOT FROM INTERFACES
                //   queue interface se object ArrayDeque and LinkedList in do methods se bana sakate hai 
        
        // Queue<Integer>q=new LinkedList<>(); // here we can use anyone of them either LinkedList or ArrayDeque 
        Queue<Integer>q=new ArrayDeque<>();    // for storing integer we have to use <Integer> ,for character Use <Character> , for boolean use <Boolean>

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
