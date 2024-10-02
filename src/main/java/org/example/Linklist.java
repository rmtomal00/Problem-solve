package org.example;

public class Linklist {
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    public void addData(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public void updateData(int index, int data) {
        Node current = head;
        for (int i = 0; i <= index-1; i++) {
            if (current == null) {
                System.out.println("Out of bounds");
                return;
            }
            current = current.next;
        }
        current.data = data;
    }
    public void deleteData(int index) {
        Node current = head;
        Node previous = null;
        for (int i = 0; i <= index-1; i++) {
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
    }
    public void getData(int index) {
        Node current = head;
        for (int i = 0; i <= index-1; i++) {
            if (current == null) {
                System.out.println("Out of bounds");
                return;
            }
            current = current.next;
        }
        if (current != null) {
            System.out.printf(String.valueOf(current.data));
        } else {
            System.out.println("Out of range");
        }

    }
    public int size() {
        Node current = head;
        int size = 0;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        Linklist linklist = new Linklist();
        for (int i = 0; i < 10; i++) {
            linklist.addData(i);
        }
        linklist.display();
        System.out.println("");
        linklist.updateData(50, 1000);
        System.out.println("");
        linklist.display();
        System.out.println("");
        System.out.println(linklist.size());
        linklist.deleteData(5);
        linklist.display();
        System.out.println("");
        System.out.println(linklist.size());
        linklist.getData(5);

    }

}
