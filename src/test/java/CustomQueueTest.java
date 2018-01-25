import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomQueueTest {

    @Test
    void testEnqueueOnEmpty() {
        CustomQueue queue = new CustomQueue();
        queue.enqueue("wera");
        assertEquals("wera", queue.peek());
    }

    @Test
    void testDequeue() {
        CustomQueue queue = new CustomQueue();
        queue.enqueue("wera");
        queue.enqueue("kuba");
        queue.dequeue();
        assertEquals("kuba", queue.peek());
    }

    @Test
    void testIfEnqueueSetsRelations() {
        CustomQueue queue = new CustomQueue();
        queue.enqueue("wera");
        queue.enqueue("kuba");
        queue.enqueue("robert");
        queue.enqueue("zenonek");
        queue.dequeue();
        queue.dequeue();
        assertEquals("robert", queue.peek());
    }
}