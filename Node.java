/**
 * This Class defines the info in each Node as well as the operations to the list and Node
 **/

public class Node
{
  // initializes the names that will b included in lists
  String name;
 // intializes the next node
  Node next;
 //initializes the prev node
  Node prev;
 
 
 //Consturctor to input a new name 
 public Node(String name, Node n, Node p)
 {
   next = n;
   this.name = name;
   prev = p;
 }
 /**
  * Constructor to just input the string
  */ 
 Node(String n)
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
 
 public String getName()
 {
   return name;
 }
 
 
 public void setNext(Node node)
 {
   this.next = node;
 }
 
 public void setPrev(Node node)
 {
   this.prev = node;
 }
 
 public void setName(String name)
 {
   this.name = name;
   
 }
 
 public String toString() {
  return " Name : "+this.name;
 }
  
                       
}