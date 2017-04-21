import java.util.Random;
/**
 * List Class to make methods to operate on the doubly linked list
 */ 
public class List
{
  // intializes the Node head
   private Node head;
 // initalizes the Node tail
 private Node tail;
 
 /** constructor for list class
   */ 
 public List()
   
 {
   head = null;
   tail = null;
 }
 
 public List(Node head, Node tail)
 {
   
 }
 /**
  * Adds a new node to the head of the list
  * @param the new String that is a assigned to the node
  * @return void
  */ 
 public void addNode(int n)
 {
   if(isEmpty())
   {
     tail = new Node(n);
     head = tail;
   }
   else
   {
     
     tail.next = new Node(n, null, tail);
     tail = tail.next;
   }
   
 }
 
 public void addRandom()
 {
   Random rand = new Random();
    
     if(isEmpty())
   {
     tail = new Node(rand.nextInt(100));
     head = tail;
   }
   else
   {
     tail.next = new Node(rand.nextInt(100), null, tail);
     tail = tail.next;
   }
 }
 
 public int size() {
   int size = 0;
   for(Node n = head; n.next != null; n = n.next)
       size++;     
   return size;
}
 
/** public void sortRandom()
 {
   
     for(int i =1; i< size(); i++)
        for(int j = i; j>0; j--)
        if(head.getNumber() < input[j-1])
      { 
       int tmp = input[j];
           input[j]= input[j-1];
           input[j-1]=tmp;
      }
        
        
        return input;
     
 }**/
 
 public void bubbleSort()
{
  for (int i = 0; i < size(); i++)
  {
    for (int j = i; j < size(); j++)
    {
       if (elementAt(j).getNumber() < (elementAt(j+1).getNumber()))
       {
         Node temp = elementAt(j);
         elementAt(j) = elementAt(j-1);
         elementAt(j-1) = temp;
        // switch j with j-1  
       }
    }
  }
}
 

 
 public Node elementAt(int index)
{
   Node temp = head;

   for (int i = 0; i < index; i++)
   {
      temp = temp.getNext();
   }

   return temp;
}
 
 
 
   /**
    * Finds a node with a given String input
    * @param the name of the Node
    * @return void
    */ 
    public void findNode(int number){
        Node currentNode = head;
        while(currentNode.getNumber()!= number)
        {
            currentNode = currentNode.getNext();
            if(currentNode == null)
                System.out.println("Node not Found");
        }
        System.out.println("Node has been found!");
    }

   
   
 
 /**
  * Deletes a Node
  * @param - input of node to be deleted
  * @return boolean wether it has been deleted or not
  */ 
 public boolean deleteNode(int element)
 {
   if(isEmpty())
     return false;
   
   Node target = head;
   while(target != null && (element != target.getNumber()))
     target = target.next;
   
   if(target == null)
     return false;
   
   Node pred = target.prev;
   Node succ = target.next;
   
   if(pred == null)
     head = succ;
   else
     pred.next = succ;
   if(succ == null)
     tail = pred;
   else
     succ.prev = pred;
   return true;
 }
 /** prints the list forward
   */ 
  public  void iterateForward(){
      
     if (this.isEmpty()) {
      System.out.println("List is empty.");
    }
    else {
      Node tmp = this.head;
      while (tmp != null) {
        System.out.println(tmp.getNumber());
        tmp = tmp.getNext();
      }
      System.out.println("");
    }
  }
    /**
     * prints the list backward
     */ 
   public void iterateBackward()
   {
     if(this.isEmpty())
     {
       System.out.println("list is empty.");
     }
     else
     {
       Node tmp = this.tail;
       while(tmp!= null)
       {
         System.out.print(tmp);
         tmp = tmp.getPrev();
         System.out.println("");
       }
       System.out.println("");
     }
   }
  
        
    
   
 
   
 
 /**
  * Deletes the list
  */ 
 public void deleteList()
 {
   head = null;
   
 }
 /**
  * Checks if the list is empty
  */ 
 public boolean isEmpty()
 {
   return head == null;
 }
 
 
  
}