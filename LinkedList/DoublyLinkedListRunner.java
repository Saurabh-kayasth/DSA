class DNode {
    int data;
    DNode next;
    DNode prev;
}

public class DoublyLinkedListRunner {
    DNode head;

    public void insertAtEnd(int data){
        DNode node = new DNode();
        node.data = data;
        node.next = null;
        node.prev = null;

        if(head == null){
            head = node;
        }
        else {
            DNode n = head;
            while(n.next != null){
                n = n.next;
            }
            node.prev = n;
            n.next = node;
        }
    }

    public void show(){
        // format("%32s%10d%16s", string1, int1, string2);
        DNode node = head;
        System.out.println("------------------------------FORWARD-------------------------------");
        System.out.format("%s%15s%15s%35s","DATA","PREV","NEXT","CURRENT NODE ADDRESS\n");
        System.out.println("-------------------------------------------------------------------");
        while(node.next != null){
            System.out.format("%d%20s%20s%25s",node.data,node.prev,node.next,node+"\n");
            node = node.next;
        }
        System.out.format("%d%20s%20s%25s",node.data,node.prev,node.next,node+"\n");
        System.out.println("-------------------------------------------------------------\n");
        System.out.println("------------------------------REVERSE-------------------------------");
        System.out.format("%s%15s%15s%35s","DATA","PREV","NEXT","CURRENT NODE ADDRESS\n");
        System.out.println("-------------------------------------------------------------------");
        while(node.prev != null){
            System.out.format("%d%20s%20s%25s",node.data,node.prev,node.next,node+"\n");
            node = node.prev;
        }
        System.out.format("%d%20s%20s%25s",node.data,node.prev,node.next,node+"\n");
    }

    public void showInReverseDirection(){

    }

    public static void main(String[] args) {

        DoublyLinkedListRunner linkedList = new DoublyLinkedListRunner();
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(15);
        linkedList.insertAtEnd(25);
        linkedList.insertAtEnd(35);
        linkedList.insertAtEnd(45);
        linkedList.show();
        
    }
}
