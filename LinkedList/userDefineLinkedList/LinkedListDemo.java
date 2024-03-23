package LinkedList.userDefineLinkedList;

/**
 * LinkedList
 */

 class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

 class linkedlist{
     Node head;

     linkedlist()
     {
        head=null;
     }

     void addAtFirst(int data)
     {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode; 
     }

    

    void reversed() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to the current node
            current = next; // Move current to the next node
        }
        head = prev; // Make the last node (prev) the new head
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }



}
public class LinkedListDemo {
    public static void main(String[] args) {
        linkedlist list=new linkedlist();

        list.addAtFirst(10);
        list.addAtFirst(20);
        list.addAtFirst(30);
        list.addAtFirst(40);

        list.reversed();
        list.display();
        


    }
    
}