package _09_dsa_list_set.th.linkedlist;

public class MyLinkedList {
  private Node head;
  class Node{
      private Node next;
      private Object data;


      public Node(Object data) {
          this.data = data;
      }
  }
}
