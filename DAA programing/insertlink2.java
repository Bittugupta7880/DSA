public class insertlink2 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }
void insertStart(int val){
    Node temp = new Node(val);

 Node k=head;
 head=temp;
 head.next=k;
 
    
    

}
void insertAtlocation(int idx,int val){
    if (idx==0) {
        insertStart(val);
        return;
    }
    Node temp = new Node(val);
    Node p=head;
    for (int i=0;i<idx-1 && p!=null;i++){
p=p.next;
    }
    if (p==null){
        System.out.println("index out of bounds");
        return;
    }
    temp.next=p.next;
p.next=temp;
   

   
}
        void display() {
           
            while (head != null) {
                System.out.print(head.data + " ");
                head=head.next;
            }

        }
    }

    public static void main(String[] args) {
linkedList link=new linkedList();
link.insertAtEnd(7);
link.insertAtEnd(20);
link.insertAtEnd(200);

link.insertStart(56);
link.insertStart(100);
link.insertStart(89);
link.insertAtlocation(3, 78);
link.insertAtlocation(0, 66);
link.insertAtlocation(6, 500);
link.insertAtlocation(5, 88);
link.display();
    }
}
