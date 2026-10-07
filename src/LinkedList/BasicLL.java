package LinkedList;

class BasicLL {

    // Node creation
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // Nodes create
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Nodes connect
        first.next = second;
        second.next = third;

        // Print linked list
        Node temp = first;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
