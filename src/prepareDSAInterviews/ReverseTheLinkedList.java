

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}


    class ReverseTheLinkedList {
        public static void main(String[] args) {

        }
        public static  Node solve(Node head) {

            int count = 0;
            Node middlle = head;
            while (head !=  null) {
                count += 1;
                head = head.next;
            }
            int i = 0;
            while (i < count /2) {
                middlle = middlle.next;
                i++;

            }
            return middlle;


        }
    }

