package linklist;

public class basic {
    public static class Node {
        int data;
        Node next;
Node(int data){
    this.data=data;
}
        // Constructor to initialize the node
        // public Node(int data) {
        //     this.data = data;
        //     this.next = null; // Initialize next to null
        // }
    }

    public static void main(String[] args) {
        Node a=new Node(34);
    
        Node b=new Node(23);

        Node c=new Node(12);
        Node d=new Node(89);
        a.next = b;
        System.out.println(a.next.data);
    }
}