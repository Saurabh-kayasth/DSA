// Given a singly linked list of even number of nodes of size N. 
// You need to  swap elements in the linked list pairwise.
// For eg, input list is  3-->5-->1-->4, 
// the resulting list after swaps will be 5-->3-->4-->1 

class SNode {
    int data;
    SNode next;
}

public class SwapLinkedList {

    SNode head;
    void insertAtEnd(int data){
        SNode node = new SNode();
        node.data = data;
        node.next = null;
        
        if(head == null){
            head = node;
        }
        else {
            SNode n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node; // storing directly at memory address
        }
    }

    void swap(){
        SNode node = head;
        while(node != null && node.next != null){
            int temp = node.data;
            node.data = node.next.data;
            node.next.data = temp;
            System.out.println(node.next.next);
            node = node.next.next;
        }
    }

    void show(){
        SNode node = head;
        System.out.format("%s%15s%35s","DATA","NEXT","CURRENT NODE ADDRESS\n");
        System.out.println("-------------------------------------------------------------------");
        while(node.next != null){
            System.out.format("%d%20s%25s",node.data,node.next,node+"\n");
            node = node.next;
        }
        System.out.format("%d%20s%25s",node.data,node.next,node+"\n");
    }
    public static void main(String[] args) {
        SwapLinkedList linkedList = new SwapLinkedList();
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);
        linkedList.show();
        linkedList.swap();
        linkedList.show();
    }
}
