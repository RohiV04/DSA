class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Middle {
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

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void swap() {
        Node temp = null;
        int temp1, temp2;
        Node current = head;
        while (current.next != null) {

            temp = current;
            if (temp.next != null && temp.next.next != null) {
                temp2 = current.next.data;
                temp1 = current.data;
                current.next.data = temp1;
                current.data = temp2;
                current = current.next.next;
            }
        }
    }

    public void countNumber() {
        int zero = 0, one = 0, two = 0;
        for (Node i = head; i != null; i = i.next) {
            if (i.data == 0)
                zero++;
            else if (i.data == 1)
                one++;
            else
                two++;
        }
        for (int k = 0; k < zero; k++)
            System.out.println(0);
        for (int k = 0; k < one; k++)
            System.out.println(1);
        for (int k = 0; k < two; k++)
            System.out.println(2);
    }

    public void circulardisplay() {
        Node current = head;
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }

    public int count() {
        Node current = head;
        int cnt = 1;
        while (current.next != null) {
            cnt++;
            current = current.next;
        }
        return cnt;
    }

    public void displayCertain(int pos) {
        Node current = head;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        System.out.println(current.data);
    }

    public static boolean isIdentical(Middle list1, Middle list2) {
        Node cur1 = list1.head;
        Node cur2 = list2.head;
        while (cur1.next != null && cur2.next != null) {
            if (cur1.data != cur2.data) {
                return false;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        if (cur1.next != null || cur2.next != null)
            return false;
        return true;

    }

    public Node divide() {
        Node current = head;
        Node odd = null;
        Node oddhead = odd;
        Node even = null;
        Node evenhead = even;
        while (current != null) {
            if (current.data % 2 == 0) {
                odd.next = current;
                odd = odd.next;
            } else {
                even.next = current;
                even = even.next;
            }
            current = current.next;
        }
        current = evenhead;
        while (current != null) {
            current = current.next;
        }
        current = oddhead;
        return evenhead;
    }

    public void delete(int key) {
        if (head.data == key) {
            head = head.next;
        }
        for (Node i = head; i != null; i = i.next) {
            if (i.next.data == key) {
                i.next = i.next.next;
            }
        }
    }

    public void deleteDuplicates() {
        Node first = head;
        while (first.next != null) {
            if (first.data == first.next.data) {
                first.next = first.next.next;
            } else if (first != null)
                first = first.next;
        }
    }

    public static void common(Middle list1, Middle list2) {
        Node cur1 = list1.head;

        while (cur1 != null) {
            int temp = cur1.data;
            Node cur2 = list2.head;
            while (cur2 != null) {
                if (temp == cur2.data)
                    System.out.println(temp + " is Common Element");
                cur2 = cur2.next;
            }
            cur1 = cur1.next;
        }
    }

    public static void rotate(Middle list, int k) {
        Node current = list.head;
        Node temp = null;
        Node flag = null;
        int cnt = 0;
        while (current.next != null) {
            cnt++;
            if (cnt == k) {
                temp = current.next;
                flag = current;
            }
            current = current.next;
        }
        current.next = list.head;
        list.head = temp;
        flag.next = null;
    }

    public void reverse() {
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public boolean isLoop() {
        Node current = head;
        Node current2 = head.next;
        while (current != null && current2 != null) {
            if (current == current2) {
                return true;
            }
            current = current.next;
            current2 = current2.next.next;
        }
        return false;

    }

    public static void main(String args[]) {
        Middle list = new Middle();
        Middle list2 = new Middle();
        // list.append(1);
        list.append(1);
        list.append(2);
        // list.append(2);
        // list2.append(1);
        list.append(0);
        // list.append(1);
        // list.append(0);
        // System.out.println(isIdentical(list, list2));
        // list.deleteDuplicates();
        // common(list, list2);
        // rotate(list, 2);
        // list.swap();
        System.out.println("Output");
        // list.countNumber();
        list.delete(0);
        list.display();

    }
}
