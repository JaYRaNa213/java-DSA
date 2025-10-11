public class LinkedList {

    // Node class
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Head pointer of the linked list
    Node head;

    // Constructor
    public LinkedList() {
        head = null;
    }

    // Insert at the end
    public void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at the beginning
    public void insertAtStart(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    // Insert at a specific position (1-based index)
    public void insertAtPosition(int val, int position) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }

        Node newNode = new Node(val);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete from start
    public void deleteFromStart() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
    }

    // Delete from end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete from a specific position (1-based index)
    public void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds!");
            return;
        }

        temp.next = temp.next.next;
    }

    // Display linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert at end
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display(); // 10 -> 20 -> 30 -> null

        // Insert at start
        list.insertAtStart(5);
        list.display(); // 5 -> 10 -> 20 -> 30 -> null

        // Insert at position
        list.insertAtPosition(15, 3);
        list.display(); // 5 -> 10 -> 15 -> 20 -> 30 -> null

        // Delete from start
        list.deleteFromStart();
        list.display(); // 10 -> 15 -> 20 -> 30 -> null

        // Delete from end
        list.deleteFromEnd();
        list.display(); // 10 -> 15 -> 20 -> null

        // Delete from position
        list.deleteFromPosition(2);
        list.display(); // 10 -> 20 -> null
    }
}
