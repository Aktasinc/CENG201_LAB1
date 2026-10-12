package Exercise1;

/**
 * Your Name:  Sami Yusuf Aktaş
 * Your Student ID: 250444045
 * Your Date:        12.10.2026
 */
public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    // Add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("null");
    }

    // Find the middle node
    public Node findMiddle() {
        if (head == null) {
            return null;
        }

        // 1. Eleman sayısını bul
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        // 2. Orta indeksi hesapla (count / 2)
        int middleIndex = count / 2;

        // 3. Orta indeksteki düğüme kadar git
        current = head;
        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }

        return current;
    }

    public Node getHead() {
        return head;
    }
}