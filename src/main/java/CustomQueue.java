public class CustomQueue implements Queue {

    Node head;

    @Override
    public void enqueue(String value) {

        Node last = new Node(value);
        if (head == null) head = last;
        else {
            Node current = head;

            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(last);
        }
    }

    @Override
    public String peek() {
        return head.getValue();
    }

    @Override
    public String dequeue() {

        String returnal = head.getValue();
        head = head.getNextNode();
        return returnal;
    }
}
