public class intersecationInLinkList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class intersection{
        public static  Node find(Node head ,Node head2){
        if(head==null||head2==null){
            return null;
        }
        int len1=getLength(head);
        int len2=getLength(head2);
        //diference in length
        int diff=Math.abs(len1-len2);

        Node longer=len1>len2?head:head2;
        Node sorter=len1>len2?head2:head;

    }
private static  int getLength(Node head){
    int length=0;
    while(head!=null){
        length++;
        head=head.next;
    }
    return length;
}
    }
    }
    public static void main(String[] args) {
       Node a=new Node(6); 
       Node b=new Node(8); 
       Node c=new Node(35); 
       Node d=new Node(45); 
       Node e=new Node(6); 
       Node f=new Node(3); 
       Node g=new Node(66);
       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
       //2
       f.next=g;
       g.next=d;
       d.next=e;
       int size=10;
    

    
    }
    
}
