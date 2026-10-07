package Stack;

public class StackLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }


    }
    Node head;
    void push(int data){

        Node newNode = new Node(data);
        if (head == null) { head = newNode; return; }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;

        }
        temp.next = newNode;
    }

    void pop(){
//        Node newNode = new Node(data);
        Node temp = head;
        if (head.next == null) { head = null; return; }
        while(temp.next.next != null){
            temp = temp.next;

        }
        temp.next = null;
    }

    void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }


    static void main() {
        StackLL stackLL = new StackLL();
        stackLL.push(1);
        stackLL.push(2);
        stackLL.push(3);
        stackLL.printLL();
        System.out.println();
        stackLL.pop();
        stackLL.printLL();

    }



}
