class Node {
    int data;
    Node next;
}

class LinkedList{
    Node head;
    public void insertAtEnd(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(head == null){
            head = node;
        }
        else {
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAtIndex(int index,int data){
        
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0){
            insertAtStart(data);
        }
        else {
            Node n = head;
            int counter = 0;
            while(counter < index-1){
                counter++;
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }    
    }

    public void deleteAtIndex(int index){
        if(index == 0){
            head = head.next;
        }
        else {
            Node n = head;
            int counter = 0;
            Node node = null;
            while(counter < index-1){
                counter++;
                n = n.next;
            }
            node = n.next;
            n.next = node.next;
        }
    }

    public void searchValue(int value){
        Node n = head;
        int counter = 0;
        while(n.next != null){
            if(n.data == value){
                break;
            }
            n = n.next;
            counter++;
        }
        System.out.println("Element found at index "+counter);
    }

    public void updateValue(int index,int value){
        Node n = head;
        int counter = 0;
        while(counter < index){
            n = n.next;
            counter++;
        }
        n.data = value;
    }

    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(1);
        ll.insertAtEnd(53);
        ll.insertAtEnd(54);
        ll.insertAtEnd(1000);
        ll.insertAtStart(100);
        ll.insertAtIndex(2,200);
        ll.insertAtIndex(0,400);
        ll.deleteAtIndex(2);
        ll.show();
        ll.searchValue(400);
        ll.updateValue(1, 4000);
        ll.show();
    }
}
