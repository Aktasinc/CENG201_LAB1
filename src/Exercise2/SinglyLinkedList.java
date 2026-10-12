package Exercise2;

/**
 * Your Name:   Sami Yusuf Aktaş
 * Your Student ID: 250444045
 * Your Date:        12.10.2026
 */
public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    //listenin sonuna node ekle
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

    //linked list'i göster
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // orta node'u sil
    public void deleteMiddle() {
        //liste boşsa hiçbir şey yapma
        if (head == null) {
            return;
        }

        //tek düğüm varsa head'i null yap
        if (head.next == null) {
            head = null;
            return;
        }

        //toplam düğüm sayısı
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        //silinecek orta düğümün indeksi
        int middleIndex = count / 2;

        //orta düğümden bir önceki düğüm
        Node prev = head;
        for (int i = 0; i < middleIndex - 1; i++) {
            prev = prev.next;
        }

        //orta düğümü atlayarak bağları güncelle
        prev.next = prev.next.next;
    }

    public Node getHead() {
        return head;
    }
}