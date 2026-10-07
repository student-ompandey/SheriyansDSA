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

//    static void printLL(Node head){
//        Node  temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }


        static void printLL2(Node head){


        if(head == null){
            return;
        }
        System.out.print(head.data+"->");
        printLL2(head.next);

    }

    public static void main(String[] args) {

        // Nodes create
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Nodes connect
        first.next = second;
        second.next = third;
        Node head = first;
        printLL2(head);

        System.out.println("null");
    }
}
