/**
 * This Class defines the info in each Node as well as the operations to the list and Node
 **/

public class Node
{
  // initializes the names that will b included in lists
  int number;
 // intializes the next node
  Node next;
 //initializes the prev node
  Node prev;
 
 
 //Consturctor to input a new name 
 public Node(int number, Node n, Node p)
 {
   next = n;
   this.number = number;
   prev = p;
 }
 /**
  * Constructor to just input the string
  */ 
 Node(int n)
 {
   this(n, null, null);
 }
 /**
  * Retrieves the Node that the current node points to
  */ 
 public Node getNext()
 {
   return next;
 }
 
 public Node getPrev()
 {
   return prev;
 }
 
 public int getNumber()
 {
   return number;
 }
 
 
 public void setNext(Node node)
 {
   this.next = node;
 }
 
 public void setPrev(Node node)
 {
   this.prev = node;
 }
 
 public void setName(int number)
 {
   this.number = number;
   
 }
 
 
 }
  
                       
