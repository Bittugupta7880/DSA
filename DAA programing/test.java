public class test {
    
        public static class Node {
            int data;
            Node next;
    
            Node(int data) {
                this.data = data;
            }
        }
    
        public static class Intersection {
            public static Node find(Node head1, Node head2) {
                if (head1 == null || head2 == null) {
                    return null;
                }
    
                // Get the lengths of both linked lists
                int len1 = getLength(head1);
                int len2 = getLength(head2);
    
                // Calculate the difference in lengths
                int diff = Math.abs(len1 - len2);
    
                // Move the pointer of the longer list by 'diff' nodes
                Node longer = len1 > len2 ? head1 : head2;
                Node shorter = len1 > len2 ? head2 : head1;
    
                for (int i = 0; i < diff; i++) {
                    longer = longer.next;
                }
    
                // Move both pointers until they meet
                while (longer != null && shorter != null) {
                    if (longer == shorter) {
                        return longer; // Intersection point
                    }
                    longer = longer.next;
                    shorter = shorter.next;
                }
    
                return null; // No intersection
            }
    
            private static int getLength(Node head) {
                int length = 0;
                while (head != null) {
                    length++;
                    head = head.next;
                }
                return length;
            }
        }
    
        public static void main(String[] args) {
            Node a = new Node(6);
            Node b = new Node(8);
            Node c = new Node(35);
            Node d = new Node(45);
            Node e = new Node(6);
            Node f = new Node(3);
            Node g = new Node(66);
    
            // Creating first linked list: 6 -> 8 -> 35 -> 45 -> 6
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
    
            // Creating second linked list: 3 -> 66 -> 45 -> 6
            f.next = g;
            g.next = d; // Intersection point at node d (45)
    
            // Finding intersection
            Node intersectionNode = Intersection.find(a, f);
            if (intersectionNode != null) {
                System.out.println("Intersection at node with data: " + intersectionNode.data);
            } else {
                System.out.println("No intersection found.");
            }
        }
    }

