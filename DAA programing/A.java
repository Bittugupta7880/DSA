public class A {

   


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

   public static void fun( Node head){
Node temp=head;
while(temp != null){
    System.out.print(temp.data+" ");
    temp=temp.next;

    }

}

public static  void fun2( Node head)
{
    if(head == null) return;
    System.out.print(head.data+" ");
    fun2(head.next);
}
    public static void main(String[] args) {
        Node a=new Node(34);
    
        Node b=new Node(23);

        Node c=new Node(12);
        Node d=new Node(89);
        a.next = b;
        b.next = c;
        c.next = d;
        
fun(a);

System.out.println();
Node temp=a;

        while(temp!= null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        fun2(a);
    }
}
