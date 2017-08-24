/*
TASK:
    Complete the insert function in your editor so that it creates
    a new Node (pass data as the Node constructor argument)
    and inserts it at the tail of the linked list referenced by the head parameter.
    Once the new node is added, return the reference to the head node.

SAMPLE INPUT:
    4 // number of cases
    2
    3
    4
    1

SAMPLE OUTPUT:
    2 3 4 1
 */
package marzgra.hackerrank._30daysofcode.day15;

import java.util.Scanner;

class Day15 {
    private static Node insert(Node head, int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
        return head;
    }

    private static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}

