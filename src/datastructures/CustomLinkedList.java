package datastructures;

public class CustomLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }

    private Node<T> head;
    private int size;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) head = newNode;
        else {
            Node<T> temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) return null;
        Node<T> temp = head;
        for (int i = 0; i < index; i++) temp = temp.next;
        return temp.data;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) return false;
        if (index == 0) head = head.next;
        else {
            Node<T> temp = head;
            for (int i = 0; i < index - 1; i++) temp = temp.next;
            temp.next = temp.next.next;
        }
        size--;
        return true;
    }

    public int size() { return size; }

    public Node<T> getHead() { return head; }
}
