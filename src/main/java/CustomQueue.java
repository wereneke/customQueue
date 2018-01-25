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

//    public void enqueue(String value, int priority) {
//
//        Node toInsert = new Node(value, priority);
//        if (head == null) head = toInsert;
//        else {
//            Node current = head;
//
//            if (current.getPriority() > toInsert.getPriority())
//            while (current.getNextNode() != null) {
//                current = current.getNextNode();
//            }
//            current.setNextNode(toInsert);
//        }
//    }

    @Override
    public String peek() throws Exception {

        if (isEmpty()) throw new Exception();
        return head.getValue();
    }

    @Override
    public String dequeue() throws Exception {

        if (isEmpty()) throw new Exception();

        String returnal = head.getValue();
        head = head.getNextNode();
        return returnal;
    }


    public int queueSize() {

        int size = 0;
        if (isEmpty()) return size;

        Node current = head;
        size = 1;
        while (current.getNextNode() != null) {
            current = current.getNextNode();
            size++;
        }

        return size;
    }

    public boolean isEmpty() {

        return (head == null);
    }

}
