public class linklist3 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class AA {
        Node head = null;
        Node tail = null;

        void insertNode(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
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

        void deleteNode(int val) {
            if (head == null) return; // If the list is empty

            // If the node to be deleted is the head
            if (head.data == val) {
                head = head.next;
                return;
            }

            Node current = head;
            Node previous = null;

            // Traverse the list to find the node to delete
            while (current != null && current.data != val) {
                previous = current;
                current = current.next;
            }

            // If the node was found
            if (current != null) {
                previous.next = current.next; // Bypass the node to delete it
                if (current == tail) {
                    tail = previous; // Update tail if necessary
                }
            }
        }
    }

    public static void main(String[] args) {
        AA ll = new AA();
        ll.insertNode(89);
        ll.insertNode(34);
        ll.insertNode(68);
        ll.insertNode(56);
        ll.display(); // Display the list

        ll.deleteNode(34); // Delete the node with value 34
        ll.display(); // Display the list after deletion
    }
}