import java.util.*;

public class Single {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void append(int data) {
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

    public void prepend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void firstDelete() {
        head = head.next;
    }

    public void lastDelete() {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void sort() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            int temp = 0;
            Node first = head;
            while (first != null) {
                Node second = first.next;
                while (second != null) {
                    if (second.data <= first.data) {
                        temp = first.data;
                        first.data = second.data;
                        second.data = temp;
                        // System.out.println(second.data);
                    }
                    second = second.next;

                }
                first = first.next;
            }
        }
    }

    public void sortInsertion(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else if (head.data > data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current != null) {
                if (current.next.data > data) {
                    newNode.next = current.next;
                    current.next = newNode;
                    break;
                }
                current = current.next;
            }
            if (current.next == null && current.data!=data) {
                current.next = newNode;
            }
        }
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node current = head;
            while (current != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    System.out.println(data + "Is Sucessfully Deleted");
                }
            }
        }
    }

    public void search(int data) {

        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node current = head;
            int cnt = 1;
            boolean flag = true;
            while (current != null) {
                if (current.data == data) {
                    System.out.println("Element Found At " + cnt + "Position");
                    flag = false;
                    break;
                }
                cnt++;
                current = current.next;
            }
            if (flag)
                System.out.println("Element Not Found");
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public static void main(String args[]) {
        Single list = new Single();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.sortInsertion(14);
        list.sortInsertion(19);
        list.sortInsertion(0);
        list.sortInsertion(3);
        list.sortInsertion(2);
        // list.sort();
        // list.search(19);
        // list.firstDelete();
        // list.lastDelete();
        list.display();
    }
}