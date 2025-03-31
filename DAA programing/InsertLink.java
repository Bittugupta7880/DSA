public class InsertLink {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null; // Initialize next to null
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp; // Set tail when the list is empty
            } else {
                tail.next = temp;
                tail = temp; // Update tail to the new node
            }
        }

        void insertStart(int val) {
            Node temp = new Node(val);
            temp.next = head; // Point new node to the current head
            head = temp; // Update head to the new node
            if (tail == null) { // If the list was empty, update tail
                tail = temp;
            }
        }

        void insertAtLocation(int idx, int val) {
            if (idx == 0) {
                insertStart(val);
                return;
            }

            Node temp = new Node(val);
            Node p = head;
            for (int i = 0; i < idx - 1 && p != null; i++) {
                p = p.next;
            }

            if (p == null) {
                System.out.println("Index out of bounds");
                return; // Index is out of bounds
            }
            temp.next = p.next; // Link new node to the next node
            p.next = temp; // Link previous node to the new node

            if (temp.next == null) { // If the new node is inserted at the end
                tail = temp; // Update tail
            }
        }

        void display() {
            Node current = head; // Use a temporary variable to traverse
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next; // Move to the next node
            }
            System.out.println(); // Print a new line after displaying the list
        }
    }

    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.insertAtEnd(7);
        link.insertAtEnd(20);
        link.insertAtEnd(200);

        link.insertStart(56);
        link.insertStart(100);
        link.insertStart(89);
        link.insertAtLocation(3, 78);
        link.display();
    }
}