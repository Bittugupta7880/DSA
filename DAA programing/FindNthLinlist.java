public class FindNthLinlist {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class FindNode {
        int count(Node head) {
            int size = 0;
            while (head != null) {
                size++;
                head = head.next; // Move to the next node
            }
            return size;
        }
        

        public static Node fromEnd(Node head, int idx, int size) {
            if (idx <= 0 || idx > size) {
                return null; // Return null if index is out of bounds
            }
            int k = size - idx; // Adjust index for 0-based index
            for (int i = 0; i < k; i++) {
                head = head.next; // Move to the desired node
            }
            return head;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(34);
        Node d = new Node(9);
        Node e = new Node(23);
        Node f = new Node(68);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        FindNode ll = new FindNode();
        int l=ll.count(a);

        int idx = 10; // Example: Get the 3rd node from the end
        // Size of the linked list
        Node resultNode = ll.fromEnd(a, idx, l);
        if (resultNode != null) {
            System.out.println("The " + idx + "rd node from the end is: " + resultNode.data);
        } else {
            System.out.println("Index out of bounds.");
        }
    }
}