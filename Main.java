public class Main
{
  /**
   * Test's for all methods in the List class
   */ 
 public static void main(String args[])
 {
   List newList = new List();
   newList.addNode("Frank");
   newList.addNode("Max");
   newList.addNode("Eli");
   newList.findNode("Frank");
   newList.iterateForward();
   newList.deleteNode("Max");
   newList.iterateBackward();
   
   
   
   newList.addAlphabetical("All");
   newList.addAlphabetical("Ball");
   newList.addAlphabetical("Dall");
   newList.addAlphabetical("Call");
   newList.iterateForward();
   
   newList.deleteList();
   newList.iterateForward();
   
   
   
   
 }
}