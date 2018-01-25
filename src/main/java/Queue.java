public interface Queue {

    void enqueue (String value);
    String peek() throws Exception;
    String dequeue() throws Exception;

}
