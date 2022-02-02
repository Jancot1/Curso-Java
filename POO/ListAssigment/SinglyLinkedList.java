package POO.ListAssigment;

public class SinglyLinkedList {

    public newNode head;

    public void add(int value) {

        newNode newNode = new newNode(value);

        if(head == null) {

            head = newNode;

        } else {

            newNode runner = head;

            while(runner.next != null) {

                runner = runner.next;

            }

            runner.next = newNode;

        }

    }

    public void remove() {
        
    }

    public void printValues(SinglyLinkedList list) {
        newNode newNode = list.head;

        System.out.println("LikedList: ");

        while (newNode != null) {
            System.out.print(newNode.value + " ");
    
            newNode = newNode.next;
        }
    }
}
